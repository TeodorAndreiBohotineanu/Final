package Main.level.tile;

import Main.Graphics.Screen;
import Main.Graphics.Sprite;

public class VoidTile extends Tile
{
    public VoidTile(Sprite sprite)
    {
        super(sprite);
    }
    public void render (int x, int y, Screen screen)
    {
        screen.renderTile(x * 16,y * 16,this);
    }
}
