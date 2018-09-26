package Main.Graphics;

public class AnimatedSprite extends Sprite
{
    private int frame = 0;
    private Sprite sprite;
    private int time = 0;
    private int rate = 5;
    private int lenght = -1;
    public AnimatedSprite (Spritesheet sheet, int width, int height, int lenght)
    {
        super(sheet, width, height);
        this.lenght = lenght;
        sprite = sheet.getSprites( )[0];
        if (lenght > sheet.getSprites( ).length)
            System.err.println("Error. Length of animation is too long!");
    }
    public void update ( )
    {
        time++;
        if (time % rate == 0)
        if (frame >= lenght - 1)
            frame = 0;
        else frame++;
        sprite = sheet.getSprites( )[frame];
    }
    public Sprite getSprite ( )
    {
        return sprite;
    }
    public void setFrameRate (int frames)
    {
        rate = frames;
    }
    public void render ( )
    {

    }
}
