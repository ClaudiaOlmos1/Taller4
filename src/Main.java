import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
        String rutaArchivo = "kanto.txt";
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length == 8) {
                    String id = campos[0];
                    String nombre = campos[1];
                    String etapa = campos[2];
                    String evolucion1 = campos[3];
                    String evolucion2 = campos[4];
                    String evolucion3 = campos[5];
                    String tipo1 = campos[6];
                    String tipo2 = campos[7];
                    Pokemon pokemon = new Pokemon(id, nombre, etapa, evolucion1, evolucion2, evolucion3, tipo1, tipo2);
                    listaPokemon.add(pokemon);
                }
                if (campos.length == 7) {
                    String id = campos[0];
                    String nombre = campos[1];
                    String etapa = campos[2];
                    String evolucion1 = campos[3];
                    String evolucion2 = campos[4];
                    String tipo1 = campos[5];
                    String tipo2 = campos[6];
                    Pokemon pokemon = new Pokemon(id, nombre, etapa, evolucion1, evolucion2,"", tipo1, tipo2);
                    listaPokemon.add(pokemon);
                }
                if (campos.length == 6) {
                    String id = campos[0];
                    String nombre = campos[1];
                    String etapa = campos[2];
                    String evolucion1 = campos[3];
                    String tipo1 = campos[4];
                    String tipo2 = campos[5];
                    Pokemon pokemon = new Pokemon(id, nombre, etapa, evolucion1, "","", tipo1, tipo2);
                    listaPokemon.add(pokemon);
                }
                if (campos.length == 5) {
                    String id = campos[0];
                    String nombre = campos[1];
                    String etapa = campos[2];
                    String tipo1 = campos[3];
                    String tipo2 = campos[4];
                    Pokemon pokemon = new Pokemon(id, nombre, etapa, "", "","", tipo1, tipo2);
                    listaPokemon.add(pokemon);
                }

            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        // Mostrar los datos almacenados en la lista
        for (Pokemon pokemon : listaPokemon) {
            System.out.println(pokemon);
        }
    }

    public static class Pokemon {
        private String id;
        private String nombre;
        private String etapa;
        private String evolucion1;
        private String evolucion2;
        private String evolucion3;
        private String tipo1;
        private String tipo2;

        public Pokemon(String id, String nombre, String etapa, String evolucion1, String evolucion2,String evolucion3, String tipo1, String tipo2) {
            this.id = id;
            this.nombre = nombre;
            this.etapa = etapa;
            this.evolucion1 = evolucion1;
            this.evolucion2 = evolucion2;
            this.evolucion3 = evolucion3;
            this.tipo1 = tipo1;
            this.tipo2 = tipo2;
        }

        @Override
        public String toString() {
            return "ID: " + id + "\n" +
                    "Nombre: " + nombre + "\n" +
                    "Etapa: " + etapa + "\n" +
                    "Evolución 1: " + evolucion1 + "\n" +
                    "Evolución 2: " + evolucion2 + "\n" +
                    "Evolución 3: " + evolucion3 + "\n" +
                    "Tipo 1: " + tipo1 + "\n" +
                    "Tipo 2: " + tipo2 + "\n";
        }
    }
}