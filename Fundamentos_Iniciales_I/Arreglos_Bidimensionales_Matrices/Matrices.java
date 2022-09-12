package Fundamentos_Iniciales.Arreglos_Bidimensionales_Matrices;
import java.util.Arrays;
/**
 * @author Angel Saul Pascual Camacho
 * @version 12 - 01 - 2021
 */
public class Matrices {
    public static void main(String[] args) {

      // Declaracion de una Matriz Bidimensional
      int Bidimensional[][] = new int[5][5];
      String CaracteresBDM[][] = new String[5][5];

      // LLenado de datos de manera manual
      Bidimensional[0][0] = 1;
      Bidimensional[1][0] = 1;
      Bidimensional[2][0] = 1;
      // ..... y sucesivamente

      // LLenado de datos de manera automatica
      for(int i = 0; i < CaracteresBDM.length; i++){
        for(int j = 0; j < CaracteresBDM[0].length; j++){
          CaracteresBDM[i][j] = "Columna :" + i + " Fila: " + j ;
        }
      }

      //Impresion de datos manual
      System.out.println("Arreglo Rellenado Manual:");
      System.out.print(Bidimensional[0][0] + " " + Bidimensional[0][0] + " " +
       Bidimensional[1][0] + " " + Bidimensional[2][0] + " " +
       Bidimensional[3][0] + " " + Bidimensional[4][0] + "\n" );
       // ..... y sucesivamente

       //Impresion con for
       System.out.println("Arreglo Rellenado Automatico [Impreso con For]");
       for(int i = 0; i < Bidimensional.length; i++){
         for(int j = 0; j < Bidimensional[0].length; j++){
           System.out.print(Bidimensional[i][j] + " ");
         }
       }
       //Impresion de datos con Arrays.deepToString
       System.out.println("\nArreglo Rellenado Automatico");
       System.out.println(Arrays.deepToString(CaracteresBDM));
       // "Arrays.deepToString Solo funciona para el arreglo Bidimensional"

    }
}
