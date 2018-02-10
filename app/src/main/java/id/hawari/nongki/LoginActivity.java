package id.hawari.nongki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private View.OnClickListener onLoginButtonClick = new View.OnClickListener() {
        @Override
        public  void onClick(View view) {
            Toast.makeText(LoginActivity.this, "Login on process", Toast.LENGTH_SHORT).show();
            Log.d("Login Activity", "Login button clicked!");

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button button = findViewById(R.id.button_login);
        button.setOnClickListener(this.onLoginButtonClick);
    }
}
