package org.ifpe;

public class InativarConta {
    LoginADM loginADM = new LoginADM();

        public boolean inativarConta(String username, String password, String EmailCode){
            if (loginADM.validarLogin(username, password)){
                return loginADM.validarEmail(EmailCode);
            }
            return false;
        }

}

