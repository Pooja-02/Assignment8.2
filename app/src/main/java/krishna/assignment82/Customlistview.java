package krishna.assignment82;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by abc on 7/7/2017.
 */
//extending array adapter
public class Customlistview extends ArrayAdapter<String>{
    private String [] name;
    private String [] phone_no;
    private Activity context;

    public Customlistview(Activity context, String[] name,String[] phone_no) {
        super(context,R.layout.customlistview,name);
        this.context=context;
        this.name=name;
        this.phone_no=phone_no;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        //inflate the custom list
        View listViewItem = inflater.inflate(R.layout.customlistview, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.name);
        TextView textViewDesc = (TextView) listViewItem.findViewById(R.id.phonenb);
        textViewName.setText(name[position]);//setting name at its position
        textViewDesc.setText(phone_no[position]);//setting phone-no at its position
        return  listViewItem;
    }
}
