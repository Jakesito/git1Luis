/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persoas;
import java.time.LocalDate;
/**
 * Clase Persoa.
 * @author may
 */
public class Persoa {
  private String DNI;
  private String nome;
  private String telefono;
  private LocalDate dataNac;
  
  public Persoa() {  }

  public Persoa(String DNI, String nome, String telefono, String dataNac) {
    this.DNI = DNI;
    this.nome = nome;
    this.telefono = telefono;
    this.dataNac = LocalDate.parse(dataNac);
  }

  public String getDNI() { return DNI;  }
  public void setDNI(String DNI) { this.DNI = DNI; }

  public String getNome() {return nome; }
  public void setNome(String nome) {this.nome = nome; }

  public String getTelefono() {return telefono; }
  public void setTelefono(String telefono) { this.telefono = telefono; }

  public LocalDate getDataNac() { return dataNac; }
  public void setDataNac(String dataNac) { this.dataNac = LocalDate.parse(dataNac); }

  @Override
  public String toString() {
    return "Persoa{" + "DNI=" + DNI + ", nome=" + nome + ", telefono=" + telefono 
      + ", dataNac=" + dataNac + '}';
  } 
}// fin clase.

