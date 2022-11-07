package com.example.elderly.basicappactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.elderly.R
import com.example.elderly.fragments.ContactFragment
import com.example.elderly.fragments.HomeFragment
import com.example.elderly.fragments.LocationFragment
import com.example.elderly.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_home)

        val firstFragment=HomeFragment()
        val secondFragment=LocationFragment()
        val thirdFragment=ContactFragment()
        val fourthFragment=ProfileFragment()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.homePage->setCurrentFragment(firstFragment)
                R.id.locationPage->setCurrentFragment(secondFragment)
                R.id.contactPage->setCurrentFragment(thirdFragment)
                R.id.profilePage->setCurrentFragment(fourthFragment)


            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}