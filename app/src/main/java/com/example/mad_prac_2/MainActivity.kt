package com.example.mad_prac_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    fun displayMessage(msg:String){
        Toast.makeText(this,"$msg"+" is called", Toast.LENGTH_LONG).show()
        Log.i(TAG, "This is a $msg")

        Snackbar.make(
            findViewById(R.id.Aman),
            R.string.app_name,
            Snackbar.LENGTH_SHORT
        ).show()
    }
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayMessage(" onCreate")
    }
    override fun onStart() {
        super.onStart()
        displayMessage(" onstart")
    }
    override fun onResume() {
        super.onResume()
        displayMessage(" onResume")
    }
    override fun onPause() {
        super.onPause()
        displayMessage(" onPause")
    }
    override fun onStop() {
        super.onStop()
        displayMessage(" onstop")
    }
    override fun onDestroy() {
        super.onDestroy()
        displayMessage(" onDestroy")
    }
}
