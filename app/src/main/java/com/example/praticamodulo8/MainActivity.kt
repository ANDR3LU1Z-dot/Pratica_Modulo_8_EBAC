package com.example.praticamodulo8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.widget.addTextChangedListener
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    var textTitle : AppCompatTextView? = null
    var editText : AppCompatEditText? = null
    var tela : LinearLayoutCompat? = null
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTitle = findViewById(R.id.title)
        editText = findViewById(R.id.input_text)
        tela = findViewById(R.id.tela)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            changeTitle()
            count++
        }

        editText?.addTextChangedListener{
            textTitle?.text = it?.toString()
        }




    }

    fun changeTitle(){
        textTitle?.text = "Clicou no Botão"

        when{
            count % 2 == 0 -> tela?.background = getDrawable(R.drawable.ic_launcher_background)
            else -> tela?.background = null
        }
    }
}