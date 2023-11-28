package com.example.myapplication;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionManager {
    private List<Question> questionList;

    public QuestionManager() {
        questionList = new ArrayList<>();
        initializeQuestions();
    }

    private void initializeQuestions() {
        int catImageResourceId = R.drawable.cat;
        int dogImageResourceId = R.drawable.dog;

        questionList.add(new Question(catImageResourceId, "Où est le chat?", "Dans la cuisine", "Dans le jardin"));
        questionList.add(new Question(dogImageResourceId, "Où est le chien?", "Dans la chambre", "Devant la maison"));
        // Add more questions as needed
    }

    public Question getRandomQuestion() {
        Random random = new Random();
        return questionList.get(random.nextInt(questionList.size()));
    }
}
