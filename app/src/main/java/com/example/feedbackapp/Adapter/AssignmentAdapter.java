package com.example.feedbackapp.Adapter;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feedbackapp.ModelClassToReceiveFromAPI.Assignment.Assignment;
import com.example.feedbackapp.R;

import java.util.ArrayList;
import java.util.List;

public class AssignmentAdapter extends RecyclerView.Adapter<AssignmentAdapter.ViewHolder>{
    Context context;
    ArrayList<Assignment> listAssignment;

    public AssignmentAdapter(Context context, ArrayList<Assignment> listAssignment) {
        this.context = context;
        this.listAssignment = listAssignment;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // gán view
        View view = LayoutInflater.from(context).inflate(R.layout.assignment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Gán dữ liêuk
        Assignment assignment = listAssignment.get(position);
        holder.textView_idAssignment.setText(assignment.getId());
        holder.textView_moduleName.setText(assignment.getModuleName());
        holder.textView_className.setText(assignment.getClassName());
        holder.textView_trainerName.setText(assignment.getTrainerName());
        holder.textView_rCode.setText(assignment.getRegistrationCode());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView_idAssignment, textView_moduleName,
                textView_className, textView_trainerName, textView_rCode;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Ánh xạ view
            textView_idAssignment = itemView.findViewById(R.id.textView_idAssignment);
            textView_moduleName = itemView.findViewById(R.id.textView_moduleName);
            textView_className = itemView.findViewById(R.id.textView_className);
            textView_trainerName = itemView.findViewById(R.id.textView_trainerName);
            textView_rCode = itemView.findViewById(R.id.textView_rCode);
        }
    }
}
