package com.example.gitpractice.demo.ui.listview

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gitpractice.demo.model.ListModel

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val listModel = ListModel("sudhakar", 32, "sudhakar.k@gmail.com")
    }
}