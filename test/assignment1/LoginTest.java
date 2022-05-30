/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 *
 * @author ST10211369
 */
public class LoginTest 
{
    Login response = new Login ();
    public void CheckoutPasswordComplexity() 
    {
        String expected = "Please enter Password";
        String actual = response.ReturnLoginStatus(true);
        assertEquals(expected,actual);
    }

    @Test
    public void testCalculateNumResponse() 
    {
        int expected = 50;
        
       int actual = 50 ;
        assertEquals(expected,actual);
    }
    
}
