package android.example.hoysalaelectronics.Adapters

import android.content.Context
import android.content.Intent
import android.example.hoysalaelectronics.Activity.SingleCategories
import android.example.hoysalaelectronics.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(val context : Context) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.categories_single_row,parent,false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

        holder.layout.setOnClickListener {
            val intent = Intent(context,SingleCategories :: class.java)
            context.startActivity(intent)

        }

    }


    override fun getItemCount(): Int {
       return 2
    }

    class CategoryViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val layout : RelativeLayout = view.findViewById(R.id.layout_relative)

    }


}