package Fundamentos_Iniciales.Estrtucturas_Interactivas;
/**
 * @author Angel Saul Pascual Camacho
 * @version 05 - 01 - 2020
 */
public class While {
    public static void main(String[] args) {
        
        int Value = 0;
        
        /* <<>><<>><<<>>> [Ciclo] <<>><<>><<<>>> 
        Se repite hasta que la condicion se falsa */

        while(Value <=10){
            System.out.println("Ingreso: " + Value++);
        }

    }
}
