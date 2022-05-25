package VOM;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Launcher {
    int port = 8080;
    public static void main(String[] args) {
        try {
            new Launcher();
        }
        catch(Exception e)
        {

        }
    }
    public Launcher() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        System.out.println("VomOS server loaded successfully " + port);
        server.createContext("/", new RootHandler());
        server.setExecutor(null);
        server.start();
    }
    public class RootHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange he) throws IOException {
            String response = "<h1>Server start success if you see this message</h1>" + "<h1>Port: " + port + "</h1>";
            he.sendResponseHeaders(200, response.length());
            OutputStream os = he.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
