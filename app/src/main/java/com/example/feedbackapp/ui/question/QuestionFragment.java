package com.example.feedbackapp.ui.question;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

//import com.example.feedbackapp.Adapter.QuestionAdapter;
import com.example.feedbackapp.ModelClassToReceiveFromAPI.Question.ListQuestionInfo;
import com.example.feedbackapp.ModelClassToReceiveFromAPI.Question.Question;
import com.example.feedbackapp.ModelClassToReceiveFromAPI.Question.QuestionInfo;
import com.example.feedbackapp.R;
import com.example.feedbackapp.RetrofitAPISetvice.QuestionAPIServices;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuestionFragment extends Fragment {

    private QuestionViewModel questionViewModel;

    // TODO: Control Varible
    FloatingActionButton btn_Add_Question;
    Spinner spinner_Topic;
    ListQuestionInfo listQuestionInfo;
    ArrayList<Question> arrQuestion;
//    QuestionAdapter questionAdapter;
    RecyclerView questionList;

    String authToken = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2NvdW50SWQiOiI2MGE3MjRiYTk1N2FhNjBjN2M3YzNlYTEiLCJ0eXBlVXNlciI6ImFkbWluIiwiaWF0IjoxNjIxODU5NDMwfQ.-GljSrlUF4b3nl8ojzpk1xK1O-_MX5B6a31g8u5eTp8";

    public static QuestionFragment newInstance() {
        return new QuestionFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        questionViewModel =
        new ViewModelProvider(this).get(QuestionViewModel.class);
        View root = inflater.inflate(R.layout.question_fragment, container, false);
        addEvents(root);

        questionList = root.findViewById(R.id.questionList);


        // Call api
        QuestionAPIServices.questionAPIServices.getListQuestion(authToken)
                .enqueue(new Callback<ListQuestionInfo>() {
            @Override
            public void onResponse(Call<ListQuestionInfo> call, Response<ListQuestionInfo> response) {
                listQuestionInfo = response.body();

                showListQuestion();
                System.out.print("ok");
            }
            @Override
            public void onFailure(Call<ListQuestionInfo> call, Throwable t) {
                System.out.print("no ok");
            }
        });

        System.out.print("no ok 123");

        return root;
    }

    private void addEvents(View root) {
        addControls(root);
        btn_Add_Question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key","abc"); // Put anything what you want

                AddQuestionFragment addQuestionFragment = new AddQuestionFragment();
                addQuestionFragment.setArguments(bundle);

                Navigation.findNavController(root).navigate(R.id.question_to_add_question, bundle);
            }
        });
    }

    private void addControls(View root) {
        btn_Add_Question = root.findViewById(R.id.btn_add_question);
        spinner_Topic = root.findViewById(R.id.spinner_Topic);
    }

    private void showListQuestion(){
//        arrQuestion = listQuestionInfo.getListQuestion();
//        questionAdapter = new QuestionAdapter(getActivity(),arrQuestion);

//        questionList.setAdapter(questionAdapter);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        questionViewModel = new ViewModelProvider(this).get(QuestionViewModel.class);
        // TODO: Use the ViewModel
    }

}