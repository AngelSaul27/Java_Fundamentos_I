package Fundamentos_Iniciales.Operadores_De_Programacion;
/**
 * @author Angel Saul Pascual Camacho
 * @version 03 - 01 - 2020
 */
public class Incremento {
    
    public static void main(String args[]){
        int Value = 5;
        /* Sufijo - Prefijo */
        int Rel = Value++; //Post-Incemento
        int Rel2 = ++Value; //Pre-Incremento
        
        System.out.println(Rel);
        System.out.println(Rel2);
        
        int Value2 = 10;
        int Rel3 = Value2--; //Post-Decremento
        int Rel4 = --Value2; //Pre-Decremento
        
        System.out.println(Rel3);
        System.out.println(Rel4);
    }
}
