package Fundamentos_Iniciales.Operadores_De_Programacion;
/**
 * @author Angel Saul Pascual Camacho
 * @version 03 - 01 - 2020
 */
public class Relacionales {
    public static void main(String args[]){
        int Value = 5,Value2 = 10;
        
        /* Igualdad */
        if(Value == Value2){
            System.out.println(Value + " SI SON IGUAKES " + Value2);
        }else{
            System.out.println(Value + " NO SON IGUALES " + Value2);
        }
        
        /* Distinto */ 
        if(Value != Value2){
            System.out.println(Value + " SON DISTINTOS " + Value2);
        }else{
            System.out.println(Value + " SON IGUALES " + Value2);
        }
        
        /* Menor Que */
        if(Value < Value2){
            System.out.println(Value + " ES MENOR " + Value2);
        }else{
            System.out.println(Value + " ES MAYOR " + Value2);
        }
        
        /* Mayor Que */
        if(Value > Value2){
            System.out.println(Value + " ES MAYOR " + Value2);
        }else{
            System.out.println(Value + " ES MENOR " + Value2);
        }
        
        /* Menor o Igual Que */
        if(Value <= Value2){
            System.out.println(Value + " ES MENOR O IGUAL QUE " + Value2);
        }else{
            System.out.println(Value + " ES MAYOR O IGUAL QUE " + Value2);
        }
        
        /* Mayor o Igual Que*/
        if(Value >= Value2){
            System.out.println(Value + " ES NAYOR O IGUAL QUE " + Value2);
        }else{
            System.out.println(Value + " ES MENOR O IGUAL QUE " + Value2);
        }
    }
}
