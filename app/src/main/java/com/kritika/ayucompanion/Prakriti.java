package com.kritika.ayucompanion;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Prakriti extends AppCompatActivity {
    TextView t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20;
    LinearLayout linearLayout;
    ScrollView scrollView;
    TextToSpeech textToSpeech;
    int speechCount =0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prakriti);
        t10 = findViewById(R.id.t10);
        t11 = findViewById(R.id.t117);
        t12 = findViewById(R.id.t116);
        t13 = findViewById(R.id.t115);
        t14 = findViewById(R.id.t114);
        t15 = findViewById(R.id.t113);
        t16 = findViewById(R.id.t112);
        t17 = findViewById(R.id.t111);
        t18 = findViewById(R.id.t118);
        t19 = findViewById(R.id.t119);
        t20 = findViewById(R.id.t120);
        scrollView = findViewById(R.id.ltt);
        linearLayout = findViewById(R.id.lt);
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.US);
                }
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textToSpeech.isSpeaking()) {
                    switch (speechCount) {
                        case 0: {
                             t17.setVisibility(View.VISIBLE);
                             textToSpeech.speak(t17.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                            speechCount++;
                            break;
                        }
                        case 1: {
                            t16.setVisibility(View.VISIBLE);
                            textToSpeech.speak(t16.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                            speechCount++;
                            break;
                        }
                        case 2: {
                            t15.setVisibility(View.VISIBLE);
                            textToSpeech.speak(t15.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                            speechCount++;
                            break;
                        }
                        case 3: {
                            t14.setVisibility(View.VISIBLE);
                            textToSpeech.speak(t14.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                            speechCount++;
                            break;
                        }
                        case 4: {
                            t13.setVisibility(View.VISIBLE);
                            textToSpeech.speak(t13.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                            speechCount++;
                            break;
                        }
                        case 5: {
                            t12.setVisibility(View.VISIBLE);
                            textToSpeech.speak(t12.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                            speechCount++;
                            break;
                        }
                        case 6: {
                            t11.setVisibility(View.VISIBLE);
                            textToSpeech.speak(t11.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                            speechCount++;
                            break;
                        }
                        case 7: {
                            t18.setVisibility(View.VISIBLE);
                            textToSpeech.speak(t18.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                            speechCount++;
                            break;
                        }
                        case 8: {
                            t19.setVisibility(View.VISIBLE);
                            textToSpeech.speak(t19.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                            speechCount++;
                            break;
                        }
                        case 9: {
                            t20.setVisibility(View.VISIBLE);
                            textToSpeech.speak(t20.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                            break;
                        }
                    }
                }
            }
        });
    }
        protected void onDestroy() {
            if (textToSpeech != null) {
                textToSpeech.stop();
                textToSpeech.shutdown();
            }
            super.onDestroy();
        }
}

