package com.mg.listas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generar(view: View?) {

        var lista1 = arrayOf(1, 1, 1, 1, 1)
        var lista2 = arrayOf(1, 1, 1, 1, 1)
        var unida = arrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
        var lista3 = arrayListOf<String>()
        var nAleatorio = Random()
        var aux= 0

        for (i in 0 until 5) {
            lista1[i] = nAleatorio.nextInt(8) + 1
            lista2[i] = nAleatorio.nextInt(8) + 1
            unida[i] = lista1[i]
            unida[i+5] = lista2[i]
        }

        for (i in 0 until 10) {
            aux=0
            for (j in i until 10){
                if(unida[i]==unida[j]){
                    aux+=1
                }
            }
            if (aux==1) {
                if (unida[i] % 2 != 0) {
                    lista3.add(unida[i].toString())
                }
            }
        }

            textView.text = lista1[0].toString()
            textView2.text = lista2[0].toString()
            textView3.text = lista1[1].toString()
            textView4.text = lista2[1].toString()
            textView5.text = lista1[2].toString()
            textView6.text = lista2[2].toString()
            textView7.text = lista1[3].toString()
            textView8.text = lista2[3].toString()
            textView9.text = lista1[4].toString()
            textView10.text = lista2[4].toString()
            textView11.text = lista3.toString()

        }
}
