package android.example.hoysalaelectronics.fragments

import android.content.Context
import android.example.hoysalaelectronics.adapters.CategoryAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.example.hoysalaelectronics.R
import android.example.hoysalaelectronics.adapters.ParentAdapter
import android.example.hoysalaelectronics.model.ChildItem
import android.example.hoysalaelectronics.model.ParentItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CategoriesFragment : Fragment() {

    lateinit var adapter : CategoryAdapter

    private lateinit var recyclerView: RecyclerView
    private val parentList = ArrayList<ParentItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_categories, container, false)

        recyclerView = view.findViewById(R.id.category_recycler)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(activity as Context)

        addDataToList()
        val adapter = ParentAdapter(parentList)
        recyclerView.adapter = adapter
        return view
    }

    private fun addDataToList() {

        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("Capacitor", R.drawable.capacitor))
        childItems1.add(ChildItem("Inductor", R.drawable.inductor))
        childItems1.add(ChildItem("Resistor", R.drawable.resistor))


        parentList.add(ParentItem("Electronic Components", R.drawable.processor, childItems1))

        val childItem2 = ArrayList<ChildItem>()
        childItem2.add(ChildItem("Robot", R.drawable.robottwo))
        childItem2.add(ChildItem("Robot", R.drawable.robottwo))
        childItem2.add(ChildItem("Robot", R.drawable.robottwo))
        childItem2.add(ChildItem("Robot", R.drawable.robot))


        parentList.add(
            ParentItem(
                "Robots",
                R.drawable.android,
                childItem2
            )
        )
        val childItem3 = ArrayList<ChildItem>()
        childItem3.add(ChildItem("Modules", R.drawable.robottwo))
        childItem3.add(ChildItem("Modules", R.drawable.robottwo))
        childItem3.add(ChildItem("Modules", R.drawable.robot))
        parentList.add(
            ParentItem(
                "Electronic Modules",
                R.drawable.front_end,
                childItem3
            )
        )
        val childItem4 = ArrayList<ChildItem>()
        childItem4.add(ChildItem("dev boards", R.drawable.robottwo))
        childItem4.add(ChildItem("dev boards", R.drawable.robottwo))
        childItem4.add(ChildItem("dev boards", R.drawable.robot))
        parentList.add(
            ParentItem(
                "Development Boards",
                R.drawable.developer,
                childItem4
            )
        )
        val childItem5 = ArrayList<ChildItem>()
        childItem5.add(ChildItem("iot", R.drawable.iotone))
        childItem5.add(ChildItem("iot2", R.drawable.iottwo))
        childItem5.add(ChildItem("iot2", R.drawable.iottwo))
        childItem5.add(ChildItem("iot2", R.drawable.iottwo))

        parentList.add(
            ParentItem(
                "IoT & Wireless",
                R.drawable.iot,
                childItem5
            )
        )
    }


    }

