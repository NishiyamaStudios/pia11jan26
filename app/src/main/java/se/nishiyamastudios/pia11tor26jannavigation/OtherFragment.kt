package se.nishiyamastudios.pia11tor26jannavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class OtherFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: OtherFragmentArgs by navArgs()

        view.findViewById<TextView>(R.id.thenameTV).text = args.personname

        view.findViewById<Button>(R.id.otherCloseButton).setOnClickListener {
            findNavController().popBackStack()
        }
    }
}