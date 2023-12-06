package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent?.action

        when (action) {
         //   Intent.ACTION_BATTERY_LOW -> {
         //       Toast.makeText(context, "Battery low", Toast.LENGTH_SHORT).show()
         //   }
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}