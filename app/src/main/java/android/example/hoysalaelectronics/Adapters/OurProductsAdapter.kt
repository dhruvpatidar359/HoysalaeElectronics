package android.example.hoysalaelectronics.Adapters

import android.example.hoysalaelectronics.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class OurProductsAdapter : RecyclerView.Adapter<OurProductsAdapter.ProductsViewHolder>() {


    override fun getItemCount(): Int {
        return 26
    }


    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.our_products_single_row,parent,false)
        return ProductsViewHolder(view)
    }

    class ProductsViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    }

}