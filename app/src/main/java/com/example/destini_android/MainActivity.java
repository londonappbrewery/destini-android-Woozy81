package com.example.destini_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mFirstChoice;
    Button mSecondChoice;
    TextView mStory;
    int mStoryIndex;
    int mAnswerOneIndex;
    int mAnswerTwoIndex;


    int [] Story = {R.string.T1_Story,
            R.string.T2_Story,
            R.string.T3_Story,
            R.string.T4_End,
            R.string.T5_End,
            R.string.T6_End
    };
    final int[] Answer_One ={R.string.T1_Ans1,
            R.string.T2_Ans1,
            R.string.T3_Ans1

    };
    final int[] Answer_Two ={R.string.T1_Ans2,
            R.string.T2_Ans2,
            R.string.T3_Ans2

    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAnswerOneIndex = 0;
        mAnswerTwoIndex = 0;
        mStoryIndex = 0;


        mFirstChoice = (Button) findViewById(R.id.button_One);
        mSecondChoice = (Button) findViewById(R.id.button_Two);
        mStory = (TextView) findViewById(R.id.Choice);
        mStory.setText(Story[mStoryIndex]);
        mFirstChoice.setText(Answer_One[mAnswerOneIndex]);
        mSecondChoice.setText(Answer_Two[mAnswerTwoIndex]);
        System.out.println(mAnswerOneIndex);




        mFirstChoice.setOnClickListener(v -> {
            Log.d("Destini","first Choice.");
            if(mAnswerOneIndex == 0 ){
                mAnswerOneIndex = 2;
                mAnswerTwoIndex = 2;
                mStoryIndex = 2;
                mFirstChoice.setText(Answer_One[mAnswerOneIndex]);
                mSecondChoice.setText(Answer_Two[mAnswerTwoIndex]);
                mStory.setText(Story[mStoryIndex]);

            }else if (mAnswerOneIndex == 1 ){
                mAnswerOneIndex = 2;
                mAnswerTwoIndex = 2;
                mStoryIndex = 2;
                mFirstChoice.setText(Answer_One[mAnswerOneIndex]);
                mSecondChoice.setText(Answer_Two[mAnswerTwoIndex]);
                mStory.setText(Story[mStoryIndex]);


            }else if (mAnswerOneIndex == 2 ){
                mStoryIndex = 5;
                mFirstChoice.setText(R.string.GameOver);
                mSecondChoice.setText(R.string.DestinyGood);
                mStory.setText(Story[mStoryIndex]);


            }

        });
        mSecondChoice.setOnClickListener(v -> {
            if(mAnswerTwoIndex == 0 ){
                mAnswerOneIndex = 1;
                mAnswerTwoIndex = 1;
                mStoryIndex = 1;
                mFirstChoice.setText(Answer_One[mAnswerOneIndex]);
                mSecondChoice.setText(Answer_Two[mAnswerTwoIndex]);
                mStory.setText(Story[mStoryIndex]);

            }else if (mAnswerOneIndex == 1 ){
                mStoryIndex = 3;
                mFirstChoice.setText(R.string.GameOver);
                mSecondChoice.setText(R.string.DestinyGood);
                mStory.setText(Story[mStoryIndex]);



            } else if (mAnswerOneIndex == 2 ){
                mStoryIndex = 4;
                mFirstChoice.setText(R.string.GameOver);
                mSecondChoice.setText(R.string.DestinyBad);
                mStory.setText(Story[mStoryIndex]);


            }
        });


    }

}