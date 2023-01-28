package se.nishiyamastudios.pia11tor26jannavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.goOtherButton).setOnClickListener {
            //findNavController().navigate(R.id.action_startFragment_to_otherFragment)

            val startnameET = view.findViewById<EditText>(R.id.startNameET)
            val startname = startnameET.text.toString()

            if(startname != "") {

                val action = StartFragmentDirections.actionStartFragmentToOtherFragment(startname, 20, null)
                findNavController().navigate(action)

            } else {
                /*
                val text = "Fyll i namn!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(requireContext(), text, duration)
                toast.show()

                 */

                Snackbar.make(view, "Fyll i namn!", Snackbar.LENGTH_LONG)
                    .setAction("bartil") {
                        view.findViewById<EditText>(R.id.startNameET).setText("Bartil")
                    }.setAnchorView(startnameET).show()

            }


        }

        view.findViewById<Button>(R.id.goFancyButton).setOnClickListener {

            //findNavController().navigate(R.id.action_startFragment_to_fancyFragment)

            val action = StartFragmentDirections.actionStartFragmentToFancyFragment()
            findNavController().navigate(action)

        }

    }

}