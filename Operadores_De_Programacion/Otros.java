package Fundamentos_Iniciales.Operadores_De_Programacion;
/**
 * @author Angel Saul Pascual Camacho
 * @version 03 - 01 - 2020
 */
public class Otros {
    public static void main(String args[]){
        
       int Value = 10, Value2 = 5;
       
       /* AND Logico [ENTRE BITS] */
        if(Value > Value2 & Value2 < Value ){
            System.out.println("LOS DOS ESTAN BIEN [AND]");
        }else{
            System.out.println("UNO MAL OTRO BIEN");
        }
        
        /* OR Logico Inclusivo [ENTRE BITS] */
        if(Value == Value2 | Value2 < Value ){
            System.out.println("UNO DE LOS DOS ESTA BIEN [OR]");
        }else{
            System.out.println("NINGUNO ESTA BIEN");
        }
        
        /* OR Logico Inclusivo [ENTRE BITS] */
        if(Value == Value2 ^ Value2 < Value ){
            System.out.println("PENDIENTE..");
        }else{
            System.out.println("PENDIENTE...");
        }
        
        /* <<< >>> <<<< >>>> <<< >>> <<< >>> <<<< >>>> <<< >>> */
       
        /* NOT Logico */
        if(Value != Value2){
            System.out.println("NO SON IGUALES [NOT]");
        }else{
            System.out.println("SON IGUALES");
        }
        if(!(Value <= Value2)){
            System.out.println("NO SON IGUALES [NOT]");
        }else{
            System.out.println("SON IGUALES");
        }
        
        /* AND Logico*/
        if(Value > Value2 && Value2 < Value ){
            System.out.println("LOS DOS ESTAN BIEN [AND]");
        }else{
            System.out.println("UNO MAL OTRO BIEN");
        }
        
        /* OR Logico Inclusivo*/
        if(Value == Value2 || Value2 < Value ){
            System.out.println("UNO DE LOS DOS ESTA BIEN [OR]");
        }else{
            System.out.println("NINGUNO ESTA BIEN");
        }
        
        /* <<< >>> <<<< >>>> <<< >>> <<< >>> <<<< >>>> <<< >>> */
        
        /*  
            NEGACION ~
        
            Corrimientos de bits [ENTRE BITS]
            << >>  >>>
            INVESTIGAR 
            >> << <<<
        */ 
        
        /* <<< >>> <<<< >>>> <<< >>> <<< >>> <<<< >>>> <<< >>> */
        
        /*Todos los operadores binarios que tienen la misma prioridad 
        (excepto los operadores de asignación) son evaluados de izquierda a derecha.
        Los operadores de asignación son evaluados de derecha a izquierda*/
    }
}
