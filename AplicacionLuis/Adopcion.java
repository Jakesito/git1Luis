/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ucha.animalherdanza;
import persoas.Clientes;
import animais.Animal;
import java.time.LocalDate;
/**
 * Clase Adopcion.
 * Exemplo de clase con composición: esto é, contén
 * atributos que son obxectos doutras clases.
 * @author may
 */
public class Adopcion {
  private Animal animal;
  private Clientes cliente;
  private LocalDate dataAdopcion;

  public Adopcion() {
  }

  public Adopcion(Animal animal, Clientes cliente, String dataAdopcion) {
    this.animal = animal;
    this.cliente = cliente;
    this.dataAdopcion = LocalDate.parse(dataAdopcion);
  }

  public Animal getAnimal() { return animal; }
  public void setAnimal(Animal animal) { this.animal = animal;  }

  public Clientes getCliente() { return cliente;  }
  public void setCliente(Clientes cliente) {  this.cliente = cliente; }

  public LocalDate getDataAdopcion() { return dataAdopcion;  }
  public void setDataAdopcion(LocalDate dataAdopcion) {
    this.dataAdopcion = dataAdopcion;
  }

  /**
   * Método para imprimir os atributos da adopción.
   * Neste caso é necesario modificar o método xerado para empregar
   * o toString de cada atributo obxecto, doutro modo non imprimiría
   * os seus valores senón a dirección de memoria do obxecto.
   * @return
   */
  @Override
  public String toString() {
    return "Adopcion{" + "animal=" + animal.toString() + ", cliente=" + cliente.toString() 
      + ", dataAdopcion=" + dataAdopcion + '}';
  }
}// fin clase.
