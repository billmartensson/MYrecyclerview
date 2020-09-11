package se.magictechnology.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var theadapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        therecview.layoutManager = LinearLayoutManager(this)
        therecview.adapter = theadapter



        var people = mutableListOf<String>()
        people.add("Arne")
        people.add("Berit")
        people.add("Caesar")
        people.add("David")
        people.add("Erik")
        people.add("Fredrik")

        theadapter.thepeople = people
        theadapter.notifyDataSetChanged()



    }
}