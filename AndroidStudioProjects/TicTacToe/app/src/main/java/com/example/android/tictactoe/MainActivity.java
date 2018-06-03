package com.example.android.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, resetButton;
    TextView displayingInfo;
    boolean whoISPlaying = true, win = false;
    int displayCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find view that shows text view button
        displayingInfo = (TextView) findViewById(R.id.text_view);

        //Find view that shows image button 1 i.e first row frst column button
        b1 = (Button) findViewById(R.id.button_1);

        //Find view that shows image button 2 i.e first row second column button
        b2 = (Button) findViewById(R.id.button_2);

        //Find view that shows image button 3 i.e first row third column button
        b3 = (Button) findViewById(R.id.button_3);

        //Find view that shows image button 4 i.e second row frst column button
        b4 = (Button) findViewById(R.id.button_4);

        //Find view that shows image button 5 i.e second row second column button
        b5 = (Button) findViewById(R.id.button_5);

        //Find view that shows image button 6 i.e second row third column button
        b6 = (Button) findViewById(R.id.button_6);

        //Find view that shows image button 7 i.e third row frst column button
        b7 = (Button) findViewById(R.id.button_7);

        //Find view that shows image button 8 i.e third row second column button
        b8 = (Button) findViewById(R.id.button_8);

        //Find view that shows image button 9 i.e third row third column button
        b9 = (Button) findViewById(R.id.button_9);
        resetButton = (Button) findViewById(R.id.play_again);

        //        set a clicklistener on that view
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (b1.getText().toString().equals("-")) {

                    displayCount++;
                    if (whoISPlaying) {
                        b1.setText("X");
                        whoISPlaying = false;
                    } else {
                        b1.setText("O");
                        whoISPlaying = true;
                    }
                } else if (b1.getText().toString().equals("X") || b1.getText().toString().equals("O")) {

                    Toast.makeText(MainActivity.this, "Can't be modified, if u want to start freshly click play again", Toast.LENGTH_SHORT).show();
                }

                winLooseLogic();
            }
        });

        //        set a clicklistener on that view
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (b2.getText().toString().equals("-")) {

                    displayCount++;
                    if (whoISPlaying) {
                        b2.setText("X");
                        whoISPlaying = false;

                    } else {
                        b2.setText("O");
                        whoISPlaying = true;
                    }
                } else if (b2.getText().toString().equals("X") || b2.getText().toString().equals("O")) {

                    Toast.makeText(MainActivity.this, "Can't be modified, if u want to start freshly click play again", Toast.LENGTH_SHORT).show();
                }

                winLooseLogic();
            }

        });

        //        set a clicklistener on that view
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (b3.getText().toString().equals("-")) {

                    displayCount++;
                    if (whoISPlaying) {
                        b3.setText("X");
                        whoISPlaying = false;
                    } else {
                        b3.setText("O");
                        whoISPlaying = true;
                    }
                } else if (b3.getText().toString().equals("X") || b3.getText().toString().equals("O")) {

                    Toast.makeText(MainActivity.this, "Can't be modified, if u want to start freshly click play again", Toast.LENGTH_SHORT).show();
                }

                winLooseLogic();
            }
        });

        //        set a clicklistener on that view
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (b4.getText().toString().equals("-")) {

                    displayCount++;
                    if (whoISPlaying) {
                        b4.setText("X");
                        whoISPlaying = false;
                    } else {
                        b4.setText("O");
                        whoISPlaying = true;
                    }
                } else if (b4.getText().toString().equals("X") || b4.getText().toString().equals("O")) {

                    Toast.makeText(MainActivity.this, "Can't be modified, if u want to start freshly click play again", Toast.LENGTH_SHORT).show();
                }

                winLooseLogic();
            }
        });

        //        set a clicklistener on that view
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (b5.getText().toString().equals("-")) {

                    displayCount++;
                    if (whoISPlaying) {
                        b5.setText("X");
                        whoISPlaying = false;
                    } else {
                        b5.setText("O");
                        whoISPlaying = true;
                    }
                } else if (b5.getText().toString().equals("X") || b5.getText().toString().equals("O")) {

                    Toast.makeText(MainActivity.this, "Can't be modified, if u want to start freshly click play again", Toast.LENGTH_SHORT).show();
                }

                winLooseLogic();
            }

        });

        //        set a clicklistener on that view
        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (b6.getText().toString().equals("-")) {

                    displayCount++;
                    if (whoISPlaying) {
                        b6.setText("X");
                        whoISPlaying = false;
                    } else {
                        b6.setText("O");
                        whoISPlaying = true;
                    }
                } else if (b6.getText().toString().equals("X") || b6.getText().toString().equals("O")) {

                    Toast.makeText(MainActivity.this, "Can't be modified, if u want to start freshly click play again", Toast.LENGTH_SHORT).show();
                }

                winLooseLogic();
            }
        });

        //        set a clicklistener on that view
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (b7.getText().toString().equals("-")) {

                    displayCount++;
                    if (whoISPlaying) {
                        b7.setText("X");
                        whoISPlaying = false;
                    } else {
                        b7.setText("O");
                        whoISPlaying = true;
                    }
                } else if (b7.getText().toString().equals("X") || b7.getText().toString().equals("O")) {

                    Toast.makeText(MainActivity.this, "Can't be modified, if u want to start freshly click play again", Toast.LENGTH_SHORT).show();
                }

                winLooseLogic();
            }
        });

        //        set a clicklistener on that view
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (b8.getText().toString().equals("-")) {

                    displayCount++;
                    if (whoISPlaying) {
                        b8.setText("X");
                        whoISPlaying = false;
                    } else {
                        b8.setText("O");
                        whoISPlaying = true;
                    }
                } else if (b8.getText().toString().equals("X") || b8.getText().toString().equals("O")) {

                    Toast.makeText(MainActivity.this, "Can't be modified, if u want to start freshly click play again", Toast.LENGTH_SHORT).show();
                }

                winLooseLogic();
            }
        });

        //        set a clicklistener on that view
        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (b9.getText().toString().equals("-")) {

                    displayCount++;
                    if (whoISPlaying) {
                        b9.setText("X");
                        whoISPlaying = false;
                    } else {
                        b9.setText("O");
                        whoISPlaying = true;
                    }
                } else if (b9.getText().toString().equals("X") || b9.getText().toString().equals("O")) {

                    Toast.makeText(MainActivity.this, "Can't be modified, if u want to start freshly click play again", Toast.LENGTH_SHORT).show();
                }

                winLooseLogic();
            }
        });

        //        set a clicklistener on that view
        resetButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                win = false;
                whoISPlaying = true;
                b1.setText("-");
                b2.setText("-");
                b3.setText("-");
                b4.setText("-");
                b5.setText("-");
                b6.setText("-");
                b7.setText("-");
                b8.setText("-");
                b9.setText("-");
            }

        });
    }

    public void winLooseLogic() {

        String a, b, c, d, e, f, g, h, i;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if(a.equals("X") && b.equals("X") && c.equals("X")) {

            Toast.makeText(MainActivity.this, " Winner : Player 1 ", Toast.LENGTH_SHORT).show();
            win = true;
        }

        else if(a.equals("X") && d.equals("X") && g.equals("X")){

            Toast.makeText(MainActivity.this, " Winner : Player 1 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(b.equals("X") && e.equals("X") && h.equals("X")){

            Toast.makeText(MainActivity.this, " Winner : Player 1 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(a.equals("X") && e.equals("X") && i.equals("X")){

            Toast.makeText(MainActivity.this, " Winner : Player 1 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(c.equals("X") && f.equals("X") && i.equals("X")){

            Toast.makeText(MainActivity.this, " Winner : Player 1 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(c.equals("X") && e.equals("X") && g.equals("X")) {

            Toast.makeText(MainActivity.this, " Winner : Player 1 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(d.equals("X") && e.equals("X") && f.equals("X")){

            Toast.makeText(MainActivity.this, " Winner : Player 1 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(g.equals("X") && h.equals("X") && i.equals("X")){

            Toast.makeText(MainActivity.this, " Winner : Player 1 ", Toast.LENGTH_SHORT).show();
            win = true;

        }


        else if(a.equals("O") && b.equals("O") && c.equals("O")) {

            Toast.makeText(MainActivity.this, " Winner : Player 2 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(a.equals("O") && d.equals("O") && g.equals("O")){

            Toast.makeText(MainActivity.this, " Winner : Player 2 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(b.equals("O") && e.equals("O") && h.equals("O")){

            Toast.makeText(MainActivity.this, " Winner : Player 2 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(a.equals("O") && e.equals("O") && i.equals("O")){

            Toast.makeText(MainActivity.this, " Winner : Player 2 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(c.equals("O") && f.equals("O") && i.equals("O")){

            Toast.makeText(MainActivity.this, " Winner : Player 2 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(c.equals("O") && e.equals("O") && g.equals("O")) {

            Toast.makeText(MainActivity.this, " Winner : Player 2 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(d.equals("O") && e.equals("O") && f.equals("O")){

            Toast.makeText(MainActivity.this, " Winner : Player 2 ", Toast.LENGTH_SHORT).show();
            win = true;

        }

        else if(g.equals("O") && h.equals("O") && i.equals("O")){

            Toast.makeText(MainActivity.this, " Winner : Player 2 ", Toast.LENGTH_SHORT).show();
            win = true;

        }
        else{

            if(displayCount == 9){

                win = true;
                Toast.makeText(MainActivity.this, "Draw", Toast.LENGTH_SHORT).show();
            }

        }


        if(win){

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }


    }

}