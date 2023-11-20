package com.example.buscaminas

import android.widget.Button
import android.widget.GridLayout

class Jugabilidad {
    /**
     * fija la dificultad del tablero de juego
     * recibe la dificultad de la vista
     * por defecto la crea a nivel 1
     */
    fun iniciarJuego(dificultad: Int) {

        when (dificultad) {
            -1 -> crearMapa(1)
            1 -> crearMapa(1)
            2 -> crearMapa(2)
            3 -> crearMapa(3)
        }
    }

    /**
     * crea un mapa nuevo tomando la difcultad que recibe como paramentro
     * determina el numero de botones y elementos a buscar
     */
    private fun crearMapa(id_dificultad: Int) {
        var botonoesCantidad: Int = 0
        var columas: Int = 0
        when (id_dificultad) {
            -1 -> botonoesCantidad = 64
            1 -> botonoesCantidad = 64
            2 -> botonoesCantidad = 144
            3 -> botonoesCantidad = 256
        }
       /*
        val conjuntoBotonoes = Array<Button>(botonoesCantidad) { index ->
            Button(this).apply {
                text = "Bt ${index + 1}"
                // Puedes configurar otros atributos según tus necesidades
            }
        }

        val grid_tablero = findViewById<GridLayout>(R.id.grid_tablero)
        grid_tablero.layoutParams = GridLayout.LayoutParams()

        // Configurar el número de columnas en el GridLayout
        grid_tablero.columnCount = 8

        // Agregar botones al GridLayout
        for (button in conjuntoBotonoes) {
            grid_tablero.addView(button)
        }

        // Establecer el GridLayout como el contenido de la actividad
        setContentView(grid_tablero)
    */
    }

    /**
     * reparte los elementos a encontrar en función de la dificultad que recibe
     */
    private fun colocar(id_dificultad: Int){

    }

    /***
     * recorre el tablero para localizar todos los elementos y marcar los lugares adyacentes el numerod e elementos alrededor
     */
    private fun localizar(){

    }

    /**
     * muestra la casilla que se pincha a razon de:
     * si no hay nada revela todas hasta llegar a una que tenga información del mapa
     * si hay un objeto comprueba como se ha interacturado con la casilla
     */
    private fun revelarMapa(){

    }

    /**
     * comprueba si quedan objetos por encontrar
     * si hay un elemento marcado con un lick corto termina la partida
     * si no quedan elementos por encontrar se ha ganado
     */
    private fun perderOGanar(){

    }

    /**
     * llama a los metodos que comprueban las acciones del jugador para ver sigue jugando o no
     */
    private fun jugar(){

    }
}