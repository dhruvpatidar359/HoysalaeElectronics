package android.example.hoysalaelectronics.Adapters

import android.example.hoysalaelectronics.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SingleCategoryAdapter : RecyclerView.Adapter<SingleCategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.all_categories_single_row,parent,false)
        return CategoryViewHolder(view)

    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: SingleCategoryAdapter.CategoryViewHolder, position: Int) {

    }
    class CategoryViewHolder(view : View) : RecyclerView.ViewHolder(view){

    }

}