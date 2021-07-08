/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10miexcepcion;

/**
 *
 * @author lapca
 */
public class Cajero {
    public static void main(String[]args)throws TresRetirosException{
        CuentaBancaria cuenta=new CuentaBancaria();
        try{
             try{
                 try{
                int i=1;
            while (i<=3)
                {
                System.out.println("\nRETIRO "+i+"\n");
                i+=1;
                cuenta.depositar(100);
                cuenta.depositar(10);
                cuenta.getSaldo();
                cuenta.retirar(50);
                cuenta.getSaldo();
                }
                throw new TresRetirosException();
                 }catch(TresRetirosException tre){
                     System.out.println("Error, no se pueden hacer mas de 3 retiros");
                     
                 }
            }catch(SaldoMenorVeinteMilException smvme){
                System.out.println("Error, no se puede depositar más de 20,000");
            }
        }catch(SaldoInsuficienteException sie){
            System.out.println("Error, no tienes tanto dinero");
        }
        
    }
}
