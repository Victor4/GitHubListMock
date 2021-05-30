package com.vb.github_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vb.domain.module.gitHubRepositoryModule
import com.vb.home.modules.homeViewModelModule
import com.vb.home.ui.HomeActivity
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity(), KoinComponent {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin {
            modules(
                homeViewModelModule,
                gitHubRepositoryModule
            )
        }

        startActivity(Intent(this, HomeActivity::class.java))


    }
}