package com.example.feedbackapp.ModelClassToReceiveFromAPI.Question;

public class Question {

    private String Id;
    private String TopicId;
    private String TopicName;
    private String QuestionContent;
    private Boolean isDeleted;

    // Constructor
    public Question(
            String Id,
            String TopicId,
            String TopicName,
            String QuestionContent,
            Boolean isDeleted
    ){
        this.Id = Id;
        this.TopicId = TopicId;
        this.TopicName = TopicName;
        this.QuestionContent = QuestionContent;
        this.isDeleted = isDeleted;
    }

    public Question(Question question){
        this.Id = question.Id;
        this.TopicId = question.TopicId;
        this.TopicName = question.TopicName;
        this.QuestionContent = question.QuestionContent;
        this.isDeleted = question.isDeleted;
    }


    // GET SET


    // set Id
    public String getId() {
        return this.Id;
    }
    public void setId(String Id) { this.Id = Id; }

    // set Topic Id
    public String getTopicId() {
        return this.TopicId;
    }
    public void setTopicId(String TopicId) { this.TopicId = TopicId; }

    // set Topic Name
    public String getTopicName() {
        return this.TopicName;
    }
    public void setTopicName(String TopicName) { this.TopicName = TopicName; }

    // set Question Content
    public String getQuestionContent() {
        return this.QuestionContent;
    }
    public void setQuestionContent(String QuestionContent) { this.QuestionContent = QuestionContent; }

    // set is deleted
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    public void setIsDeleted(Boolean isDeleted) { this.isDeleted = isDeleted; }
}
