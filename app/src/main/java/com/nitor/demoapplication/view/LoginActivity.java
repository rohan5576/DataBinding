package com.nitor.demoapplication.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nitor.demoapplication.R;
import com.nitor.demoapplication.databinding.LoginActivityBinding;
import com.nitor.demoapplication.view.detailsList.MedicalListActivity;

public class LoginActivity extends AppCompatActivity implements INextCallActivity {

    LoginActivityBinding loginActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataBinding();
    }


    private void initDataBinding() {
        loginActivityBinding = DataBindingUtil.setContentView(this, R.layout.login_activity);
        loginActivityBinding.setINextCallActivity(this);
    }


    @Override
    public void onNextScreen() {
        startActivity(new Intent(LoginActivity.this, MedicalListActivity.class));
    }
}
