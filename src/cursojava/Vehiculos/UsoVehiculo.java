package cursojava.Vehiculos;

public class UsoVehiculo {
    
    public static void main(String args[]){
        
        Furgoneta ford = new Furgoneta("rojo", true, false, 2, 250);
        System.out.println(ford.getRuedas());
        
    }
    
}
