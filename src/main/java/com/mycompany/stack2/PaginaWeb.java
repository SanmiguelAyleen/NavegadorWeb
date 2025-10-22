package com.mycompany.stack2;

/**
 *
 * @author USER
 */
public class PaginaWeb {

    public static void main(String[] args) {
        
        Pag navegador = new Pag("Inicio");

        navegador.visitar("google.com");
        navegador.visitar("youtube.com");
        navegador.visitar("github.com");
        navegador.mostrarHistorial();

        navegador.navegarAtras();
        navegador.mostrarHistorial();

        navegador.navegarAtras();
        navegador.mostrarHistorial();

        navegador.navegarAdelante();
        navegador.mostrarHistorial();
    }
}
