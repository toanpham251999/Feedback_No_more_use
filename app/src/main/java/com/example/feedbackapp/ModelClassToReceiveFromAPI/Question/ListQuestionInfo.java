package com.example.feedbackapp.ModelClassToReceiveFromAPI.Question;
import com.example.feedbackapp.ModelClassToReceiveFromAPI.APIRes.APIRes;
import java.util.ArrayList;

public class ListQuestionInfo {
    private boolean isSuccess;
    private String message;

    private ArrayList<Question> listQuestion;

    // Constructor
    public ListQuestionInfo(boolean isSuccess, String message){
        this.isSuccess = isSuccess;
        this.message = message;
        listQuestion = new ArrayList<Question>();
    }

    // GET SET
    public ArrayList<Question> getListQuestion() {
        return this.listQuestion;
    }

    // Get Set
    public boolean getIsSuccess() {
        return isSuccess;
    }
    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    public ArrayList<Question> setListQuestion() {
        return this.listQuestion;
    }


    // Method
    void addQuestion (Question question){
        this.listQuestion.add(question);
    }


}
