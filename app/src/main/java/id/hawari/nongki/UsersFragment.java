package id.hawari.nongki;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class UsersFragment extends Fragment {
    public static UsersFragment newInstance() {
        return new UsersFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_users, container, false);
    }

    /**
     * @method onViewCreated
     * is method will run after a view created
     * in here we use list view with custom adapter
     */
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Create dummy data for testing
        ArrayList<Model.User> dataList = new ArrayList<>();
        dataList.add(new Model.User("1",  "Royhan Anwar", "anwarroyhan@gmail.com", "Simple is not east", "https://pbs.twimg.com/profile_images/949374088249671680/MuxDEZpD.jpg", true, null, null));
        dataList.add(new Model.User("1",  "Fachri Hawari", "anwarroyhan@gmail.com", "Simple is not east", "https://lh3.googleusercontent.com/dB3Dvgf3VIglusoGJAfpNUAANhTXW8K9mvIsiIPkhJUAbAKGKJcEMPTf0mkSexzLM5o=w300", true, null, null));
        dataList.add(new Model.User("1",  "Imron Habibi", "anwarroyhan@gmail.com", "Simple is not east", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRaVGpdEZAxPH3Z2THGyZyBnQuo9Qpr2yZltDAThOS6ur1Rd3iI", true, null, null));
        dataList.add(new Model.User("1",  "Andri Huang", "anwarroyhan@gmail.com", "Simple is not east", "https://lh3.googleusercontent.com/VT-PqxMMsA2wPy7kzmuKGDIzaA3AGuXKExqnfOfwTEy5AvLIMTranbfNGheRr457RD4=w300", true, null, null));
        dataList.add(new Model.User("1",  "Vivih Herawati", "anwarroyhan@gmail.com", "Simple is not east", "http://dl.hiapphere.com/data/icon/201412/HiAppHere_com_com.studio8apps.instasizenocrop.png", true, null, null));
        dataList.add(new Model.User("1",  "Muhammad Faiz", "anwarroyhan@gmail.com", "Simple is not east", "https://lh3.googleusercontent.com/SsRzFeyrgSlpUJO--xSo8VEnEd7zl9ocyXih83oq3UqmMCbu4GVlMUMMbGgqJauKAw=w300", true, null, null));
        dataList.add(new Model.User("1",  "Dede Mulyawan", "anwarroyhan@gmail.com", "Simple is not east", "https://hb-therm.com/wp-content/themes/hbterm/assets/img/dummy.png", true, null, null));
        dataList.add(new Model.User("1",  "Ethan Chen", "anwarroyhan@gmail.com", "Simple is not east", "https://ik.imagekit.io/bfrs/tr:w-600,h-600,pr-true,cm-pad_resize,bg-FFFFFF/image_jinu1992/data/QiYi-MoFangGe-Square-1-Stickerless-cubelelo_2.jpeg", true, null, null));
        dataList.add(new Model.User("1",  "Yogy Phang Wijaya", "anwarroyhan@gmail.com", "Simple is not east", "http://moziru.com/images/square-clipart-cartoon-6.jpg", true, null, null));

        // Use list view with custom adapter @UsersAdapter
        UsersAdapter adapter = new UsersAdapter(getActivity(), dataList);
        ListView listView = getActivity().findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
