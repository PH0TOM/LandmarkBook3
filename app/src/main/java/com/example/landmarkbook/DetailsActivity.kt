package com.example.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent=intent

        val selectedItem=intent.getSerializableExtra("landmark") as Landmark
        binding.txtName.text=selectedItem.name
        binding.txtCountry.text=selectedItem.country
        binding.txtQuestion3.text=selectedItem.question3

    }
}