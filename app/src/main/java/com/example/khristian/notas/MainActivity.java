package com.example.khristian.notas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rm1,rm2,rm3;
    EditText n1m1, n2m1, n3m1, n1m2, n2m2, n3m2, n1m3, n2m3,n3m3;
    TextView ndm1, ndm2, ndm3, dt;
    ImageView imagenm1, imagenm2, imagenm3, imagent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rm1 = (RelativeLayout) findViewById(R.id.rm1);
        rm2 = (RelativeLayout) findViewById(R.id.rm2);
        rm3 = (RelativeLayout) findViewById(R.id.rm3);

        SharedPreferences prefs = getSharedPreferences("datos", MODE_PRIVATE);

        Float n1m1a = prefs.getFloat("n1m1" , 0);
        Float n2m1a = prefs.getFloat("n2m1" , 0);
        Float n3m1a = prefs.getFloat("n3m1" , 0);
        Float ndm1a = prefs.getFloat("ndm1" , 0);
        Float n1m2a = prefs.getFloat("n1m2" , 0);
        Float n2m2a = prefs.getFloat("n2m2" , 0);
        Float n3m2a = prefs.getFloat("n3m2" , 0);
        Float ndm2a = prefs.getFloat("ndm2" , 0);
        Float n1m3a = prefs.getFloat("n1m3" , 0);
        Float n2m3a = prefs.getFloat("n2m3" , 0);
        Float n3m3a = prefs.getFloat("n3m3" , 0);
        Float ndm3a = prefs.getFloat("ndm3" , 0);
        Float dta = prefs.getFloat("dt" , 0);

        ((EditText)findViewById(R.id.n1m1)).setText(n1m1a+"");
        ((EditText)findViewById(R.id.n2m1)).setText(n2m1a+"");
        ((EditText)findViewById(R.id.n3m1)).setText(n3m1a+"");
        ((TextView)findViewById(R.id.ndm1)).setText(ndm1a+"");
        ((EditText)findViewById(R.id.n1m2)).setText(n1m2a+"");
        ((EditText)findViewById(R.id.n2m2)).setText(n2m2a+"");
        ((EditText)findViewById(R.id.n3m2)).setText(n3m2a+"");
        ((TextView)findViewById(R.id.ndm2)).setText(ndm2a+"");
        ((EditText)findViewById(R.id.n1m3)).setText(n1m3a+"");
        ((EditText)findViewById(R.id.n2m3)).setText(n2m3a+"");
        ((EditText)findViewById(R.id.n3m3)).setText(n3m3a+"");
        ((TextView)findViewById(R.id.ndm3)).setText(ndm3a+"");
        ((TextView)findViewById(R.id.dt)).setText(dta+"");

        n1m1 = (EditText) findViewById(R.id.n1m1);
        n2m1 = (EditText) findViewById(R.id.n2m1);
        n3m1 = (EditText) findViewById(R.id.n3m1);
        ndm1 = (TextView) findViewById(R.id.ndm1);
        n1m2 = (EditText) findViewById(R.id.n1m2);
        n2m2 = (EditText) findViewById(R.id.n2m2);
        n3m2 = (EditText) findViewById(R.id.n3m2);
        ndm2 = (TextView) findViewById(R.id.ndm2);
        n1m3 = (EditText) findViewById(R.id.n1m3);
        n2m3 = (EditText) findViewById(R.id.n2m3);
        n3m3 = (EditText) findViewById(R.id.n3m3);
        ndm3 = (TextView) findViewById(R.id.ndm3);
        dt = (TextView) findViewById(R.id.dt);
        imagenm1 = (ImageView) findViewById(R.id.im1);
        imagenm2 = (ImageView) findViewById(R.id.im2);
        imagenm3 = (ImageView) findViewById(R.id.im3);
        imagent = (ImageView) findViewById(R.id.imt);

        n1m1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nom = "n1m1";
                String nomd = "ndm1";
                String n1 = n1m1.getText().toString();
                String n2 = n2m1.getText().toString();
                String n3 = n3m1.getText().toString();
                if(n1.equals("") || n2.equals("") || n3.equals("")){
                    vacios();
                }else {
                    float n1f = Float.parseFloat(n1);
                    float n2f = Float.parseFloat(n2);
                    float n3f = Float.parseFloat(n3);
                    if (n1f < 0 || n1f > 5) {
                        fuera();
                    }else {
                        String nd = ndm1.getText().toString();
                        float ndf = Float.parseFloat(nd);
                        guardar(n1f, nom);
                        caldefm1(ndf, n1f, n2f, n3f, nomd);
                        String ndn = ndm1.getText().toString();
                        float ndnf = Float.parseFloat(ndn);
                        immagenmat1(ndnf);
                        caldeft();
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        n2m1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nom = "n2m1";
                String nomd = "ndm1";
                String n1 = n1m1.getText().toString();
                String n2 = n2m1.getText().toString();
                String n3 = n3m1.getText().toString();
                if(n1.equals("") || n2.equals("") || n3.equals("")){
                    vacios();
                }else {
                    float n1f = Float.parseFloat(n1);
                    float n2f = Float.parseFloat(n2);
                    float n3f = Float.parseFloat(n3);
                    if (n2f < 0 || n2f > 5) {
                        fuera();
                    }else {
                        String nd = ndm1.getText().toString();
                        float ndf = Float.parseFloat(nd);
                        guardar(n2f, nom);
                        caldefm1(ndf, n1f, n2f, n3f, nomd);
                        String ndn = ndm1.getText().toString();
                        float ndnf = Float.parseFloat(ndn);
                        immagenmat1(ndnf);
                        caldeft();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        n3m1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nom = "n3m1";
                String nomd = "ndm1";
                String n1 = n1m1.getText().toString();
                String n2 = n2m1.getText().toString();
                String n3 = n3m1.getText().toString();
                if(n1.equals("") || n2.equals("") || n3.equals("")){
                    vacios();
                }else {
                    float n1f = Float.parseFloat(n1);
                    float n2f = Float.parseFloat(n2);
                    float n3f = Float.parseFloat(n3);
                    if (n3f < 0 || n3f > 5) {
                        fuera();
                    }else {
                        String nd = ndm1.getText().toString();
                        float ndf = Float.parseFloat(nd);
                        guardar(n3f, nom);
                        caldefm1(ndf, n1f, n2f, n3f, nomd);
                        String ndn = ndm1.getText().toString();
                        float ndnf = Float.parseFloat(ndn);
                        immagenmat1(ndnf);
                        caldeft();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        n1m2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nom = "n1m2";
                String nomd = "ndm2";
                String n1 = n1m2.getText().toString();
                String n2 = n2m2.getText().toString();
                String n3 = n3m2.getText().toString();
                if(n1.equals("") || n2.equals("") || n3.equals("")){
                    vacios();
                }else {
                    float n1f = Float.parseFloat(n1);
                    float n2f = Float.parseFloat(n2);
                    float n3f = Float.parseFloat(n3);
                    if (n1f < 0 || n1f > 5) {
                        fuera();
                    }else {
                        String nd = ndm2.getText().toString();
                        float ndf = Float.parseFloat(nd);
                        guardar(n1f, nom);
                        caldefm2(ndf, n1f, n2f, n3f, nomd);
                        String ndn = ndm2.getText().toString();
                        float ndnf = Float.parseFloat(ndn);
                        immagenmat2(ndnf);
                        caldeft();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        n2m2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nom = "n2m2";
                String nomd = "ndm2";
                String n1 = n1m2.getText().toString();
                String n2 = n2m2.getText().toString();
                String n3 = n3m2.getText().toString();
                if(n1.equals("") || n2.equals("") || n3.equals("")){
                    vacios();
                }else {
                    float n1f = Float.parseFloat(n1);
                    float n2f = Float.parseFloat(n2);
                    float n3f = Float.parseFloat(n3);
                    if (n2f < 0 || n2f > 5) {
                        fuera();
                    }else {
                        String nd = ndm2.getText().toString();
                        float ndf = Float.parseFloat(nd);
                        guardar(n2f, nom);
                        caldefm2(ndf, n1f, n2f, n3f, nomd);
                        String ndn = ndm2.getText().toString();
                        float ndnf = Float.parseFloat(ndn);
                        immagenmat2(ndnf);
                        caldeft();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        n3m2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nom = "n3m2";
                String nomd = "ndm2";
                String n1 = n1m2.getText().toString();
                String n2 = n2m2.getText().toString();
                String n3 = n3m2.getText().toString();
                if(n1.equals("") || n2.equals("") || n3.equals("")){
                    vacios();
                }else {
                    float n1f = Float.parseFloat(n1);
                    float n2f = Float.parseFloat(n2);
                    float n3f = Float.parseFloat(n3);
                    if (n3f < 0 || n3f > 5) {
                        fuera();
                    }else {
                        String nd = ndm2.getText().toString();
                        float ndf = Float.parseFloat(nd);
                        guardar(n3f, nom);
                        caldefm2(ndf, n1f, n2f, n3f, nomd);
                        String ndn = ndm2.getText().toString();
                        float ndnf = Float.parseFloat(ndn);
                        immagenmat2(ndnf);
                        caldeft();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        n1m3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nom = "n1m3";
                String nomd = "ndm3";
                String n1 = n1m3.getText().toString();
                String n2 = n2m3.getText().toString();
                String n3 = n3m3.getText().toString();
                if(n1.equals("") || n2.equals("") || n3.equals("")){
                    vacios();
                }else {
                    float n1f = Float.parseFloat(n1);
                    float n2f = Float.parseFloat(n2);
                    float n3f = Float.parseFloat(n3);
                    if (n1f < 0 || n1f > 5) {
                        fuera();
                    }else {
                        String nd = ndm3.getText().toString();
                        float ndf = Float.parseFloat(nd);
                        guardar(n1f, nom);
                        caldefm3(ndf, n1f, n2f, n3f, nomd);
                        String ndn = ndm3.getText().toString();
                        float ndnf = Float.parseFloat(ndn);
                        immagenmat3(ndnf);
                        caldeft();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        n2m3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nom = "n2m3";
                String nomd = "ndm3";
                String n1 = n1m3.getText().toString();
                String n2 = n2m3.getText().toString();
                String n3 = n3m3.getText().toString();
                if(n1.equals("") || n2.equals("") || n3.equals("")){
                    vacios();
                }else {
                    float n1f = Float.parseFloat(n1);
                    float n2f = Float.parseFloat(n2);
                    float n3f = Float.parseFloat(n3);
                    if (n2f < 0 || n2f > 5) {
                        fuera();
                    }else {
                        String nd = ndm3.getText().toString();
                        float ndf = Float.parseFloat(nd);
                        guardar(n2f, nom);
                        caldefm3(ndf, n1f, n2f, n3f, nomd);
                        String ndn = ndm3.getText().toString();
                        float ndnf = Float.parseFloat(ndn);
                        immagenmat3(ndnf);
                        caldeft();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        n3m3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nom = "n3m3";
                String nomd = "ndm2";
                String n1 = n1m3.getText().toString();
                String n2 = n2m3.getText().toString();
                String n3 = n3m3.getText().toString();
                if(n1.equals("") || n2.equals("") || n3.equals("")){
                    vacios();
                }else {
                    float n1f = Float.parseFloat(n1);
                    float n2f = Float.parseFloat(n2);
                    float n3f = Float.parseFloat(n3);
                    if (n3f < 0 || n3f > 5) {
                        fuera();
                    }else {
                        String nd = ndm3.getText().toString();
                        float ndf = Float.parseFloat(nd);
                        guardar(n3f, nom);
                        caldefm3(ndf, n1f, n2f, n3f, nomd);
                        String ndn = ndm3.getText().toString();
                        float ndnf = Float.parseFloat(ndn);
                        immagenmat3(ndnf);
                        caldeft();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    public void guardar(float v, String n){
        SharedPreferences prefs = getSharedPreferences("datos", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putFloat(n , v);
        editor.commit();
    }

    public void caldefm1(float d, float n1,float n2, float n3, String n){
        d = ((n1*30)/100)+((n2*30)/100)+((n3*40)/100);
        ndm1.setText(""+d);
        guardar(d , n);
    }

    public void caldefm2(float d, float n1,float n2, float n3, String n){
        d = ((n1*30)/100)+((n2*30)/100)+((n3*40)/100);
        ndm2.setText(""+d);
        guardar(d , n);
    }

    public void caldefm3(float d, float n1,float n2, float n3, String n){
        d = ((n1*30)/100)+((n2*30)/100)+((n3*40)/100);
        ndm3.setText(""+d);
        guardar(d , n);
    }

    public void caldeft(){
        String nd1 = ndm1.getText().toString();
        float nd1f = Float.parseFloat(nd1);
        String nd2 = ndm2.getText().toString();
        float nd2f = Float.parseFloat(nd2);
        String nd3 = ndm3.getText().toString();
        float nd3f = Float.parseFloat(nd3);
        float deftot = (nd1f+nd2f+nd3f)/3;
        dt.setText(""+deftot);
        if(deftot >= 3){
            imagent.setImageResource(R.drawable.feliz);
        }
        else{
            imagent.setImageResource(R.drawable.tristes);
        }
        guardar(deftot , "dt");
    }

    public void vacios(){
        Toast toast1 =
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.vacios)
                        , Toast.LENGTH_SHORT);
        toast1.show();
    }

    public void fuera(){
        Toast toast1 =
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.vfr)
                        , Toast.LENGTH_SHORT);
        toast1.show();
    }

    public void immagenmat1(float v){
        if(v >= 3){
            imagenm1.setImageResource(R.drawable.feliz);
        }
        else{
            imagenm1.setImageResource(R.drawable.tristes);
        }
    }

    public void immagenmat2(float v){
        if(v >= 3){
            imagenm2.setImageResource(R.drawable.feliz);
        }
        else{
            imagenm2.setImageResource(R.drawable.tristes);
        }
    }

    public void immagenmat3(float v){
        if(v >= 3){
            imagenm3.setImageResource(R.drawable.feliz);
        }
        else{
            imagenm3.setImageResource(R.drawable.tristes);
        }
    }

    public void acerca(View view){
        Intent autor = new Intent(MainActivity.this, Acerca.class);
        startActivity(autor);
    }

    public void listas(View view){
        switch(view.getId()){
            case R.id.bm1:
                if(rm1.getVisibility()==View.GONE){
                    rm1.setVisibility(View.VISIBLE);
                }else{
                    rm1.setVisibility(View.GONE);
                }
                break;
            case R.id.bm2:
                if(rm2.getVisibility()==View.GONE){
                    rm2.setVisibility(View.VISIBLE);
                }else{
                    rm2.setVisibility(View.GONE);
                }
                break;
            case R.id.bm3:
                if(rm3.getVisibility()==View.GONE){
                    rm3.setVisibility(View.VISIBLE);
                }else{
                    rm3.setVisibility(View.GONE);
                }
                break;
        }
    }

}
