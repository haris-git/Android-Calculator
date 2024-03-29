package./*here goes your package destination*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;  /*the first number given from the user*/
    private EditText num2;  /*the second number given from the user*/
    private TextView sum;   /*the result*/

    /*Everything happens in the 'onCreate'*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*Attach graphics to variables*/
        Button btn = (Button)findViewById(R.id.button);
        num1 = (EditText)findViewById(R.id.editText);
        num2 = (EditText)findViewById(R.id.editText2);
        sum = (TextView)findViewById(R.id.textView3);

        /*create a new click listener for the button - it returns the result on our screen*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                /*read the two numbers that user has given*/
                int anum = Integer.parseInt(num1.getText().toString());
                int bnum = Integer.parseInt(num2.getText().toString());
                
                /*likewise, you can do anything you like with the two given numbers*/
                int finalsum = anum + bnum;
                
                /*convert the integer to string format in order to print it to 'textView3'*/
                sum.setText(Integer.toString(finalsum));
            }
        });
    }
}
