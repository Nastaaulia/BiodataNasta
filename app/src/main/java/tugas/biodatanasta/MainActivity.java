package tugas.biodatanasta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public EditText Nama, Email, NIM, Angkatan;
    public TextView txnama, txnim, txemail, txangkatan, txtitik;
    public Button Tampil,Reset;
    public ImageView imgsaya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txnama = (TextView) findViewById(R.id.txNama);
        txnim = (TextView) findViewById(R.id.txNim);
        txemail = (TextView) findViewById(R.id.txEmail);
        txangkatan = (TextView) findViewById(R.id.txAngkatan);

        Nama = (EditText) findViewById(R.id.EdNama);
        Email = (EditText) findViewById(R.id.EdEmail);
        NIM = (EditText) findViewById(R.id.EdNim);
        Angkatan = (EditText) findViewById(R.id.EdAngkatan);
        Tampil = (Button) findViewById(R.id.btnTampil);
        Reset = (Button) findViewById(R.id.btnReset);
        imgsaya = (ImageView) findViewById(R.id.imgNasta);


        Tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentform = new Intent(getApplicationContext(), BiodataHasil.class);
                intentform.putExtra("txtnama", txnama.getText().toString());
                intentform.putExtra("txtnim", txnim.getText().toString());
                intentform.putExtra("txtemail", txemail.getText().toString());
                intentform.putExtra("txtangkatan", txangkatan.getText().toString());
                intentform.putExtra("nama", Nama.getText().toString());
                intentform.putExtra("email", Email.getText().toString());
                intentform.putExtra("nim", NIM.getText().toString());
                intentform.putExtra("angkatan", Angkatan.getText().toString());
                startActivity(intentform);
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Nama.setText("");
                Email.setText("");
                NIM.setText("");
                Angkatan.setText("");
            }
        });

    }
}