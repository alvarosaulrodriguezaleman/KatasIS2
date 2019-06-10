package kata7;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JPanel;

public class WatchDisplay extends JPanel {
    Point[] points = new Point[0];
    
    public void paint(Point[] points) {
        this.points = points;
        repaint();
    }
            
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);
        int width = 1;
        int ox = getWidth()/2;
        int oy = getHeight()/2;
        for (Point point : points) {
            g2(g).setStroke(new BasicStroke(width++));
            g2(g).drawLine(ox, oy, ox - point.x, oy - point.y);
        }
        
    }

    private Graphics2D g2(Graphics g) {
        return (Graphics2D) g;
    }
}
