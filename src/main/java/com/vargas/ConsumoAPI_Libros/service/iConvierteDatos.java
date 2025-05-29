package com.vargas.ConsumoAPI_Libros.service;

public interface iConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}

