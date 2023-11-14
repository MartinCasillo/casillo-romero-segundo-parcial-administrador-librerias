
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaLibros sistemaLibros = new SistemaLibros("Libreria UCES");


        System.out.println("Bienvenido a : " + sistemaLibros.getNombreSistema());

        int opcion = 0;
        Scanner scan = new Scanner(System.in);

        while(opcion != 7){
            System.out.println(" 1 - Ingrese un libro\n" +
                    " 2 - Ingrese un Ejemplar\n" +
                    " 3 - Datos de libros\n" +
                    " 4 - Cantidad de libros\n" +
                    " 5 - Cantidad Ejemplares\n" +
                    " 6 - Cantidad de Ejemplares para Prestamo\n" +
                    " 7 - Salir\n");

            opcion = scan.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Agregando Libro\n");
                    sistemaLibros.agregarLibro();
                    break;

                case 2:
                    System.out.println("Agregando Ejemplar\n");
                    sistemaLibros.agregarEjemplar();
                    break;

                case 3:
                    System.out.println("Datos del Sistema\n");
                    System.out.println(sistemaLibros);
                    break;

                case 4:
                    System.out.println("Cantidad de Libros\n");
                    sistemaLibros.cantidadLibros();
                    break;

                case 5:
                    System.out.println("Cantidad de Ejemplares\n");
                    sistemaLibros.cantidadEjemplares();
                    break;

                case 6:
                    System.out.println("Cantidad de Ejemplares Disponibles para Prestamo\n");
                    sistemaLibros.cantidadEjParaPrestamo();
                    break;

                case 7:
                    System.out.println("Vuelva Pronto ! ");
                    break;

                default:
                    System.out.print("Opcion Invalida\n");
                    break;
            }
        }

       Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonSistemaLibros = gson.toJson(sistemaLibros);
        System.out.println("JSON del Sistema de Libros:\n" + jsonSistemaLibros);
    }
}