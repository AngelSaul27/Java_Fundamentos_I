package Tipos_De_Datos;
import Tipos_De_Datos.*;
/**
 * @author Angel Saul Pascual Camacho
 * @version 23 - 12 - 2020
 */
public class Enteros {
    
    public void TD_Byte() {
        byte desde = -128; /* 8 bits */
        byte hasta = 127;

        ImprimirByte(desde,hasta);
    }

    public void TD_Short() {
        short desde = -32768; /* 16 bits */
        short hasta = 32767;

        ImprimirShort(desde,hasta);
    }

    public void TD_Int() {
        int desde = -2147483648; /* 32 bits */
        int hasta = 2147483647;

        ImprimirEnt(desde,hasta);
    }

    public void TD_Long() {
        long desde = -1000000000; /* 64 bits */
        long hasta = 1000000000;

        ImprimirLong(desde,hasta);
    }

    public void ImprimirEnt(int valor, int valor1){
        System.out.println("Tamaño desde : " + valor);
        System.out.println("Tamaño Hasta : " + valor1);
    }
    
    public void ImprimirShort(short valor, short valor1){
        System.out.println("Tamaño desde : " + valor);
        System.out.println("Tamaño Hasta : " + valor1);
    }
    
    public void ImprimirLong(long valor, long valor1){
        System.out.println("Tamaño desde : " + valor);
        System.out.println("Tamaño Hasta : " + valor1);
    }
    
    public void ImprimirByte(byte valor, byte valor1){
        System.out.println("Tamaño desde : " + valor);
        System.out.println("Tamaño Hasta : " + valor1);
    }
    
    public void ImprimirString(String valor){
        System.out.println("Tamaño desde : " + valor);
    }
    
    public void ImprimirFloat(float valor, float valor1){
        System.out.println("Tamaño desde : " + valor);
        System.out.println("Tamaño Hasta : " + valor1);
    }
    
    public void ImprimirOtros(char valor, char valor1, boolean valor2, boolean valor3){
        System.out.println("Tamaño desde : " + valor);
        System.out.println("Tamaño Hasta : " + valor1);

        System.out.println("Tamaño desde : " + valor2);
        System.out.println("Tamaño Hasta : " + valor3);
    }
    
    
    public static void main(String args[]) {

        Enteros Ent = new Enteros();
        Ent.TD_Byte();
        Ent.TD_Int();
        Ent.TD_Long();
        Ent.TD_Short();
        
        Decimales Dec = new Decimales();
        Dec.TD_Float();
        
        Text text = new Text();
        text.TD_String();
        
        Otros otros = new Otros();
        otros.TD_Otros();
        
    }

}
