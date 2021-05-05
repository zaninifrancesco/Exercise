/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
import exceptions.Excep.NameOrSurnameNullException;
import exceptions.Excep.NameOrSurnameIsEmpyException;

/**
 *
 * @author francesco
 */
import exceptions.Excep.RegistrationParameter;
public class RegistrationManager {
    private static RegistrationManager _instance = null;
    
    public static RegistrationManager getInstance() {
        if (_instance == null) {
            _instance = new RegistrationManager();
            return _instance;
        } else {
            return _instance;
        }
    }
    
    private RegistrationManager()  {
        super();
    }
    
    public void register(String name, String surname) throws NameOrSurnameNullException, NameOrSurnameIsEmpyException{
        if(name == null){
            throw new NameOrSurnameNullException(RegistrationParameter.NAME);
        }
        if(surname == null){
            throw  new NameOrSurnameNullException(RegistrationParameter.NAME);
        }
        
        if(name.isEmpty()){
            throw  new NameOrSurnameIsEmpyException(RegistrationParameter.NAME);
        }
        
        if(surname.isEmpty()){
            throw new NameOrSurnameIsEmpyException(RegistrationParameter.SURNAME);
        }
               
                
    }
    
}
