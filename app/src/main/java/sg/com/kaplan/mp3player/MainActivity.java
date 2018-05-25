package sg.com.kaplan.mp3player;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.loca);
        final Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {

            boolean isPlaying = false;

            @Override
            public void onClick(View view) {
                if(!isPlaying) {
                    b.setText(R.string.pause);
                    mp.start();
                } else {
                    b.setText(R.string.resume);
                    mp.pause();
                }

                isPlaying = !isPlaying;
            }
        });
    }
}
