package com.example.feedbackapp.RetrofitAPISetvice;

import com.example.feedbackapp.Config.ConfigAPI;
import com.example.feedbackapp.ModelClassToReceiveFromAPI.Question.ListQuestionInfo;
import com.example.feedbackapp.ModelClassToReceiveFromAPI.Question.QuestionInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Url;

public interface QuestionAPIServices {
    //tạo 1 biến gson dùng cho service bên dưới
    Gson gson = new GsonBuilder()
            .setDateFormat("dd-MM-yyyy")
            .create();

    //khởi tạo service
    QuestionAPIServices questionAPIServices = new Retrofit.Builder()
            .baseUrl(ConfigAPI.url)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(QuestionAPIServices.class);



    //service lấy danh sách các question
    @GET("api/question")
    Call<ListQuestionInfo> getListQuestion(@Header("Authorization") String authToken);

    //service lấy danh sách các question
    @GET()
    Call<QuestionInfo> getQuestion(
            @Url String url,
            @Header("Authorization") String authToken
    );
}
