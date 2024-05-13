package cursojava.Empresa;

import java.util.Arrays;

public class UsoEmpresa{
    
    public static void main(String args[]){
        
        Empleado[] empleados = {
            new Empleado("Alejandro Perez", 150000, 2024, 04, 19),
            new Empleado("Juan Suarez", 110000, 2025, 10, 26),
            new Empleado("Rodrigo Cavagna", 80000, 2022, 01, 07),
            new Empleado("Alejandro Perez", 150000, 2024, 04, 19),
            new Empleado("Juan Suarez", 110000, 2025, 10, 26),
            new Empleado("Rodrigo Cavagna", 80000, 2022, 01, 07),
            new Empleado("Maximiliano Marquez"),
            new Jefe("Benjamin Lopez", 1200000, 2010, 02, 23, 1)
        };
        
        Jefe jefe_RRHH = (Jefe) empleados[7];
        jefe_RRHH.setIncentivo(10000);
        /* Si no hacemos casting no podemos usar los métodos propios de la clase Jefatura,
        porque el objeto base es de tipo Empleado, más allá de que un Jefe sea SIEMPRE un Empleado.
        Osea, más allá de que funcione el polimorfismo, los métodos no son polimorfos en este caso*/
        System.out.println(jefe_RRHH.tomarDecisiones("Despedir DevOps Juniors"));

        for (Empleado empleado : empleados) {
            empleado.subirSueldo(30000);
        }
        
        Arrays.sort(empleados);
        
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Sueldo: " + empleado.getSueldo());
            System.out.println("Fecha de alta: " + empleado.getFechaAlta());
            System.out.println("ID: " + empleado.getID());
            System.out.println("");
        }

        System.out.println("ID siguiente: " + Empleado.getId_increment());
        
        Empleado jefe_adm = new Jefe("José Rodrigo", 146000, 2007, 02, 23, 100);
        Comparable ejemplo = new Empleado("Agus Sarabia", 1200000, 2010, 02, 23);
        //NO se puede instanciar un objeto de una interfaz, igual que de una clase abstracta, pero sí se puede
        //definir la instancia y luego darle un valor inicial con otra clase (principio de sustitución o polimorfismo)
        
        if(jefe_adm instanceof Empleado){ // Se usa para comprobar si un objeto es una instancia de cierta clase
            System.out.println("\njefe_adm es una instancia de Empleado");
        }
        
        if(ejemplo instanceof Comparable){ //En este caso, para comprobar si un objeto implementa cierta interfaz
            System.out.println("ejemplo implementa la interfaz Comparable");
        }
 
    }
    
}
