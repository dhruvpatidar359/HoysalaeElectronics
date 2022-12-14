package android.example.hoysalaelectronics.Fragments

import android.content.Context
import android.example.hoysalaelectronics.Adapters.CategoryAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.example.hoysalaelectronics.R
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CategoriesFragment : Fragment() {
    lateinit var recyler : RecyclerView
    lateinit var adapter : CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_categories, container, false)
        recyler = view.findViewById(R.id.category_recycler)

        adapter = CategoryAdapter(activity as Context)
        recyler.layoutManager = LinearLayoutManager(activity)
        recyler.adapter = adapter

        return view
    }

}