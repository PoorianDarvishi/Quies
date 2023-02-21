package com.example.navigation

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {
    val viewModel : InfoFragmentViewModel by activityViewModels()
    lateinit var binding: FragmentMainBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding.apply {
            textViewSave.text = viewModel.save.value
            buttonInfo.setOnClickListener {
                Navigation.findNavController(view).navigate(MainFragmentDirections.actionMainFragmentToInfoFragment(
                    if (editTextTextUserName.text.toString() != ""){
                        editTextTextUserName.text.toString()
                    }else{
                         "userName"
                    }
                    ,
                    if (editTextTextPassword.text.toString() != ""){
                        editTextTextPassword.text.toString()
                    }else{
                        "Password"
                    }

                ))
            }
            buttonSetting.setOnClickListener {
                Navigation.findNavController(view).navigate(MainFragmentDirections.actionMainFragmentToSettingFragment())
            }
        }

    }

}