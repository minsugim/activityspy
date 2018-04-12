package edu.washington.minsugim.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate fired, additional info: " + savedInstanceState.toString())
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        Log.i(TAG, "onStart event fired")
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG, "onResume event fired")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e(TAG, "We're going down, Captain!")
    }

    companion object {
        const val TAG = "MainActivity"
    }
}
