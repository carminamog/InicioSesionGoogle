package moreno.carmina.iniciogoogle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.material.internal.ContextUtils
import org.w3c.dom.Text

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val nombre : TextView = findViewById(R.id.tv_name)
        val email : TextView = findViewById(R.id.tv_email)


        val extra = intent.getStringExtra("NOMBRE")
        nombre.apply {
            text = extra
        }


    }

}