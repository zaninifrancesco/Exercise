/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletoneTest;

/**
 *
 * @author francesco
 */
public class UserManager {
    
    private static UserManager _instance = null;
    
    public static UserManager getInstance() {
        if (_instance == null) {
            _instance = new UserManager();
            return _instance;
        } else {
            return _instance;
        }
    }
    
    private UserManager() {
        super();
    }
    
    public void printl(){
        System.out.println("babaoey");
    }
    
}
