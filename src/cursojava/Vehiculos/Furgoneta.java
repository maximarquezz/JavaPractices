package cursojava.Vehiculos;

public class Furgoneta extends Auto{
    
    private int plazas_extra;
    private int capacidad_carga;

    public Furgoneta(String color, boolean asientosCuero, boolean climatizador, int plazas_extra, int capacidad_carga) {
        super(color, asientosCuero, climatizador);
        this.plazas_extra = plazas_extra;
        this.capacidad_carga = capacidad_carga;
    }
    
}
