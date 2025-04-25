/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;
import interfaces.*;
/**
 * Clase Can, subclase de Animal e implementa 
 * interfaces Canido e Mascotas.
 * @author may
 */
public class Can extends Animal implements Canido, Mascotas {
  // CONSTRUCTORES.
  public Can() {   }
  //O constructor inclúe os atributos herdados.
  public Can(String raza, double peso, String paisProcedencia, String dataNac) {
    super(raza, peso, paisProcedencia, dataNac);
  }
  //MÉTODOS QUE TEÑEN A OBRIGA DE IMPLEMENTAR.
  //Estos métodos son abstractos na superclase ou das interfaces implementadas.
  @Override
  public void facerRuido() { System.out.println("O can ladra");  }
  @Override
  public void dormir() { System.out.println("O can durme 8 horas");  }

  @Override
  public void territorialidad() {  System.out.println("O can ten un territorio"); }

  @Override
  public void setNome(String nome) { System.out.println("O can chámase "+nome);  }

  @Override
  public void xogar() { System.out.println("O can vai polo pau e o devolve"); }

  @Override
  public void vacunar() {System.out.println("O can se vacuna");  }

  @Override
  public String toString() {
    return "Can{" +super.toString()+ '}';
  }
}// fin clase.
