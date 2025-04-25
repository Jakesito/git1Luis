/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persoas;
/**
 * Clase Cuidarores.
 * @author may
 */
public class Cuidadores extends Traballadores{
  private double soldo;

  public Cuidadores() {  }

    public Cuidadores(double soldo, String horario, String DNI, String nome, String telefono, String dataNac) {
    super(horario, DNI, nome, telefono, dataNac);
    this.soldo = soldo;
  }

  public double getSoldo() { return soldo; }
  public void setSoldo(double soldo) { this.soldo = soldo; }

  @Override
  public String toString() {
    return "Cuidadores{" +super.toString() +  "soldo=" + soldo + '}';
  } 
}
