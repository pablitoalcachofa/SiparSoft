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
public class Cliente {
private String identificacion;
private String nombre;
private String direccion;
private String tipo_cliente;
private double valor_compras;
private double total_compras;

public Cliente(String ident,String nom, String tipoC,double valorC,double totalC){
        this.identificacion=ident;
        this.nombre=nom;
        this.tipo_cliente=tipoC;
        this.total_compras=totalC;
        this.valor_compras=valorC;
        
    }
public void crear_clientes(){
    
}
public void actualizar_cliente(){
    
}
public void eliminar_cliente(){
    
}
public void generar_compra(){

}
}
