package com.asianaidt.fragment_20220518.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.asianaidt.fragment_20220518.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second,container,false)


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnToast.setOnClickListener {
//        유의사항 : this를 대입하면 화면이 부품이 대입되므로 에러발생!!
//        > requiredContext() / requiredActitity(): 나를 가지고 있는 화면 가져옴
            Toast.makeText(requireContext(), "프레그먼트에서 토스트", Toast.LENGTH_SHORT).show()
        }


    }

}