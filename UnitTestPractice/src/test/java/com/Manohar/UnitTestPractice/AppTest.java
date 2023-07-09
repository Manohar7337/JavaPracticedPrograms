package com.Manohar.UnitTestPractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /* *
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    } 
    @Test
    public void test1(){
    	Calci c=new Calci();
    	int res=c.add(10, 20);
    	assertEquals(30, res);
    }
   
    
}
