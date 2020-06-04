package com.example.internchat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {

    private  List<Chat> chats;
    public ChatAdapter (List<Chat> chatList){
        this.chats = chatList;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_item, parent, false);

        return new ChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        Chat  chat = chats.get(position);

        holder.tvName.setText(chat.getName());
        holder.tvTime.setText(getTime(chat.getTime()));
        holder.tvMessage.setText(chat.getMessage());

    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public String getTime(long time){
            Date date = new Date(time);
            DateFormat formatter = new SimpleDateFormat("HH:mm");

            return formatter.format(date);
    }

    public class ChatViewHolder extends RecyclerView.ViewHolder{
        private TextView tvName;
        private TextView tvTime;
        private TextView tvMessage;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName= itemView.findViewById(R.id.tv_name);
            tvTime= itemView.findViewById(R.id.tv_time);
            tvMessage= itemView.findViewById(R.id.tv_message);

        }
    }
}
