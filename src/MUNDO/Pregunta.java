/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MUNDO;

/**
 *
 * @author JulianOlarte
 */
public class Pregunta {
    
    
    private String nombre;
    private String pregunta;
    private String respuesta;
    private Integer mov;
    
    public Pregunta(String nombre, String pregunta, String respuesta,Integer mov)
    {
        this.nombre=nombre;
        this.pregunta=pregunta;
        this.respuesta=respuesta;
        this.mov=mov;
    }
    
   public String getPregunta()
   {
       return this.pregunta;
   }
   public String getRespuesta()
   {
       return this.respuesta;
   }
   public String getNombre()
   {
       return this.nombre;
   }
   
   public Integer getCasilla()
   {
       return this.mov;
   }
    
}
