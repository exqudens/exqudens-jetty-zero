package exqudens.jetty;

import exqudens.jetty.servlet.ExampleServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Application {

    public static void main(String... args) {
        try {
            // host: 'http://localhost:8080/example'
            Server server = new Server(8080);
            ServletContextHandler handler = new ServletContextHandler(server, "/example");
            handler.addServlet(ExampleServlet.class, "/");
            server.start();
        } catch (RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

}
