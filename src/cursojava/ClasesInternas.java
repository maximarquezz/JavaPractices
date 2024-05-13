package cursojava;

import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ClasesInternas {
    public static void main(String[] args){
        
        Clock reloj = new Clock(3000, true);
        reloj.startClock();
        JOptionPane.showMessageDialog(null, "");
        System.exit(0);
        
    }
}

class Clock{
    
    private int delay;
    private boolean sound;
    
    public Clock(int delay, boolean sound){
        this.delay = delay;
        this.sound = sound;
    }
    
    public void startClock(){
        ActionListener e = new getActualTime();
        Timer t = new Timer(delay, e);
        t.start();
    }
    
    private class getActualTime implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("Hora actual: " + now);
            
            if (sound){
                Toolkit.getDefaultToolkit().beep();
            }
        }
        
    }
    
}