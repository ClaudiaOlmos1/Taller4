package model;

public class Pokemon {

    private String id;
    private String nombre;
    private String etapa;
    private String evolucion1;
    private String evolucion2;
    private String evolucion3;
    private String tipo1;
    private String tipo2;

    public Pokemon(String id, String nombre, String etapa, String evolucion1, String evolucion2, String evolucion3, String tipo1, String tipo2) {
        this.id = id;
        this.nombre = nombre;
        this.etapa = etapa;
        this.evolucion1 = evolucion1;
        this.evolucion2 = evolucion2;
        this.evolucion3 = evolucion3;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEtapa() {
        return etapa;
    }

    public String getEvolucion1() {
        return evolucion1;
    }

    public String getEvolucion2() {
        return evolucion2;
    }

    public String getEvolucion3() {
        return evolucion3;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }
}
