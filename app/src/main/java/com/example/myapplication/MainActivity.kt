package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    lateinit var edtStudentID:EditText
    lateinit var spnYear:Spinner
    lateinit var spnSemester:Spinner
    lateinit var cbAgree:CheckBox
    lateinit var btnSubmit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtStudentID=findViewById(R.id.stdId)
        spnYear=findViewById(R.id.year)
        spnSemester=findViewById(R.id. semester)
        cbAgree=findViewById(R.id.checkBox)
        btnSubmit=findViewById(R.id.button)
    }
    override fun on Resume(){
        super.omResume()

        btnSubmit.setOnClickListener(view.OnCliclListner{

        })
    }
}