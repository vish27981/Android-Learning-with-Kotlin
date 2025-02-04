package com.vishcustom.todoapp.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.recyclerview.widget.RecyclerView;

import com.vishcustom.todoapp.MainActivity;
import com.vishcustom.todoapp.Model.ToDoModel;
import com.vishcustom.todoapp.R;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {
    private List<ToDoModel>toDoList;
    private MainActivity activity;

    public ToDoAdapter(MainActivity activity){
        this.activity=activity;
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.newtask,parent,false);

        return new ViewHolder(itemView);

    }
    public void onBindViewHolder(ViewHolder holder,int position){
        ToDoModel item =toDoList.get(position);
        holder.task.setText(item.getTask());
        holder.task.setChecked(toBoolean(item.getStatus()));
    }

    public int getItemCount(){
        return toDoList.size();
    }
    private boolean toBoolean(int n){
        return n!=0;
    }

    public void setTasks(List<ToDoModel>toDoList){
        this.toDoList=toDoList;
        notifyDataSetChanged();

    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        CheckBox task;

        ViewHolder(View view){
            super(view);
            task=view.findViewById(R.id.todoCheckBox);

        }

    }

}
