/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10miexcepcion;

/**
 *
 * @author Alna
 */
public class TresRetirosException extends Exception{
    public TresRetirosException(){
        super("No se pueden hacer más de 3 retiros");
    }
    
}
