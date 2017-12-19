package com.homework.codeclan.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText sentenceEditText;
    Button countButton;
    TextView answerCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        sentenceEditText = findViewById(R.id.sentence_text);
        answerCount = findViewById(R.id.answer_count);
        countButton = findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button) {
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        String text = sentenceEditText.getText().toString();
        Log.d(getClass().toString(), "The sentence was '" + text + "'");
        WordCount wordcount = new WordCount();
//        String sentence = sentenceEditText.getText().toString();
//        answerCount.setText(Integer.toString(wordcount.countWords(sentence)));
//         OR
        int sentence = wordcount.countWords(text);
        answerCount.setText(Integer.toString(sentence));
    }
}