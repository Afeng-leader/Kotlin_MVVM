package com.af.kotlin_mvvm.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.af.kotlin_mvvm.base.BaseActivity
import com.af.kotlin_mvvm.databinding.ActivityMainBinding
import com.af.kotlin_mvvm.ui.community.CommunityFragment
import com.af.kotlin_mvvm.ui.home.HomePageFragment
import com.af.kotlin_mvvm.ui.main.MineFragment.MineFragment
import com.af.kotlin_mvvm.ui.notification.NotificationFragment

class MainActivity : BaseActivity() {

    private var _binding : ActivityMainBinding? = null

    private val binding : ActivityMainBinding
        get() = _binding!!

    private var backPressTime = 0L

    private var homePageFragment: HomePageFragment? = null

    private var communityFragment: CommunityFragment? = null

    private var notificationFragment: NotificationFragment? = null

    private var mineFragment: MineFragment? = null

    private val fragmentManager : FragmentManager by lazy { supportFragmentManager }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun setupViews() {
        super.setupViews()

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }
}
