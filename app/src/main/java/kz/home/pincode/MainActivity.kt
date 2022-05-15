package kz.home.pincode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


private const val CORRECT_CODE = "1567"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview: TextView = findViewById(R.id.textview)
        val code: TextView = findViewById(R.id.pincode)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonD: Button = findViewById(R.id.buttonC)
        val button0: Button = findViewById(R.id.button0)
        val buttonOK: Button = findViewById(R.id.buttonOk)

        button0.setOnClickListener {
            textview.text = ""
            code.append("0")
        }
        button1.setOnClickListener {
            textview.text = ""
            code.append("1")
        }
        button2.setOnClickListener {
            textview.text = ""
            code.append("2")
        }
        button3.setOnClickListener {
            textview.text = ""
            code.append("3")
        }
        button4.setOnClickListener {
            textview.text = ""
            code.append("4")
        }
        button5.setOnClickListener {
            textview.text = ""
            code.append("5")
        }
        button6.setOnClickListener {
            textview.text = ""
            code.append("6")
        }
        button7.setOnClickListener {
            textview.text = ""
            code.append("7")
        }
        button8.setOnClickListener {
            textview.text = ""
            code.append("8")
        }
        button9.setOnClickListener {
            textview.text = ""
            code.append("9")
        }

        buttonD.setOnClickListener {
            if (code.text.toString().isNotBlank()){
                code.text = code.text.toString().substring(0, code.text.toString().length-1)
            }
        }

        buttonOK.setOnClickListener {
            if (code.text.toString() == CORRECT_CODE){
                Toast.makeText(this, "It is a Correct Code", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "It is a Wrong Code", Toast.LENGTH_SHORT).show()
            }
        }
    }
}