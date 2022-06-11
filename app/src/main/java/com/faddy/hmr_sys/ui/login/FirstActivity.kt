package com.faddy.hmr_sys.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faddy.hmr_sys.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        supportActionBar?.hide()
    }
}