import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SistemaLibros {
    private String nombreSistema;
    private String fechaCreacion;
    private List<Libro> libros;

    public SistemaLibros(String nombreSistema) {
        this.nombreSistema = nombreSistema;
        this.fechaCreacion = "Fecha de Creación"; // Puedes asignar la fecha actual aquí
        this.libros = new ArrayList<>();
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void agregarLibro() {
        String titulo;
        String autor;
        String genero;
        int añoPublicacion;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un titulo : ");
        titulo = scan.nextLine();
        System.out.println("Ingrese un autor : ");
        autor = scan.nextLine();
        System.out.println("Ingrese un genero : ");
        genero = scan.nextLine();
        System.out.println("Ingrese el año de publicacion : ");
        añoPublicacion = scan.nextInt();
        Libro libro = new Libro(titulo,autor,genero,añoPublicacion);
        libros.add(libro);
        System.out.println("Libro agregado correctamente.");
    }

    public void agregarEjemplar(){
        String titulo;
        int numero;
        String estado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro al que le quiere agregar un ejemplar : ");
        titulo = scan.nextLine();

        for (Libro libro : libros){
            if(titulo.equals(libro.getTitulo())){


                System.out.println("Ingrese el estado del ejemplar : ");
                estado = scan.nextLine();

                System.out.println("Ingrese el numero del ejemplar : ");
                numero = scan.nextInt();

                libro.agregarEjemplar(numero,estado,"nuevo");
            }

        }
    }

    public int cantidadLibros(){
        System.out.println(libros.size());
        return this.libros.size();
    }

    public void cantidadEjemplares(){
        for(Libro libro : libros){
            libro.cantidadEjemplares();
        }
    }

    public void cantidadEjParaPrestamo(){
        for(Libro libro : libros){
            libro.cantidadEjParaPrestamo();
        }
    }


    @Override
    public String toString() {
        return "SistemaLibros{" +
                "nombreSistema='" + nombreSistema + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", libros=" + libros +
                '}';
    }
}
