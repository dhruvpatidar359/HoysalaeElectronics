package android.example.hoysalaelectronics

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.example.hoysalaelectronics.Fragments.*
import android.example.hoysalaelectronics.util.ConnectionManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var toolbar : Toolbar
    lateinit var drawerLayout : DrawerLayout
    lateinit var navigationDrawer : NavigationView
    lateinit var coordinaterLayout : CoordinatorLayout
    lateinit var frameLayoutFirst : FrameLayout
    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var myContext : Context
    lateinit var dialog : Dialog


        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)


            drawerLayout = findViewById(R.id.drawer)
            navigationDrawer = findViewById(R.id.navigation)
            coordinaterLayout = findViewById(R.id.coordinater)
            toolbar = findViewById(R.id.toolbar)
            frameLayoutFirst = findViewById(R.id.frame)
            bottomNavigationView = findViewById(R.id.bottom_navigation)

            if (ConnectionManager().isConnected(this@HomeActivity)) {
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
//                 R.id.about ->
//                 {
//                      drawerFragment()
//                 }
//                 R.id.share ->
//                 {
//                 }

                    }

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
                    return@setOnItemSelectedListener true
                }

            }

            else{
                showDialogBox()
            }
        }
            private fun drawerFragment(fragment: Fragment, title: String) {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.frame, fragment)
                transaction.commit()
                supportActionBar?.title = title
                drawerLayout.close()

            }

            private fun homeFragment(fragment: Fragment, title: String) {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.frame, fragment)
                transaction.commit()
                supportActionBar?.title = title
                drawerLayout.close()

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

        private fun showDialogBox() {
            lateinit var okButton: Button
            val builder = AlertDialog.Builder(this@HomeActivity)
            myContext = applicationContext
            val inflater: LayoutInflater =
                    myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.alert_dialog_layout, null)
            okButton = view.findViewById(R.id.no_connection_button)
            builder.setView(view)
            dialog = builder.create()

            okButton.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()
        }

}