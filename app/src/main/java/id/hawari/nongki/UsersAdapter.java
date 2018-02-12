package id.hawari.nongki;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UsersAdapter extends BaseAdapter {

    TextView textView_name, textView_bio;
    ImageView imageView;
    ArrayList<Model.User> data;
    Activity activity;

    public UsersAdapter(Activity activity, ArrayList<Model.User> data) {
        super();
        this.data = data;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Model.User getItem(int position) {
        return this.data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(activity);
            view = inflater.inflate(R.layout.list_view_users, null);
        }

        Model.User user = getItem(position);

        if (user != null) {
            imageView = view.findViewById(R.id.imageView);
            textView_name = view.findViewById(R.id.textView_name);
            textView_bio = view.findViewById(R.id.textView_bio);

            new Library.DownLoadImageTask(imageView).execute(user.image);
            textView_name.setText(user.name);
            textView_bio.setText(user.bio);
        }

        return view;
    }

}