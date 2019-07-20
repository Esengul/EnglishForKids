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

public class Renkler extends AppCompatActivity implements TextToSpeech.OnInitListener, TextToSpeech.OnUtteranceCompletedListener {
    ImageView renkbalonları;
    ImageView imageViewgeri, imageViewileri;
    TextView textrenk;
    ImageView dinleme_butonu;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.renkler);

        textToSpeech=new TextToSpeech(Renkler.this, Renkler.this);
        renkbalonları=(ImageView)findViewById(R.id.renkbalonlari);
        imageViewgeri=(ImageView)findViewById(R.id.balongeri);
        imageViewileri=(ImageView)findViewById(R.id.balonileri);
        textrenk=(TextView)findViewById(R.id.textview_renk);
        dinleme_butonu=(ImageView)findViewById(R.id.dinlemebutonu);



        dinleme_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textToSpeech.isSpeaking()){
                    HashMap<String, String> stringStringHashMap=new HashMap<String, String>();
                    stringStringHashMap.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "Helo how are you");
                    textToSpeech.speak(textrenk.getText().toString(), TextToSpeech.QUEUE_ADD, stringStringHashMap);
                    dinleme_butonu.setVisibility(Button.VISIBLE);
                }
                else{
                    textToSpeech.stop();
                }
            }
        });




        renkbalonları.setImageResource(R.drawable.red);
        imageViewgeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Renkler.this, MainActivity.class);
                startActivity(i);
            }
        });

        imageViewileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                renkbalonları.setImageResource(R.drawable.turuncu);
                textrenk.setText("ORANGE");
                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textrenk.setText("RED");
                        renkbalonları.setImageResource(R.drawable.red);
                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i=new Intent(Renkler.this, MainActivity.class);
                                startActivity(i);
                            }
                        });


                    }
                });

                imageViewileri.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        renkbalonları.setImageResource(R.drawable.pembe);
                        textrenk.setText("PINK");
                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textrenk.setText("ORANGE");
                                renkbalonları.setImageResource(R.drawable.turuncu);
                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        textrenk.setText("RED");
                                        renkbalonları.setImageResource(R.drawable.red);
                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent i=new Intent(Renkler.this, MainActivity.class);
                                                startActivity(i);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        imageViewileri.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkbalonları.setImageResource(R.drawable.mavi);
                                textrenk.setText("BLUE");
                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        textrenk.setText("PINK");
                                        renkbalonları.setImageResource(R.drawable.pembe);
                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                textrenk.setText("ORANGE");
                                                renkbalonları.setImageResource(R.drawable.turuncu);
                                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        textrenk.setText("RED");
                                                        renkbalonları.setImageResource(R.drawable.red);
                                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                Intent i=new Intent(Renkler.this, MainActivity.class);
                                                                startActivity(i);
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                                imageViewileri.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        renkbalonları.setImageResource(R.drawable.sari);
                                        textrenk.setText("YELLOW");
                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                textrenk.setText("BLUE");
                                                renkbalonları.setImageResource(R.drawable.mavi);
                                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        textrenk.setText("PINK");
                                                        renkbalonları.setImageResource(R.drawable.pembe);
                                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                textrenk.setText("ORANGE");
                                                                renkbalonları.setImageResource(R.drawable.turuncu);
                                                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        textrenk.setText("RED");
                                                                        renkbalonları.setImageResource(R.drawable.red);
                                                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                Intent i=new Intent(Renkler.this, MainActivity.class);
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
                                        imageViewileri.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                renkbalonları.setImageResource(R.drawable.yesil);
                                                textrenk.setText("GREEN");
                                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        textrenk.setText("YELLOW");
                                                        renkbalonları.setImageResource(R.drawable.sari);
                                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                textrenk.setText("BLUE");
                                                                renkbalonları.setImageResource(R.drawable.mavi);
                                                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        textrenk.setText("PINK");
                                                                        renkbalonları.setImageResource(R.drawable.pembe);
                                                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                textrenk.setText("ORANGE");
                                                                                renkbalonları.setImageResource(R.drawable.turuncu);
                                                                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        textrenk.setText("RED");
                                                                                        renkbalonları.setImageResource(R.drawable.red);
                                                                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                Intent i=new Intent(Renkler.this, MainActivity.class);
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
                                                imageViewileri.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        renkbalonları.setImageResource(R.drawable.siyah);
                                                        textrenk.setText("BLACK");
                                                        imageViewileri.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                Intent i=new Intent(Renkler.this, Hayvanlar.class);
                                                                startActivity(i);
                                                            }
                                                        });
                                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                textrenk.setText("GREEN");
                                                                renkbalonları.setImageResource(R.drawable.yesil);
                                                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        textrenk.setText("YELLOW");
                                                                        renkbalonları.setImageResource(R.drawable.sari);
                                                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                textrenk.setText("BLUE");
                                                                                renkbalonları.setImageResource(R.drawable.mavi);
                                                                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        textrenk.setText("PINK");
                                                                                        renkbalonları.setImageResource(R.drawable.pembe);
                                                                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                textrenk.setText("ORANGE");
                                                                                                renkbalonları.setImageResource(R.drawable.turuncu);
                                                                                                imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        textrenk.setText("RED");
                                                                                                        renkbalonları.setImageResource(R.drawable.red);
                                                                                                        imageViewgeri.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {
                                                                                                                Intent i=new Intent(Renkler.this, MainActivity.class);
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


    @Override
    public void onInit(int status) {
        textToSpeech.setOnUtteranceCompletedListener(this);
    }

    @Override
    public void onUtteranceCompleted(String utteranceId) {

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
               // Toast.makeText(Renkler.this, "Utterence completed", Toast.LENGTH_LONG).show();
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
