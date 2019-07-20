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
import com.github.siyamed.shapeimageview.ShapeImageView;
import java.util.HashMap;

public class Aile extends AppCompatActivity  implements TextToSpeech.OnInitListener, TextToSpeech.OnUtteranceCompletedListener  {

    ImageView image_aile;
    ImageView geri_butonu, ileri_butonu;
    TextView text_aile;
    TextToSpeech textToSpeech;
    ImageView dinleme_butonu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aile);

        image_aile=(ImageView)findViewById(R.id.aile);
        geri_butonu=(ImageView)findViewById(R.id.geributonu_aile);
        ileri_butonu=(ImageView)findViewById(R.id.ileributonu_aile);
        text_aile=(TextView)findViewById(R.id.txt_aile);
        textToSpeech=new TextToSpeech(Aile.this, Aile.this);
        dinleme_butonu=(ImageView)findViewById(R.id.dinleme_butonu);

        dinleme_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textToSpeech.isSpeaking()){
                    HashMap<String, String> stringStringHashMap=new HashMap<String, String>();
                    stringStringHashMap.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "Helo how are you");
                    textToSpeech.speak(text_aile.getText().toString(), TextToSpeech.QUEUE_ADD, stringStringHashMap);
                    dinleme_butonu.setVisibility(Button.VISIBLE);
                }
                else{
                    textToSpeech.stop();
                }
            }
        });

        image_aile.setImageResource(R.drawable.anne);
        geri_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Aile.this, MainActivity.class);
                startActivity(i);
            }
        });
        ileri_butonu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               image_aile.setImageResource(R.drawable.baba);
               text_aile.setText("FATHER");
               geri_butonu.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       text_aile.setText("MOTHER");
                       image_aile.setImageResource(R.drawable.anne);
                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View v) {
                               Intent i=new Intent(Aile.this, MainActivity.class);
                               startActivity(i);
                           }
                       });
                   }
               });
               ileri_butonu.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       image_aile.setImageResource(R.drawable.erkekkardes);
                       text_aile.setText("BROTHER");
                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View v) {
                               text_aile.setText("FATHER");
                               image_aile.setImageResource(R.drawable.baba);
                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       text_aile.setText("MOTHER");
                                       image_aile.setImageResource(R.drawable.anne);
                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent i=new Intent(Aile.this, MainActivity.class);
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
                               image_aile.setImageResource(R.drawable.kizkardes);
                               text_aile.setText("SISTER");
                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       text_aile.setText("BROTHER");
                                       image_aile.setImageResource(R.drawable.erkekkardes);
                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               text_aile.setText("FATHER");
                                               image_aile.setImageResource(R.drawable.baba);
                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       text_aile.setText("MOTHER");
                                                       image_aile.setImageResource(R.drawable.anne);
                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View v) {
                                                               Intent i=new Intent(Aile.this, MainActivity.class);
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
                                       image_aile.setImageResource(R.drawable.buyukanne);
                                       text_aile.setText("GRANDMOTHER");
                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               text_aile.setText("SISTER");
                                               image_aile.setImageResource(R.drawable.kizkardes);
                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       text_aile.setText("BROTHER");
                                                       image_aile.setImageResource(R.drawable.erkekkardes);
                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View v) {
                                                               text_aile.setText("FATHER");
                                                               image_aile.setImageResource(R.drawable.baba);
                                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                   @Override
                                                                   public void onClick(View v) {
                                                                       text_aile.setText("MOTHER");
                                                                       image_aile.setImageResource(R.drawable.anne);
                                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                           @Override
                                                                           public void onClick(View v) {
                                                                               Intent i=new Intent(Aile.this, MainActivity.class);
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
                                               image_aile.setImageResource(R.drawable.buyukbaba);
                                               text_aile.setText("GRANDFATHER");
                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       text_aile.setText("GRANDMOTHER");
                                                       image_aile.setImageResource(R.drawable.buyukanne);
                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View v) {
                                                               text_aile.setText("SISTER");
                                                               image_aile.setImageResource(R.drawable.kizkardes);
                                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                   @Override
                                                                   public void onClick(View v) {
                                                                       text_aile.setText("BROTHER");
                                                                       image_aile.setImageResource(R.drawable.erkekkardes);
                                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                           @Override
                                                                           public void onClick(View v) {
                                                                               text_aile.setText("FATHER");
                                                                               image_aile.setImageResource(R.drawable.baba);
                                                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                   @Override
                                                                                   public void onClick(View v) {
                                                                                       text_aile.setText("MOTHER");
                                                                                       image_aile.setImageResource(R.drawable.anne);
                                                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                           @Override
                                                                                           public void onClick(View v) {
                                                                                               Intent i=new Intent(Aile.this, MainActivity.class);
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
                                                       image_aile.setImageResource(R.drawable.teyze);
                                                       text_aile.setText("AUNT");
                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View v) {
                                                               text_aile.setText("GRANDFATHER");
                                                               image_aile.setImageResource(R.drawable.buyukbaba);
                                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                   @Override
                                                                   public void onClick(View v) {
                                                                       text_aile.setText("GRANDMOTHER");
                                                                       image_aile.setImageResource(R.drawable.buyukanne);
                                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                           @Override
                                                                           public void onClick(View v) {
                                                                               text_aile.setText("SISTER");
                                                                               image_aile.setImageResource(R.drawable.kizkardes);
                                                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                   @Override
                                                                                   public void onClick(View v) {
                                                                                       text_aile.setText("BROTHER");
                                                                                       image_aile.setImageResource(R.drawable.erkekkardes);
                                                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                           @Override
                                                                                           public void onClick(View v) {
                                                                                               text_aile.setText("FATHER");
                                                                                               image_aile.setImageResource(R.drawable.baba);
                                                                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                   @Override
                                                                                                   public void onClick(View v) {
                                                                                                       text_aile.setText("MOTHER");
                                                                                                       image_aile.setImageResource(R.drawable.anne);
                                                                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                           @Override
                                                                                                           public void onClick(View v) {
                                                                                                               Intent i=new Intent(Aile.this, MainActivity.class);
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
                                                               image_aile.setImageResource(R.drawable.amca);
                                                               text_aile.setText("UNCLE");
                                                               ileri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                   @Override
                                                                   public void onClick(View v) {
                                                                       Intent i=new Intent(Aile.this, MainActivity.class);
                                                                       startActivity(i);
                                                                   }
                                                               });
                                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                   @Override
                                                                   public void onClick(View v) {
                                                                       text_aile.setText("AUNT");
                                                                       image_aile.setImageResource(R.drawable.teyze);
                                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                           @Override
                                                                           public void onClick(View v) {
                                                                               text_aile.setText("GRANDFATHER");
                                                                               image_aile.setImageResource(R.drawable.buyukbaba);
                                                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                   @Override
                                                                                   public void onClick(View v) {
                                                                                       text_aile.setText("GRANDMOTHER");
                                                                                       image_aile.setImageResource(R.drawable.buyukanne);
                                                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                           @Override
                                                                                           public void onClick(View v) {
                                                                                               text_aile.setText("SISTER");
                                                                                               image_aile.setImageResource(R.drawable.kizkardes);
                                                                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                   @Override
                                                                                                   public void onClick(View v) {
                                                                                                       text_aile.setText("BROTHER");
                                                                                                       image_aile.setImageResource(R.drawable.erkekkardes);
                                                                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                           @Override
                                                                                                           public void onClick(View v) {
                                                                                                               text_aile.setText("FATHER");
                                                                                                               image_aile.setImageResource(R.drawable.baba);
                                                                                                               geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                   @Override
                                                                                                                   public void onClick(View v) {
                                                                                                                       text_aile.setText("MOTHER");
                                                                                                                       image_aile.setImageResource(R.drawable.anne);
                                                                                                                       geri_butonu.setOnClickListener(new View.OnClickListener() {
                                                                                                                           @Override
                                                                                                                           public void onClick(View v) {
                                                                                                                               Intent i=new Intent(Aile.this, MainActivity.class);
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
