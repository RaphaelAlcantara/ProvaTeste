import org.ifpe.LoginADM;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLoginADM {


    @Test
    public void testLoginValido() {
        LoginADM loginADM = new LoginADM();
        boolean resultado = loginADM.validarLogin("12345678911", "P@ssw0rd!");
        assertTrue(resultado);
    }

    @Test
    public void testLoginInvalido() {
        LoginADM loginADM = new LoginADM();
        boolean resultado = loginADM.validarLogin("12345678911", "P@1234");
        assertFalse(resultado);
    }

    @Test
    public void testLoginVazio() {
        LoginADM loginADM = new LoginADM();
        boolean resultado = loginADM.validarLogin("", "");
        assertFalse(resultado);
    }



}
