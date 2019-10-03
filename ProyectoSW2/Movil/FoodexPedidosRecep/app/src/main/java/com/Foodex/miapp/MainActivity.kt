package com.Foodex.miapp

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_listview)
        listView.adapter = MycustomAdapter(this)

    }
    private class MycustomAdapter(context : Context) : BaseAdapter() {
        private val mContext: Context

        init {
            mContext = context
        }
        override fun getView(position: Int, convertView: View?, ViewGroup: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text = "Acá van los pedidos"
            return textView
        }

        override fun getItem(position: Int): Any {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return "TEST STRING"
        }

        override fun getItemId(position: Int): Long {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return position.toLong()
        }

        override fun getCount(): Int {
            return 5
        }
    }
}
