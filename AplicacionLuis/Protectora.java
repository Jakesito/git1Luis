/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ucha.animalherdanza;
import animais.*;
import interfaces.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import persoas.*;

/**
 * Clase aplicación.
 * @author may
 */
public class Protectora {

  public static Scanner sc = new Scanner(System.in);
  public static Traballadores[] listaTraballadores = new Traballadores[5];
  public static Animal[] listaAnimais = new Animal[5];
  public static Adopcion[] listaAdopcions = new Adopcion[5];

  public static void amosarMenu() {
    System.out.println("Luis");
    System.out.println("APLICACIÓN PROTECTORA.");
    System.out.println("1. Dar de alta un animal.");
    System.out.println("2. Dar de baixa un animal.");
    System.out.println("3. Dar de alta un traballador.");
    System.out.println("4. Dar de baixa un traballador.");
    System.out.println("5. Facer unha adopcion.");
    System.out.println("6. Amosar información da protectora.");
    System.out.println("7. Saír.");
  }
  public static String paisProcedencia(String pais){
    switch (pais.toUpperCase()) {
      case "ESP"-> {return Pais.ESP;}
      case "CHE"-> {return Pais.CHE;}
      case "FRA"-> {return Pais.FRA;}
      case "MAR"-> {return Pais.MAR;}
      case "ITA"-> {return Pais.ITA;}
      case "POR"-> {return Pais.POR;}
      default->{
          // Tratamento de excepción con reanudación.
          // Dase no caso de que se introduza un nº non válido.
          // Neste caso avísase do erro e a aplicación continúa.
          try {
            throw new AssertionError();
          } catch (AssertionError e) {
            System.out.println("Opción inválida, o número ten que ser un país válido.");
          }
        }//fin default;
    }//fin switch
    return "";
  }//fin método paisProcedencia
  
  public static void crearAnimal(Animal animal) {
    // Enchemos os datos do traballador comúns a todas as persoas.
    System.out.println("Escribe a raza do animal:");
    animal.setRaza(sc.next());
    System.out.println("Escribe o peso do animal:");
    animal.setPeso(sc.nextDouble());
    System.out.println("Escribe o país de procedencia do animal.");
    System.out.println("Valores posibles: ESP, ITA, FRA, CHE, MAR ou POR. ");
    animal.setPaisProcedencia(paisProcedencia(sc.next()));
    System.out.println("Escribe a data de nacemento do animal (YYYY-MM-DD):");
    animal.setDataNac(sc.next());
  }//fin método
  public static void crearPersoa(Persoa persoa) {
    // Enchemos os datos do traballador comúns a todas as persoas.
    System.out.println("Escribe o DNI:");
    persoa.setDNI(sc.next());
    System.out.println("Escribe o nome:");
    persoa.setNome(sc.next());
    System.out.println("Escribe o telefono:");
    persoa.setTelefono(sc.next());
    System.out.println("Escribe a data de nacemento (YYYY-MM-DD):");
    persoa.setDataNac(sc.next());
  }//fin método
  public static void crearTraballador(Traballadores traballador) {
    int horario;
    // Logo os datos específicos dos traballadores. O Horario dado que debe ter
    // uns valores determinados, pedimos unha escolla e logo asignamos o valor noso.
    // Así garantimos que esten todos escritos igual, e facilita buscas, por exemplo.
    do {
      System.out.println("Escribe o horario do traballador (1-MAÑA, 2-TARDE, 3-PARTIDO):");
      horario = sc.nextInt();
      switch (horario) {
        case 1 ->
          traballador.setHorario(Horario.MAÑA);
        case 2 ->
          traballador.setHorario(Horario.TARDE);
        case 3 ->
          traballador.setHorario(Horario.PARTIDO);
        default -> {
          // Tratamento de excepción con reanudación.
          // Dase no caso de que se introduza un nº non válido.
          // Neste caso avísase do erro e a aplicación continúa.
          try {
            throw new AssertionError();
          } catch (AssertionError e) {
            System.out.println("Opción inválida, o número ten que ser entre 1 e 3, inténtao de novo.");
          }
        }//fin default
      }//fin switch
    } while (horario < 1 || horario > 3);
    //Para rematar, en caso de que sexa cuidador, tamén pedimos o soldo.
    if (traballador instanceof Cuidadores) {
      System.out.println("Indica o soldo:");
      ((Cuidadores) traballador).setSoldo(sc.nextDouble());
    }//fin if
  }//fin método
  public static void crearAdopcion(Adopcion adopcion) {
    Clientes cliente=new Clientes();
    System.out.println("Datos do cliente que quere adoptar");
    // Primeiro os datos xerais de calquera persoa.
    crearPersoa(cliente);
    System.out.println("Escriba a dirección:");
    // Logo os específicos do cliente.
    cliente.setDireccion(sc.next());
    adopcion.setCliente(cliente);
    //Eleximos animal.
    System.out.println("------");
    System.out.println("Animais dispoñibles.");
    System.out.println(Arrays.toString(listaAnimais));
    System.out.println("Escolle o animal que queres adoptar (0-3)");
    adopcion.setAnimal(listaAnimais[sc.nextInt()]);
    // E poñemos como data o día actual.
    adopcion.setDataAdopcion(LocalDate.now());
    System.out.println("Adopción rematada.");
  }//fin método

