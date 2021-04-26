package com.longs7.android_lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class PasswordGeneratorActivity extends AppCompatActivity {

    private TextView tvResult;
    private EditText edtLength;
    private CheckBox cbLowerCase;
    private CheckBox cbUpperCase;
    private CheckBox cbIncludeNumber;
    private CheckBox cbSpecialSymbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_generator);

        Button btnGenerate = findViewById(R.id.btnGenerate);
        tvResult = findViewById(R.id.tvResult);
        edtLength = findViewById(R.id.edt_length);
        cbLowerCase = findViewById(R.id.cb_lower_case);
        cbUpperCase = findViewById(R.id.cb_upper_case);
        cbIncludeNumber = findViewById(R.id.cb_include_number);
        cbSpecialSymbol = findViewById(R.id.cb_special_symbol);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generatePassword();
            }
        });
    }

    private void generatePassword() {
        if(edtLength.getText().toString().isEmpty()){
            tvResult.setText("");
            return;
        }

        int length = Integer.parseInt(edtLength.getText().toString());
        if(length < 1){
            tvResult.setText("");
            return;
        }

        String result;

        PasswordGenerator.PasswordGeneratorBuilder builder = new PasswordGenerator.PasswordGeneratorBuilder();
        if(cbLowerCase.isChecked())
            builder.useLower(true);
        if(cbUpperCase.isChecked())
            builder.useUpper(true);
        if(cbIncludeNumber.isChecked())
            builder.useDigits(true);
        if(cbSpecialSymbol.isChecked())
            builder.usePunctuation(true);

        result = new PasswordGenerator(builder).generate(length);

        tvResult.setText(result);
    }
}
