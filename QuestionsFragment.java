package com.example.myapplication.ui.Questions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class QuestionsFragment extends Fragment {

        private QuestionsViewModel questionsViewModel;

        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState){
                questionsViewModel =
                        ViewModelProviders.of(this).get(QuestionsViewModel.class);
                View root = inflater.inflate(R.layout.fragment_questions, container, false);
                final TextView textView = root.findViewById(R.id.text_genres);
                questionsViewModel.getText().observe(this, new Observer<String>() {
                        @Override
                        public void onChanged(@Nullable String s) {
                                textView.setText(s);
                        }
                });
                return root;
            /**finished.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(QuestionsFragment.class, HomeFragment.class);
                    startActivity(myIntent);
                }
            });
        }
    private Button finished;
       */
        }
}
