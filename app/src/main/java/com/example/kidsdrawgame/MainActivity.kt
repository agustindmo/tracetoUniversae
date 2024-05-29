package com.example.kidsdrawgame

import android.content.Intent
import android.graphics.Paint
import android.graphics.Path
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kidsdrawgame.ui.theme.KidsDrawGameTheme

class MainActivity : ComponentActivity() {

    companion object{
        var  path =  Path()
        var paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_intro)

        val button1= findViewById<Button>(R.id.my_button)
        button1.setOnClickListener(View.OnClickListener{

            val intent = Intent(this, MainActivityIntro::class.java)
            startActivity(intent)
        })

//        val redBtn = findViewById<Button>(R.id.redColor)
//        val blueBtn = findViewById<Button>(R.id.blueColor)
//        val blackBtn = findViewById<Button>(R.id.blackColor)
//        val whiteBtn = findViewById<Button>(R.id.whiteColor)
//
//        redBtn.setOnClickListener {
//            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
//            paintBrush.setColor(Color.RED)
//        }
//
//        blueBtn.setOnClickListener {
//            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
//            paintBrush.setColor(Color.BLUE)
//        }
//
//        blackBtn.setOnClickListener {
//            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
//            paintBrush.setColor(Color.BLACK)
//
//        }
//
//        whiteBtn.setOnClickListener {
//            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
//            paintBrush.setColor(Color.WHITE)
//        }
//
//
//        }

@Composable
fun MainScreen(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello!",
        modifier = modifier
    )
}


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KidsDrawGameTheme {
        MainActivity()
    }}}