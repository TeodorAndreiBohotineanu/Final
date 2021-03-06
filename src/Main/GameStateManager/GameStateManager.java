package Main.GameStateManager;


import java.awt.*;
import java.util.ArrayList;

public class GameStateManager
{
    public static int currentState;
    private ArrayList<GameState> gameStates;
    public static final int MENUSTATE = 0;
    public static final int GAMESTATE = 1;
    public GameStateManager ( )
    {
        gameStates = new ArrayList<GameState>( );
        currentState = MENUSTATE;
        gameStates.add(new MenuState (this));
    }
    public void setState ( int state )
    {
        currentState = state;
        gameStates.get(currentState).render( );
    }
    public void update ( )
    {
        gameStates.get(currentState).update( );
    }
    public void draw(Graphics2D g)
    {
        gameStates.get(currentState).draw(g);
    }
    public void keyPressed ( int k )
    {
        gameStates.get(currentState).keyPressed( k );
    }
    public void keyReleased ( int k )
    {
        gameStates.get(currentState).keyReleased( k );
    }
}
