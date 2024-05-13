package cursojava.Empresa;

import java.time.LocalDate;

public class Empleado extends Persona implements Comparable, iEmpleados{
    
    //VARIABLES
    private int sueldo;
    private LocalDate fechaAlta;

    //CONSTRUCTORES
    public Empleado(String nombre, int sueldo, int año, int mes, int dia){
        super(nombre);
        this.sueldo = sueldo;
        this.fechaAlta = LocalDate.of(año, mes, dia);
    }
    
    public Empleado(String nombre){
        this(nombre, 30000, 2024, 04, 19);
    }

    //MÉTODOS
    public int subirSueldo(int aumento){
        return sueldo += aumento;
    }

    //GETTERS
    public int getSueldo(){
        return sueldo;
    }

    public LocalDate getFechaAlta(){
        return fechaAlta;
    }

    //SETTERS
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }

    public void setFechaAlta(int año, int mes, int dia){
        this.fechaAlta = LocalDate.of(año, mes, dia);
    }

    //ABSTRACT
    @Override
    public String getType() {
        return "Soy un empleado";
    }
    
    //INTERFACES
    @Override
    public int compareTo(Object obj){
        Empleado emp = (Empleado) obj;
        
        if(this.sueldo < emp.sueldo){
            return -1;
        }
        else if(this.sueldo > emp.sueldo){
            return +1;
        }
        else{
            return 0;
        }
    }

    @Override
    public double establecerBonus(double bonus) {
        if (bonus < iEmpleados.MIN_BONUS){
            System.out.println("ERROR: el mínimo de bonus es: " + iEmpleados.MIN_BONUS);
            return 0;
        }
        else{
            return bonus;
        }
    }

}
