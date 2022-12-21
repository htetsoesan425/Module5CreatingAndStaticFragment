package com.padc.kotlin.ftc.creatingandstaticfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_subscription.view.*

class SubscriptionFragment : Fragment() {

    companion object {
        const val KEY_SUBSCRIPTION_DESCRIPTION = "KEY_SUBSCRIPTION_DESCRIPTION"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_subscription, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = arguments.takeIf { bundle ->
            bundle?.containsKey(KEY_SUBSCRIPTION_DESCRIPTION) ?: false
        }
        view.tvSubscriptionDescription.text =
            bundle?.getString(KEY_SUBSCRIPTION_DESCRIPTION) ?: ""
    }
}