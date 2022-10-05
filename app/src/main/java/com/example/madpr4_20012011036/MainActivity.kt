package com.example.madpr4_20012011036

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.text.BoringLayout.make
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.madpr4_20012011036.R
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Browse=findViewById<Button>(R.id.button_Browse)

        Browse.setOnClickListener{
            val url = findViewById<TextInputEditText>(R.id.input_browse).text
            var url_text = url.toString()
            Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://uvpce.ac.in")).apply { startActivity(this) }

        }

        var Call=findViewById<Button>(R.id.button2_Call)

        Call.setOnClickListener{
            var number = findViewById<TextInputEditText>(R.id.input_call).text
            var number_text = "tel: $number"
            Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:1234567890")).apply { startActivity(this) }

        }

        var Contact=findViewById<Button>(R.id.button3_Contact)

        Contact.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE).apply { startActivity(this) }

        }

        var CallLog=findViewById<Button>(R.id.button4_CallLog)

        CallLog.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType(CallLog.call.CONTENT TYPE).apply { startActivity(this) }

        }

        var Gallery=findViewById<Button>(R.id.button5_Gallery)

        Gallery.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType("image/*").apply { startActivity(this) }

        }

        var Camera=findViewById<Button>(R.id.button6_Camera)

        Camera.setOnClickListener{
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply { startActivity(this) }

        }

        var Alarm=findViewById<Button>(R.id.button7_Alarm)

        Alarm.setOnClickListener{
            Intent(AlarmClock.ACTION_SHOW_ALARMS).apply { startActivity(this) }

        }
    }
}