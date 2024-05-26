package com.example.landmarkbook

import java.io.Serializable

class Landmark(val name:String,
               val country:String,
               val image:Int,
               val question_easy: String,
               val question_medium: String,
               val question_hard: String) :Serializable{
}