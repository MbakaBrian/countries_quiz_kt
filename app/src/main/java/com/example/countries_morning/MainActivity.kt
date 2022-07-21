package com.example.countries_morning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onCLicked(view: View){
        if (chk_kenya.isChecked){
        txt_ans.text="Correct answer"
        }
        if (chk_uganda.isChecked){
            txt_ans.text="Wrong answer.Try again"
        }
        if (chk_TZ.isChecked){
            txt_ans.text="Wrong answer.Try again"
        }
    }
    fun onSelect(view: View){
        if (radio_yes.isChecked){
            txt_review.text="Welcome to our programme"
        }
        if (radio_no.isChecked){
            txt_review.text="PLease be a certified developer to join"
        }
    }
}