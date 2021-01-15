package cl.desafiolatam.coilglidepicasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.desafiolatam.coilglidepicasso.databinding.ActivityMainBinding
import coil.load
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        picasso()
        glide()
        coil()

    }

    fun picasso(){
        Picasso.get()
            .load("https://cdn.pixabay.com/photo/2018/02/23/19/23/raspberry-3176371_960_720.jpg")
            .into(binding.ivPicasso)


    }
    fun glide(){
        Glide.with(this)
            .load(Glide.with(this)
                .load("https://cdn.pixabay.com/photo/2018/10/14/18/58/garlic-3747176_960_720.jpg")
                .into(binding.ivGlide)
            )


    }
    fun coil(){
        binding.ivCoil.load("https://cdn.pixabay.com/photo/2015/03/26/09/40/blueberries-690072_960_720.jpg")
    }
}