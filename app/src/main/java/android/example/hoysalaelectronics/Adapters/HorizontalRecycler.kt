package android.example.hoysalaelectronics.Adapters

import android.content.Context
import android.content.Intent
import android.example.hoysalaelectronics.Activity.ProductDetail
import android.example.hoysalaelectronics.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class HorizontalRecycler(val context : Context) : RecyclerView.Adapter<HorizontalRecycler.HorizontalViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.featured_product_single_row,parent,false)
        return HorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {

        holder.featureProCardView.setOnClickListener {
            val intent = Intent(context,ProductDetail :: class.java)
            context.startActivity(intent)
        }

    }


    override fun getItemCount(): Int {
        return 10
    }

    class HorizontalViewHolder(view : View):RecyclerView.ViewHolder(view) {

        val featureProCardView : CardView = view.findViewById(R.id.card)

    }

}
