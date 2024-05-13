package cursojava.Vehiculos;

public class Furgoneta extends Auto{
    
    private int plazas_extra;
    private int capacidad_carga;

    public Furgoneta(String color, boolean asientosCuero, boolean climatizador, int plazas_extra, int capacidad_carga) {
        super(color, asientosCuero, climatizador);
        this.plazas_extra = plazas_extra;
        this.capacidad_carga = capacidad_carga;
    }

    public int getPlazas_extra() {
        return plazas_extra;
    }

    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setPlazas_extra(int plazas_extra) {
        this.plazas_extra = plazas_extra;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }
    
    @Override
    public String getInfo(){
        return getInfo() + "\n"
                + "Plazas extra: " + plazas_extra + ".\n"
                + "Capacidad de carga: " + capacidad_carga + " kg.\n";
    }
    
}
