package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestLoginService {

    LoginService service;
    LoginService serviceEmpty;

    @Test
    public void testLoginExists()
    {
        assertTrue(this.service.loginExists("log1"));
        assertTrue(this.service.loginExists("log2"));
        assertTrue(this.service.loginExists("log3"));
        assertTrue(this.service.loginExists("log4"));
        assertTrue(this.service.loginExists("log5"));
    }

    @Test
    public void testAddLogin() {
        serviceEmpty.addLogin("logAdd");
        List<String>logs = serviceEmpty.findAllLogins();
        assertEquals(1, logs.size());
        assertEquals("logAdd", logs.get(0));
    }

    @Test
    public void testFindAllLoginsStartingWith() {
        List<String>logs = service.findAllLoginsStartingWith("log");
        assertEquals(5, logs.size());
        assertEquals("log1", logs.get(0));

    }

    @Test
    public void testFindAllLogins() {
        List<String> logs = service.findAllLogins();
        assertEquals(6, logs.size());
        assertEquals("log1", logs.get(0));
        assertEquals("paslog6", logs.get(5));
    }

    @Before
    public void setUp() throws Exception {
        String[] logins = {"log1", "log2", "log3", "log4", "log5", "paslog6"};
        this.service = new LoginService(logins);
        this.serviceEmpty = new LoginService(new String[0]);
    }
}
