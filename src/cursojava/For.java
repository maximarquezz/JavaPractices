package cursojava;

import javax.swing.JOptionPane;

public class For {
    
    public static void main(String args[]){
        
        boolean arroba = false;
        
        String email = JOptionPane.showInputDialog("Email");
        
        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@'){
                arroba = true;
            }
        }
        
        if (arroba == true){
            System.out.println("Valido");
        }
        else{
            System.out.println("Invalido");
        }
        
    }
    
}
