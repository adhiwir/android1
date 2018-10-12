package com.example.adhi.fragment.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import com.example.adhi.fragment.R
import com.example.adhi.fragment.ui.fragment.AcademyFragment
import com.example.adhi.fragment.ui.fragment.HelpFragment
import com.example.adhi.fragment.ui.fragment.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showAxademy()
        setupView()
    }

    private fun showAxademy() {
        setupFragmen(AcademyFragment())
        this.title = getString(R.string.academy)
    }

    private fun setupView() {
        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_academy -> {
                    setupFragmen(AcademyFragment())
                    this.title = getString(R.string.academy)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_help -> {
                    setupFragmen(HelpFragment())
                    this.title = getString(R.string.help)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_profile -> {
                    setupFragmen(ProfileFragment())
                    this.title = getString(R.string.profile)
                    return@setOnNavigationItemSelectedListener true
                }

            }
            return@setOnNavigationItemSelectedListener false
        }
    }

    private fun setupFragmen(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
