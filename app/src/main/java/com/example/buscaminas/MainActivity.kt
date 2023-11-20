package com.example.buscaminas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.GridLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

      //  val jugar = Jugabilidad()

    }

    // el elemento que infla el menu para mostrarlo
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.juego_menu, menu)// OJO- se pasa la vista que se quiere inflar
        return true
    }

    /**
     * menu que muestra las diferentes opciones y lleva al método correspondiente
     */
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

    /**
     * crea una partida nueva y reinicia la que puedira estar iniciada
     * por defecto siempre las crea en nivel principiante
     */
    private fun juegoNuevo() {


     //   val jugar = Jugabilidad()

      //  jugar.iniciarJuego(-1)

    }

    /**
     * permite escoger la dificultad de la nueva partida
     * al aceptar se crea una partida co la dificultad marcada
     */

    private fun elegirDificultad() {
        // se crea el radiogroup y las opciones que iran dentro
        val radioGroup = RadioGroup(this)

        // Crear RadioButtons
        val principiante = RadioButton(this)
        principiante.text = "Principiante"
        val amateur = RadioButton(this)
        amateur.text = "Amateur"
        val avanzado = RadioButton(this)
        avanzado.text = "Avanzado"
        // Agregar RadioButtons al RadioGroup
        radioGroup.addView(principiante)
        radioGroup.addView(amateur)
        radioGroup.addView(avanzado)

        val msnEmergente = AlertDialog.Builder(this)

        msnEmergente.setView(radioGroup)

       msnEmergente.setPositiveButton("Aceptar") { dialog, which ->

          //  val jugar = Jugabilidad()

          //  jugar.iniciarJuego(radioGroup.checkedRadioButtonId)

        }


        msnEmergente.show()
    }

    /**
     * explica el juego
     *
     */
    private fun verInstrucciones() {
        val msnEmergente = AlertDialog.Builder(this)
        val instrucciones = R.string.instruccion
        msnEmergente.setMessage(getString(R.string.instruccion))
        msnEmergente.show()
    }

    /**
     * permit cambiar la imagen del objeto a buscar
     */
    private fun elegirPersonajes() {
       val personaje1 = CheckBox(this)
        val pinia1 = R.drawable.pina1
        personaje1.setButtonDrawable(pinia1)
        val personaje2 = CheckBox(this)
        val pinia2 = R.drawable.pina2
        personaje2.setButtonDrawable(pinia1)
        val personaje3 = CheckBox(this)
        val pinia3 = R.drawable.pina3
        personaje3.setButtonDrawable(pinia1)
        val personaje4 = CheckBox(this)
        val pinia4 = R.drawable.pina4
        personaje4.setButtonDrawable(pinia1)

        val msnEmergente = AlertDialog.Builder(this)

        msnEmergente.setView(personaje1)
        msnEmergente.setView(personaje2)
        msnEmergente.setView(personaje3)
        msnEmergente.setView(personaje4)
        msnEmergente.show()
    }


}
