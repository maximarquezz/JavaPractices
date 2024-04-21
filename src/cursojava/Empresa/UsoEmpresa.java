package cursojava.Empresa;

public class UsoEmpresa {
    
    public static void main(String args[]){
        
        Empleado[] empleados = {
            new Empleado("Alejandro Perez", 150000, 2024, 04, 19),
            new Empleado("Juan Suarez", 110000, 2025, 10, 26),
            new Empleado("Rodrigo Cavagna", 80000, 2022, 01, 07),
            new Empleado("Alejandro Perez", 150000, 2024, 04, 19),
            new Empleado("Juan Suarez", 110000, 2025, 10, 26),
            new Empleado("Rodrigo Cavagna", 80000, 2022, 01, 07),
            new Empleado("Maximiliano Marquez")
        };

        for (Empleado empleado : empleados) {
            empleado.subirSueldo(30000);
        }
        
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Sueldo: " + empleado.getSueldo());
            System.out.println("Fecha de alta: " + empleado.getFechaAlta());
            System.out.println("ID: " + empleado.getID());
            System.out.println("ID siguiente: " + Empleado.getId_increment());
            System.out.println("");
        }

    }
    
}
