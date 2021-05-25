package com.example.feedbackapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feedbackapp.ModelClassToReceiveFromAPI.Module.Module;
import com.example.feedbackapp.R;

import java.util.ArrayList;

public class ModuleAdapter extends RecyclerView.Adapter<ModuleAdapter.ViewHolder> {

    Context context;
    ArrayList<Module> listModule;

    public ModuleAdapter(Context context, ArrayList<Module> listModule) {
        this.context = context;
        this.listModule = listModule;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // gán view
        View view = LayoutInflater.from(context).inflate(R.layout.item_module_manager_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return listModule.size(); // trả item tại vị trí postion
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //gán dữ liệu cho từng item
        Module module = listModule.get(position);
        holder.txtModuleID.setText(module.getId());
        holder.txtModuleName.setText(module.getModuleName());
        holder.txtAdminID.setText(module.getAdminId());
        holder.txtStartDate.setText(module.getStartTime());
        holder.txtEndDate.setText(module.getEndTime());
        holder.txtFeedbackTitle.setText(module.getFeedbackTitle());
        holder.txtFeedbackStartTime.setText(module.getFeedbackStartTime());
        holder.txtFeedbackEndTime.setText(module.getFeedbackEndTime());
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        //khởi tạo các view con trong 1 item
        TextView txtModuleID,
                txtModuleName,
                txtAdminID,
                txtStartDate,
                txtEndDate,
                txtFeedbackTitle,
                txtFeedbackStartTime,
                txtFeedbackEndTime;
        Button btnEdit,
                btnDelete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtModuleID = itemView.findViewById(R.id.txt_ModuleID);
            txtModuleName = itemView.findViewById(R.id.txt_ModuleName);
            txtAdminID = itemView.findViewById(R.id.txt_AdminID);
            txtStartDate = itemView.findViewById(R.id.txt_StartDate);
            txtEndDate = itemView.findViewById(R.id.txt_endDate);
            txtFeedbackTitle = itemView.findViewById(R.id.txt_FeedbackTitle);
            txtFeedbackStartTime = itemView.findViewById(R.id.txt_FeedbackStartTime);
            txtFeedbackEndTime = itemView.findViewById(R.id.txt_FeedbackEndTime);

            btnEdit = itemView.findViewById(R.id.btn_EditModule);
            btnDelete = itemView.findViewById(R.id.btn_DeleteModule);
        }
    }
    public void EditModule(int position){

    }
    public void DeleteModule(int position){

    }
}


