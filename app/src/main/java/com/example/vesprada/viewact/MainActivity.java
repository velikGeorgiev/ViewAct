package com.example.vesprada.viewact;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.wv = (WebView)findViewById(R.id.webView);

        Titular[] data = new Titular[] {
                new Titular("Marc Bartra Aregall", "Defensa", R.mipmap.ic_launcher, "http://www.laliga.es/jugador/liga-bbva/bartra"),
                new Titular("Claudio Andrés Bravo Muñoz", "Portero", R.mipmap.ic_star, "http://www.laliga.es/jugador/liga-bbva/claudio-bravo"),
                new Titular("Gerard Gumbau Garriga", "Centrocampista", R.mipmap.ic_launcher, "http://www.laliga.es/jugador/liga-bbva/gerard-gumbau"),
                new Titular("Luis Alberto Suárez Díaz", "Delanteros", R.mipmap.ic_star, "http://www.laliga.es/jugador/liga-bbva/luis-suarez"),
                new Titular("Lionel Andrés Messi", "Delantero", R.mipmap.ic_launcher, "http://www.laliga.es/jugador/liga-bbva/messi")
        };

        TitularAdapter adapter = new TitularAdapter(this, data);

        ListView lv = (ListView)findViewById(R.id.myView);

        lv.setAdapter(adapter);

        final Context mc = this;

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Titular v = (Titular)parent.getItemAtPosition(position);

                Toast toast = Toast.makeText(mc, "Has seleccionado " + v.getTitle() + " que juega de " + v.getSubtitle(), Toast.LENGTH_SHORT);
                //toast.show();

                wv.loadUrl(v.getUrl());
            }

        });
    }
}
