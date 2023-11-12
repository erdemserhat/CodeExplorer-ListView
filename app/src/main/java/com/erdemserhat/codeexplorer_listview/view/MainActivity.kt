package com.erdemserhat.codeexplorer_listview.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.constraintlayout.helper.widget.Carousel
import com.erdemserhat.codeexplorer_listview.R
import com.erdemserhat.codeexplorer_listview.model.ProgrammingLanguage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView:ListView = findViewById(R.id.listView)

        //static data for listing
        val java = ProgrammingLanguage("Java",getString(R.string.javaDescription),R.drawable.java)
        val cplus = ProgrammingLanguage("C++",getString(R.string.cplusDescription),R.drawable.cplus)
        val python = ProgrammingLanguage("Python",getString(R.string.pythonDescription),R.drawable.python)
        val javaScript = ProgrammingLanguage("Java-Script",getString(R.string.javaScriptDescription),R.drawable.java_script)

        //static list for list view's items
        val languageList:List<ProgrammingLanguage> = listOf(java,cplus,python,javaScript)

        //create an adapter for listView
        val adapterArray: ArrayAdapter<Any> = ArrayAdapter(this,
            com.google.android.material.R.layout.m3_auto_complete_simple_item,languageList.map { it.name })

        //parameterize the adapter with array
        listView.adapter=adapterArray

       listView.setOnItemClickListener { parent, view, position, id ->

           val intent: Intent =Intent(MainActivity@this,DetailsActivity::class.java)
           intent.putExtra("programmingLanguage",languageList[position])
           startActivity(intent)


           Toast.makeText(this,languageList[position].name,Toast.LENGTH_SHORT).show()
       }}

    }
