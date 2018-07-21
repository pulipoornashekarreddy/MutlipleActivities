package in.net.foru.www.multipleactivities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
    }

    public void ChangeActivity(View v)
    {
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
        //this activity will be killed
        //finish();
    }

    public void ThirdAct(View v)
    {
        String data = editText.getText().toString();
        Intent i = new Intent(this,ThirdActivity.class);
        i.putExtra("info",data);
        startActivity(i);
    }

    public void MakeCall(View v)
    {
        Intent i =new Intent(Intent.ACTION_DIAL);
        String number = editText2.getText().toString();
        i.setData(Uri.parse("tel:"+number));
        startActivity(i);
    }


}
