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
public class Empleado {
    private String identificacion;
    private String nombre;
    //private date fecha_nacimiento;
    private int edad;
    private String cargo;
    private String tipo_empleado;

    public Empleado(String ident,String nom, int ed,String carg,String tipoE){
        this.identificacion=ident;
        this.nombre=nom;
        this.edad=ed;
        this.cargo=carg;
        this.tipo_empleado=tipoE;
    }
    
public void crear_empleado(){
    
}
public void actualizar_empleado(){
    
}
public boolean activar_empleado(){
    return true;
}
}