package com.example.hack1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeMenu extends Activity implements View.OnClickListener {

    Button InvestButton,LoanButton,Loan_PaymentButton,WithdrawButton,GoToYourProfileButton,CheckPreviousTransactionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);

        InvestButton=findViewById(R.id.InvestId);
        LoanButton=findViewById(R.id.LoanId);
        Loan_PaymentButton=findViewById(R.id.LoanPaymentId);
        WithdrawButton=findViewById(R.id.WithdrawId);
        GoToYourProfileButton=findViewById(R.id.GoToYourProfileId);
        CheckPreviousTransactionButton=findViewById(R.id.CheckPreviousTransactionId);


        InvestButton.setOnClickListener(this);
        LoanButton.setOnClickListener(this);
        Loan_PaymentButton.setOnClickListener(this);
        WithdrawButton.setOnClickListener(this);
        GoToYourProfileButton.setOnClickListener(this);
        CheckPreviousTransactionButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            if(v==InvestButton){
                startActivity(new Intent(this, JSON.class));
            }
    }
}
