package com.example.luynthibnglixeb1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.luynthibnglixeb1.model.Category;

import java.util.List;

public class Activity3 extends AppCompatActivity {

    private TextView textViewHighScore;
    private Spinner spinnerCategory;
    private Button buttonStartQuestion;

    private static final int REQUEST_CODE_QUESTION = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }}
/*
        Anhxa();

        //load chu de
        loadCategories();
        //click bat dau
        buttonStartQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startQuestion();
            }
        });
    }
/*


    //ham bat dau cau hoi qua activity question
    private void startQuestion(){
        //lay id, name chu de da chon
        Category category = (Category) spinnerCategory.getSelectedItem();
        int categoryID = category.getId();
        String categoryName = category.getName();
        //Chuyen qua activity question
        Intent intent = new Intent(Activity3.this, QuestionActivity.class);
        //gui du lieu name, id
        intent.putExtra("idcategories", categoryID);
        intent.putExtra("catgoriesname", categoryName);
        //sd startActivityForResult để có thể nhận lại dữ liệu kết quả trả về thông qua phương thức onActivityResult()
        startActivityForResult(intent,REQUEST_CODE_QUESTION);

    }

    private void Anhxa(){
        textViewHighScore = findViewById(R.id.textview_high_score);
        buttonStartQuestion = findViewById(R.id.button_start_question);

    }
    //load chu de
    private void loadCategories(){
        Database database = new Database(this);
        //Lay du lieu danh sach chu de
        List<Category> categories = database.getDataCategories();
        // tao adapter
        ArrayAdapter<Category> categoryArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,categories);

        //bo cuc hien thi chu de
        categoryArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // gan chu de len spinner hien thi
        spinnerCategory.setAdapter(categoryArrayAdapter);
    }
}*/
