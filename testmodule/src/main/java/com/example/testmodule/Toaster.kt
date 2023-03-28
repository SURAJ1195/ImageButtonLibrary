package com.example.testmodule

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object{
        fun showToast(context: Context){
            Toast.makeText(context,"Suraj kumar",Toast.LENGTH_LONG).show()
        }
    }
}