package Fundamentos_Iniciales.Estrtucturas_Interactivas;
/**
 * @author Angel Saul Pascual Camacho
 * @version 05 - 01 - 2020
 */
public class Do_While {
    public static void main(String[] args) {
        
        int Value = 0;
        
        /* <<>><<>><<<>>> [Ciclo] <<>><<>><<<>>> 
        Se repite hasta que la condicion se falsa */
        do{
            System.out.println("Ingreso: " + Value++);
        }while(Value <=10); //Aplica la condicion al llegar aqui
        /* Se ejecuta al menos una vez*/
    }
}
