package com.eliseozepeda.proyectou2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton

//Eliseo Zepeda Arredondo 17100313
class Pregunta5Fragment : Fragment() {
    companion object {
        var t: Int = 0
        var respuestaSeleccionada: Boolean = false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_pregunta5, container, false)
        ejecutar(view)
        return view
    }

    fun ejecutar(view: View) {
        val rdbR1P5: RadioButton = view.findViewById(R.id.rdbR1)
        val rdbR2P5: RadioButton = view.findViewById(R.id.rdbR2)
        val rdbR3P5: RadioButton = view.findViewById(R.id.rdbR3)

        rdbR1P5.setOnClickListener {
            if(rdbR1P5.isChecked) {
                t = 1
            }
            respuestaSeleccionada = true
        }
        rdbR2P5.setOnClickListener {
            if(rdbR2P5.isChecked) {
                t = 0
            }
            respuestaSeleccionada = true
        }
        rdbR3P5.setOnClickListener {
            if(rdbR3P5.isChecked) {
                t = 0
            }
            respuestaSeleccionada = true
        }
    }
}