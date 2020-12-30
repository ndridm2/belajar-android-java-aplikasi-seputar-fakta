package com.example.seputarfakta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class FaktaActivity extends AppCompatActivity {


    private kumpulanFakta mkumpulanFakta = new kumpulanFakta();
    private backgroundColor mbackgroundcolor = new backgroundColor();

    private TextView mFaktaTextView;
    private Button mTampilFaktaLainButton;
    private ConstraintLayout mContraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign variabel
        mFaktaTextView = (TextView) findViewById(R.id.FaktaTextView);
        mTampilFaktaLainButton = (Button) findViewById(R.id.FaktaLainnyaButton);
        mContraintLayout = (ConstraintLayout) findViewById(R.id.ConstraintLayout);

        TextView.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fakta = mkumpulanFakta.getFakta();
                int warna = mbackgroundcolor.getWarna();

                mFaktaTextView.setText(fakta);
                mContraintLayout.setBackgroundColor(warna);
                //mTampilFaktaLainButton.setTextColor(warna);

                //Toast.makeText(FaktaActivity.this, "Lihat Fakta Lainnya!", Toast.LENGTH_LONG).show();
                }
            };
        mTampilFaktaLainButton.setOnClickListener(Listener);
        Toast.makeText(FaktaActivity.this, "Seputar Fakta di jalankan!", Toast.LENGTH_SHORT).show();
    }
}
