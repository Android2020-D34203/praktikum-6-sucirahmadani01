package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView helloWorld;
    Button buttonPindah;
    EditText editText;

    private String tulis="";
    private String input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorld = findViewById(R.id.viewYa);
        buttonPindah = findViewById(R.id.buttonPindah);
        editTeks = findViewById(R.id.editNama);
        buttonPindah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    input = editTeks.getText().toString();
                    if (input != null && input != "") {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                        intent.putExtra(tulis, input);
                        startActivity(intent);
                    } else {
                        Log.i("Error", "Aplikasi Error");
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    Log.i("Error","Aplikasi Error");
                }

            }
        });
    }
    @Override
    protected  void onStart(){
        super.onStart();
        helloWorld.setText("Tulisan Hello World telah diubah");
    }

    @Override
    protected void onResume(){
        super.onResume();
        helloWorld.setText("Mana yang akan ditampilkan?");
    }
}
