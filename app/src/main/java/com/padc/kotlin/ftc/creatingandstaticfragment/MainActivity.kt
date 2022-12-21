package com.padc.kotlin.ftc.creatingandstaticfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //second under first
        supportFragmentManager.beginTransaction()
//            .add(R.id.fragmentContainerFirst, FirstFragment())
//            .add(R.id.fragmentContaineSecond, SecondFragment())
//            .commit()


        //first under second
        supportFragmentManager.beginTransaction()
//            .add(R.id.fragmentContainerFirst, SecondFragment())
//            .add(R.id.fragmentContaineSecond, FirstFragment())
//            .commit()


        //ktx using, no need to create object
        supportFragmentManager.commit {
            add<SecondFragment>(R.id.fragmentContainerFirst)
            add<FirstFragment>(R.id.fragmentContaineSecond)
        }

    }
}