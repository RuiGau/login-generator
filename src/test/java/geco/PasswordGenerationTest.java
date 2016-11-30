package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Test
    public void testGetRandomPassword() throws Exception {
        String pass1 = PasswordGeneration.getRandomPassword();
        System.out.println(pass1);
        assertEquals(8, pass1.length());
        String pass2 = PasswordGeneration.getRandomPassword();
        System.out.println(pass2);
        assertEquals(8, pass2.length());
        assertNotEquals(pass1, pass2);
    }

}