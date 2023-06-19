package colecciones;

import model.Pokemon;

public class ListaNexoDoble {

    private NodoDoble cabeza;
    private NodoDoble cola;

    private int cantElementos;

    public ListaNexoDoble() {
        this.cabeza = null;
        this.cola = null;
        this.cantElementos = 0;
    }

    public Pokemon obtenerPokemon(String id) {
        if (this.cabeza == null) {
            return null;
        }
        if (this.cola.getPokemon().getId() == id) {
            return this.cola.getPokemon();
        }

        NodoDoble aux = this.cabeza;
        while (aux != this.cola && aux != null) {
            if (aux.getPokemon().getId() == id) {
                return aux.getPokemon();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public boolean agregarPokemon (Pokemon pokemon) {
        NodoDoble nuevoNodo = new NodoDoble(pokemon);

        if (this.cabeza == null) {
            this.cabeza = nuevoNodo;
            this.cola = nuevoNodo;
            this.cantElementos++;
            return true;
        }
        if (obtenerPokemon(pokemon.getId()) != null) {
            return false;
        }
        this.cola.setSiguiente(nuevoNodo);
        nuevoNodo.setAnterior(this.cola);
        this.cola = nuevoNodo;
        this.cantElementos++;
        return true;
    }

    public Pokemon obtenerPokemon(int index) {
        if (this.cabeza == null) {
            return null;
        }
        if (index < 0 || index >= this.cantElementos) {
            return null;
        }
        NodoDoble aux = this.cabeza;
        for (int i = 0; i < index; i++) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getPokemon();
        }
        return null;
    }

    public int getCantElementos() {
        return cantElementos;
    }
}