package com.example.carnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {

    private lateinit var xx1: EditText
    private lateinit var yyy: EditText
    private lateinit var xx2: EditText
    private lateinit var PiradiNom: EditText
    private lateinit var Button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        xx1 = findViewById(R.id.nom1)
        xx2 = findViewById(R.id.nom2)
        yyy = findViewById(R.id.alphabet)
        PiradiNom = findViewById(R.id.pNom)
        Button = findViewById(R.id.button)
        Button.setOnClickListener() {

            if (xx1.text.toString().length != 2 || !xx1.text.isDigitsOnly()
                || xx2.text.toString().length != 2 || !xx2.text.isDigitsOnly() ) {
                Toast.makeText(this, "შეამოწმეთ მანქანის ნომერი", Toast.LENGTH_SHORT).show()
            }else if (yyy.text.toString().length != 3 || !yyy.text.toString().all {it.isUpperCase()}) {
                Toast.makeText(this, "შეიყვანეთ მხოლოდ დიდი ასოებით", Toast.LENGTH_SHORT).show()
            }else if (PiradiNom.length() != 11 || !PiradiNom.text.isDigitsOnly()) {
                Toast.makeText(this, "შეიყვანეთ სწორი პირადი ნომერი", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "ჯარიმა გადახდილია", Toast.LENGTH_SHORT).show()
            }



        }





    }



}