package com.example.buscaminas

import android.content.ClipData.Item
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //por defecto se inicia el juego a null de dificultad
        inicarJuego(null)
    }

    // el elemento que infla el menu para mostrarlo
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_buscaminas, menu)// OJO- se pasa la vista que se quiere inflar
        return true
    }

    // opciones del menú
    // cada opcion se muestra al inflarse el menú y va a asociada a un elemento del mismo
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.juegoNuevo -> {
                juegoNuevo()
                true
            }

            R.id.dificultad -> {
                elegirDificultad()
                true
            }

            R.id.instrucciones -> {
                verInstrucciones()
                true
            }

            R.id.personajes -> {
                elegirPersonajes()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
// metodos para inciar especidifcos de cada opcion
    private fun juegoNuevo() {
    // debe crear una nueva plantilla de la ultimia dificultad selccionada

    /**
     * se abre un radio buton que permite elegir entre tres tipos de dificultad y crear una nueva partida
     */
    }
    private fun elegirDificultad() {
        // anclar la accion al pinchar en la opcion de dificultades del menu--DUDA
        val dificultades = findViewById<Item>(R.id.dificultad)

        val BG_opciones = findViewById<RadioGroup>(R.id.agrupacionDificultad)
        // se recoge la opcion seleccionada para crear el tablero
        val opcionMarcada = BG_opciones.checkedRadioButtonId
        if (opcionMarcada!=-1){
            val eleccion = findViewById<RadioButton>(opcionMarcada)
            inicarJuego(eleccion)
        }else{
            val eleccion = findViewById<RadioButton>(opcionMarcada)
            inicarJuego(eleccion)
        }
    }

    /**
     * explica el juego
     * se asigan al text view el contenido del string de la explicacion del juego
     */
    private fun verInstrucciones() {
        val verInstruccios=findViewById<TextView>(R.id.mostraTexto)
        verInstruccios.text=R.string.explicacion.toString()
    }
    /**
     * se abre un radio buton que permtie seleccionar el personaje que se va a buscar
     */
    private fun elegirPersonajes(){

    }
    /**
     * se crea un tablerod e juego nuevo en funcion de la dificultad seleccionada
     * por defecto se tiene la dificultad principiante
     */
    private fun inicarJuego( dificultad:RadioButton?){
        var dificultadBase= "principiante"
        if (dificultad!=null){
            dificultadBase=dificultad.text.toString()
            //generar mapas con la dificultad marcada
        }else{
            //generar mapas con la dificultad marcada

        }
    }

    }
