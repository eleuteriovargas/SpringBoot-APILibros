package com.vargas.ConsumoAPI_Libros.principal;

import com.vargas.ConsumoAPI_Libros.model.DatosLibro;
import com.vargas.ConsumoAPI_Libros.service.ConsumoAPI;
import com.vargas.ConsumoAPI_Libros.service.ConvierteDatos;

import java.util.Scanner;


public class Principal {
    private Scanner teclado = new Scanner(System.in);

    private ConsumoAPI consumoAPI = new ConsumoAPI();

    private final String URL_BASE = "https://gutendex.com/books/";

    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraElMenu(){
        System.out.println("Porfavor escribe el nombre del libro que deseas buscar");
        //busca los datos generales de la series
        //var nombreSerie = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE);// + nombreSerie.replace(" ", "+"));
        //var datos = conversor.obtenerDatos(json, DatosLibro.class);
        System.out.println(json);

    }
}

