//package com.example.feedbackapp.Adapter;
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.feedbackapp.ModelClassToReceiveFromAPI.Question.Question;
//import com.example.feedbackapp.R;
//
//import java.util.List;
//
//public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {
//    private Context context;
//    private List<Question> listQuestion;
//
//    public QuestionAdapter(Context context, List<Question> listQuestion) {
//        this.context = context;
//        this.listQuestion = listQuestion;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        Context context = parent.getContext();
//        LayoutInflater inflater = LayoutInflater.from(context);
//
//        // Nạp layout cho View biểu diễn phần tử sinh viên
//        View questionView = inflater.inflate(R.layout.question_item, parent, false);
//
//        ViewHolder viewHolder = new ViewHolder(questionView);
//        return viewHolder;
//
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        Question question = listQuestion.get(position);
//
//        // map
//        holder.txtTopicId.setText(question.getTopicId());
//        holder.txtQuestionContent.setText(question.getQuestionContent());
//        holder.txtQuestionId.setText(question.getId());
//        holder.txtTopicName.setText(question.getTopicName());
//
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return listQuestion.size();
//    }
//
//    /**
//     * Lớp nắm giữ cấu trúc view
//     */
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        private View itemview;
//        public TextView txtTopicId, txtTopicName, txtQuestionContent, txtQuestionId;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            itemview = itemView;
//            txtTopicId = itemView.findViewById(R.id.txtTopicId);
//            txtTopicName = itemView.findViewById(R.id.txtTopicName);
//            txtQuestionContent = itemView.findViewById(R.id.txtQuestionContent);
//            txtQuestionId = itemView.findViewById(R.id.txtQuestionId);
//
//        }
//    }
//
//}
