package android.example.hoysalaelectronics.Adapters

import android.content.Context
import android.content.Intent
import android.example.hoysalaelectronics.Activity.ProductDetail
import android.example.hoysalaelectronics.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView

class SingleCategoryAdapter(val context : Context) : RecyclerView.Adapter<SingleCategoryAdapter.CategoryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_product_single_row,parent,false)
        return CategoryViewHolder(view)

    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

       holder.singleRelative.setOnClickListener {
           val intent = Intent(context, ProductDetail :: class.java)
           intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
           context.startActivity(intent)
       }

    }
    class CategoryViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val singleRelative : RelativeLayout = view.findViewById(R.id.all_pro_relative_lay)

    }

}