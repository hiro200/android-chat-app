package id.hawari.nongki;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChatsAdapter extends BaseAdapter {

    TextView textView_name, textView_message, textView_time, textView_count;
    ImageView imageView;
    ArrayList<Model.Chat> data;
    Activity activity;

    public ChatsAdapter(Activity activity, ArrayList<Model.Chat> data) {
        super();
        this.data = data;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Model.Chat getItem(int position) {
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
            view = inflater.inflate(R.layout.list_view_chats, null);
        }

        Model.Chat chat = getItem(position);

        if (chat != null) {
            imageView = view.findViewById(R.id.imageView);
            textView_name = view.findViewById(R.id.textView_name);
            textView_message = view.findViewById(R.id.textView_message);
            textView_time = view.findViewById(R.id.textView_time);
            textView_count = view.findViewById(R.id.textView_count);

            final String imgURL  = "https://www.google.com/images/srpr/logo11w.png";
            new Library.DownLoadImageTask(imageView).execute(imgURL);

            textView_name.setText(chat.name);
            textView_message.setText(chat.message);
            textView_time.setText(chat.time);
            if (chat.count > 0) {
                textView_count.setVisibility(View.VISIBLE);
                textView_count.setText(String.valueOf(chat.count));
            }
            else
            {
                textView_count.setVisibility(View.INVISIBLE);
            }
        }

        return view;
    }

}