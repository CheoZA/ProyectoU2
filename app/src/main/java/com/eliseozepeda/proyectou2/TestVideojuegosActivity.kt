package com.eliseozepeda.proyectou2

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.snackbar.Snackbar

//Eliseo Zepeda Arredono 17100313
class TestVideojuegosActivity : AppCompatActivity(), View.OnClickListener {

    var intRespuestasCorrectas: Int = 0
    var contador: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_videojuegos)

        val btnSiguiente: Button = findViewById(R.id.btnSiguiente)
        val fragment: Fragment = Pregunta1Fragment()
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        cambiarFragment(fragment)
        btnSiguiente.setOnClickListener(this)
    }

    fun cambiarFragment(fragment: Fragment) {
        val manager: FragmentManager = supportFragmentManager
        val transaccion: FragmentTransaction = manager.beginTransaction()
        transaccion.replace(R.id.framelayoutid, fragment)
        transaccion.commit()
    }

    override fun onClick(v: View?) {
        contador++
        var fragment: Fragment
        if(contador == 2) {
            if(Pregunta1Fragment.respuestaSeleccionada) {
                fragment = Pregunta2Fragment()
                cambiarFragment(fragment)
                intRespuestasCorrectas += Pregunta1Fragment.t
                val mySnackbar = Snackbar.make(findViewById(R.id.framelayoutid),
                    "Regresar", Snackbar.LENGTH_SHORT)
                mySnackbar.setAction("Regresar") {
                    contador--
                    fragment = Pregunta1Fragment()
                    cambiarFragment(fragment)
                    if(Pregunta1Fragment.t == 1)
                        intRespuestasCorrectas--
                }
                mySnackbar.show()
            } else {
                contador--
                val toast = Toast.makeText(applicationContext, "Selecciona una respuesta", Toast.LENGTH_LONG)
                toast.show()
            }
        }
        if(contador == 3) {
            if(Pregunta2Fragment.respuestaSeleccionada) {
                fragment = Pregunta3Fragment()
                cambiarFragment(fragment)
                intRespuestasCorrectas += Pregunta2Fragment.t
                val mySnackbar = Snackbar.make(findViewById(R.id.framelayoutid),
                    "Regresar", Snackbar.LENGTH_SHORT)
                mySnackbar.setAction("Regresar") {
                    contador--
                    fragment = Pregunta2Fragment()
                    cambiarFragment(fragment)
                    if(Pregunta2Fragment.t == 1)
                        intRespuestasCorrectas--
                }
                mySnackbar.show()
            } else {
                contador--
                val toast = Toast.makeText(applicationContext, "Selecciona una respuesta", Toast.LENGTH_LONG)
                toast.show()
            }
        }
        if(contador == 4) {
            if(Pregunta3Fragment.respuestaSeleccionada) {
                fragment = Pregunta4Fragment()
                cambiarFragment(fragment)
                intRespuestasCorrectas += Pregunta3Fragment.t
                val mySnackbar = Snackbar.make(findViewById(R.id.framelayoutid),
                    "Regresar", Snackbar.LENGTH_SHORT)
                mySnackbar.setAction("Regresar") {
                    contador--
                    fragment = Pregunta3Fragment()
                    cambiarFragment(fragment)
                    if(Pregunta3Fragment.t == 1)
                        intRespuestasCorrectas--
                }
                mySnackbar.show()
            } else {
                contador--
                val toast = Toast.makeText(applicationContext, "Selecciona una respuesta", Toast.LENGTH_LONG)
                toast.show()
            }
        }
        if(contador == 5) {
            if(Pregunta4Fragment.respuestaSeleccionada) {
                fragment = Pregunta5Fragment()
                cambiarFragment(fragment)
                intRespuestasCorrectas += Pregunta4Fragment.t
                val mySnackbar = Snackbar.make(findViewById(R.id.framelayoutid),
                    "Regresar", Snackbar.LENGTH_SHORT)
                mySnackbar.setAction("Regresar") {
                    contador--
                    fragment = Pregunta4Fragment()
                    cambiarFragment(fragment)
                    if(Pregunta4Fragment.t == 1)
                        intRespuestasCorrectas--
                }
                mySnackbar.show()
            } else {
                contador--
                val toast = Toast.makeText(applicationContext, "Selecciona una respuesta", Toast.LENGTH_LONG)
                toast.show()
            }
        }
        if(contador == 6) {
            if(Pregunta5Fragment.respuestaSeleccionada) {
                intRespuestasCorrectas += Pregunta5Fragment.t
                val builder: AlertDialog.Builder = AlertDialog.Builder(this)
                builder.setTitle("Resultado")
                builder.setMessage("Tu resultado es: ${intRespuestasCorrectas} / 5" )
                builder.setPositiveButton("Ok") { dialogInterface: DialogInterface, i: Int ->
                    finish()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    intRespuestasCorrectas = 0
                }

                val alertDialog: AlertDialog = builder.create()
                alertDialog.show()
            } else {
                contador--
                val toast = Toast.makeText(applicationContext, "Selecciona una respuesta", Toast.LENGTH_LONG)
                toast.show()
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId

        if(id == R.id.acercaDe) {
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder.setTitle("Acerca De")
            builder.setMessage("Proyecto creado por Eliseo Zepeda Arredondo para la materia de Programación Móvil 1. No. de Control: 17100313")
            builder.setPositiveButton("Ok") { dialogInterface: DialogInterface, i: Int ->

            }

            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()
        }
        return true
    }
}