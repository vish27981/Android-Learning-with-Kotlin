import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.vishcustom.mark01.R

class MainActivity : AppCompatActivity() {
    private lateinit var editUserId: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnLogin: Button

    private val PRESCRIBED_USER_ID = "your_user_id"
    private val PRESCRIBED_PASSWORD = "your_password"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editUserId = findViewById(R.id.editUserId)
        editPassword = findViewById(R.id.editPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val enteredUserId = editUserId.text.toString()
            val enteredPassword = editPassword.text.toString()

            if (enteredUserId == PRESCRIBED_USER_ID && enteredPassword == PRESCRIBED_PASSWORD) {
                showToast("Login Successful")
            } else {
                showToast("Login Failed. Please check your credentials.")
            }
        }
    }

    
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
