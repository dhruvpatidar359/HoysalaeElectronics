package android.example.hoysalaelectronics.fragments

import android.content.Context
import android.example.hoysalaelectronics.adapters.ImageAdapter
import android.example.hoysalaelectronics.R
import android.example.hoysalaelectronics.adapters.Categories_Adapter
import android.example.hoysalaelectronics.model.Categories_Model
import android.example.hoysalaelectronics.model.imageModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class Homefragment : Fragment(),ImageAdapter.RecyclerViewItemClickListeners {

   private lateinit var carsoul : ImageCarousel
//   private lateinit var recyclerView: RecyclerView
//   private lateinit var adapter : HorizontalRecycler
//   private lateinit var secondRecyler : RecyclerView
//   private lateinit var secondAdapter : ImageAdapter
//   lateinit var layoutManager: RecyclerView.LayoutManager

    private  lateinit var categoriesRecycler: RecyclerView
    private lateinit var categoriesAdapter: Categories_Adapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        carsoul = view.findViewById(R.id.carousel)
//        recyclerView = view.findViewById(R.id.recyler)
//        secondRecyler = view.findViewById(R.id.recycler2)
        categoriesRecycler = view.findViewById(R.id.categories)
        val list = arrayListOf<Categories_Model>()
        list.add(Categories_Model(R.drawable.goggle_icon,"google"))
        list.add(Categories_Model(R.drawable.goggle_icon,"capacitor"))
        list.add(Categories_Model(R.drawable.goggle_icon,"electronic component"))
        list.add(Categories_Model(R.drawable.goggle_icon,"google"))
        list.add(Categories_Model(R.drawable.goggle_icon,"google"))
        list.add(Categories_Model(R.drawable.goggle_icon,"google"))
        list.add(Categories_Model(R.drawable.goggle_icon,"google"))
        list.add(Categories_Model(R.drawable.goggle_icon,"google"))

        categoriesAdapter = Categories_Adapter(list)

        categoriesRecycler.layoutManager = LinearLayoutManager(activity as Context,LinearLayoutManager.HORIZONTAL,false)
        categoriesRecycler.adapter = categoriesAdapter





//
//        //First Recycler View inflating
//        adapter = HorizontalRecycler(activity as Context)
//        recyclerView.layoutManager = LinearLayoutManager(activity as Context,LinearLayoutManager.HORIZONTAL,false)
//        recyclerView.adapter = adapter
//
//        //Second Recycler View inflating
//
//        layoutManager = GridLayoutManager(activity as Context,2)
//
//        val list = arrayListOf<imageModel>()
//        list.add(imageModel("","","",""))
//        list.add(imageModel("","","",""))
//        list.add(imageModel("","","",""))
//        list.add(imageModel("","","",""))
//        list.add(imageModel("","","",""))
//        list.add(imageModel("","","",""))
//        list.add(imageModel("","","",""))
//        list.add(imageModel("","","",""))
//        list.add(imageModel("","","",""))
//
//
//
//
//        secondAdapter = ImageAdapter(activity as Context,list,Homefragment(),secondRecyler,2)
//        secondRecyler.layoutManager = layoutManager
//        secondRecyler.adapter = secondAdapter


        initSlider()





        return view

    }
    private fun initSlider(){
        val list = mutableListOf<CarouselItem>()
        list.add(
            CarouselItem(
                imageUrl = "https://urbanwired.com/wp-content/uploads/2016/11/Buy-electrical-products.jpg","Big sale"
            )
        )
        list.add(
            CarouselItem(
                imageUrl = "https://asset.conrad.com/media10/isa/160267/c1/-/en/002138864PI00/image.jpg","Best for You"
            )
        )
        list.add(
            CarouselItem(
                imageUrl = "https://tse1.mm.bing.net/th?id=OIP.YZoLlxJDEsE1UWedWH1AiwHaEf&pid=Api&P=0","Newly launch"
            )
        )
        list.add(
            CarouselItem(
                imageUrl = "https://www.techbuy.com.au/images/extra/47/P476723-i9.jpg","The best standard"
            )
        )
        carsoul.setData(list)
    }

    override fun onRecyclerViewItemClick(items: MutableList<imageModel>?, position: Int) {
        TODO("Not yet implemented")
    }

}