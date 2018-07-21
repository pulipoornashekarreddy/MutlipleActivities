package in.net.foru.www.multipleactivities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editText3,editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);
    }

    public void SendSMS(View v)
    {
        String number=editText3.getText().toString();
        String message=editText4.getText().toString();
        //method 1
        /*
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:"+number));
        i.putExtra("sms_body",message);
        startActivity(i);
        */
        //method 2
        SmsManager manager = SmsManager.getDefault();
        manager.sendTextMessage(number,null,message,null,null);
    }
}
