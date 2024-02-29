package id.ac.stmikbjb.apptebakgambar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class TebakActivity extends AppCompatActivity {

    ImageView img_tbk;
    EditText edt_jwb;
    Button btn_jwb;
    String jwb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebakactivity);

        setInitalisasi();
        cekIntent();
        onClikjwb();

    }
    private void onClikjwb(){
        btn_jwb.setOnClickListener(view -> {
            if (edt_jwb.getText().toString().equals(jwb)){
                Toast.makeText(TebakActivity.this,
                        "Jawaban Yang Anda Masukkan Benar", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(TebakActivity.this,
                        "Jawaban Yang Anda Masukkan Salah", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void cekIntent(){
        Intent cek = getIntent();
        String nama_icon =
                cek.getStringExtra("nama_icon");
        switch (Objects.requireNonNull(nama_icon)) {
            case "anjing":
                img_tbk.setImageResource(R.drawable.anjing);
                jwb = "anjing";
                break;
            case "kucing":
                img_tbk.setImageResource(R.drawable.kucing);
                jwb = "kucing";
                break;
            case "kelinci":
                img_tbk.setImageResource(R.drawable.kelinci);
                jwb = "kelinci";
                break;
            case "semut":
                img_tbk.setImageResource(R.drawable.semut);
                jwb = "semut";
                break;
            case "tikus":
                img_tbk.setImageResource(R.drawable.tikus);
                jwb = "tikus";
                break;
            default:
                img_tbk.setImageResource(R.drawable.ular);
                jwb = "ular";
                break;
        }
    }
    private void setInitalisasi(){
        img_tbk = (ImageView) findViewById(R.id.img_tbk);
        edt_jwb = (EditText) findViewById(R.id.edt_jwb);
        btn_jwb = (Button) findViewById(R.id.btn_jwb);
    }
}