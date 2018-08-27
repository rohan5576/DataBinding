package com.nitor.demoapplication.view.detailsList;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nitor.demoapplication.R;
import com.nitor.demoapplication.databinding.ItemLayoutBinding;

import java.util.List;

public class MedicalAdapter extends RecyclerView.Adapter<MedicalAdapter.ViewHolder> {


    private List<MedicalListModel> medicalListModels;
    private Context context;

    public MedicalAdapter(List<MedicalListModel> medicalLst, Context ctx) {
        medicalListModels = medicalLst;
        context = ctx;
    }

    @Override
    public MedicalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        ItemLayoutBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MedicalListModel medicalListModel = medicalListModels.get(position);
            holder.itemLayoutBinding.setMedical(medicalListModel);

    }

    @Override
    public int getItemCount() {
        return medicalListModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemLayoutBinding itemLayoutBinding;

        public ViewHolder(ItemLayoutBinding itemLayoutBinding1) {
            super(itemLayoutBinding1.getRoot());
            itemLayoutBinding = itemLayoutBinding1;
        }
    }
}

