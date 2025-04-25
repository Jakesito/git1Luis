/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persoas;
/**
 * Clase Clientes.
 * @author may
 */
public class Clientes extends Persoa {
  private String direccion;
 
  public Clientes() {
  }
  public Clientes(String DNI, String nome, String telefono, String dataNac, String direccion) {
    super(DNI, nome, telefono, dataNac);
    this.direccion=direccion;
  }

  public String getDireccion() { return direccion; }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  } 
}// fin clase.
