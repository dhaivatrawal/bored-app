package com.zedr.dhaivat.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout clkone,clktwo,clkthree,clkfour,clkfive,clksix,clkseven,clkeight,clknine;
    ImageView share,rateMe;
    private ImageView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clkone = findViewById(R.id.clkone);
        clktwo = findViewById(R.id.clktwo);
        clkthree = findViewById(R.id.clkthree);
        clkfour = findViewById(R.id.clkfour);
        clkfive = findViewById(R.id.clkfive);
        clksix = findViewById(R.id.clksix);
        clkseven = findViewById(R.id.clkseven);
        clkeight = findViewById(R.id.clkeight);
        clknine = findViewById(R.id.clknine);


        // Set up the user interaction to manually show or hide the system UI.


        clkone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),One.class);
                startActivity(intent);
            }
        });

        clktwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Two.class);
                startActivity(intent);
            }
        });
        clkthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Three.class);
                startActivity(intent);
            }
        });
        clkfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Four.class);
                startActivity(intent);
            }
        });
        clkfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Five.class);
                startActivity(intent);
            }
        });
        clksix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Six.class);
                startActivity(intent);
            }
        });
        clkseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Seven.class);
                startActivity(intent);
            }
        });
        clkeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Eight.class);
                startActivity(intent);
            }
        });
        clknine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Nine.class);
                startActivity(intent);
            }
        });


        ImageView share=findViewById(R.id.share);
        ImageView rateMe=findViewById(R.id.rateMe);

        rateMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Intent.ACTION_SEND);
                final  String appPackageNAm = getApplicationContext().getPackageName();
                String strAppLink ="";
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=" + appPackageNAm)));
                } catch (android.content.ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + appPackageNAm)));
                }
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_SEND);
                final  String appPackageNAme = getApplicationContext().getPackageName();
                String strAppLink ="";

                try
                {
                    strAppLink = "http://play.google.com/store/apps/details?id=" + appPackageNAme;
                }
                catch (android.content.ActivityNotFoundException anfe)
                {
                    strAppLink = "https:/play.google.com/store/apps/details?id=" + appPackageNAme;
                }
                a.setType("text/link");
                String sharebody = "This App is basically on different tasks and works to make you happy, creative and innovative and make your free time a happy time.\n\n"+"-Different Ideas\n"+"-Innovative Tasks\n"+"-New Creations\n"+"-Works that make you Happy\n"+"-Handling Your Moods\n\n" +
                        " Please Comment and Rate Us." + "Download this Exclusive application and Share it." + "\n\n"+""+strAppLink;
                String sharesub = "APP NAME ";
                a.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                a.putExtra(Intent.EXTRA_TEXT,sharebody);
                startActivity(Intent.createChooser(a,"Share Using"));
            }

        });

        button = (ImageView) findViewById(R.id.buttonShowCustomDialog);

        // add button listener
        button.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom);

                // set the custom dialog components - text, image and button
                TextView title_law = (TextView) dialog.findViewById(R.id.title_law);
                title_law.setText("Feeling Bored - Do something Creative !");
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("This App is basically on different tasks and works to make you happy, creative and innovative and make your free time a happy time.\n\n"+"-Different Ideas\n"+"-Innovative Tasks\n"+"-New Creations\n"+"-Works that make you Happy\n"+"-Handling Your Moods\n");
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.iconlogo);

                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.setCanceledOnTouchOutside(false);
                dialog.show();
            }
        });


    }
}
