package id.hawari.nongki;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MeFragment extends Fragment {
    public static MeFragment newInstance() {
        MeFragment fragment = new MeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * @variable onButtonClick
     * is a variable for handle event on click for button_logout
     * in here will will show a toast and move to login activity
     */
    private View.OnClickListener onLogoutButtonClick = new View.OnClickListener() {
        @Override
        public  void onClick(View view) {
            Log.d("Fragment Me", "Logout button clicked!");
            Toast.makeText(getActivity(), "Logout success", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(getActivity(), LoginActivity.class);
            startActivity(intent);
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_me, container, false);
    }

    /**
     * @method onViewCreated
     * is method will run after a view created
     * in here will call setOnClickListener to onLogoutButtonClick method
     */
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Button button = getActivity().findViewById(R.id.button_logout);
        button.setOnClickListener(this.onLogoutButtonClick);

    }
}
