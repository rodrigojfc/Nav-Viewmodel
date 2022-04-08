package com.flores.parcial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.flores.parcial.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    // private val args: SecondFragmentArgs by navArgs()
    private lateinit var  binding: FragmentSecondBinding
    private val viewModel: MainViewModel by activityViewModels ()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        //Binding en fragmento

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // binding.textSecondFragment.text = args.receivedValue

        //El viewmodel del fragmento se conecta con el view model del mainactivity
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.actionAddscore.setOnClickListener{
            val navController = findNavController()
            navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        }



    }
}