/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import MUNDO.Jugador;
import MUNDO.Monopoly;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


/**
 *
 * @author JulianOlarte
 */
public class JPanelF extends javax.swing.JPanel implements Runnable{
    
    private Image imagen;
    JButton player1,tirarDados;
    int n,cont,casillas,num;
    Jugador jugador;
    private Monopoly m;
    private int turno;
    private JLabel labelturno;
    private int movextra;
    private int proxcasilla;
   private HashMap<Integer, Color> shapeColors = new HashMap<Integer, Color>();
   
 
    public JPanelF(String nombreImagen,Monopoly m,JButton tirarDados,JLabel turno) {
        
        this.m=m;
        this.movextra=0;
        this.proxcasilla=0;
        this.tirarDados=tirarDados;
        this.labelturno=turno;
        if (nombreImagen != null) {
            imagen = new ImageIcon(
                           getClass().getResource(nombreImagen)
                           ).getImage();
            int i=0;
            
            while(i<m.getBotones().length)
            {
                this.add(m.getBotones()[i]);
                i++;
            }
            this.repaint();
            
            this.player1=m.getBotones()[0];
            this.m.setEliminado(player1);
            
            this.turno=2;
            this.num=0;
            this.jugador=this.m.getJugadores()[0];
            
            cont=0;n=3;casillas=0;
        
        
        
                shapeColors.put(1, Color.red);
		shapeColors.put(2, Color.red);
		shapeColors.put(3, Color.red);
		shapeColors.put(4, Color.red);
		shapeColors.put(5, Color.red);
                
		shapeColors.put(6, Color.white);
                
		shapeColors.put(7, Color.blue);
		shapeColors.put(8, Color.blue);
                shapeColors.put(9, Color.blue);
		shapeColors.put(10, Color.blue);
		shapeColors.put(11, Color.blue);
                
		shapeColors.put(12, Color.white);
                
		shapeColors.put(13, Color.green);
		shapeColors.put(14, Color.green);
		shapeColors.put(15, Color.green);
		shapeColors.put(16, Color.green);
                shapeColors.put(17, Color.green);
                
		shapeColors.put(18, Color.white);
                
                shapeColors.put(19, Color.yellow);
                shapeColors.put(20, Color.yellow);
		shapeColors.put(21, Color.yellow);
		shapeColors.put(22, Color.yellow);
		shapeColors.put(23, Color.yellow);
                
		shapeColors.put(24, Color.white);
                	
        }
    }
 
 
    @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),
                              this);
 
            setOpaque(false);
        } else {
            setOpaque(true);
        }
        super.paint(g);
    }
    
    public void inicio()
    {
            Thread hilo=new Thread(this);
            hilo.start();
    }

    public void setDado(int dado)
    {
        this.n=dado;
    }
    
    public int getTurno()
    {
        return this.turno;
    }

     public int getValor(int casilla)
    {
        int val=casilla;
        
        if (casilla == 1) {
            val = 1000;
        } else if (casilla == 2) {
            val = 2000;
        } else if (casilla == 4) {
            val = 3000;
        } else if (casilla == 5) {
            val = 4000;
        } else if (casilla == 6||casilla==12) {
            val = 20000;
        } else if (casilla == 7) {
            val = 5000;
        } else if (casilla == 8) {
            val = 6000;
        } else if (casilla == 10) {
            val = 7000;
        } else if (casilla == 11) {
            val = 8000;
        } else if (casilla == 13) {
            val = 9000;
        } else if (casilla == 14) {
            val = 10000;
        } else if (casilla == 16) {
            val = 15000;
        } else if (casilla == 17) {
            val = 20000;
        } else if (casilla == 19) {
            val = 25000;
        } else if (casilla == 20) {
            val = 30000;
        } else if (casilla == 22) {
            val = 40000;
        } else if (casilla == 23) {
            val = 50000;
        }
        
        return val;
    }
     
     
     
     public void moverFicha(int casilla)
     {
        int var=casilla;
        int x=player1.getX();
        int y=player1.getY();
        int xfinal=jugador.getPos(var).x;
        int yfinal=jugador.getPos(var).y;

        if(x<xfinal)
        {
            while(x<xfinal)
            { 
                try {
                    x+=3;
                    Thread.sleep(3);
                    player1.setLocation(x,y);

                } catch (InterruptedException ex) {
                   
                }
            }
        }
        if(y<yfinal)
        {
            while(y<yfinal)
            { 
                try {
                    y+=3;
                    Thread.sleep(3);
                    player1.setLocation(x,y);

                } catch (InterruptedException ex) {
                    
                }
            }
        }
        if(x>xfinal)
        {
            while(x>xfinal)
            { 
                try {
                    x-=3;
                    Thread.sleep(3);
                    player1.setLocation(x,y);

                } catch (InterruptedException ex) {
                    
                }
            }
        }
        if(y>yfinal)
        {
            while(y>yfinal)
            { 
                try {
                    y-=3;
                    Thread.sleep(3);
                    player1.setLocation(x,y);

                } catch (InterruptedException ex) {
                    
                }
            }
        }
        this.player1.setEnabled(true);
    
     }
     
   public void setMovimientoExtra(int mov)
   {
       this.movextra=mov;
   }
   
   public Jugador getJugador()
   {
       return this.jugador;
   }
  
    
   public void setProxcasilla(int cas)
   {
       this.proxcasilla=cas;
   }
   
   public void actualizarJugador()
   {
       
       int i=0;
       while(!this.m.getJugadores()[i].getNombre().equals(this.jugador.getNombre()))
       {
           i++;
       }
       i++;
       i=i%this.m.getNum();
       this.player1=this.m.getBotones()[i];
       this.jugador=this.m.getJugadores()[i]; 
       this.m.setEliminado(player1);
   }
   
   public JButton getFicha()
   {
       return this.player1;
   }
   
   
    @Override
    public void run() {
        
        int var=this.proxcasilla;
                
        this.jugador.setCasilla(var);
       
        
        this.moverFicha(var);
       
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            
        }
        
        
        if(this.movextra==0)
        { 
            if(this.proxcasilla!=0)
            {
                Tarjeta tar=new Tarjeta(shapeColors.get(var),this.tirarDados,this.labelturno,this.m,var,this.getValor(var),this,this.player1);
                tar.setVisible(true);
            }
            else
            {
                
                this.actualizarJugador();
                this.labelturno.setText(this.player1.getText());
                this.tirarDados.setEnabled(true);
            }
            
        }
        else
        {
             if(this.proxcasilla==6)
             {
                Tarjeta tar=new Tarjeta(shapeColors.get(var),this.tirarDados,this.labelturno,this.m,var,this.getValor(var),this,this.player1);
                tar.setVisible(true);
             }
             else
             {
                 this.actualizarJugador();
                 this.labelturno.setText(this.player1.getText());
                 this.tirarDados.setEnabled(true);
             }
             
        } 
        this.movextra=0;
        
    }

}

    
    

