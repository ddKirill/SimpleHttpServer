package simplehttpserver;



public class Main {

    public static void main(String[] args) {

        new Server((req, resp) -> {
            return "<html><body><h1>Hello, simpleHttp<h1></bode></html>";
        }).bootstrap();
    }

}

