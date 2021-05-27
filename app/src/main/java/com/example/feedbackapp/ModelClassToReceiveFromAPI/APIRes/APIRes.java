package com.example.feedbackapp.ModelClassToReceiveFromAPI.APIRes;

import com.example.feedbackapp.ModelClassToReceiveFromAPI.Login.Account;

public class APIRes {
    private boolean success;
    private String message;

    // Constructor
    public APIRes(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public APIRes(APIRes apiRes) {
        this.success = apiRes.success;
        this.message = apiRes.message;
    }


    // Get Set
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