  public static void main(String[] args) {
    // PASO 1 LIGADURA DINÁMICA. 
    // Primeiro creamos unha referencia, tanto de animal como
    // de traballador, pero ata a execución do programa 
    // non se crea o obxecto que poderá ser calquera das subclases.
    Animal animal;
    Traballadores traballador;
    int opcion;
    do {
      boolean okAlta = false;
      amosarMenu();
      // Tratamento da excepción con interrupción.
      // No caso de que se introduza un valor non enteiro
      // a aplicación para, avisando do erro.
      try {
        System.out.println("Escolle unha opción:");
        opcion = sc.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Opción inválida, ten que ser un número entre 1 e 5, inténtao de novo.");
        break;
      }
      switch (opcion) {
        case 1 -> {
          //PASO 2 DA LIGADURA DINÁMICA DE ANIMAL.
          //Créase o obxecto can ou gato sobre unha referencia de tipo animal.
          System.out.println("Queres dar de alta un can ou un gato???");
          if (sc.next().equalsIgnoreCase("Can")) animal = new Can();
          else animal = new Gato();
          
          // Percórrese o array dos animais ata atopar unha posición baleira.
          // Cando se atopa, rexístrase o animal.
          for (int i = 0; i < listaAnimais.length; i++) {
            if (listaAnimais[i] == null) {
              // O OPERADO BOOLEANO INSTANCEOF devolve true se o obxecto é da clase
              // que se indica. A súa sintaxe: "obx instanceof Clase".
              if (animal instanceof Can) listaAnimais[i] = (Can) animal;
              else listaAnimais[i] = (Gato) animal;
              // Cando podemos facer efectiva a alta, o marcamos e 
              // chamamos a crearAnimal para completar datos.
              okAlta = true;
              crearAnimal(listaAnimais[i]);
              break;
            }//fin if   
          }//fin for
          System.out.println((okAlta) ? "Alta realizada correctamente." : "Sen prazas dispoñibles.");
        }//fin case dar de alta animal.
        case 2 -> {
          System.out.println("----------");
          System.out.println("ANIMAIS:");
          System.out.println(Arrays.toString(listaAnimais));
          System.out.println("Indica o animal que queres dar de baixa(0-3).");
          int numAnimal = sc.nextInt();
          if (listaAnimais[numAnimal] != null) listaAnimais[numAnimal] = null;
          else System.out.println("Ese animal non existe, inténteo de novo.");
        }//fin case dar baixa animal.
        case 3 -> {
          // Igual que no caso 1, pero para os traballadores.
          System.out.println("Queres dar de alta un cuidador ou un voluntario???");
          if (sc.next().equalsIgnoreCase("Cuidador")) traballador = new Cuidadores();
          else traballador = new Voluntarios();
         
          //Logo de crear o obxecto, o dou de alta no array de traballadores.
          // Nesta ocasión propoño unha sintaxe alternativo do operador instanceof
          for (int i = 0; i < listaTraballadores.length; i++) {
            if (listaTraballadores[i] == null) {
              if (traballador instanceof Cuidadores cuidadores) listaTraballadores[i] = cuidadores;
              else listaTraballadores[i] = (Voluntarios) traballador;
              okAlta = true;
              crearPersoa(listaTraballadores[i]);
              crearTraballador(listaTraballadores[i]);
              break;
            }//fin if   
          }//fin for
          System.out.println((okAlta) ? "Alta realizada correctamente." : "Sen prazas dispoñibles.");
        }//fin case dar de alta traballador.
        case 4 -> {
          System.out.println("----------");
          System.out.println("TRABALLADORES:");
          System.out.println(Arrays.toString(listaTraballadores));
          System.out.println("Indica o traballador que queres dar de baixa(0-4).");
          int numTraballador = sc.nextInt();
          if (listaTraballadores[numTraballador] != null) listaTraballadores[numTraballador] = null;
          else System.out.println("Ese traballador non existe, inténteo de novo.");
        }//fin case dar de baixa traballador.
        case 5 -> {
          System.out.println("Dar de alta unha adopción.");
          for (int i = 0; i < listaAdopcions.length; i++) {
            if (listaAdopcions[i] == null) {
              listaAdopcions[i] = new Adopcion();
              crearAdopcion(listaAdopcions[i]);
              okAlta = true;
              break;
            }//fin if   
          }//fin for
          System.out.println((okAlta) ? "Alta realizada correctamente." : "Sen prazas dispoñibles.");
        }//fin case dar de alta unha adopción.
        case 6 -> {
          System.out.println("\n________________________");
          System.out.println("INFORMACIÓN DA PROTECTORA.");
          System.out.println("----------");
          System.out.println("ANIMAIS:");
          System.out.println(Arrays.toString(listaAnimais));
          System.out.println("----------");
          System.out.println("TRABALLADORES:");
          System.out.println(Arrays.toString(listaTraballadores));
          System.out.println("----------");
          System.out.println("ADOPCIÓNS:");
          System.out.println(Arrays.toString(listaAdopcions));
        }//fin case imprimir datos da protectora.
        case 7 -> System.out.println("Ata outra!!!!");
        default -> {
          // Tratamento de excepción con reanudación.
          // Dase no caso de que se introduza un nº non válido.
          // Neste caso avísase do erro e a aplicación continúa.
          try {
            throw new AssertionError();
          } catch (AssertionError e) {
            System.out.println("Opción inválida, o número ten que ser entre 1 e 5, inténtao de novo.");
          }
        }//fin default
      }//fin switch
    } while (opcion != 7);
  }//fin main
}//fin clase
