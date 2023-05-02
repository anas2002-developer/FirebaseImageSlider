package com.anas.firebaseimgslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ImageSlider slider2;
    TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        slider2=findViewById(R.id.slider2);
        skip=findViewById(R.id.skip);

        ArrayList<SlideModel> arrSlides=new ArrayList<>();

        arrSlides.add(new SlideModel(R.drawable.img, ScaleTypes.FIT));
        arrSlides.add(new SlideModel(R.drawable.img, ScaleTypes.FIT));
        arrSlides.add(new SlideModel(R.drawable.img, ScaleTypes.FIT));
        arrSlides.add(new SlideModel(R.drawable.img, ScaleTypes.FIT));

        slider2.setImageList(arrSlides,ScaleTypes.FIT);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "jafdk", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
