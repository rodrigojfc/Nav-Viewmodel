package com.flores.parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import com.flores.parcial.databinding.ActivityMainBinding
import com.flores.parcial.databinding.FragmentFirstBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    // se declara el viewmodel
    private val viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //Se conecta el navhostfragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
                as NavHostFragment
        //se declara el navcontroller
        val navController = navHostFragment.navController

    }
}