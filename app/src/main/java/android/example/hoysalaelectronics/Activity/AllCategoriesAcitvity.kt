package android.example.hoysalaelectronics.Activity

import android.example.hoysalaelectronics.Adapters.SingleCategoryAdapter
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AllCategoriesAcitvity : AppCompatActivity() {

    lateinit var recyler : RecyclerView
    lateinit var adapter : SingleCategoryAdapter
    lateinit var layoutManager: GridLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_categories_acitvity)

        recyler = findViewById(R.id.all_category_recyler)
        layoutManager = GridLayoutManager(this@AllCategoriesAcitvity,2)

        adapter = SingleCategoryAdapter()
        recyler.layoutManager = layoutManager
        recyler.adapter = adapter
    }
}