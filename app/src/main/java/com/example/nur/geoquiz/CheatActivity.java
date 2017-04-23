package com.example.nur.geoquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {
    private static final String EXTRA_ANSWER_IS_TRUE =
            "com.example.nur.geoquiz.answer_is_true";
//    private static final String EXTRA_ANSWER_SHOWN =
//            "com.example.nur.geoquiz.answer_shown";
//    private TextView mAnswerTextView;
//    private Button mShowAnswer;

    private boolean mAnswerIsTrue;

    public static Intent newIntent(Context packageContext, boolean answerIsTrue) {
        Intent i = new Intent(packageContext, CheatActivity.class);
        i.putExtra(EXTRA_ANSWER_IS_TRUE, answerIsTrue);
        return i;
    }

//    public static boolean wasAnswerShown(Intent result) {
//        return result.getBooleanExtra(EXTRA_ANSWER_SHOWN, false);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_cheat);
//        what is this?Note that Activity.getIntent() always returns the Intent that started the activity. This is what you
//        sent when calling startActivity(Intent) .
        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);
//        mAnswerTextView = (TextView) findViewById(R.id.answer_text_view);
//
//        mShowAnswer = (Button) findViewById(R.id.show_answer_button);
//        mShowAnswer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mAnswerIsTrue) {
//                    mAnswerTextView.setText(R.string.true_button);
//                } else {
//                    mAnswerTextView.setText(R.string.false_button);
//                }
////                setAnswerShownResult(true);
//            }
//        });
    }

//    private void setAnswerShownResult(boolean isAnswerShown) {
//        Intent data = new Intent();
//        data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
////        When the user presses the Show Answer button, the CheatActivity packages up the result code and
////        the intent in the call to setResult(int, Intent) .
//        setResult(RESULT_OK, data);
//    }
}
