import java.awt.*;

public class Circle extends Shape {
    int radius;
    public Circle(int x, int y, int r, Color color){
        this.posy = y;
        this.posx = x;
        this.color = color;
        this.radius = r;
    }
    public void draw(Graphics2D g){
        g.setColor(color);
        g.fillOval(posx, posy, radius *2, radius *2);
    }
}