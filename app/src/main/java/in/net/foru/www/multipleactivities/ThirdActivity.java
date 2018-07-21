package in.net.foru.www.multipleactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        textView=(TextView)findViewById(R.id.textView3);
        String receivedText = getIntent().getStringExtra("info");
        textView.setText("Hello "+receivedText);
    }
}
