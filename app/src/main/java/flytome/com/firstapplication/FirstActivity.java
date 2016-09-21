package flytome.com.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    //Déclaration du TextView
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        //Initialisation du TextView
        textView = (TextView)findViewById(R.id.greetings_text_view);
    }

    public void showGreetings(View view){

        String message = "Welcome to my first app...";
        textView.setText(message);
    }
}
