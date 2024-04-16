package cursojava;

import javax.swing.JOptionPane;

public class While2 {
    
    public static void main(String args[]){
        
        int i = 1;
        int num_user = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al 100"));

        int num_rand = (int) (Math.random() * 100);
        
        while (num_rand != num_user){
            if (num_user > num_rand){
               JOptionPane.showMessageDialog(null, "Incorrecto, el numero introducido es mayor al generado");
               num_user = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
            }
            else if (num_user < num_rand){
                JOptionPane.showMessageDialog(null, "Incorrecto, el numero introducido es menor al generado");
                num_user = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
            }
            i++;
        }
        
        JOptionPane.showMessageDialog(null, "Correcto: el numero era " + num_rand + " y te llevo " + i + " intentos.");
    }
    
}
