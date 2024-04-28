package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

     int [][] images = {
        {R.drawable.cupcake1,R.drawable.cupcake2,R.drawable.cupcake3,R.drawable.cupcake4},
        {R.drawable.cupcake5,R.drawable.cupcake6,R.drawable.cupcake7,R.drawable.cupcake8},
        {R.drawable.cupcake1,R.drawable.cupcake2,R.drawable.cupcake3,R.drawable.cupcake4},
        {R.drawable.cupcake5,R.drawable.cupcake6,R.drawable.cupcake7,R.drawable.cupcake8}
     };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void knock(View view)
    {
        int id = view.getId();

        if (id == R.id.imageView1)
        {
            ImageView cupcake1ImageView = (ImageView) view;
            cupcake1ImageView.setImageResource(images[0][0]);
        }

        if (id == R.id.imageView2)
        {
            ImageView cupcake2ImageView = (ImageView) view;
            cupcake2ImageView.setImageResource(images[1][0]);
        }

        if (id == R.id.imageView3)
        {
            ImageView cupcake3ImageView = (ImageView) view;
            cupcake3ImageView.setImageResource(images[2][3]);
        }

        if (id == R.id.imageView4)
        {
            ImageView cupcake4ImageView = (ImageView) view;
            cupcake4ImageView.setImageResource(images[0][1]);
        }

        if (id == R.id.imageView5)
        {
            ImageView cupcake5ImageView = (ImageView) view;
            cupcake5ImageView.setImageResource(images[3][0]);
        }

        if (id == R.id.imageView6)
        {
            ImageView cupcake6ImageView = (ImageView) view;
            cupcake6ImageView.setImageResource(images[1][3]);
        }

        if (id == R.id.imageView7)
        {
            ImageView cupcake7ImageView = (ImageView) view;
            cupcake7ImageView.setImageResource(images[1][2]);
        }

        if (id == R.id.imageView8)
        {
            ImageView cupcake8ImageView = (ImageView) view;
            cupcake8ImageView.setImageResource(images[2][1]);
        }

        if (id == R.id.imageView9)
        {
            ImageView cupcake9ImageView = (ImageView) view;
            cupcake9ImageView.setImageResource(images[0][2]);
        }

        if (id == R.id.imageView10)
        {
            ImageView cupcake10ImageView = (ImageView) view;
            cupcake10ImageView.setImageResource(images[3][1]);
        }

        if (id == R.id.imageView11)
        {
            ImageView cupcake11ImageView = (ImageView) view;
            cupcake11ImageView.setImageResource(images[3][3]);
        }

        if (id == R.id.imageView12)
        {
            ImageView cupcake13ImageView = (ImageView) view;
            cupcake13ImageView.setImageResource(images[1][1]);
        }

        if (id == R.id.imageView13)
        {
            ImageView cupcake13ImageView = (ImageView) view;
            cupcake13ImageView.setImageResource(images[2][2]);
        }

        if (id == R.id.imageView14)
        {
            ImageView cupcake14ImageView = (ImageView) view;
            cupcake14ImageView.setImageResource(images[2][0]);
        }
        if (id == R.id.imageView15)
        {
            ImageView cupcake15ImageView = (ImageView) view;
            cupcake15ImageView.setImageResource(images[0][3]);
        }
        if (id == R.id.imageView16)
        {
           ImageView cupcake16ImageView = (ImageView) view;
           cupcake16ImageView.setImageResource(images[3][2]);
        }

       }


    }
