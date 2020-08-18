package com.j4android.bug;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CharAdapter extends ArrayAdapter<CharList> {
    ArrayList<CharList> list = new ArrayList<CharList>();
    Activity activity;

    public CharAdapter(Activity activity, ArrayList<CharList> list){
        super(activity,R.layout.list_view_layout,list);
        this.list = list;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder viewHolder = null;
        CharList charList = list.get(position);

        View itemView = convertView;
        if(itemView == null){
            viewHolder = new ViewHolder();
            itemView = activity.getLayoutInflater().inflate(R.layout.list_view_layout,parent,false);
            viewHolder.imageView = (ImageView)itemView.findViewById(R.id.list_image);
            viewHolder.tv_name = (TextView)itemView.findViewById(R.id.name);
            viewHolder.tv_num = (TextView)itemView.findViewById(R.id.number);
            itemView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) itemView.getTag();
        }

        viewHolder.imageView.setImageResource(charList.getSrc());
        viewHolder.tv_name.setText(charList.getName());
        viewHolder.tv_num.setText(charList.getNum());

        return itemView;
    }

}

class ViewHolder{
    public ImageView imageView;
    public TextView tv_name;
    public TextView tv_num;
}