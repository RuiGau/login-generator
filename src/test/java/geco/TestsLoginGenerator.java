package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestsLoginGenerator {

    private LoginService loginService;
    private LoginGenerator loginGenerator;

    @Before
    public void setUp(){
        loginService = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom1(){
        assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul"));
        assertTrue(loginService.loginExists("PDUR"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenom2(){
        assertEquals("JROL1", loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean"));
        assertTrue(loginService.loginExists("JROL1"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenom3(){
        assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul"));
        assertTrue(loginService.loginExists("PDUR"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenom4(){
        assertEquals("JRAL2", loginGenerator.generateLoginForNomAndPrenom("Ralling", "John"));
        assertTrue(loginService.loginExists("JRAL2"));
    }

    @Test
    public void testDeAccent(){

    }
}
