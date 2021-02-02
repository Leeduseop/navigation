package com.project.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import kotlinx.android.synthetic.main.screen_first_home.view.*
import androidx.navigation.fragment.findNavController

class FirstHomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.screen_first_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.btn_first_home.setOnClickListener {
            val direction: NavDirections =
                FirstHomeScreenDirections.actionGlobalTwoDepthScreen(1)
            findNavController().navigate(direction)
        }
    }
}