package id.hawari.nongki;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {

    public static ChatsFragment newInstance() {
        ChatsFragment fragment = new ChatsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chats, container, false);
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
        ArrayList<Model.Chat> dataList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            dataList.add(new Model.Chat("1",  "asdfx", "asdfx", "Mas Tony", "Bang fai, kapan pulang ?", "09:33", 0));
            dataList.add(new Model.Chat("2",  "asdfx", "asdfx", "Abi", "Bang fai, abi udah bikin motion grafiknya lhoo!","11:21", 0));
            dataList.add(new Model.Chat("3",  "asdfx", "asdfx", "Royhan", "Boss, jagal yuk.","19:03", 1));
            dataList.add(new Model.Chat("4",  "asdfx", "asdfx", "Baehqi", "Dimana mbel, gua udah dijagal.","20:00", 0));
        }

        // Use list view with custom adapter @ChatsAdapter
        ChatsAdapter adapter = new ChatsAdapter(getActivity(), dataList);
        ListView listView = getActivity().findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
