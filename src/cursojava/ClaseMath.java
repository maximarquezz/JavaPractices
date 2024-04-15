package cursojava;

public class ClaseMath {
    
    public static void main(String args[]){
        
        //Raíz cuadrada de un número (Math.sqrt)
        double res_n1 = Math.sqrt(3);
        System.out.println(res_n1);
        
        //Redondear un número (Math.round) y refundición o CASTING
        int res_n2 = (int) Math.round(9.8);
        System.out.println(res_n2);
        
        /*Math.round sirve para cambiar el tipo de dato primitivo que
        retornará un método.
        Debe manejarse CON CUIDADO, ya que puede resultar en la pérdida de datos.
        */
        
        //Potencia de un número
        int res_n3 = (int) Math.pow(5, 2);
        System.out.println(res_n3);
        
        
    }
    
}
