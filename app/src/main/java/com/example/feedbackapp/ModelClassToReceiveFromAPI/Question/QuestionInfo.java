package com.example.feedbackapp.ModelClassToReceiveFromAPI.Question;

public class QuestionInfo {
    private boolean isSuccess;
    private String message;
    private Question question;


    public QuestionInfo(boolean isSuccess, String message, Question question){
        this.isSuccess = isSuccess;
        this.message = message;
        this.question=question;
    }

    // get set
    public boolean getIsSuccess() {
        return isSuccess;
    }
    public void setIsSuccess(boolean success) {
        this.isSuccess = success;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Question getQuestion() {
        return this.question;
    }
}
