package Fundamentos_Iniciales.Operadores_De_Programacion;
/**
 * @author Angel Saul Pascual Camacho
 * @version 03 - 01 - 2020
 */
public class Asignacion {
    public static void main(String args[]){
        
        int Value = 5, Value2 = 10;
        
        /* ASIGNACION */
        Value = Value2; // (a=b)
        System.out.println(Value);
        Value = 5;
        
        /* SUMA Y ASIGNACION */
        Value += Value2; // (a=a+b)
        System.out.println(Value);
        Value = 5;
        
        /* RESTA Y ASIGNACION */
        Value -= Value2; // (a=a-b)
        System.out.println(Value);
        Value = 5;
        
        /* MULTIPLICACION Y ASIGNACION */
        Value *= Value2;// (a=a*b)
        System.out.println(Value);
        Value = 5;
        
        /* DIVISION Y ASIGNACION */
        Value /= Value2; // (a=a/b)
        System.out.println(Value);
        Value = 5;
        
        /* MODULO Y ASIGNACION */
        Value %= Value2; // (a=a%b)
        System.out.println(Value);
        Value = 5;
    }
}
