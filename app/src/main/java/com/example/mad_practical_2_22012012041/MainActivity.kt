package com.example.mad_practical_2_22012012041

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.SnackbarLayout

class MainActivity : AppCompatActivity() {
    var TAG:String="";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is called!");

    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart method is called!")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume method is called!")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method is called!")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method is called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method is called!")
    }
    fun showMessage(s:String){
        Log.i(TAG, s)
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.mainActicity),s,Snackbar.LENGTH_SHORT).show()
    }
}