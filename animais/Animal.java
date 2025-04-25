/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;
import java.time.LocalDate;
/**
 * Clase abstracta Animal.
 * @author may
 */
//O símbolo da esquerda indica que esta clase ten fillos.
public abstract class Animal {
  private static int genChip = 0;
  private final int chip;
  private String raza;
  private double peso;
  private String paisProcedencia;
  private LocalDate dataNac;
  
  // O atributos autoincrementado inicialízase nos constructores.
  // Defínese como final, pois despois de recibir un valor, non volve a cambiar.
  public Animal() { this.chip = Animal.genChip++; }

  public Animal(String raza, double peso, String paisProcedencia, String dataNac) {
    this.chip = Animal.genChip++;
    this.raza = raza;
    this.peso = peso;
    this.paisProcedencia = paisProcedencia;
    this.dataNac=LocalDate.parse(dataNac);
  }
  public int getChip() { return chip;  } 
  
  public String getRaza() {return raza;  }
  public void setRaza(String raza) {this.raza = raza;  }
  
  public double getPeso() { return peso;  }
  public void setPeso(double peso) {this.peso = peso; }
  
  public String getPaisProcedencia() { return paisProcedencia;  }
  public void setPaisProcedencia(String paisProcedencia) {
    this.paisProcedencia = paisProcedencia;
  }

  public LocalDate getDataNac() { return dataNac; }
  public void setDataNac(String dataNac) { this.dataNac = LocalDate.parse(dataNac); }
  
  //O IDE indícame que este método foi sobreescrito nalgunha clase filla.
  public abstract void facerRuido();
  public abstract void dormir();

  @Override
  public String toString() {
    return "Animal{" + "chip=" + chip + ", raza=" + raza + ", peso=" + peso 
      + ", paisProcedencia=" + paisProcedencia + ", dataNac=" + dataNac + '}';
  }
}// fin clase
