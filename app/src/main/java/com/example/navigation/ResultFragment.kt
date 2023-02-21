package com.example.navigation


import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentResultBinding


class ResultFragment : Fragment(R.layout.fragment_result) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DataBindingUtil.bind<FragmentResultBinding>(view)!!.apply {
            buttonNext.setOnClickListener {
                Navigation.findNavController(view).navigate(ResultFragmentDirections.actionResultFragmentToMainFragment())
            }
        }
    }

}