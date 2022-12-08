package android.example.hoysalaelectronics.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.example.hoysalaelectronics.R
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class HomeFragment : Fragment() {

    lateinit var carsoul : ImageCarousel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        carsoul = view.findViewById(R.id.carousel)

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