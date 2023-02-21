package com.example.navigation

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigation.databinding.FragmentInfoBinding


class InfoFragment : Fragment(R.layout.fragment_info) {
    lateinit var binding : FragmentInfoBinding
    val viewModel : InfoFragmentViewModel by activityViewModels()
    val args : InfoFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)!!
        binding.apply {
            infoViewModel = viewModel
            lifecycleOwner = this@InfoFragment
            viewModel.userName.value = args.userName
            viewModel.password.value = args.password
            buttonNext.setOnClickListener {
                viewModel.save.value = buttonNext.text.toString()
//                Navigation.findNavController(view).navigate(InfoFragmentDirections.actionInfoFragmentToResultFragment())
            }
        }
    }
}