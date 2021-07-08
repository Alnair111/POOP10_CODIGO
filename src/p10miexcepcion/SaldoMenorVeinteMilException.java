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
public class SaldoMenorVeinteMilException extends Exception {
    public SaldoMenorVeinteMilException(){
            super("El saldo no puede ser mayor a 20000");  
    }
}
