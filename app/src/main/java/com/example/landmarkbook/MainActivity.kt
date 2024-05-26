package com.example.landmarkbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var landmarkList:ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList= ArrayList<Landmark>()

        val Python=Landmark("Python","Azerbaycan",R.drawable.python_logo,"Niye Burdasan?")
        val Cplusplus=Landmark("C++","Azerbaycan",R.drawable.c___logo, "Niye Burdasan?")
        val C_lang=Landmark("C","Azerbaycan",R.drawable.c_logo, "Niye Burdasan?")
        val Kotlin=Landmark("Kotlin","Azerbaycan",R.drawable.kotlin_logo, "Niye Burdasan?")
        landmarkList.add(Python)
        landmarkList.add(Cplusplus)
        landmarkList.add(C_lang)
        landmarkList.add(Kotlin)


        binding.recyclerView.layoutManager= LinearLayoutManager(this)
        val landmarkAdapter=LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=landmarkAdapter



    }
}