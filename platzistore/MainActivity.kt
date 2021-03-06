package com.example.platzistore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcViewLanding.layoutManager = LinearLayoutManager(this)


        val data = (0..20).map { //map itera sobre el rango
            ItemLanding("Title $it", "Descr $it", 200.00 + it)
        }

        rcViewLanding.adapter = AdapterLanding(data)

    }
}
