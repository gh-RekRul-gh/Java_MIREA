import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FPanel extends JPanel {
    FPanel(){
        this.setPreferredSize(new Dimension(900, 500));
    }
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D gr = (Graphics2D) graphics;
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            int shape = random.nextInt(0, 2);
            int red = random.nextInt(0, 256);
            int green = random.nextInt(0, 256);
            int blue = random.nextInt(0, 256);
            int x = random.nextInt(0, 850);
            int y = random.nextInt(0, 450);
            Color color = new Color(red, green, blue);
            switch (shape) {
                case 0: {
                    Square square = new Square(x, y, random.nextInt(50), color);
                    square.draw(gr);
                }
                case 1: {
                    Circle circle = new Circle(x, y, random.nextInt(50), color);
                    circle.draw(gr);
                }
            }
        }
    }
}