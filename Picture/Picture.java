
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square grass;
    private Square window;
    private Square window2;
    private Square door;
    private Square doorKnob;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square base;
    private Triangle trunk;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.changeColor("blue");
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        window2 = new Square();
        window2.changeColor("white");
        window2.moveHorizontal(60);
        window2.moveVertical(100);
        window2.makeVisible();

        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(30);
        door.moveVertical(140);
        door.changeSize(40);
        door.makeVisible();
        
        doorKnob = new Square();
        doorKnob.changeColor("yellow");
        doorKnob.moveHorizontal(35);
        doorKnob.moveVertical(150);
        doorKnob.changeSize(5);
        doorKnob.makeVisible();

        roof = new Triangle();
        roof.changeColor("yellow");
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        moon = new Circle();
        moon.changeColor("yellow");
        moon.moveHorizontal(170);
        moon.changeSize(60);
        moon.makeVisible();

        base = new Square();
        base.changeColor("red");
        base.changeSize(40);
        base.moveHorizontal(140);
        base.moveVertical(180);
        base.makeVisible();

        trunk = new Triangle();
        trunk.changeColor("green");
        trunk.changeSize(90, 50);
        trunk.moveHorizontal(170);
        trunk.moveVertical(140);
        trunk.makeVisible();

        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
