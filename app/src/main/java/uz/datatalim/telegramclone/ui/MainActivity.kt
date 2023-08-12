package uz.datatalim.telegramclone.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.datatalim.telegramclone.R
import uz.datatalim.telegramclone.adapter.UserAdapter
import uz.datatalim.telegramclone.model.User

class MainActivity : AppCompatActivity() {
    lateinit var userList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
        val rvUser=findViewById<RecyclerView>(R.id.rv_user)
        rvUser.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvUser.adapter=UserAdapter(userList)

    }

    private fun initviews() {
        loadUsers()
    }

    private fun loadUsers() {
        userList = ArrayList()
        userList.add(User("mavsumbel", "salom", "bugun", "", true))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
        userList.add(User("mavsumbel", "salom", "bugun", "", false))
    }}