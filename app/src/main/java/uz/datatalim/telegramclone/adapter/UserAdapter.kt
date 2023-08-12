package uz.datatalim.telegramclone.adapter

import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import uz.datatalim.telegramclone.R
import uz.datatalim.telegramclone.model.User

class UserAdapter(val list:ArrayList<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        var user = list[position]
        holder.tvUserName.text=user.userName
        holder.ivMessage.text=user.message
        holder.tvTime.text=user.time
        Glide.with(holder.ivProfile).load(user.image).into(holder.ivProfile)
        if (user.isOnline) {
            holder.ivOnline.visibility = View.VISIBLE
        } else {
            holder.ivOnline.visibility = View.GONE
        }



    }

    class UserViewHolder(view:View): RecyclerView.ViewHolder(view){
        val ivProfile=view.findViewById<ImageView>(R.id.iv_profile_photo)
        val tvUserName=view.findViewById<TextView>(R.id.tv_user_name)
        val ivMessage=view.findViewById<TextView>(R.id.tv_message)
        val ivOnline=view.findViewById<ImageView>(R.id.ic_isonline)
        val tvTime=view.findViewById<TextView>(R.id.tv_time)
    }
}
