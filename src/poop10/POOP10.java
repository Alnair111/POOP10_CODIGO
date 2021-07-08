/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 *
 * @author lapca
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensajes []={"Primero","Segundo","Tercero"};
        try{
        for (int i=0; i<=3; i++){
            System.out.println(mensajes[i]);
        }
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Error: Tu apuntador esta fuera de rango");
        } 
        
        System.out.println("###########Ejercicio2##########");
        int a=8, b=7;
        try{
            float c = (float) a/b;
            System.out.println("C = "+c);
        }catch(ArithmeticException ac){
            System.out.println("Error: dividir entre cero");
        }finally{
            System.out.println("A pesar de todo, este bloque finally se ejecuta");
        }
        
        System.out.println("###########Ejercicio3##########");
        ///Try Catch anidados 
        ///Siempre debe ir de lo mas particular a lo general
        
        try{
            int d=99/0;
            System.out.println("D =" +d);
        }catch(ArithmeticException ac){
            System.out.println("Error: División entre cero");   
        }catch(Exception e){
            System.out.println("Error Exception general");
        }finally{
            System.out.println("El bloque finally siempre se ejecuta");
        }
       
         System.out.println("###########Ejercicio4##########");
         
         try{
             int division = metodoPropagaExc(55,0);
             System.out.println("Division "+division);
         }catch(ArithmeticException ac){
             System.out.println("Exception aritmetica arrojada: ");
             //ae.printStackTrace();
         }
       
    }
     
    public static int metodoPropagaExc(int x, int y)throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException();
        }
        return x/y;
    }
}
