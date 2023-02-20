package hr.algebra.butterknife

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_yellow.view.*

class YellowFragment : Fragment( ) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myFragment = inflater.inflate( R.layout.fragment_yellow, container, false )

        myFragment.bToast.setOnClickListener {
            Toast
                .makeText( activity, "From extension", Toast.LENGTH_SHORT )
                .show( )
        }

        return myFragment
    }
}