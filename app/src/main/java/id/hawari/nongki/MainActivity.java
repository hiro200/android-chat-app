package id.hawari.nongki;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    /*
    *  onNavigationItemSelectedListener
    *  is a event listener for every clicked tab item
    *  display fragment view for every selected tab
    */
    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_chats:
                    getSupportActionBar().setTitle(R.string.title_chats);
                    selectedFragment = ChatsFragment.newInstance();
                    break;
                case R.id.navigation_new_chat:
                    getSupportActionBar().setTitle(R.string.title_users);
                    selectedFragment = UsersFragment.newInstance();
                    break;
                case R.id.navigation_me:
                    getSupportActionBar().setTitle(R.string.title_me);
                    selectedFragment = MeFragment.newInstance();
                    break;
            }

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, selectedFragment);
            transaction.commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Give BottomNavigationView an event listener
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this.onNavigationItemSelectedListener);

        // Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, ChatsFragment.newInstance());
        transaction.commit();

        getSupportActionBar().setTitle(R.string.title_chats);

        // Used to select an item programmatically
        // bottomNavigationView.getMenu().getItem(2).setChecked(true);
    }

}
