package uz.gita.sevimlisahobalar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import uz.gita.sevimlisahobalar.data.SahobaData;
import uz.gita.sevimlisahobalar.dataController.DataController;
public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        DataController controller = DataController.getInstance();
        Bundle bundle = getIntent().getExtras();
        int pos = bundle.getInt("id");
        SahobaData sahoba= controller.getSahobaPosition(pos);
        ImageView image= findViewById(R.id.imageSahoba);
        TextView text= findViewById(R.id.textDescription);
        image.setImageResource(sahoba.getImageID());
        text.setText(sahoba.getDescription());
        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(view -> {
           // Intent intent = new Intent(InfoActivity.this, MainActivity.class);
            finish();
        });


    }
}