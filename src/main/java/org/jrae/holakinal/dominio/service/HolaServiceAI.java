package org.jrae.holakinal.dominio.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface HolaServiceAI {
    @UserMessage("""
            Genera un saludo de bienvenida a mi plataforma Pelicula en Linea jrae
            usa al menos 120 caracteres y hazlo como un Chapin.
            """)
    String generarSaludo();
}
