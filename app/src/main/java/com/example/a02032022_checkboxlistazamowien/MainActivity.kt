package com.example.a02032022_checkboxlistazamowien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var frytki: CheckBox
    lateinit var pizza: CheckBox
    lateinit var kawa: CheckBox
    lateinit var burger: CheckBox
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "KotlinApp"
        frytki = findViewById(R.id.checkBoxFrytki)
        pizza = findViewById(R.id.checkBoxPizza)
        kawa = findViewById(R.id.checkBoxKawa)
        burger = findViewById(R.id.checkBoxBurger)
        button = findViewById(R.id.buttonZaplac)

        button.setOnClickListener{
            var doZaplacenia : Int = 0
            val wynik = StringBuilder()
            wynik.append("Wybrane")
            if(frytki.isChecked) {
                wynik.append("\nFrytki 4zł")
                doZaplacenia += 4
            }
            if(pizza.isChecked) {
                wynik.append("\nPizza 20zł")
                doZaplacenia += 20
            }
            if(kawa.isChecked) {
                wynik.append("\nKawa 3zł")
                doZaplacenia += 3
            }
            if(burger.isChecked) {
                wynik.append("\nBurger 6zł")
                doZaplacenia += 6
            }
            wynik.append("\nDo Zaplacenia :" + doZaplacenia + "Zł")
            Toast.makeText(applicationContext,wynik.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}