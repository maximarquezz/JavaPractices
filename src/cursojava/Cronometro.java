package cursojava;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;

class cronometroActionListener implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){
        Date now = new Date();
        System.out.println("Hora actual: " + now);
        Toolkit.getDefaultToolkit().beep();
    }
    
}

public class Cronometro{
    
    public static void main(String[] args){
        
        cronometroActionListener e = new cronometroActionListener();
        Timer cronometro = new Timer(5000, e);
        cronometro.start();
        
        JOptionPane.showMessageDialog(null, "hola");
        System.exit(0);
    }  
    
}
