package eduardo.souza.io.marvelappstarter.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import eduardo.souza.io.marvelappstarter.R
import eduardo.souza.io.marvelappstarter.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupSplash()
        window.statusBarColor = ContextCompat.getColor(this, R.color.gray)
        supportActionBar?.hide()
    }

    private fun setupSplash() = with(binding) {
        imgSplash.alpha = 0f
        imgSplash.animate().setDuration(3000).alpha(1f).withEndAction {
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}