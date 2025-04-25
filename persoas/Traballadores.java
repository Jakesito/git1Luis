/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persoas;
import interfaces.Horario;
/**
 * Clase Traballadores.
 * @author may
 */
public abstract class Traballadores extends Persoa implements Horario{
  private String horario;

  public Traballadores() {
  }

  public Traballadores(String horario, String DNI, String nome, String telefono, String dataNac) {
    super(DNI, nome, telefono, dataNac);
    this.horario = horario;
  }

  public String getHorario() { return horario; }
  public void setHorario(String horario) { this.horario = horario; }

  @Override
  public String toString() {
    return "Traballadores{" + super.toString() + "horario=" + horario + '}';
  }
}
