package com.example.feedbackapp.ui.feedback;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.app.FragmentManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.feedbackapp.R;

import java.util.ArrayList;

public class FeedBackFragment extends Fragment {

    private FeedackViewModel mViewModel;
    Button btnView,btnEdit,btnDelete;

    public static FeedBackFragment newInstance() {
        return new FeedBackFragment();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.feedback_fragment,container,false);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.rcvFeedback);

        ArrayList<FeedbackModel> listFeedback;
        FeedbackAdapter feedbackAdapter;

        listFeedback = new ArrayList<>();
        listFeedback.add(new FeedbackModel("1","Title1","11"));
        listFeedback.add(new FeedbackModel("2","Title2","12"));
        listFeedback.add(new FeedbackModel("3","Title3","13"));
        listFeedback.add(new FeedbackModel("4","Title4","14"));
        feedbackAdapter=new FeedbackAdapter(listFeedback);
        recyclerView.setAdapter(feedbackAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);


        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FeedackViewModel.class);
        // TODO: Use the ViewModel

    }

}