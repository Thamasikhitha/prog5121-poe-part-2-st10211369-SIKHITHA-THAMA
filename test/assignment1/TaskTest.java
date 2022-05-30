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
public class TaskTest 
{
    
    public TaskTest() 
    {
        String expectedString = " add tas feature";
        String actual = new String ();
        assertEquals(expectedString,actual);
    }

    @Test
    public boolean testCheckTaskDescription() 
    {
        String expectedString = "Create add task feature to add task users";
        return(expectedString.length() <= 50);
    }

    @Test
    public void testCreareTaskID() 
    {
        
    }

    @Test
    public void testPrintTaskDeatils() 
    {
        String expectedString = " Mike Smith";
        System.out.println("Mike Smith");
    }

    @Test
    public boolean testReturnTotalhours(boolean returntotalHours) 
    {
        int totalHours= 10;
        return returntotalHours;
    }
    
}
