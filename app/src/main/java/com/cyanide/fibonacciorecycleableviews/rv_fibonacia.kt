import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cyanide.fibonacciorecycleableviews.R

class NumbersRVAdapter(var list: List<Int>): RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val numberview= LayoutInflater.from(parent.context)
            .inflate(R.layout.rvadapter,parent,false)
        return NumbersViewHolder(numberview)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
//   turned tostring for it to be a string
        val currentNumber=list.get(position).toString()
        holder.tvnames.text=currentNumber
    }

    override fun getItemCount(): Int {
        return list.size
    }


}

class NumbersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvnames=itemView.findViewById<TextView>(R.id.tvnames)
}
