/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ficha0_dsa.Complexo;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Diogo
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    
    @Test
    public void retornaNumeroReal(){
        
        Complexo z = new Complexo(4,3);
        assertEquals(4.0, z.getParteReal());
        
        
    }
    
    
    @Test
    public void retornaNumeroImaginario(){
        
        
        Complexo z = new Complexo(4,3);
        assertEquals(3.0, z.getParteImaginaria());
    }
    
    
    
    
    @Test
    public void retornaSoma(){
        
        Complexo c1 = new Complexo(1,1);
        Complexo c2 = new Complexo(2,2);
        Complexo r = Complexo.somar(c1, c2);
        assertEquals(new Complexo(3,3), r);
        
        
       
        
        
    }
    
    
    
    @Test 
    public void retornaSubtracao(){
        
        
        Complexo c1 = new Complexo(1,1);
        Complexo c2 = new Complexo(2,2);
        Complexo r = Complexo.subtrair(c1, c2);
        
        assertEquals(new Complexo(-1,-1), r);
    }
    
    
    
    
    
    @Test
    public void retornaMult(){
        
        
        Complexo c1 = new Complexo(1,1);
        Complexo c2 = new Complexo(2,2);
        Complexo r = Complexo.multiplicar(c1, c2);
        
        
        
        assertEquals(new Complexo(0,4), r);
        
    }
    
    
    
    
    
    @Test
    public void retornaDividir(){
        
        Complexo c1 = new Complexo(1,1);
        Complexo c2 = new Complexo(2,2);
        Complexo r = Complexo.dividir(c1, c2);
        
        
        assertEquals(new Complexo(0.5, 0.0), r);
        
        
        
    }
    
   
    
    
    
    
    
    @Test
    public void testeToString(){
        
        
        Complexo r = new Complexo(1,1);
        
        String res = r.toString();
        
        assertEquals("1.0+1.0i", res);
       
    }
    
    
    
    
    
}
