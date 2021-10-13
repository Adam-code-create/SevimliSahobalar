package uz.gita.sevimlisahobalar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import uz.gita.sevimlisahobalar.data.SahobaData;
import uz.gita.sevimlisahobalar.dataController.DataController;

public class MainActivity extends AppCompatActivity {
    private DataController controller;
    private ArrayList<TextView> sahobalar;
    private ArrayList<LinearLayout> sahobaInfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadView();
        loadDataToView();
    }

    public void loadView (){
        sahobalar = new ArrayList<>();
        TextView sahoba1 = findViewById(R.id.sahoba1);
        TextView sahoba2 = findViewById(R.id.sahoba2);
        TextView sahoba3 = findViewById(R.id.sahoba3);
        TextView sahoba4 = findViewById(R.id.sahoba4);
        TextView sahoba5 = findViewById(R.id.sahoba5);
        TextView sahoba6 = findViewById(R.id.sahoba6);
        TextView sahoba7 = findViewById(R.id.sahoba7);
        TextView sahoba8 = findViewById(R.id.sahoba8);
        TextView sahoba9 = findViewById(R.id.sahoba9);
        TextView sahoba10 = findViewById(R.id.sahoba10);
        TextView sahoba11 = findViewById(R.id.sahoba11);
        TextView sahoba12 = findViewById(R.id.sahoba12);
        TextView sahoba13 = findViewById(R.id.sahoba13);
        TextView sahoba14 = findViewById(R.id.sahoba14);
        TextView sahoba15 = findViewById(R.id.sahoba15);
        TextView sahoba16 = findViewById(R.id.sahoba16);
        TextView sahoba17 = findViewById(R.id.sahoba17);
        TextView sahoba18 = findViewById(R.id.sahoba18);
        TextView sahoba19 = findViewById(R.id.sahoba19);
        TextView sahoba20 = findViewById(R.id.sahoba20);
        sahobalar.add(sahoba1);
        sahobalar.add(sahoba2);
        sahobalar.add(sahoba3);
        sahobalar.add(sahoba4);
        sahobalar.add(sahoba5);
        sahobalar.add(sahoba6);
        sahobalar.add(sahoba7);
        sahobalar.add(sahoba8);
        sahobalar.add(sahoba9);
        sahobalar.add(sahoba10);
        sahobalar.add(sahoba11);
        sahobalar.add(sahoba12);
        sahobalar.add(sahoba13);
        sahobalar.add(sahoba14);
        sahobalar.add(sahoba15);
        sahobalar.add(sahoba16);
        sahobalar.add(sahoba17);
        sahobalar.add(sahoba18);
        sahobalar.add(sahoba19);
        sahobalar.add(sahoba20);

        LinearLayout sahobaInfo1 = findViewById(R.id.sahobaInfo1);
        LinearLayout sahobaInfo2 = findViewById(R.id.sahobaInfo2);
        LinearLayout sahobaInfo3 = findViewById(R.id.sahobaInfo3);
        LinearLayout sahobaInfo4 = findViewById(R.id.sahobaInfo4);
        LinearLayout sahobaInfo5 = findViewById(R.id.sahobaInfo5);
        LinearLayout sahobaInfo6 = findViewById(R.id.sahobaInfo6);
        LinearLayout sahobaInfo7 = findViewById(R.id.sahobaInfo7);
        LinearLayout sahobaInfo8 = findViewById(R.id.sahobaInfo8);
        LinearLayout sahobaInfo9 = findViewById(R.id.sahobaInfo9);
        LinearLayout sahobaInfo10 = findViewById(R.id.sahobaInfo10);
        LinearLayout sahobaInfo11 = findViewById(R.id.sahobaInfo11);
        LinearLayout sahobaInfo12 = findViewById(R.id.sahobaInfo12);
        LinearLayout sahobaInfo13 = findViewById(R.id.sahobaInfo13);
        LinearLayout sahobaInfo14 = findViewById(R.id.sahobaInfo14);
        LinearLayout sahobaInfo15 = findViewById(R.id.sahobaInfo15);
        LinearLayout sahobaInfo16 = findViewById(R.id.sahobaInfo16);
        LinearLayout sahobaInfo17 = findViewById(R.id.sahobaInfo17);
        LinearLayout sahobaInfo18 = findViewById(R.id.sahobaInfo18);
        LinearLayout sahobaInfo19 = findViewById(R.id.sahobaInfo19);
        LinearLayout sahobaInfo20 = findViewById(R.id.sahobaInfo20);
        sahobaInfos = new ArrayList<>();
        sahobaInfos.add(sahobaInfo1);
        sahobaInfos.add(sahobaInfo2);
        sahobaInfos.add(sahobaInfo3);
        sahobaInfos.add(sahobaInfo4);
        sahobaInfos.add(sahobaInfo5);
        sahobaInfos.add(sahobaInfo6);
        sahobaInfos.add(sahobaInfo7);
        sahobaInfos.add(sahobaInfo8);
        sahobaInfos.add(sahobaInfo9);
        sahobaInfos.add(sahobaInfo10);
        sahobaInfos.add(sahobaInfo11);
        sahobaInfos.add(sahobaInfo12);
        sahobaInfos.add(sahobaInfo13);
        sahobaInfos.add(sahobaInfo14);
        sahobaInfos.add(sahobaInfo15);
        sahobaInfos.add(sahobaInfo16);
        sahobaInfos.add(sahobaInfo17);
        sahobaInfos.add(sahobaInfo18);
        sahobaInfos.add(sahobaInfo19);
        sahobaInfos.add(sahobaInfo20);

        for (int i = 0; i < sahobalar.size(); i++) {
            sahobaInfos.get(i).setTag(i);
            sahobaInfos.get(i).setOnClickListener(view -> {
                Intent intent = new Intent(this, InfoActivity.class);
                intent.putExtra("id", (Integer) view.getTag());
               startActivity(intent);
            });

        }


    }


    public void loadDataToView (){
        controller = DataController.getInstance();
        controller.loadData();
        ArrayList<SahobaData> sahobaList = controller.getListSahoba();
        for (int i = 0; i < sahobalar.size(); i++) {
            SahobaData sahobaData = sahobaList.get(i);
            TextView text = sahobalar.get(i);
            text.setText(sahobaData.getName());
        }
    }}