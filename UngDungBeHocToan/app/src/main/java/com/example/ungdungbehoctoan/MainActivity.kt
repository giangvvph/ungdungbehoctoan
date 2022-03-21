package com.example.ungdungbehoctoan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ungdungbehoctoan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.btnPhepcong.setOnClickListener {
           var giatri1:  Int = (binding.edtSothu1.text.toString()).toInt()
           var giatri2: Int = (binding.edtSothu2.text.toString()).toInt()
           var phepcong: Int = giatri1 +  giatri2
           binding.tvKetqua.text = phepcong.toString()
       }
        binding.btnPheptru.setOnClickListener {
            var giatri1:  Int = (binding.edtSothu1.text.toString()).toInt()
            var giatri2: Int = (binding.edtSothu2.text.toString()).toInt()
            var pheptru: Int = giatri1 -  giatri2
            binding.tvKetqua.text = pheptru.toString()
        }
        binding.btnPhepnhan.setOnClickListener {
            var giatri1:  Int = (binding.edtSothu1.text.toString()).toInt()
            var giatri2: Int = (binding.edtSothu2.text.toString()).toInt()
            var phepnhan: Int = giatri1 *  giatri2
            binding.tvKetqua.text = phepnhan.toString()
        }
        binding.btnPhepchia.setOnClickListener {
            var giatri1:  Int = (binding.edtSothu1.text.toString()).toInt()
            var giatri2: Int = (binding.edtSothu2.text.toString()).toInt()
            var phepchia: Int = giatri1 /  giatri2
            binding.tvKetqua.text = phepchia.toString()
        }
    }
}