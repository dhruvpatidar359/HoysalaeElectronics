package android.example.hoysalaelectronics

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.example.hoysalaelectronics.Activity.CartActivity
import android.example.hoysalaelectronics.Fragments.*
import android.example.hoysalaelectronics.util.ConnectionManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlin.properties.Delegates

class HomeActivity : AppCompatActivity() {
    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationDrawer: NavigationView
    lateinit var coordinaterLayout: CoordinatorLayout
    lateinit var frameLayoutFirst: FrameLayout
    lateinit var bottomNavigationView: BottomNavigationView
    var isBackButton = false

    //  @SuppressLint("MissingInflatedId", "SuspiciousIndentation")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        drawerLayout = findViewById(R.id.drawer)
        navigationDrawer = findViewById(R.id.navigation)
        coordinaterLayout = findViewById(R.id.coordinater)
        toolbar = findViewById(R.id.toolbar)
        frameLayoutFirst = findViewById(R.id.frame)
        bottomNavigationView = findViewById(R.id.bottom_navigation)

        homeFragment(Homefragment(), "Hoysala Electronics")

        setUpToolbar()

        val actionBarDrawerToolbar = ActionBarDrawerToggle(
            this@HomeActivity, drawerLayout, toolbar, R.string.open_drawer,
            R.string.close_drawer
        )

        //adding click Listener to hamburger icon
        drawerLayout.addDrawerListener(actionBarDrawerToolbar)

        //below code is used to change hamburger color
        actionBarDrawerToolbar.drawerArrowDrawable.color =
                resources.getColor(R.color.purple_700);

        //this code is used to change hamburger icon to back arrow and vice-versa
        actionBarDrawerToolbar.syncState()

        navigationDrawer.setNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.transaction_history -> {
                    drawerFragment(Transaction(), "My Transaction")
                }
                R.id.about -> {
                    drawerFragment(Transaction(), "My Transaction")
                }
                R.id.share -> {
                    try{
                        val intent = Intent(Intent.ACTION_SEND)
                        intent.type = "text/plain"
                        intent.putExtra(Intent.EXTRA_SUBJECT,"Share this app")
                        val shareMessage = "https://play.google.com/store/apps/detils?id="+BuildConfig.APPLICATION_ID+"\n\n"
                        intent.putExtra(Intent.EXTRA_TEXT,shareMessage)
                        startActivity(Intent.createChooser(intent,"share by"))
                    } catch (e:Exception){
                       Toast.makeText(applicationContext,"Some errror occured",Toast.LENGTH_SHORT).show()
                    }
                }

            }
            it.isChecked = true
            drawerLayout.close()
            return@setNavigationItemSelectedListener true
        }
        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home_icon -> {
                    homeFragment(Homefragment(), "Hoysala Electronics")
                }
                R.id.category -> {
                    drawerFragment(CategoriesFragment(), "Categories")
                }
                R.id.notification -> {
                    drawerFragment(NotificationFragment(), "Notification")
                }
                R.id.profile -> {
                    drawerFragment(AccountFragment(), "My Account")
                }

            }
            it.isChecked = true
            drawerLayout.close()
            return@setOnItemSelectedListener true
        }

    }

    private fun drawerFragment(fragment: Fragment, title: String) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.frame, fragment)
        transaction.commit()
        supportActionBar?.title = title
      //  drawerLayout.close()

    }

    private fun homeFragment(fragment: Fragment, title: String) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.frame, fragment)
        transaction.commit()
        supportActionBar?.title = title
     //   drawerLayout.close()

    }

    private fun setUpToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu_cart, menu)
            return super.onCreateOptionsMenu(menu)
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.action_my_cart){
            val intent = Intent(this@HomeActivity,CartActivity :: class.java)
            startActivity(intent)
        }

        return super.onOptionsItemSelected(item)
    }

        override fun onBackPressed() {
            val frame = supportFragmentManager.findFragmentById(R.id.frame)

            when (frame) {
                !is Homefragment -> {
                    homeFragment(Homefragment(), "Hoysala Electronics")
                    navigationDrawer.setCheckedItem(R.id.home)

                }
                else -> super.onBackPressed()
            }
        }
}