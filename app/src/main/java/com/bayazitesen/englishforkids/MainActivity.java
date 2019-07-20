package com.bayazitesen.englishforkids;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final List<Kategoriler> kategorilistem = new ArrayList<Kategoriler>();
    ListView listem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listem = (ListView) findViewById(R.id.liste);
        kategorilistem.add(new Kategoriler("SAYILAR"));
        kategorilistem.add(new Kategoriler("RENKLER"));
        kategorilistem.add(new Kategoriler("HAYVANLAR"));
        kategorilistem.add(new Kategoriler("MESLEKLER"));
        kategorilistem.add(new Kategoriler("AİLE"));


        OzelAdapter ozeladaptorumuz = new OzelAdapter(this, kategorilistem);
        listem.setAdapter(ozeladaptorumuz);

    }


    public class OzelAdapter extends BaseAdapter {
        private List<Kategoriler> mylistem;
        private LayoutInflater mInflater;

        public OzelAdapter(Activity activity, List<Kategoriler> kategorilistem) {
            mInflater = (LayoutInflater)
                    activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mylistem= kategorilistem;
        }

        @Override
        public Object getItem(int position) {
            return mylistem.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getCount() {
            return mylistem.size();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View satirView = mInflater.inflate(R.layout.satir, null);

            TextView textView = (TextView) satirView.findViewById(R.id.txtLogo);
            ImageView imageView = (ImageView) satirView.findViewById(R.id.logo);

            Kategoriler kategori = mylistem.get(position);
            textView.setText(kategori.getKategoriadi());


            if (kategori.getKategoriadi().equals("SAYILAR"))
            {
                imageView.setImageResource(R.drawable.sayilar);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(MainActivity.this, Sayilar.class);
                        startActivity(i);
                    }
                });
            }

            if (kategori.getKategoriadi().equals("RENKLER"))
            {
                imageView.setImageResource(R.drawable.renkler);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(MainActivity.this, Renkler.class);
                        startActivity(i);
                    }
                });
            }

            if (kategori.getKategoriadi().equals("HAYVANLAR"))
            {
                imageView.setImageResource(R.drawable.hayvanlar);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this, Hayvanlar.class);
                        startActivity(intent);
                    }
                });
            }
            if (kategori.getKategoriadi().equals("MESLEKLER"))
            {
                imageView.setImageResource(R.drawable.meslekler);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(MainActivity.this, Meslekler.class);
                        startActivity(i);
                    }
                });
            }
            if (kategori.getKategoriadi().equals("AİLE"))
            {
                imageView.setImageResource(R.drawable.aile);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(MainActivity.this, Aile.class);
                        startActivity(i);
                    }
                });
            }
            //////////7if(imageView.equals(R.drawable.aile)




           /* textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentim=new Intent(MainActivity.this, Renkler.class);
                    startActivity(intentim);
                }
            });*/



            return satirView;
        }

    }
}
