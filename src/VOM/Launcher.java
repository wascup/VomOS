package VOM;

public class Launcher {
    public static void main(String[] args) {
        new Launcher();
    }
    Server VOMServer;
    UIHandler VOMUI;

    public Launcher() {
        try {
            VOMUI = new UIHandler();
            //VOMServer = new Server();
        }
        catch(Exception e) {
            System.out.println("Failed to load a Module");
        }

    }

}
