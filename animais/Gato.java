/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;
import interfaces.*;
/**
 * Clase Gato, subclase de Animal e implementa 
 * interfaces Felido e Mascotas.
 * @author may
 */
public class Gato extends Animal implements Felido, Mascotas{
  //CONTRUCTORES.
  public Gato() {   }
  public Gato(String raza, double peso, String paisProcedencia, String dataNac) {
    super(raza, peso, paisProcedencia, dataNac);
  }
  // MÉTODOS QUE TEN A OBRIGA DE IMPLEMENTAR.
  // Ou métodos abstractos da superclase, ou métodos das interfaces implementadas.
  @Override
  public void facerRuido() { System.out.println("O gato maulla.");  }

  @Override
  public void dormir() { System.out.println("O gato durme moitísimo.");  }

  @Override
  public void escupeBolasPelo() {
    System.out.println("O gato debe excupir bolas de pelo, ou enferma.");
  }

  @Override
  public void setNome(String nome) { System.out.println("O gato chámase "+ nome); }
 
  @Override
  public void xogar() {
    System.out.println("O gato xoga con ovillos de la, e nunca trae o pau.");
  }

  @Override
  public void vacunar() {
    System.out.println("O gato ten que vacunarse regularmente.");
  }

  @Override
  public String toString() {
    return "Gato{" +super.toString()+ '}';
  }
}// fin clase.
