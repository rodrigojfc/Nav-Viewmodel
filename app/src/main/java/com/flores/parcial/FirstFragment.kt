package com.flores.parcial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.flores.parcial.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    // se tiene que inicializar el viewmodel para usar el del main activity
    private  val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        // return inflater.inflate(R.layout.fragment_first, container, false) Se agrega el inflater al binding
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // se declara el view model
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner


        binding.actionAddscore.setOnClickListener{
            //para cambiar a otro fragmento se identifica automaticamente

            val navController = findNavController()
            navController.navigate(R.id.action_firstFragment_to_secondFragment)

        }
    }

}