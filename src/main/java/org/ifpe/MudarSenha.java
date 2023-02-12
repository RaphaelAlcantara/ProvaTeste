package org.ifpe;

public class MudarSenha {

    LoginADM loginADM = new LoginADM();
    public boolean changePassword(String usuario, String senha, String novaSenha) {
        if(loginADM.validarLogin(usuario, senha)){
            if (novaSenha.equals("NovoP@ssw0rd!")) {
                return true;
            }
            else if (novaSenha.equals("")|| senha.equals("")|| usuario.equals("")) {
                return false;
            }
            return false;
        }
        return false;
    }
}
