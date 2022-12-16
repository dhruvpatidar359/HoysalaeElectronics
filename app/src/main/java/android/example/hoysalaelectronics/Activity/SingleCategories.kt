package android.example.hoysalaelectronics.Activity

import android.example.hoysalaelectronics.Adapters.SingleCategoryAdapter
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SingleCategories : AppCompatActivity() {

    lateinit var recyler : RecyclerView
    lateinit var adapter : SingleCategoryAdapter
    lateinit var layoutManager: GridLayoutManager
    lateinit var toolbar : androidx.appcompat.widget.Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_categories_acitvity)

        recyler = findViewById(R.id.all_category_recyler)
        toolbar = findViewById(R.id.toolbar_all_categories)

        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        layoutManager = GridLayoutManager(this@SingleCategories,2)

        adapter = SingleCategoryAdapter(applicationContext)
        recyler.layoutManager = layoutManager
        recyler.adapter = adapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}