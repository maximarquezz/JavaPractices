package cursojava;

import javax.swing.JOptionPane;

public class While {
    
    public static void main(String args[]){
        
        String password = "Maxi";
        String password_input = "";
        
        while (!password.equals(password_input)){
            password_input = JOptionPane.showInputDialog("Introduzca la contraseña");
            
            if (password_input.equals(password)){
                JOptionPane.showMessageDialog(null, "La contraseña es correcta");
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR: contraseña incorrecta");
            }
        }
        
    }
    
}
