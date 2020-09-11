package se.magictechnology.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.my_layout_item.view.*

class MyAdapter() : RecyclerView.Adapter<MyViewHolder>() {

    var thepeople = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val vh = MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.my_layout_item, parent, false))
        return vh
    }

    override fun getItemCount(): Int {
        return thepeople.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.rowtext.text = thepeople.get(position)

    }

}

class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    var rowtext = view.therowtext

}