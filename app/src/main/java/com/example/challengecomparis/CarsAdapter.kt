package com.example.challengecomparis

    import android.view.LayoutInflater
    import android.view.ViewGroup
    import androidx.recyclerview.widget.RecyclerView
    import com.example.challengecomparis.databinding.ItemCarBinding

class CarsAdapter : RecyclerView.Adapter<ListSelectionViewHolder>() {
    private lateinit var cars: MutableList<Car>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val binding = ItemCarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListSelectionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        val car = cars[position]
        holder.binding.itemName.text = car.carName
        if (car.isFavourite) {
            holder.binding.itemIsFavourite.setImageResource(R.drawable.ic_baseline_favorite_24)
        } else {
            holder.binding.itemIsFavourite.setImageResource(R.drawable.ic_baseline_favorite_border_24)
        }
    }

    override fun getItemCount(): Int {
            return cars.size
    }

     fun setCars(items: MutableList<Car>){
         cars = items
         notifyDataSetChanged()
     }
}
