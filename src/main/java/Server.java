import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8084/BanqueWS", new BanqueService());
        System.out.println("Web service deployed on http://0.0.0.0:8084/BanqueWS");
    }
}