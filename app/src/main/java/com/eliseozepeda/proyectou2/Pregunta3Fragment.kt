package com.eliseozepeda.proyectou2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import java.nio.file.StandardWatchEventKinds

//Eliseo Zepeda Arredondo 17100313
class Pregunta3Fragment : Fragment() {
    companion object {
        var t: Int = 0
        var respuestaSeleccionada: Boolean = false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_pregunta3, container, false)
        ejecutar(view)
        return view
    }

    fun ejecutar(view: View) {
        val chkOpcion1: CheckBox = view.findViewById(R.id.chkOpcion1)
        val chkOpcion2: CheckBox = view.findViewById(R.id.chkOpcion2)
        val chkOpcion3: CheckBox = view.findViewById(R.id.chkOpcion3)
        val chkOpcion4: CheckBox = view.findViewById(R.id.chkOpcion4)
        val chkOpcion5: CheckBox = view.findViewById(R.id.chkOpcion5)
        val chkOpcion6: CheckBox = view.findViewById(R.id.chkOpcion6)



        chkOpcion1.setOnClickListener {
            respuestaSeleccionada =
                !(!chkOpcion1.isChecked && !chkOpcion2.isChecked && !chkOpcion3.isChecked && !chkOpcion4.isChecked && !chkOpcion5.isChecked && !chkOpcion6.isChecked)

            if(!chkOpcion1.isChecked && chkOpcion2.isChecked && chkOpcion3.isChecked && !chkOpcion4.isChecked && chkOpcion5.isChecked && !chkOpcion6.isChecked){
                t = 1
            } else {
                t = 0
            }
        }
        chkOpcion2.setOnClickListener {
            respuestaSeleccionada =
                !(!chkOpcion1.isChecked && !chkOpcion2.isChecked && !chkOpcion3.isChecked && !chkOpcion4.isChecked && !chkOpcion5.isChecked && !chkOpcion6.isChecked)

            if(!chkOpcion1.isChecked && chkOpcion2.isChecked && chkOpcion3.isChecked && !chkOpcion4.isChecked && chkOpcion5.isChecked && !chkOpcion6.isChecked){
                t = 1
            } else {
                t = 0
            }
        }
        chkOpcion3.setOnClickListener {
            respuestaSeleccionada =
                !(!chkOpcion1.isChecked && !chkOpcion2.isChecked && !chkOpcion3.isChecked && !chkOpcion4.isChecked && !chkOpcion5.isChecked && !chkOpcion6.isChecked)

            if(!chkOpcion1.isChecked && chkOpcion2.isChecked && chkOpcion3.isChecked && !chkOpcion4.isChecked && chkOpcion5.isChecked && !chkOpcion6.isChecked){
                t = 1
            } else {
                t = 0
            }
        }
        chkOpcion4.setOnClickListener {
            respuestaSeleccionada =
                !(!chkOpcion1.isChecked && !chkOpcion2.isChecked && !chkOpcion3.isChecked && !chkOpcion4.isChecked && !chkOpcion5.isChecked && !chkOpcion6.isChecked)

            if(!chkOpcion1.isChecked && chkOpcion2.isChecked && chkOpcion3.isChecked && !chkOpcion4.isChecked && chkOpcion5.isChecked && !chkOpcion6.isChecked){
                t = 1
            } else {
                t = 0
            }
        }
        chkOpcion5.setOnClickListener {
            respuestaSeleccionada =
                !(!chkOpcion1.isChecked && !chkOpcion2.isChecked && !chkOpcion3.isChecked && !chkOpcion4.isChecked && !chkOpcion5.isChecked && !chkOpcion6.isChecked)

            if(!chkOpcion1.isChecked && chkOpcion2.isChecked && chkOpcion3.isChecked && !chkOpcion4.isChecked && chkOpcion5.isChecked && !chkOpcion6.isChecked){
                t = 1
            } else {
                t = 0
            }
        }
        chkOpcion6.setOnClickListener {
            respuestaSeleccionada =
                !(!chkOpcion1.isChecked && !chkOpcion2.isChecked && !chkOpcion3.isChecked && !chkOpcion4.isChecked && !chkOpcion5.isChecked && !chkOpcion6.isChecked)

            if(!chkOpcion1.isChecked && chkOpcion2.isChecked && chkOpcion3.isChecked && !chkOpcion4.isChecked && chkOpcion5.isChecked && !chkOpcion6.isChecked){
                t = 1
            } else {
                t = 0
            }
        }
    }
}