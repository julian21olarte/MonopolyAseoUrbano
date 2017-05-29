/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MUNDO;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;

/**
 *
 * @author JulianOlarte
 */
public class Jugador {
    
    private String nombre;
    Color color;
    Point inicio;
    int casilla,x,y;
   
    private HashMap<Integer, Point> shapes;
    
    public Jugador(String nombre, Color color, Point inicio)
    {
        this.nombre=nombre;
        
        this.color=color;
        this.inicio=inicio;
        this.casilla=0;
        this.x=this.inicio.x;
        this.y=this.inicio.y;
        shapes=new HashMap<>();
        
        shapes.put(0, new Point(x,y));
        x+=100;
        shapes.put(1, new Point(x,y));x+=100;
        shapes.put(2, new Point(x,y));x+=100;
        shapes.put(3, new Point(x,y));x+=100;
        shapes.put(4, new Point(x,y));x+=100;
        shapes.put(5, new Point(x,y));x+=100;
        shapes.put(6, new Point(x,y));

        y+=100;
        shapes.put(7, new Point(x,y));y+=100;
        shapes.put(8, new Point(x,y));y+=100;
        shapes.put(9, new Point(x,y));y+=100;
        shapes.put(10, new Point(x,y));y+=100;
        shapes.put(11, new Point(x,y));y+=100;
        shapes.put(12, new Point(x,y));

        x-=100;
        shapes.put(13, new Point(x,y));x-=100;
        shapes.put(14, new Point(x,y));x-=100;
        shapes.put(15, new Point(x,y));x-=100;
        shapes.put(16, new Point(x,y));x-=100;
        shapes.put(17, new Point(x,y));x-=100;
        shapes.put(18, new Point(x,y));
        

        y-=100;
        shapes.put(19, new Point(x,y));y-=100;
        shapes.put(20, new Point(x,y));y-=100;
        shapes.put(21, new Point(x,y));y-=100;
        shapes.put(22, new Point(x,y));y-=100;
        shapes.put(23, new Point(x,y));y-=100;
        shapes.put(24, new Point(x,y));
    }
    
    public int getCasilla()
    {
        return this.casilla;
    }
    
    public void setCasilla(int cas)
    {
        this.casilla=cas;
    }
    
    public Point getPos(int n)
    {
        return this.shapes.get(n);
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
  
}

