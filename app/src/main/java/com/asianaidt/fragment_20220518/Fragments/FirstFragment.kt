package com.asianaidt.fragment_20220518.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.asianaidt.fragment_20220518.R

class FirstFragment : Fragment() {

//    어떤 xml을 끌어다 사용할 지 결정하는 함수

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflater : XML을 끌어올때 사용하는 함수
        return inflater.inflate( R.layout.fragment_first, container,false)
    }

}