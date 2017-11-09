package example.codeclan.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameActivity extends AppCompatActivity {

    private TextView choose;
    private Button rock;
    private Button paper;
    private Button scissors;

    private TextView playerScore;
    private TextView comScore;

    Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        choose = (TextView)findViewById(R.id.choose);
        rock = (Button)findViewById(R.id.rock);
        paper = (Button)findViewById(R.id.paper);
        scissors = (Button)findViewById(R.id.scissors);

        playerScore = (TextView)findViewById(R.id.your_score);
        comScore = (TextView)findViewById(R.id.com_score);
    }

    public void makeChoice(View button){
        Button butt = (Button)button;
        game.runGame(butt.getText().toString());
        playerScore.setText("YOU: " + game.getPlayerScore());
        comScore.setText("COM: " + game.getComScore());
        choose.setText(game.giveResults());
    }
}
