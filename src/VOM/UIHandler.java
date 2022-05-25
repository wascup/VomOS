package VOM;

import VOM.Panels.GPS;
import VOM.Panels.Home;

import javax.swing.*;

public class UIHandler extends JFrame {
    boolean debug = true;
    Home homePanel = new Home();
    GPS gpsPanel = new GPS();

    public UIHandler() {
        add(homePanel);
        if(debug)
        {
            setSize(1280,720);
        }
        setVisible(true);
    }
}
