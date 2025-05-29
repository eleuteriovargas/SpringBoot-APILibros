package com.vargas.ConsumoAPI_Libros.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosLibro(
        @JsonAlias("title") String titulo)
//@JsonAlias("title") Integer totalDeTemporadas)
//
//                         @JsonAlias("imdbRating") String evaluaciones)
//
                         {
}
