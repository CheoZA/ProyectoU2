package com.eliseozepeda.proyectou2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup

//Eliseo Zepeda Arredondo 17100313
class Pregunta2Fragment : Fragment() {
    companion object {
        var t: Int = 0
        var respuestaSeleccionada: Boolean = false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_pregunta2, container, false)
        ejecutar(view)
        return view
    }

    fun ejecutar(view: View) {
        val rdbR1P2: RadioButton = view.findViewById(R.id.rdbR1)
        val rdbR2P2: RadioButton = view.findViewById(R.id.rdbR2)
        val rdbR3P2: RadioButton = view.findViewById(R.id.rdbR3)
        val rdbR4P2: RadioButton = view.findViewById(R.id.rdbR4)

        rdbR1P2.setOnClickListener {
            if(rdbR1P2.isChecked) {
                t = 0
            }
            respuestaSeleccionada = true
        }
        rdbR2P2.setOnClickListener {
            if(rdbR2P2.isChecked) {
                t = 0
            }
            respuestaSeleccionada = true
        }
        rdbR3P2.setOnClickListener {
            if(rdbR3P2.isChecked) {
                t = 0
            }
            respuestaSeleccionada = true
        }
        rdbR4P2.setOnClickListener {
            if(rdbR4P2.isChecked) {
                t = 1
            }
            respuestaSeleccionada = true
        }
    }

}