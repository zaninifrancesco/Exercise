/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions.Excep;

/**
 *
 * @author francesco
 */
public class NameOrSurnameNullException extends Exception{

    public NameOrSurnameNullException(RegistrationParameter par) {
        super("Il parametro " + par + " e' null");
    }
    
}
