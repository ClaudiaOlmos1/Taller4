package colecciones;
import model.Pokemon;

public class NodoDoble {
    private Pokemon pokemon; //pokemon
    private NodoDoble anterior;
    private NodoDoble siguiente;

    public NodoDoble(Pokemon pokemon) {
        if (pokemon == null){
            throw new IllegalArgumentException("Elemento nulo");
        }
        this.pokemon = pokemon;

    }

    public Pokemon getPokemon() {
        return this.pokemon;
    }

    public NodoDoble getAnterior() {
        return this.anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }
}