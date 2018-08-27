package com.nitor.demoapplication.view.detailsList;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import com.nitor.demoapplication.R;
import com.nitor.demoapplication.databinding.DetailListActivityBinding;

public class MedicalListActivity extends AppCompatActivity {

    DetailListActivityBinding detailListActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initRecyclerView();
    }

    public  void initRecyclerView(){
        detailListActivityBinding = DataBindingUtil.setContentView(this, R.layout.detail_list_activity);
        detailListActivityBinding.rvMedicalList.setLayoutManager(new LinearLayoutManager(this));
        detailListActivityBinding.rvMedicalList.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        MedicalAdapter adapter =
                new MedicalAdapter(MedicalListModel.prepareData(), this);
        detailListActivityBinding.rvMedicalList.setAdapter(adapter);
    }

}
