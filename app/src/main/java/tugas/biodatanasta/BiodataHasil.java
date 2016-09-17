package tugas.biodatanasta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.TextView;

public class BiodataHasil extends AppCompatActivity {
    public TextView tekshasil;
    public TextView tekshasil2;
    public String result;
    public String result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata_hasil);

        tekshasil = (TextView) findViewById(R.id.hasil);
        tekshasil2 = (TextView) findViewById(R.id.hasil2);
        Intent intentget = getIntent();
        Bundle bundle = intentget.getExtras();
        String txtnama = bundle.getString("txtnama");
        String txtnim = bundle.getString("txtnim");
        String txtemail = bundle.getString("txtemail");
        String txtangkatan = bundle.getString("txtangkatan");
        String nama = bundle.getString("nama");
        String nim = bundle.getString("nim");
        String email = bundle.getString("email");
        String angkatan = bundle.getString("angkatan");
        result = txtnama + "\n" + txtnim + "\n" + txtemail  + "\n" + txtangkatan;
        result2 = ": " + nim + "\n" +": " + nama + "\n" +": " + email + "\n" +": " + angkatan;

        tekshasil.setText(result);
        tekshasil2.setText(result2);
    }
}
