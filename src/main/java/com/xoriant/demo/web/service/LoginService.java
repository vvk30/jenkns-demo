package com.xoriant.demo.web.service;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	private static boolean isLoggedIn;

    public boolean validateUser(String userid, String password) {
    	
    	if(userid.equalsIgnoreCase("vvk30")
                && password.equalsIgnoreCase("dummy"))
    	{
    		isLoggedIn = true;
    	}
    		
    	
    	
        return isLoggedIn;
    }
    
    public boolean getIsLoggedIn() {
    	return isLoggedIn;
    }

}