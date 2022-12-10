package android.example.hoysalaelectronics.Adapters

import android.content.Context
import android.example.hoysalaelectronics.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HorizontalRecycler : RecyclerView.Adapter<HorizontalRecycler.HorizontalViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.featured_product_single_row,parent,false)
        return HorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {

    }


    override fun getItemCount(): Int {
        return 10
    }

    class HorizontalViewHolder(view : View):RecyclerView.ViewHolder(view) {

    }

}
