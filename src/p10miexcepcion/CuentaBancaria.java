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
public class CuentaBancaria {
   
    private double saldo;

    public CuentaBancaria() {
        saldo=0;
    }

    public void getSaldo() {
        System.out.println("Saldo "+saldo);
    }
    
    public void depositar(double monto) throws SaldoMenorVeinteMilException{
        System.out.println("Depositando "+monto+" pesos");
            saldo+=monto;
            if (monto>20000){
                throw new SaldoMenorVeinteMilException();
            }
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando "+monto);
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        else
            saldo-=monto;
       }
       

}

