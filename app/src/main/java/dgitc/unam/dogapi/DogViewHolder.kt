package dgitc.unam.dogapi

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dgitc.unam.dogapi.databinding.ItemDogBinding

class DogViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemDogBinding.bind(view)
    fun bind(image: String) {
        Picasso.get().load(image).into(binding.imgView)
    }
}
