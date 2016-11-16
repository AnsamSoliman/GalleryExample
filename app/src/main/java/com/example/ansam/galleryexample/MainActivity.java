package com.example.ansam.galleryexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery gallery;
    public int []images={R.drawable.ariel,R.drawable.aurora,R.drawable.bella,R.drawable.cinderella,
    R.drawable.jasmine,R.drawable.mulan,R.drawable.pacahontas,R.drawable.rapunzel,R.drawable.snow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gallery=(Gallery)findViewById(R.id.gallery);
        gallery.setAdapter(new ImageAdapter(this,images));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageResource(images[position]);
            }
        });
    }
}
