package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private QuestionManager questionManager;
    private ImageView animalImageView;
    private TextView questionTextView;
    private Button optionAButton;
    private Button optionBButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionManager = new QuestionManager();

        animalImageView = findViewById(R.id.animalImageView);
        questionTextView = findViewById(R.id.questionTextView);
        optionAButton = findViewById(R.id.optionAButton);
        optionBButton = findViewById(R.id.optionBButton);
        animalImageView = findViewById(R.id.animalImageView2);

        // Display the first question
        displayQuestion();

        // Set click listeners for buttons
        optionAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle user selection for option A
                boolean isCorrect = checkAnswer(optionAButton.getText().toString());
                // You can add logic to provide feedback or move to the next question
                displayQuestion();
            }
        });
//
//        optionBButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Handle user selection for option B
//                // You can add logic to provide feedback or move to the next question
//                displayQuestion();
//            }
//        });
//    }
//
    private void displayQuestion() {
        // Get a random question from the QuestionManager
        Question randomQuestion = questionManager.getRandomQuestion();

        // Update UI with the question and options
        animalImageView.setImageResource(randomQuestion.getImageResourceId());
        questionTextView.setText(randomQuestion.getQuestionText());
        optionAButton.setText(randomQuestion.getOptionA());
        optionBButton.setText(randomQuestion.getOptionB());
    }
}