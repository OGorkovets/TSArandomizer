package ogorkovets.greenrivertech.net.tsarandomizer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (ImageButton) findViewById(R.id.button);
    }

    public void randomizer(View view) {
        int choice = random.nextInt(100) + 1;
        if ((choice & 1) == 0) {
            new CountDownTimer(2000, 1000) {
                public void onTick(long millisUntilFinished) {
                    button.setImageResource(R.drawable.arrow_left);
                }
                public void onFinish() {
                    button.setImageResource(R.drawable.press);
                }
            }.start();
        } else {
            new CountDownTimer(2000, 1000) {
                public void onTick(long millisUntilFinished) {
                    button.setImageResource(R.drawable.arrow_right);
                }
                public void onFinish() {
                    button.setImageResource(R.drawable.press);
                }
            }.start();
        }
    }
}
