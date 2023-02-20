package com.example.sumatif1latihanzhro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Jurusan(view: View){
        val pindah = Intent (this,Hal_jurusan::class.java)
        startActivity(pindah)
    }
    fun Guru(view: View){
        val pindah = Intent(this,Hal_Guru::class.java)
        startActivity(pindah)
    }
    fun Siswa(view: View){
        val pindah = Intent(this,Hal_Siswa::class.java)
        startActivity(pindah)
    }
    fun VisiMisi(view: View){
        val pindah = Intent(this,Hal_VisiMisi::class.java)
        startActivity(pindah)
    }
}