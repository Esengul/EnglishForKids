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


public class Meslekler extends AppCompatActivity implements TextToSpeech.OnInitListener, TextToSpeech.OnUtteranceCompletedListener{
    ImageView ileri_butonu, geri_butonu;
    ImageView meslekler_image;
    TextView txt_meslekler;
    TextToSpeech textToSpeech;
    ImageView hayvanlar_dinleme;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meslekler);

        ileri_butonu=(ImageView)findViewById(R.id.buton_ileri);
        geri_butonu=(ImageView)findViewById(R.id.buton_geri);
        meslekler_image=(ImageView)findViewById(R.id.meslekler);
        txt_meslekler=(TextView)findViewById(R.id.txt_meslekler);
        textToSpeech=new TextToSpeech(Meslekler.this, Meslekler.this);
        hayvanlar_dinleme=(ImageView)findViewById(R.id.dinleme_butonu);

        hayvanlar_dinleme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textToSpeech.isSpeaking()){
                    HashMap<String, String> stringStringHashMap=new HashMap<String, String>();
                    stringStringHashMap.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "Helo how are you");
                    textToSpeech.speak(txt_meslekler.getText().toString(), TextToSpeech.QUEUE_ADD, stringStringHashMap);
                    hayvanlar_dinleme.setVisibility(Button.VISIBLE);
                }
                else{
                    textToSpeech.stop();
                }
            }
        });





        meslekler_image.setImageResource(R.drawable.doktor);
        geri_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Meslekler.this, MainActivity.class);
                startActivity(i);
            }
        });

        ileri_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meslekler_image.setImageResource(R.drawable.polis);
                txt_meslekler.setText("POLICE");
                geri_butonu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt_meslekler.setText("DOCTOR");
                        meslekler_image.setImageResource(R.drawable.doktor);
                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i=new Intent(Meslekler.this, MainActivity.class);
                                startActivity(i);
                            }
                        });
                    }
                });
                ileri_butonu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        meslekler_image.setImageResource(R.drawable.itfaiyeci);
                        txt_meslekler.setText("FIREMAN");
                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                txt_meslekler.setText("POLICE");
                                meslekler_image.setImageResource(R.drawable.polis);
                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        txt_meslekler.setText("DOCTOR");
                                        meslekler_image.setImageResource(R.drawable.doktor);
                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent i=new Intent(Meslekler.this, MainActivity.class);
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
                                meslekler_image.setImageResource(R.drawable.ogretmen);
                                txt_meslekler.setText("TEACHER");
                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        txt_meslekler.setText("FIREMAN");
                                        meslekler_image.setImageResource(R.drawable.itfaiyeci);
                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                txt_meslekler.setText("POLICE");
                                                meslekler_image.setImageResource(R.drawable.polis);
                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        txt_meslekler.setText("DOCTOR");
                                                        meslekler_image.setImageResource(R.drawable.doktor);
                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                Intent i=new Intent(Meslekler.this, MainActivity.class);
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
                                        meslekler_image.setImageResource(R.drawable.pilot);
                                        txt_meslekler.setText("PILOT");
                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                txt_meslekler.setText("TEACHER");
                                                meslekler_image.setImageResource(R.drawable.ogretmen);
                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        txt_meslekler.setText("FIREMAN");
                                                        meslekler_image.setImageResource(R.drawable.itfaiyeci);
                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                txt_meslekler.setText("POLICE");
                                                                meslekler_image.setImageResource(R.drawable.polis);
                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        txt_meslekler.setText("DOCTOR");
                                                                        meslekler_image.setImageResource(R.drawable.doktor);
                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                Intent i=new Intent(Meslekler.this, MainActivity.class);
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
                                                meslekler_image.setImageResource(R.drawable.dishekimi);
                                                txt_meslekler.setText("DENTIST");
                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        txt_meslekler.setText("PILOT");
                                                        meslekler_image.setImageResource(R.drawable.pilot);
                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                txt_meslekler.setText("TEACHER");
                                                                meslekler_image.setImageResource(R.drawable.ogretmen);
                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        txt_meslekler.setText("FIREMAN");
                                                                        meslekler_image.setImageResource(R.drawable.itfaiyeci);
                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                txt_meslekler.setText("POLICE");
                                                                                meslekler_image.setImageResource(R.drawable.polis);
                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        txt_meslekler.setText("DOCTOR");
                                                                                        meslekler_image.setImageResource(R.drawable.doktor);
                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                Intent i=new Intent(Meslekler.this, MainActivity.class);
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
                                                        meslekler_image.setImageResource(R.drawable.muhendis);
                                                        txt_meslekler.setText("ENGINEER");
                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                txt_meslekler.setText("DENTİST");
                                                                meslekler_image.setImageResource(R.drawable.dishekimi);
                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        txt_meslekler.setText("PILOT");
                                                                        meslekler_image.setImageResource(R.drawable.pilot);
                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                txt_meslekler.setText("TEACHER");
                                                                                meslekler_image.setImageResource(R.drawable.ogretmen);
                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        txt_meslekler.setText("FIREMAN");
                                                                                        meslekler_image.setImageResource(R.drawable.itfaiyeci);
                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                txt_meslekler.setText("POLICE");
                                                                                                meslekler_image.setImageResource(R.drawable.polis);
                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        txt_meslekler.setText("DOCTOR");
                                                                                                        meslekler_image.setImageResource(R.drawable.doktor);
                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {
                                                                                                                Intent i=new Intent(Meslekler.this, MainActivity.class);
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
                                                                meslekler_image.setImageResource(R.drawable.hemsire);
                                                                txt_meslekler.setText("NURSE");
                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        txt_meslekler.setText("ENGINEER");
                                                                        meslekler_image.setImageResource(R.drawable.muhendis);
                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                txt_meslekler.setText("DENTIST");
                                                                                meslekler_image.setImageResource(R.drawable.dishekimi);
                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        txt_meslekler.setText("PILOT");
                                                                                        meslekler_image.setImageResource(R.drawable.pilot);
                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                txt_meslekler.setText("TEACHER");
                                                                                                meslekler_image.setImageResource(R.drawable.ogretmen);
                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        txt_meslekler.setText("FIREMAN");
                                                                                                        meslekler_image.setImageResource(R.drawable.itfaiyeci);
                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {
                                                                                                                txt_meslekler.setText("POLICE");
                                                                                                                meslekler_image.setImageResource(R.drawable.polis);
                                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                    @Override
                                                                                                                    public void onClick(View v) {
                                                                                                                        txt_meslekler.setText("DOCTOR");
                                                                                                                        meslekler_image.setImageResource(R.drawable.doktor);
                                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                Intent i=new Intent(Meslekler.this, MainActivity.class);
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
                                                                        meslekler_image.setImageResource(R.drawable.asci);
                                                                        txt_meslekler.setText("COOK");
                                                                        ileri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                Intent i=new Intent(Meslekler.this, Aile.class);
                                                                                startActivity(i);
                                                                            }
                                                                        });
                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                txt_meslekler.setText("NURSE");
                                                                                meslekler_image.setImageResource(R.drawable.hemsire);

                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                txt_meslekler.setText("ENGINEER");
                                                                                meslekler_image.setImageResource(R.drawable.muhendis);
                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        txt_meslekler.setText("DENTIST");
                                                                                        meslekler_image.setImageResource(R.drawable.dishekimi);
                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                txt_meslekler.setText("PILOT");
                                                                                                meslekler_image.setImageResource(R.drawable.pilot);
                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        txt_meslekler.setText("TEACHER");
                                                                                                        meslekler_image.setImageResource(R.drawable.ogretmen);
                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {
                                                                                                                txt_meslekler.setText("FIREMAN");
                                                                                                                meslekler_image.setImageResource(R.drawable.itfaiyeci);
                                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                    @Override
                                                                                                                    public void onClick(View v) {
                                                                                                                        txt_meslekler.setText("POLICE");
                                                                                                                        meslekler_image.setImageResource(R.drawable.polis);
                                                                                                                        geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                txt_meslekler.setText("DOCTOR");
                                                                                                                                meslekler_image.setImageResource(R.drawable.doktor);
                                                                                                                                geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                                    @Override
                                                                                                                                    public void onClick(View v) {
                                                                                                                                        Intent i=new Intent(Meslekler.this, MainActivity.class);
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
               // Toast.makeText(Meslekler.this, "Utterence completed", Toast.LENGTH_LONG).show();
                hayvanlar_dinleme.setVisibility(ImageView.VISIBLE);

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
