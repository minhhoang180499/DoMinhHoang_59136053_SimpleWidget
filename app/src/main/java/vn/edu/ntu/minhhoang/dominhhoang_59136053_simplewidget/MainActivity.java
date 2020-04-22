package vn.edu.ntu.minhhoang.dominhhoang_59136053_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtNgSinh, edtSTK;
    RadioGroup rdgGT;
    Button btnXN;
    String GT;
    String cb1="", cb2="",cb3="",cb4="",cb5="";
    CheckBox cbox1, cbox2, cbox3, cbox4, cbox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }

    private void addViews()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNgSinh = findViewById(R.id.edtngSinh);
        edtSTK = findViewById(R.id.edtSTK);
        rdgGT = findViewById(R.id.rdgGT);
        btnXN = findViewById(R.id.btnXN);
        cbox1 = findViewById(R.id.cbox1);
        cbox2 = findViewById(R.id.cbox2);
        cbox3 = findViewById(R.id.cbox3);
        cbox4 = findViewById(R.id.cbox4);
        cbox5 = findViewById(R.id.cbox5);
    }

    private void addEvents()
    {
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inThongBao();
            }
        });

    }
    private void gioiTinh()
    {
        switch (rdgGT.getCheckedRadioButtonId())
        {
            case R.id.rbNam:
                GT = "Nam";
                break;
            case R.id.rbNu:
                GT = "Nữ";
                break;
        }
    }

    private void soThich()
    {

        if(cbox1.isChecked())
        {
            cb1 = cbox1.getText().toString();
            if(cb1!="")
            {
                cb1 = cb1 + "; ";
            }
        } else{
            cb1 = "";
        }
        if(cbox2.isChecked())
        {
            cb2 = cbox2.getText().toString();
            if(cb2!="")
            {
                cb2 = cb2 +"; " ;
            }
        }else{
            cb2 = "";
        }
        if(cbox3.isChecked())
        {
            cb3 = cbox3.getText().toString();
            if(cb3!="")
            {
                cb3 = cb3 +"; " ;
            }
        }else{
            cb3 = "";
        }
        if(cbox4.isChecked())
        {
            cb4 = cbox4.getText().toString();
            if(cb4!="")
            {
                cb4 = cb4 +"; " ;
            }
        }else{
            cb4 = "";
        }
        if(cbox5.isChecked())
        {
            cb5 = cbox5.getText().toString();
            if(cb5!="")
            {
                cb5 = cb5 +"; " ;
            }
        }else{
            cb5 = "";
        }

    }

    private void inThongBao()
    {
        gioiTinh();
        soThich();
        String ckb1 = cb1;
        String ckb2 = cb2;
        String ckb3 = cb3;
        String ckb4 = cb4;
        String ckb5 = cb5;
        String gt = GT;
        String Ten = edtTen.getText().toString();
        String NgSinh = edtNgSinh.getText().toString();
        String STK = edtSTK.getText().toString();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        String TT = Ten + '\n'+
                "Ngày sinh: " + NgSinh + '\n'+
                "Giới tính: " + gt + '\n'+
                "Sở thích: "  + ckb1 + ckb2 + ckb3 + ckb4 +ckb5 + STK ;
        Toast toast = Toast.makeText(context, TT, duration);
        toast.show();
    }

}
