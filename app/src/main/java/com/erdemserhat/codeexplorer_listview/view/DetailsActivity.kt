package com.erdemserhat.codeexplorer_listview.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import com.erdemserhat.codeexplorer_listview.R
import com.erdemserhat.codeexplorer_listview.model.ProgrammingLanguage

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        //Related Views.
        val imageView:ImageView = findViewById(R.id.imageView)
        val titleView:TextView = findViewById(R.id.name)
        val descView:TextView = findViewById(R.id.description)

        //Getting data
        val intent: Intent = intent
        val programmingLanguage:ProgrammingLanguage=intent.getSerializableExtra("programmingLanguage") as ProgrammingLanguage

        //Showing data
        imageView.setImageDrawable(AppCompatResources.getDrawable(this,programmingLanguage.id))
        titleView.text=programmingLanguage.name
        descView.text = programmingLanguage.description





    }
}