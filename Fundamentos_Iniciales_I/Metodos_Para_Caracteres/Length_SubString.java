package Fundamentos_Iniciales.Metodos_Para_Caracteres;
/**
 * @author Angel Saul Pascual Camacho
 * @version 12 - 01 - 2021
 */
public class Length_SubString {
  public static void main(String[] args) {

    String Manipulacion = "Hola Mundo";

    //Conocemos las longitud de una cadena
    int longitud = Manipulacion.length();
    System.out.println("La longitud es: " + longitud);

    //Extraer datos de una cadena

    String Extraccion;
    Extraccion = Manipulacion.substring(0,4);

    System.out.println("La extraccion de 0 a 4 es: " + Extraccion);

    /*Al Extraer Se Cuenta Del 0 al Maximo De Caracteres
    Disponibles (length nos lo indica)*/

    //EJEMPLO DE EXTRACCION COMPLETA
    Extraccion = Manipulacion.substring(0,10);
    System.out.println("La extraccion de 0 a 10 es: " + Extraccion);

  }
}
