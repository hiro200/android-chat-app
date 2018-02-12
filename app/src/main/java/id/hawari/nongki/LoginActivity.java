package id.hawari.nongki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private View.OnClickListener mOnLoginButtonClick = new View.OnClickListener() {
        @Override
        public  void onClick(View view) {
            Toast.makeText(LoginActivity.this, "Login success!", Toast.LENGTH_SHORT).show();
            Log.d("Login Activity", "Login button clicked!");

            // Change activity
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // find button_login set event listener if button clicked call onLoginButtonClick method
        final Button button = findViewById(R.id.button_login);
        button.setOnClickListener(this.mOnLoginButtonClick);
    }
}
