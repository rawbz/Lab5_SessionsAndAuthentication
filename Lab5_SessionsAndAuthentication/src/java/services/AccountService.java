
package services;

import models.User;

/**
 *
 * @author rmjba
 */
public class AccountService {
    public User login(String username, String password){
        
        if(password.equals("password") && username.equals("abe") || username.equals("barb")){
            return new User(username, null);
        }else{
            return null;
        }
    }
    
}
