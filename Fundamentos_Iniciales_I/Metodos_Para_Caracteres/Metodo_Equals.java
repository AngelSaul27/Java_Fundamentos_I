package Fundamentos_Iniciales.Metodos_Para_Caracteres;
/**
 * @author Angel Saul Pascual Camacho
 * @version 12 - 01 - 2021
 */
public class Metodo_Equals {
    public static void main(String[] args) {
      String Caracteres = "Hola Mundo";
      String Caracteres2 = "hola mundo";

      //Aplicacion del metodo equals

      if (Caracteres.equals(Caracteres2)) {
        System.out.println("Son Iguales");
      }else{
        System.out.println("No Son Iguales");
      }

      //Aplicacion del metodo equalsIgnoreCase

      if (Caracteres.equalsIgnoreCase(Caracteres2)){
        System.out.println("Son Iguales");
      }else{
        System.out.println("No Son Iguales");
      }
      
      if (Caracteres == Caracteres2){
        System.out.println("Son Iguales");
      }else{
        System.out.println("No Son Iguales");
      }
    }
}
