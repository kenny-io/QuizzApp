package com.example.ekene.quizzapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FirstPageActivity extends AppCompatActivity {

//assigns answer variables to their respective correct answers or buttons

    final int Q1_ANSWER = R.id.Q1btnClicked_12;
    final String Q2_ANSWER = "judas";
    final String Q3_ANSWER = "moses";
    final int Q4_ANSWER = R.id.Q4btnClicked_1189;
    final String Q6_ANSWER = "jesus wept";
    final int Q7_ANSWER = R.id.Q7btnClicked_23214;
    final int Q9_ANSWER = R.id.Q9btnClicked_117;
    final String Q10_ANSWER = "noah";
    CheckBox Q8_ANSWER;
    CheckBox Q5_ANSWER;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }


    public void checkQuiz(View view) {

        int numberOfQuestionsCorrect = 0;

        ArrayList<String> incorrectAnswersList = new ArrayList<String>();

        if (checkQuestion1()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 1");

        }
        if (checkQuestion2()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 2");
        }
        if (checkQuestion3()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 3");
        }
        if (checkQuestion4()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 4");
        }
        if (checkQuestion5()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 5");
        }
        if (checkQuestion6()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 6");
        }
        if (checkQuestion7()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 7");
        }
        if (checkQuestion8()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 8");
        }
        if (checkQuestion9()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 9");
        }
        if (checkQuestion10()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 10");
        }
        StringBuilder sb = new StringBuilder();
        for (String s : incorrectAnswersList) {
            sb.append(s);
            sb.append("\n");
        }

        Context context = getApplicationContext();
        CharSequence text = "you got " + numberOfQuestionsCorrect + "/10 answers right. \nRecheck the following: \n" + sb.toString();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    // this method links the correct button to the correct answer
    private boolean checkQuestion1() {

        RadioGroup rg = (RadioGroup) findViewById(R.id.rg1);

        if (rg.getCheckedRadioButtonId() == Q1_ANSWER) {
            return true;
        }
        return false;
    }

    // this method links the correct button to the correct answer
    private boolean checkQuestion2() {

        EditText et = (EditText) findViewById(R.id.edit_text_answer2);
        return et.getText().toString().equalsIgnoreCase(Q2_ANSWER);
    }

    // this method links the correct button to the correct answer
    private boolean checkQuestion3() {

        EditText et = (EditText) findViewById(R.id.edit_text_answer3);

        return et.getText().toString().equalsIgnoreCase(Q3_ANSWER);
    }

    // this method links the correct button to the correct answer
    private boolean checkQuestion4() {

        RadioGroup rg = (RadioGroup) findViewById(R.id.rg4);
        if (rg.getCheckedRadioButtonId() == Q4_ANSWER) {
            return true;
        }
        return false;
    }

    // this method links the correct button to the correct answer
    private boolean checkQuestion5() {

        CheckBox c1 = (CheckBox) findViewById(R.id.cb_first_answer);
        CheckBox c2 = (CheckBox) findViewById(R.id.cb_second_answer);
        CheckBox c3 = (CheckBox) findViewById(R.id.cb_third_answer);

        if (c1.isChecked() && !c2.isChecked() && c3.isChecked()) {
            return true;
        }

        return false;

    }

    // this method links the correct button to the correct answer
    private boolean checkQuestion6() {

        EditText et = (EditText) findViewById(R.id.edit_text_answer6);

        return et.getText().toString().equalsIgnoreCase(Q6_ANSWER);
    }

    // this method links the correct button to the correct answer
    private boolean checkQuestion7() {

        RadioGroup rg = (RadioGroup) findViewById(R.id.rg7);

        if (rg.getCheckedRadioButtonId() == Q7_ANSWER) {
            return true;
        }
        return false;
    }

    // this method links the correct button to the correct answer
    private boolean checkQuestion8() {

        CheckBox c1 = (CheckBox) findViewById(R.id.cb_answer_isaiah);
        CheckBox c2 = (CheckBox) findViewById(R.id.cb_answer_amos);
        CheckBox c3 = (CheckBox) findViewById(R.id.cb_answer_abraham);

        if (!c1.isChecked() && c2.isChecked() && c3.isChecked()) {
            return true;
        }

        return false;

    }

    // this method links the correct button to the correct answer
    private boolean checkQuestion9() {

        RadioGroup rg = (RadioGroup) findViewById(R.id.rg9);

        if (rg.getCheckedRadioButtonId() == Q9_ANSWER) {
            return true;
        }
        return false;
    }

    // this method links the correct button to the correct answer
    private boolean checkQuestion10() {

        EditText et = (EditText) findViewById(R.id.edit_text_answer10);

        return et.getText().toString().equalsIgnoreCase(Q10_ANSWER);
    }

}

