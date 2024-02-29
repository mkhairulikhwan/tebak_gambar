package id.ac.stmikbjb.apptebakgambar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imgviw_1, imgviw_2, imgviw_3, imgviw_4, imgviw_5, imgviw_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInisialiasi();
        onClickPilih();
    }
    private void onClickPilih(){
        imgviw_1.setOnClickListener(view -> {
            Intent d = new Intent( MainActivity.this, TebakActivity.class);
            d.putExtra("nama_icon", "anjing");
            startActivity(d);
        });
        imgviw_2.setOnClickListener(view -> {
            Intent d = new Intent( MainActivity.this, TebakActivity.class);
            d.putExtra("nama_icon", "kucing");
            startActivity(d);
        });
        imgviw_3.setOnClickListener(view -> {
            Intent c = new Intent( MainActivity.this, TebakActivity.class);
            c.putExtra("nama_icon", "kelinci");
            startActivity(c);
        });
        imgviw_4.setOnClickListener(view -> {
            Intent a = new Intent( MainActivity.this, TebakActivity.class);
            a.putExtra("nama_icon", "semut");
            startActivity(a);
        });
        imgviw_5.setOnClickListener(view -> {
            Intent al = new Intent( MainActivity.this, TebakActivity.class);
            al.putExtra("nama_icon", "tikus");
            startActivity(al);
        });
        imgviw_6.setOnClickListener(view -> {
            Intent al = new Intent( MainActivity.this, TebakActivity.class);
            al.putExtra("nama_icon", "ular");
            startActivity(al);
        });
    }
    private void setInisialiasi(){
        imgviw_1 = (ImageView) findViewById(R.id.imgviw_1);
        imgviw_2 = (ImageView) findViewById(R.id.imgviw_2);
        imgviw_3 = (ImageView) findViewById(R.id.imgviw_3);
        imgviw_4 = (ImageView) findViewById(R.id.imgviw_4);
        imgviw_5 = (ImageView) findViewById(R.id.imgviw_5);
        imgviw_6 = (ImageView) findViewById(R.id.imgviw_6);
    }

}