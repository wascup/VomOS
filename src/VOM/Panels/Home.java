package VOM.Panels;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    JButton gpsButton = new JButton("GPS");
    JButton mediaButton = new JButton("Media");
    Color backgroundColor = Color.decode("#424242");
    public Home() {
        setBackground(backgroundColor);
        setForeground(Color.WHITE);
        add(gpsButton);
        add(mediaButton);
    }

}
