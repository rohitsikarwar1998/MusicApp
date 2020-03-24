package com.example.musicapp;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int mSoundIda;
    private int mSoundIdb;
    private int mSoundIdc;
    private int mSoundIdd;
    private int mSoundIde;
    private int mSoundIdf;
    private int mSoundIdg;

    private SoundPool mSoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudioAttributes aa=new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build();
        mSoundPool=new SoundPool.Builder()
                .setAudioAttributes(aa)
                .setMaxStreams(7)
                .build();

        final int[] array={
                R.raw.note1_c,
                R.raw.note2_d,
                R.raw.note3_e,
                R.raw.note4_f,
                R.raw.note5_g,
                R.raw.note6_a,
                R.raw.note7_b
        };
        mSoundIdc=mSoundPool.load(this,array[0],1);
        mSoundIdd=mSoundPool.load(this,array[1],1);
        mSoundIde=mSoundPool.load(this,array[2],1);
        mSoundIdf=mSoundPool.load(this,array[3],1);
        mSoundIdg=mSoundPool.load(this,array[4],1);
        mSoundIda=mSoundPool.load(this,array[5],1);
        mSoundIdb=mSoundPool.load(this,array[6],1);
    }


    public void buttonClick(View v) {
        if(v.getId()==R.id.c_key){
            mSoundPool.play(mSoundIdc,1.0f,1.0f,0,0,1.0f);
        }
        else if(v.getId()==R.id.d_key){
            mSoundPool.play(mSoundIdd,1.0f,1.0f,0,0,1.0f);
        }
        else if(v.getId()==R.id.e_key){
            mSoundPool.play(mSoundIde,1.0f,1.0f,0,0,1.0f);
        }
        else if(v.getId()==R.id.f_key){
            mSoundPool.play(mSoundIdf,1.0f,1.0f,0,0,1.0f);
        }
        else if(v.getId()==R.id.g_key){
            mSoundPool.play(mSoundIdg,1.0f,1.0f,0,0,1.0f);
        }
        else if(v.getId()==R.id.a_key){
            mSoundPool.play(mSoundIda,1.0f,1.0f,0,0,1.0f);
        }
        else{
            mSoundPool.play(mSoundIdb,1.0f,1.0f,0,0,1.0f);
        }
    }
}
