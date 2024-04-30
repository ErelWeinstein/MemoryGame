package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    int countPlayer1 = 0, countPlayer2 = 0, card1, firstOpenedCard = -1, lastOpenedCard = -1;
    String turn = "counterPlayer1";
    int[][] ImageViews = {
            {R.drawable.cupcake1, R.drawable.cupcake2, R.drawable.cupcake3, R.drawable.cupcake4},
            {R.drawable.cupcake5, R.drawable.cupcake6, R.drawable.cupcake7, R.drawable.cupcake8},
            {R.drawable.cupcake1, R.drawable.cupcake2, R.drawable.cupcake3, R.drawable.cupcake4},
            {R.drawable.cupcake5, R.drawable.cupcake6, R.drawable.cupcake7, R.drawable.cupcake8}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int count = 0;

    public void knock(View view) {
        count++;

        if (view.getId() == R.id.imageView1) {
            ImageView cupcake1ImageView = (ImageView) view;
            cupcake1ImageView.setImageResource(ImageViews[0][0]);
        }

        if (view.getId() == R.id.imageView2) {
            ImageView cupcake2ImageView = (ImageView) view;
            cupcake2ImageView.setImageResource(ImageViews[1][0]);
        }

        if (view.getId() == R.id.imageView3) {
            ImageView cupcake3ImageView = (ImageView) view;
            cupcake3ImageView.setImageResource(ImageViews[2][3]);
        }

        if (view.getId() == R.id.imageView4) {
            ImageView cupcake4ImageView = (ImageView) view;
            cupcake4ImageView.setImageResource(ImageViews[0][1]);
        }

        if (view.getId() == R.id.imageView5) {
            ImageView cupcake5ImageView = (ImageView) view;
            cupcake5ImageView.setImageResource(ImageViews[3][0]);
        }

        if (view.getId() == R.id.imageView6) {
            ImageView cupcake6ImageView = (ImageView) view;
            cupcake6ImageView.setImageResource(ImageViews[1][3]);
        }

        if (view.getId() == R.id.imageView7) {
            ImageView cupcake7ImageView = (ImageView) view;
            cupcake7ImageView.setImageResource(ImageViews[1][2]);
        }

        if (view.getId() == R.id.imageView8) {
            ImageView cupcake8ImageView = (ImageView) view;
            cupcake8ImageView.setImageResource(ImageViews[2][1]);
        }

        if (view.getId() == R.id.imageView9) {
            ImageView cupcake9ImageView = (ImageView) view;
            cupcake9ImageView.setImageResource(ImageViews[0][2]);
        }

        if (view.getId() == R.id.imageView10) {
            ImageView cupcake10ImageView = (ImageView) view;
            cupcake10ImageView.setImageResource(ImageViews[3][1]);
        }

        if (view.getId() == R.id.imageView11) {
            ImageView cupcake11ImageView = (ImageView) view;
            cupcake11ImageView.setImageResource(ImageViews[3][3]);
        }

        if (view.getId() == R.id.imageView12) {
            ImageView cupcake12ImageView = (ImageView) view;
            cupcake12ImageView.setImageResource(ImageViews[1][1]);
        }

        if (view.getId() == R.id.imageView13) {
            ImageView cupcake13ImageView = (ImageView) view;
            cupcake13ImageView.setImageResource(ImageViews[2][2]);
        }

        if (view.getId() == R.id.imageView14) {
            ImageView cupcake14ImageView = (ImageView) view;
            cupcake14ImageView.setImageResource(ImageViews[2][0]);
        }
        if (view.getId() == R.id.imageView15) {
            ImageView cupcake15ImageView = (ImageView) view;
            cupcake15ImageView.setImageResource(ImageViews[0][3]);
        }
        if (view.getId() == R.id.imageView16) {
            ImageView cupcake16ImageView = (ImageView) view;
            cupcake16ImageView.setImageResource(ImageViews[3][2]);
        }

        if (firstOpenedCard != -1) {
            lastOpenedCard = firstOpenedCard;
        }
        firstOpenedCard = view.getId();
        turnEnd(view);
    }


    public void turnEnd(View view) {
        if (count % 2 != 0) {
            card1 = view.getId();
            return;
        }
        if (count % 2 == 0) {
            ImageView imageViewCard1 = findViewById(card1);
            Drawable image1 = imageViewCard1.getDrawable();
            Drawable image2 = ((ImageView) view).getDrawable();

            if (image1.getConstantState().equals(image2.getConstantState())) {
                if (turn.equals("counterPlayer1")) {
                    countPlayer1++;
                    TextView counterTextView = findViewById(R.id.counter1);
                    counterTextView.setText("Player1 -" + countPlayer1);
                    turn = "counterPlayer2";
                } else {
                    countPlayer2++;
                    TextView counterTextView = findViewById(R.id.counter2);
                    counterTextView.setText("Player2 -" + countPlayer2);
                    turn = "counterPlayer1";
                }
            }
            if (!image1.getConstantState().equals(image2.getConstantState())) {
                if (turn.equals("counterPlayer1")) {
                    turn = "counterPlayer2";
                } else {
                    turn = "counterPlayer1";
                }
            }
        }
    }

    private void mixingCards() {
        List<int[]> drawableIdsList = Arrays.asList(ImageViews);
        Collections.shuffle(drawableIdsList);
        drawableIdsList.toArray(ImageViews);
    }

}