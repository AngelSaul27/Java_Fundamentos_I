package Fundamentos_Iniciales.Estructuras_Condicionales;
/**
 * @author Angel Saul Pascual Camacho
 * @version 05 - 01 - 2020
 */
public class Switch {
    public static void main(String args[]){

        int Key1 = 5;

        switch (Key1) {
            case 1:
                System.out.println("Opcion 1");
            break;
            case 2:
                System.out.println("Opcion 2");
            break;
            case 3:
                System.out.println("Opcion 3");
            break;
            case 4:
                System.out.println("Opcion 4");
            break;
            case 5:
                System.out.println("Opcion 5");
            break;
        
            default:
                System.out.println("Error");
                /* SI NO COINCIDE CON NINGUN 
                OTRO VALOR SE EJECUTA */
                break;
        }

        /* <<< >>> <<<< >>>> <<< >>> <<< >>> <<<< >>>> <<< >>> */

        int Key2 = 6;

        switch (Key2) {
            case 1:
                System.out.println("Opcion 1");
            break;
            case 2:
                System.out.println("Opcion 2");
            break;
            case 3:
                System.out.println("Opcion 3");
            break;
            case 4:
                System.out.println("Opcion 4");
            break;
            case 5:
                System.out.println("Opcion 5");
            break;
        
            default:
                System.out.println("Error");
                /* SI NO COINCIDE CON NINGUN 
                OTRO VALOR SE EJECUTA */
                break;
        }
    }
}
