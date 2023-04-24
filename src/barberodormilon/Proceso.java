/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

/**
 *
 * @author andre
 */
public class Proceso {
 
    private String name;
    private int time;
    private Proceso sig_cliente;
    
    public Proceso(String id)
    {
        this.name= id;
        this.time= (int)((Math.random()* 10) + 5);
        this.sig_cliente = null;
    }
    
    public String get_Nombre()
    {
        return this.name ;
    }
    
      public int get_Tiempo()
    {
        return this.time ;
    }
      
      public Proceso get_Next()
      {
          return this.sig_cliente;
      }
         public void set_Next(Proceso sig)
      {
          this.sig_cliente = sig;
      }
      
}
