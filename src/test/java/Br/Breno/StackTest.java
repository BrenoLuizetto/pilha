package Br.Breno;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;


public class StackTest {
   
    private Stack p;
    @Before
    public void setup(){
        Stack p = new Stack(3);
    }
    @Test
    public void testEmptyStack() {
        

        boolean vazia = p.isEmpty();
        assertTrue("nova pilha deve estar vazia", vazia);
    }

    @Test
    public void testPush() {
        
        
        p.push(1);
        boolean vazia = p.isEmpty();
        assertFalse("pilha após inserção não deve estar vazia", vazia);
    }
    
    @Test
    public void testPeek() {
        
        
        p.push(1);
        p.push(2);
        int resp = p.peek();
        assertEquals("O valor no topo após 2 inserções deve ser 2", 2, resp);
    }

    @Test
    public void testisFull() {
        
        
        p.push(1);
        p.push(2);
        p.push(3);
        
        boolean full = p.isFull();
        assertEquals("A pilha deve estar cheia", full);
    }

    @Test
    public void testPop() {
        
        
        p.push(1);
        p.push(2);
        
        int value1 = p.pop();
        int value2 = p.pop();

        assertEquals("Remover o primeiro elemento deve ser 2", value2);
        assertEquals("Remover o segundo elemento deve ser 1", value1);
        boolean vazia = p.isEmpty();
        assertTrue("nova pilha deve estar vazia", vazia);
    }
}
