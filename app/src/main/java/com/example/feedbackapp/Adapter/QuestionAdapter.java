//package com.example.feedbackapp.Adapter;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.content.Context;
//import android.view.ContextMenu;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.ImageButton;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.cardview.widget.CardView;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.feedbackapp.ModelClassToReceiveFromAPI.Module.Module;
//import com.example.feedbackapp.ModelClassToReceiveFromAPI.Question.Question;
//import com.example.feedbackapp.R;
//
//import java.util.ArrayList;
//
//public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {
//
//    Context context;
//    ArrayList<Question> listQuestion;
//
//    public QuestionAdapter(Context context, ArrayList<Question> listQuestion) {
//        this.context = context;
//        this.listQuestion = listQuestion;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        // gán view
//        View view = LayoutInflater.from(context).inflate(R.layout.question_item, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public int getItemCount() {
//        return listQuestion.size(); // trả item tại vị trí postion
//    }
//
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        //gán dữ liệu cho từng item
//        Question question = listQuestion.get(position);
//
//        holder.txtTopicName.setText(question.getTopicName());
//        holder.txtTopicId.setText(question.getTopicId());
//        holder.txtQuestionId.setText(question.getId());
//        holder.txtQuestionContent.setText(question.getQuestionContent());
//
//    }
//
//    class ViewHolder extends RecyclerView.ViewHolder{
//        //khởi tạo các view con trong 1 item
//        TextView txtTopicName, txtTopicId, txtQuestionContent, txtQuestionId;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            txtTopicName = itemView.findViewById(R.id.txtTopicName);
//            txtTopicId = itemView.findViewById(R.id.txtTopicId);
//            txtQuestionContent = itemView.findViewById(R.id.txtQuestionContent);
//            txtQuestionId = itemView.findViewById(R.id.txtQuestionId);
//        }
//    }
//
//
//    public void EditModule(int position){
//
//    }
//    public void DeleteModule(int position){
//
//    }
//}