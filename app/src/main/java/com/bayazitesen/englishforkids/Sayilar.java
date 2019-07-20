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
import java.util.Locale;

import static com.bayazitesen.englishforkids.R.drawable.iki;

public class Sayilar extends AppCompatActivity implements TextToSpeech.OnInitListener, TextToSpeech.OnUtteranceCompletedListener {
    ImageView image_dinleme, geri_butonu, ileri_butonu;
    TextToSpeech textToSpeech;
    TextView txtview;
    ImageView sayilar;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayilar);


        textToSpeech=new TextToSpeech(Sayilar.this, Sayilar.this);
        image_dinleme=(ImageView)findViewById(R.id.dinlemebutonu);
        txtview=(TextView)findViewById(R.id.sayilar_bir);
        geri_butonu=(ImageView)findViewById(R.id.geributonu);
        ileri_butonu=(ImageView)findViewById(R.id.ileributonu);
        sayilar=(ImageView)findViewById(R.id.sayibir);


        image_dinleme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textToSpeech.isSpeaking()){
                    HashMap<String, String> stringStringHashMap=new HashMap<String, String>();
                    stringStringHashMap.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "Helo how are you");
                    textToSpeech.speak(txtview.getText().toString(), TextToSpeech.QUEUE_ADD, stringStringHashMap);
                    image_dinleme.setVisibility(Button.VISIBLE);
                }
                else{
                    textToSpeech.stop();
                }
            }
        });



        geri_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sayilar.this, MainActivity.class);
                startActivity(intent);
            }
        });


        ileri_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayilar.setImageResource(R.drawable.iki);
                txtview.setText("TWO");
                geri_butonu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sayilar.setImageResource(R.drawable.bir);
                        txtview.setText("ONE");
                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i=new Intent(Sayilar.this, MainActivity.class);
                                startActivity(i);
                            }
                        });
                    }
                });
                ileri_butonu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sayilar.setImageResource(R.drawable.uc);
                        txtview.setText("THREE");
                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sayilar.setImageResource(R.drawable.iki);
                                txtview.setText("TWO");
                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        sayilar.setImageResource(R.drawable.bir);
                                        txtview.setText("ONE");
                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent i=new Intent(Sayilar.this, MainActivity.class);
                                                startActivity(i);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        ileri_butonu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sayilar.setImageResource(R.drawable.dort);
                                txtview.setText("FOUR");
                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        sayilar.setImageResource(R.drawable.uc);
                                        txtview.setText("THREE");
                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                sayilar.setImageResource(R.drawable.iki);
                                                txtview.setText("TWO");
                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        sayilar.setImageResource(R.drawable.bir);
                                                        txtview.setText("ONE");
                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                Intent i=new Intent(Sayilar.this, MainActivity.class);
                                                                startActivity(i);
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });

                                    }
                                });
                                ileri_butonu.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        sayilar.setImageResource(R.drawable.bes);
                                        txtview.setText("FIVE");
                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                sayilar.setImageResource(R.drawable.dort);
                                                txtview.setText("FOUR");
                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        sayilar.setImageResource(R.drawable.uc);
                                                        txtview.setText("THREE");
                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                sayilar.setImageResource(R.drawable.iki);
                                                                txtview.setText("TWO");
                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        sayilar.setImageResource(R.drawable.bir);
                                                                        txtview.setText("ONE");
                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                Intent i=new Intent(Sayilar.this, MainActivity.class);
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
                                        ileri_butonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                sayilar.setImageResource(R.drawable.alti);
                                                txtview.setText("SIX");
                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        sayilar.setImageResource(R.drawable.bes);
                                                        txtview.setText("FIVE");
                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                sayilar.setImageResource(R.drawable.dort);
                                                                txtview.setText("FOUR");
                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        sayilar.setImageResource(R.drawable.uc);
                                                                        txtview.setText("THREE");
                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                sayilar.setImageResource(R.drawable.iki);
                                                                                txtview.setText("TWO");
                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        sayilar.setImageResource(R.drawable.bir);
                                                                                        txtview.setText("ONE");
                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                Intent i=new Intent(Sayilar.this, MainActivity.class);
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
                                                ileri_butonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        sayilar.setImageResource(R.drawable.yedi);
                                                        txtview.setText("SEVEN");
                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                sayilar.setImageResource(R.drawable.alti);
                                                                txtview.setText("SIX");
                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        sayilar.setImageResource(R.drawable.bes);
                                                                        txtview.setText("FIVE");
                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                sayilar.setImageResource(R.drawable.dort);
                                                                                txtview.setText("FOUR");
                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        sayilar.setImageResource(R.drawable.uc);
                                                                                        txtview.setText("THREE");
                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                sayilar.setImageResource(R.drawable.iki);
                                                                                                txtview.setText("TWO");
                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        sayilar.setImageResource(R.drawable.bir);
                                                                                                        txtview.setText("ONE");
                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {
                                                                                                                Intent i=new Intent(Sayilar.this, MainActivity.class);
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
                                                        ileri_butonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                sayilar.setImageResource(R.drawable.sekiz);
                                                                txtview.setText("EIGHT");
                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        sayilar.setImageResource(R.drawable.yedi);
                                                                        txtview.setText("SEVEN");
                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                sayilar.setImageResource(R.drawable.alti);
                                                                                txtview.setText("SIX");
                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        sayilar.setImageResource(R.drawable.bes);
                                                                                        txtview.setText("FIVE");
                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                sayilar.setImageResource(R.drawable.dort);
                                                                                                txtview.setText("FOUR");
                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        sayilar.setImageResource(R.drawable.uc);
                                                                                                        txtview.setText("THREE");
                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {
                                                                                                                sayilar.setImageResource(R.drawable.iki);
                                                                                                                txtview.setText("TWO");
                                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                    @Override
                                                                                                                    public void onClick(View v) {
                                                                                                                        sayilar.setImageResource(R.drawable.bir);
                                                                                                                        txtview.setText("ONE");
                                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                Intent i=new Intent(Sayilar.this, MainActivity.class);
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
                                                                ileri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        sayilar.setImageResource(R.drawable.dokuz);
                                                                        txtview.setText("NINE");
                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                sayilar.setImageResource(R.drawable.sekiz);
                                                                                txtview.setText("EIGHT");
                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        sayilar.setImageResource(R.drawable.yedi);
                                                                                        txtview.setText("SEVEN");
                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                sayilar.setImageResource(R.drawable.alti);
                                                                                                txtview.setText("SIX");
                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        sayilar.setImageResource(R.drawable.bes);
                                                                                                        txtview.setText("FIVE");
                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {
                                                                                                                sayilar.setImageResource(R.drawable.dort);
                                                                                                                txtview.setText("FOUR");
                                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                    @Override
                                                                                                                    public void onClick(View v) {
                                                                                                                        sayilar.setImageResource(R.drawable.uc);
                                                                                                                        txtview.setText("THREE");
                                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                sayilar.setImageResource(R.drawable.iki);
                                                                                                                                txtview.setText("TWO");
                                                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                                    @Override
                                                                                                                                    public void onClick(View v) {
                                                                                                                                        sayilar.setImageResource(R.drawable.bir);
                                                                                                                                        txtview.setText("ONE");
                                                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                                            @Override
                                                                                                                                            public void onClick(View v) {
                                                                                                                                                Intent i=new Intent(Sayilar.this, MainActivity.class);
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
                                                                        ileri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                Intent i=new Intent(Sayilar.this, Renkler.class);
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












    @Override
    public void onInit(int status) {

        textToSpeech.setOnUtteranceCompletedListener(this);
    }

    @Override
    public void onUtteranceCompleted(String utteranceId) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //Toast.makeText(Sayilar.this, "Utterence completed", Toast.LENGTH_LONG).show();
                image_dinleme.setVisibility(ImageView.VISIBLE);

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
