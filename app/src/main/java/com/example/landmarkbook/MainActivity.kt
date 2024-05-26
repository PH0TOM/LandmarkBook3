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

        val Python=Landmark("Python","Azerbaycan",R.drawable.python_logo,"Python hansı sahələrdə istifadə olunur?","Niyə Python digər dillərə nəzərən gec işləyir?","HashMap nədir?")
        val Cplusplus=Landmark("C++","Azerbaycan",R.drawable.c___logo, "Cənab, sizin başıvızı kim alladıb C++ öyrənməklə?", "List ilə Set-in fərqi","Pointer nədir? Açıq de narahat olma")
        val C_lang=Landmark("C","Azerbaycan",R.drawable.c_logo, "Niyə programlamaya C dili ilə başlayırlar?", "Class-lar niyə C dilində yoxdu?", "Hansı funksiyalar return oluna bilmir?")
        val Kotlin=Landmark("Kotlin","Azerbaycan",R.drawable.kotlin_logo, "Data tipləri hansılardır?", "When nə işə baxır?", "Null Safety haqqında məlumat özdə cəld ol!")
        landmarkList.add(Python)
        landmarkList.add(Cplusplus)
        landmarkList.add(C_lang)
        landmarkList.add(Kotlin)


        binding.recyclerView.layoutManager= LinearLayoutManager(this)
        val landmarkAdapter=LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=landmarkAdapter



    }
}