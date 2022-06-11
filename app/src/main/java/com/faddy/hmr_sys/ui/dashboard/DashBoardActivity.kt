package com.faddy.hmr_sys.ui.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faddy.hmr_sys.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        supportActionBar?.hide()
    }
}