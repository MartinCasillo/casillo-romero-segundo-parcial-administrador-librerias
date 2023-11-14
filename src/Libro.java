/*
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
*/

import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int añoPublicacion;
    private List<Ejemplar> ejemplares;

    public Libro(String titulo, String autor, String genero, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.añoPublicacion = añoPublicacion;
        this.ejemplares = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void agregarEjemplar( int numero, String estado, String condicion) {
        if (ejemplares.size() < 10) {
            Ejemplar ejemplar = new Ejemplar(numero,estado,condicion);
            ejemplares.add(ejemplar);
            System.out.println("Ejemplar registrado correctamente.");
        } else {
            System.out.println("Límite de ejemplares alcanzado para este libro.");
        }
    }

    public int cantidadEjemplares(){
        System.out.println(this.ejemplares.size());
        return this.ejemplares.size();
    }

    public void cantidadEjParaPrestamo(){
        for (Ejemplar ejemplar : ejemplares){
            if(ejemplar.getEstado().equals("Disponible para Prestamo") ){
                System.out.println(titulo + " Esta : "  + ejemplar.getEstado());
            }
        }


    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", ejemplares=" + ejemplares +
                '}';
    }
}
