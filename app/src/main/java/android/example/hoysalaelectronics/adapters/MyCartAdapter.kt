package android.example.hoysalaelectronics.adapters

import android.content.Context
import android.example.hoysalaelectronics.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MyCartAdapter(val context : Context) : RecyclerView.Adapter<MyCartAdapter.MyCartViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCartViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_acitvity_single_row,parent,false)
        return MyCartViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyCartViewHolder, position: Int) {

       /* holder.deleteItem.setOnClickListener {



        }*/

    }

    override fun getItemCount(): Int {
        return 1
    }

    class MyCartViewHolder(view : View) : RecyclerView.ViewHolder(view)  {

        val deleteItem : ImageView = view.findViewById(R.id.deleteImage)


    }

}