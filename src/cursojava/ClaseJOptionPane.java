package cursojava;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class ClaseJOptionPane {
    
    public static void main(String args[]){
        
        /*JOptionPane es una clase del package javax.swing.
        Los métodos asociados a esta clase son ESTÁTICOS, osea, debemos
        escribir el nombre de la clase . el método que queremos usar*/
        
        String nombre_input = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad_input = JOptionPane.showInputDialog("Introduce tu edad");
        int edad = Integer.parseInt(edad_input);
        
        System.out.println("Tu nombre es " + nombre_input + " y tendrás " + (edad+1) + " años en 2025.");
        
    }
    
}
