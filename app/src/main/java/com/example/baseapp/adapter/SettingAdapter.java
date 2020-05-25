package com.example.baseapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baseapp.R;
import com.example.baseapp.model.entity.Menu;

import java.util.List;

public class SettingAdapter extends RecyclerView.Adapter<SettingAdapter.ViewHolder> {
    private List<Menu.MenuLeft.ItemMenu> menuList;
    private Context context;

    public SettingAdapter(List<Menu.MenuLeft.ItemMenu> menuList, Context context) {
        this.menuList = menuList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_setting, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(menuList.get(position));
    }

    @Override
    public int getItemCount() {
        return null != menuList ? menuList.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView settingTxt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            settingTxt = itemView.findViewById(R.id.txtSetting);
        }

        public void onBind(Menu.MenuLeft.ItemMenu itemMenu) {
            settingTxt.setText(itemMenu.getName());
        }
    }
}
