package com.bayazitesen.englishforkids;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;


public class Hayvanlar extends AppCompatActivity implements TextToSpeech.OnInitListener, TextToSpeech.OnUtteranceCompletedListener{

    ImageView ileributonu, geributonu;
    ImageView hayvanresimleri;
    TextView txthayvan;
    TextToSpeech textToSpeech;
    ImageView dinleme_butonu;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hayvanlar);


        geributonu=(ImageView)findViewById(R.id.geributonu_hayvanlar);
        ileributonu=(ImageView)findViewById(R.id.ileributonu_hayvanlar);
        hayvanresimleri=(ImageView)findViewById(R.id.imageview_hayvan);
        txthayvan=(TextView)findViewById(R.id.txt_hayvanlar);
        textToSpeech=new TextToSpeech(Hayvanlar.this, Hayvanlar.this);
        dinleme_butonu=(ImageView)findViewById(R.id.buton_dinleme);


        dinleme_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textToSpeech.isSpeaking()){
                    HashMap<String, String> stringStringHashMap=new HashMap<String, String>();
                    stringStringHashMap.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "Helo how are you");
                    textToSpeech.speak(txthayvan.getText().toString(), TextToSpeech.QUEUE_ADD, stringStringHashMap);
                    dinleme_butonu.setVisibility(Button.VISIBLE);
                }
                else{
                    textToSpeech.stop();
                }
            }
        });

        hayvanresimleri.setImageResource(R.drawable.kopek);


        geributonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Hayvanlar.this, MainActivity.class);
                startActivity(i);
            }
        });
        ileributonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hayvanresimleri.setImageResource(R.drawable.kedi);
                txthayvan.setText("CAT");
                geributonu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        hayvanresimleri.setImageResource(R.drawable.kopek);
                        txthayvan.setText("DOG");
                        geributonu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i=new Intent(Hayvanlar.this, MainActivity.class);
                                startActivity(i);
                            }
                        });
                    }
                });
                ileributonu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        hayvanresimleri.setImageResource(R.drawable.kus);
                        txthayvan.setText("BIRD");
                        geributonu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                hayvanresimleri.setImageResource(R.drawable.kedi);
                                txthayvan.setText("CAT");
                                geributonu.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        hayvanresimleri.setImageResource(R.drawable.kopek);
                                        txthayvan.setText("DOG");
                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent i=new Intent(Hayvanlar.this, MainActivity.class);
                                                startActivity(i);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        ileributonu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                hayvanresimleri.setImageResource(R.drawable.tavsan);
                                txthayvan.setText("RABBIT");
                                geributonu.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        hayvanresimleri.setImageResource(R.drawable.kus);
                                        txthayvan.setText("BIRD");
                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                hayvanresimleri.setImageResource(R.drawable.kedi);
                                                txthayvan.setText("CAT");
                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        hayvanresimleri.setImageResource(R.drawable.kopek);
                                                        txthayvan.setText("DOG");
                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                Intent i=new Intent(Hayvanlar.this, MainActivity.class);
                                                                startActivity(i);
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                                ileributonu.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        hayvanresimleri.setImageResource(R.drawable.zebra);
                                        txthayvan.setText("ZEBRA");
                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                hayvanresimleri.setImageResource(R.drawable.tavsan);
                                                txthayvan.setText("RABBIT");
                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        hayvanresimleri.setImageResource(R.drawable.kus);
                                                        txthayvan.setText("BIRD");
                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                hayvanresimleri.setImageResource(R.drawable.kedi);
                                                                txthayvan.setText("CAT");
                                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        hayvanresimleri.setImageResource(R.drawable.kopek);
                                                                        txthayvan.setText("DOG");
                                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                Intent i=new Intent(Hayvanlar.this, MainActivity.class);
                                                                                startActivity(i);
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                        ileributonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                hayvanresimleri.setImageResource(R.drawable.balik);
                                                txthayvan.setText("FISH");
                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        hayvanresimleri.setImageResource(R.drawable.zebra);
                                                        txthayvan.setText("ZEBRA");
                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                hayvanresimleri.setImageResource(R.drawable.tavsan);
                                                                txthayvan.setText("RABBIT");
                                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        hayvanresimleri.setImageResource(R.drawable.kus);
                                                                        txthayvan.setText("BIRD");
                                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                hayvanresimleri.setImageResource(R.drawable.kedi);
                                                                                txthayvan.setText("CAT");
                                                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        hayvanresimleri.setImageResource(R.drawable.kopek);
                                                                                        txthayvan.setText("DOG");
                                                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                Intent i=new Intent(Hayvanlar.this, MainActivity.class);
                                                                                                startActivity(i);
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                                ileributonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        hayvanresimleri.setImageResource(R.drawable.tavuk);
                                                        txthayvan.setText("CHICKEN");
                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                hayvanresimleri.setImageResource(R.drawable.balik);
                                                                txthayvan.setText("FISH");
                                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        hayvanresimleri.setImageResource(R.drawable.zebra);
                                                                        txthayvan.setText("ZEBRA");
                                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                hayvanresimleri.setImageResource(R.drawable.tavsan);
                                                                                txthayvan.setText("RABBIT");
                                                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        hayvanresimleri.setImageResource(R.drawable.kus);
                                                                                        txthayvan.setText("BIRD");
                                                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                hayvanresimleri.setImageResource(R.drawable.kedi);
                                                                                                txthayvan.setText("CAT");
                                                                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        hayvanresimleri.setImageResource(R.drawable.kopek);
                                                                                                        txthayvan.setText("DOG");
                                                                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {
                                                                                                                Intent i=new Intent(Hayvanlar.this, MainActivity.class);
                                                                                                                startActivity(i);
                                                                                                            }
                                                                                                        });
                                                                                                    }
                                                                                                });
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        ileributonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                hayvanresimleri.setImageResource(R.drawable.fil);
                                                                txthayvan.setText("ELEPHANT");
                                                                ileributonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        Intent i=new Intent(Hayvanlar.this, Meslekler.class);
                                                                        startActivity(i);
                                                                    }
                                                                });
                                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        hayvanresimleri.setImageResource(R.drawable.tavuk);
                                                                        txthayvan.setText("CHICKEN");
                                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                hayvanresimleri.setImageResource(R.drawable.balik);
                                                                                txthayvan.setText("FISH");
                                                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        hayvanresimleri.setImageResource(R.drawable.zebra);
                                                                                        txthayvan.setText("ZEBRA");
                                                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                hayvanresimleri.setImageResource(R.drawable.tavsan);
                                                                                                txthayvan.setText("RABBIT");
                                                                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        hayvanresimleri.setImageResource(R.drawable.kus);
                                                                                                        txthayvan.setText("BIRD");
                                                                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {
                                                                                                                hayvanresimleri.setImageResource(R.drawable.kedi);
                                                                                                                txthayvan.setText("CAT");
                                                                                                                geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                    @Override
                                                                                                                    public void onClick(View v) {
                                                                                                                        hayvanresimleri.setImageResource(R.drawable.kopek);
                                                                                                                        txthayvan.setText("DOG");
                                                                                                                        geributonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                Intent i=new Intent(Hayvanlar.this, MainActivity.class);
                                                                                                                                startActivity(i);
                                                                                                                            }
                                                                                                                        });
                                                                                                                    }
                                                                                                                });
                                                                                                            }
                                                                                                        });
                                                                                                    }
                                                                                                });
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });


    }

    @Override
    public void onInit(int status) {
        textToSpeech.setOnUtteranceCompletedListener(this);
    }

    @Override
    public void onUtteranceCompleted(String utteranceId) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //Toast.makeText(Hayvanlar.this, "Utterence completed", Toast.LENGTH_LONG).show();
                dinleme_butonu.setVisibility(ImageView.VISIBLE);

            }
        });{

        }
    }

    protected void onDestroy(){
        if(textToSpeech!=null){
            textToSpeech.stop();
            textToSpeech.shutdown();
            textToSpeech=null;
        }
        super.onDestroy();
    }
}
