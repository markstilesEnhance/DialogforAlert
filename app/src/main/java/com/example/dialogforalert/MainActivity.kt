package com.example.dialogforalert

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowAlert(view: View) {
        val myAlertBuilder = AlertDialog.Builder(this)
        myAlertBuilder.setTitle(getString(R.string.alret_title))
        myAlertBuilder.setMessage(getString(R.string.alert_message))
        myAlertBuilder.setPositiveButton(getString(R.string.ok_button)) { _: DialogInterface, _: Int ->
            Toast.makeText(applicationContext, getString(R.string.ok_text), Toast.LENGTH_SHORT).show()
        }
        myAlertBuilder.setNegativeButton(getString(R.string.cancel_button)) { _: DialogInterface, _: Int ->
            Toast.makeText(applicationContext, getString(R.string.cancel_text), Toast.LENGTH_SHORT).show()
        }
        myAlertBuilder.show()
    }
}
