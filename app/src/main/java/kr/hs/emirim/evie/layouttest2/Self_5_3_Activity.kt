package kr.hs.emirim.evie.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class Self_5_3_Activity : AppCompatActivity() {
    lateinit var edittxt : EditText
    lateinit var txt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val linear1 = LinearLayout(this)
        linear1.orientation = LinearLayout.VERTICAL
        linear1.setBackgroundColor(Color.YELLOW)
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linear1, params)

        edittxt = EditText(this)
        edittxt.textSize = 20f
        edittxt.setBackgroundColor(Color.WHITE)
        linear1.addView(edittxt)

        var btn = Button(this)
        btn.text = "버튼입니다"
        btn.setBackgroundColor(Color.rgb(255, 0, 255))
        linear1.addView(btn)

        txt = TextView(this)
        txt.textSize = 20f
        txt.setTextColor(Color.rgb(128, 0, 128))
        linear1.addView(txt)

        btn.setOnClickListener {
            txt.text = edittxt.text
        }
    }



}