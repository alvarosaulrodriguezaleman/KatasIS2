package kata7;

import java.awt.Point;
import java.util.Observable;
import java.util.Observer;

public class WatchPresenter implements Observer {
    private final Watch watch;
    private final WatchDisplay watchDisplay;

    public WatchPresenter(Watch watch, WatchDisplay watchDisplay) {
        this.watch = watch;
        this.watchDisplay = watchDisplay;
        this.watchDisplay.paint(pointsOf(watch));
        this.watch.add(this);
    }

    @Override
    public void update(Observable o, Object o1) {
        refreshDisplay();
    }

    private void refreshDisplay() {
        watchDisplay.paint(pointsOf(watch));
    }
    
    private Point[] pointsOf(Watch watch) {
        Point[] points = new Point[3];
        points[0] = pointOf(watch.getSeconds(), 150);
        points[1] = pointOf(watch.getMinutes(), 80);
        points[2] = pointOf(watch.getHours(), 40);
        return points;
    }    

    private Point pointOf(double angle, int length) {
        return new Point(toInt(Math.cos(angle)*length), toInt(Math.sin(angle)*length));
    }
    
    private int toInt(double value) {
        return (int) value;
    }
}
