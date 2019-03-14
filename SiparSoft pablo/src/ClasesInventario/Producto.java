/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInventario;

/**
 *
 * @author MIGUEL
 */
public class Producto {
 private String codigo;
 private String nombre_producto;
 private String tipo_producto;
 
 public Producto(String cod,String nomP, String tipoP){
        this.codigo=cod;
        this.nombre_producto=nomP;
        this.tipo_producto=tipoP;
    }
 public void crear_producto(){
     
 }
         
 public void actualizar_producto(){
     
 }
  
public boolean activar_producto(){
    return true;
}
}
