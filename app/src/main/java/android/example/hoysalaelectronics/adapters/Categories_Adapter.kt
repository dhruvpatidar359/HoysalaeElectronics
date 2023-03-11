package android.example.hoysalaelectronics.adapters


import android.example.hoysalaelectronics.R
import android.example.hoysalaelectronics.model.Categories_Model
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Categories_Adapter(private val imageList: List<Categories_Model>) :
    RecyclerView.Adapter<Categories_Adapter.ImageViewHolder>() {

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.categroies_images)
        val textView: TextView = itemView.findViewById(R.id.categories_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.categories, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val currentItem = imageList[position]
        holder.imageView.setImageResource(currentItem.image)
        holder.textView.text = currentItem.name
    }

    override fun getItemCount() = imageList.size
}
