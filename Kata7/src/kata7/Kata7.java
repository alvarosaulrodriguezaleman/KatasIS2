package kata7;

import javax.swing.JFrame;

public class Kata7 extends JFrame {

    public static void main(String[] args) {
        new Kata7().launch();
    }

    public Kata7() {
        Watch watch = new Watch();
        WatchDisplay watchDisplay = new WatchDisplay();
        new WatchPresenter(watch, watchDisplay);
        this.setTitle("Watch");
        this.setSize(350, 350);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(watchDisplay);
    }
    
    public void launch() {
        this.setVisible(true);
    }
}
