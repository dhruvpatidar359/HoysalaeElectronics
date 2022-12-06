package android.example.hoysalaelectronics.Activity

import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.drawerlayout.widget.DrawerLayout
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toolbar : Toolbar
    lateinit var drawerLayout : DrawerLayout
    lateinit var navigationDrawer : NavigationView
    lateinit var coordinaterLayout : CoordinatorLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer)
        navigationDrawer = findViewById(R.id.navigation)
        coordinaterLayout = findViewById(R.id.coordinater)
        toolbar = findViewById(R.id.toolbar)

        setUpToolbar()

        val actionBarDrawerToolbar = ActionBarDrawerToggle(this@MainActivity,drawerLayout,toolbar,R.string.open_drawer,
                R.string.close_drawer)

        //adding click Listener to hamburger icon
        drawerLayout.addDrawerListener(actionBarDrawerToolbar)

        //below code is used to change hamburger color
        actionBarDrawerToolbar.drawerArrowDrawable.color = resources.getColor(R.color.purple_700);

        //this code is used to change hamburger icon to back arrow and vice-versa
        actionBarDrawerToolbar.syncState()

     /*   val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://i.pinimg.com/originals/da/a3/29/daa3294d1a90e2d9d850fa3a08507fec.png",""))
        imageList.add(SlideModel("http://www.comstreamconsulting.com/wp-content/uploads/2015/09/Slider-Electronics-and-High-Tech.jpg",""))
        imageList.add(SlideModel("https://thumbs.dreamstime.com/b/resistors-capacitors-other-electronic-components-micro-chip-inside-computer-close-up-resistors-capacitors-other-187455099.jpg",""))
        imageList.add(SlideModel("https://c8.alamy.com/comp/C962G5/electronic-components-including-resistors-transistors-capacitors-and-C962G5.jpg",""))
        imageList.add(SlideModel("https://qph.fs.quoracdn.net/main-qimg-d83ed6e56c74884395505e0ec8bff1e5",""))

        slider.setImageList(imageList,ScaleTypes.FIT)*/


    }
    private fun setUpToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_cart,menu)
        return super.onCreateOptionsMenu(menu)
    }
}