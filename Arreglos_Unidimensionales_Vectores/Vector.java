package Fundamentos_Iniciales.Arreglos_Unidimensionales_Vectores;
import java.util.Arrays;
/**
 * @author Angel Saul Pascual Camacho
 * @version 12 - 01 - 2021
 */
public class Vector {
  public static void main(String[] args) {

    // Declaracion Comun
    int Entero[] = new int[2];
    String Caracteres[] = new String[2];
    // Declaracion Con Valores Definidos
    String Caracteres2[] = {"Hola","Mundo"};
    // Sin Inicalizacion
    String Caracteres3[];

    // Rellenado Manual
    Entero[0] = 1;
    Entero[1] = 2;
    Caracteres[0] = "Hola";
    Caracteres[1] = "Mundo";

    //Rellenado Automatico
    Caracteres3 = new String[3]; //Se Inicializa el arreglo anterior
    for(int i = 0; i < Caracteres3.length; i++){
      Caracteres3[i] = "Posicion: " + i;
    }

    //Impresion Manual;
    System.out.println("Arreglo 1:\n" + Caracteres[0] + Caracteres[1]);

    //Impresion de Arreglos por for
    System.out.println("Arreglo 2:");
    for (int i = 0; i < Entero.length; i++){
      System.out.print(" " + Entero[i]);
    }

    //Impresion Con El Metodo Arrays.toString
    System.out.println("\nArreglo 3:\n" + Arrays.toString(Caracteres3));

  }
}
