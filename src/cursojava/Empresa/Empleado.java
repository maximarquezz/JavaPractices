package cursojava.Empresa;

import java.time.LocalDate;
import java.time.Month;

public class Empleado {
    
    //VARIABLES
    private String nombre;
    private int sueldo;
    private LocalDate fechaAlta;
    
    //CONSTRUCTORES
    public Empleado(String nombre, int sueldo, int año, int mes, int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaAlta = LocalDate.of(año, mes, dia);
    }
    
    //MÉTODOS
    public int subirSueldo(int aumento){
        return sueldo += aumento;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setFechaAlta(int año, int mes, int dia) {
        this.fechaAlta = LocalDate.of(año, mes, dia);
    }
    
}
