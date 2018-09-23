package ggeorgip.androidtemplate.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ggeorgip.androidtemplate.MainApplication
import ggeorgip.androidtemplate.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainApplication.appComponent.inject(this)
    }
}
