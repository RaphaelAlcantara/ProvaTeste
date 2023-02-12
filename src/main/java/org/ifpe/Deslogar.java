package org.ifpe;

public class Deslogar {
    LoginADM loginADM = new LoginADM();

    public boolean deslogar(String username, String password, String logoutCode){
        if (loginADM.validarLogin(username, password)){
            return loginADM.validarLogout(logoutCode);
        }
        return false;
    }

}
