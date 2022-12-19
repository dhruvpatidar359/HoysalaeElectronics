package android.example.hoysalaelectronics.Fragments

import android.content.Context
import android.example.hoysalaelectronics.Adapters.HorizontalRecycler
import android.example.hoysalaelectronics.Adapters.OurProductsAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.example.hoysalaelectronics.R
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class Homefragment : Fragment() {

   private lateinit var carsoul : ImageCarousel
   private lateinit var recyclerView: RecyclerView
   private lateinit var adapter : HorizontalRecycler
   private lateinit var secondRecyler : RecyclerView
   private lateinit var secondAdapter : OurProductsAdapter
   lateinit var layoutManager: RecyclerView.LayoutManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        carsoul = view.findViewById(R.id.carousel)
        recyclerView = view.findViewById(R.id.recyler)
        secondRecyler = view.findViewById(R.id.recycler2)

        //First Recycler View inflating
        adapter = HorizontalRecycler(activity as Context)
        recyclerView.layoutManager = LinearLayoutManager(activity as Context,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = adapter

        //Second Recycler View inflating

        layoutManager = GridLayoutManager(activity as Context,2)

        secondAdapter = OurProductsAdapter()
        secondRecyler.layoutManager = layoutManager
        secondRecyler.adapter = secondAdapter


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

}