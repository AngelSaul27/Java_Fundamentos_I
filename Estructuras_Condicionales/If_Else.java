package Fundamentos_Iniciales.Estructuras_Condicionales;
/**
 * @author Angel Saul Pascual Camacho
 * @version 05 - 01 - 2020
 */
public class If_Else {
    public static void main(String args[]){

        int Value = 10, Value2 = 5;

        //     Condicion   //
        if (Value > Value2){
            System.out.println("Condicion Verdadera " + Value + " es mayor que " + Value2);
        } else { 
            System.out.println("Condicion Falsa " + Value + " no es mayor que " + Value2);
        }
        if (Value == Value2){
            System.out.println(Value + " Es igual a " + Value2);
        }else {
            System.out.println(Value + " No es igual a " + Value2);
        }

        /* NOTA: Recordar usar dos signos ([a == b]?) ya que si usamos solamente uno
        estamos haciendo uso de los operadores de asigaccion (a = b) y no hacemos uso 
        de las condiciones */
    }
}
