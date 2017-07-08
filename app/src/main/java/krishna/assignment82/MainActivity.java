package krishna.assignment82;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by abc on 7/7/2017.
 */

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    //defining two string array
    private String name[] = //passing the names
            {
            "pooja",
            "Arjun",
            "Abhishek",
            "aditya",
            "pankaj"
    };

    private String phone_no[] =//[assing phone numbers
             {
            "0123456789",
            "1122335678",
            "5676577656",
            "4577778686",
            "000100010001"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//loading the main layout
        //binding name and phone-no with custom list
        Customlistview customList = new Customlistview(this, name,phone_no);//declaring custom listview
        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(customList);//setting the adapter
    }


}
