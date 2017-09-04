package fi.jamk.basicuicontrols_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // loginAutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.loginAutoCompleteTextView);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, new String[] {"Piitu", "Paatu", "Jörbe", "Elmo"});
        actv.setAdapter(aa);
    }

    public void ShowLogin(View view){
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.loginAutoCompleteTextView);

        String login = actv.getText().toString();

        EditText pw = (EditText) findViewById(R.id.passwordEditText);

        String password = pw.getText().toString();

        Toast.makeText(getApplicationContext(), login + " " + password, Toast.LENGTH_LONG).show();
    }
}
