package com.mycompany.stack2;

import java.util.Stack;

public class Pag {

    private String actual;
    private Stack<String> atras = new Stack<>();
    private Stack<String> adelante = new Stack<>();

    public Pag(String actual) {

        this.actual = actual;
        atras = new Stack<>();
        adelante = new Stack<>();
    }

    public boolean navegarAdelante() {

        if (adelante.isEmpty()) {
            return false;
        } else {
            atras.push(actual);
            actual = adelante.peek();
            adelante.pop();

            return true;
        }
    }

    public boolean navegarAtras() {

        if (atras.isEmpty()) {
            return false;

        } else {

            adelante.push(actual);
            actual = atras.peek();
            atras.pop();
            return true;
        }

    }
    
    public void visitar(String nuevaPagina) {
        atras.push(actual);
        actual = nuevaPagina;
    }
    
    public void mostrarHistorial() {
        System.out.println("\n===== HISTORIAL DE NAVEGACION =====");
        System.out.println("Atras: " + atras);
        System.out.println("Pagina actual: " + actual);
        System.out.println("Adelante: " + adelante);
        System.out.println("===================================\n");
    }
}
