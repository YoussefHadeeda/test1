package com.example.myapplication;
public class Question {
    private int imageResourceId;
    private String questionText;
    private String optionA;
    private String optionB;
    private String correctAnswer;

    public Question(int imageResourceId, String questionText, String optionA, String optionB) {
        this.imageResourceId = imageResourceId;
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.correctAnswer = correctAnswer;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

