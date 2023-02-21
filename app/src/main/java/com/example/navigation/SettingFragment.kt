package com.example.navigation

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentSettingBinding


class SettingFragment : Fragment(R.layout.fragment_setting) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DataBindingUtil.bind<FragmentSettingBinding>(view)!!.apply {
            buttonNext.setOnClickListener {
                Navigation.findNavController(view).navigate(SettingFragmentDirections.actionSettingFragmentToResultFragment())
            }
        }

    }
}