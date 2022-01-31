import java.awt.*;

public class Lines extends Canvas {
    public Lines (){
        setBackground(Color.red);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.drawLine(10, 10, 630, 10);


    }
}
