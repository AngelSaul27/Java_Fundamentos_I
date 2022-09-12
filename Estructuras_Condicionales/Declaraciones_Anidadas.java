package Fundamentos_Iniciales.Estructuras_Condicionales;
/**
 * @author Angel Saul Pascual Camacho
 * @version 05 - 01 - 2020
 */
public class Declaraciones_Anidadas {
    
    public static void main(String args[]){
        
        int age = 25;

        /*<<>><<>> Sin Estructuras Anidadas <<>><<>>*/

        if(age>0){ //Inicio Primera Condicion
            if(age>16){
                System.out.println("Welcome");
            }else{
                System.out.println("Welcome 2");
            }

        } else { //Fin Primer Condicion
            System.out.println("Welcome 3");
        }

        /*<<>><<>> Con Estructuras Anidadas <<>><<>>*/

        if (age <= 0){
            System.out.println("Welcome");
        }else if( age <= 16){ // Fin Segunda condicion
            System.out.println("Welcome 2");
        }else if (age <100){ // Fin Tercera condicion
            System.out.println("Welcome 3");
        }else{ // Fin Primer condicion
            System.out.println("Welcome 4"); 
        }

    }
    
}
