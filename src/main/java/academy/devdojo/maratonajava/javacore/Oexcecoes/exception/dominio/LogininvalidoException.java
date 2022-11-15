package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio;

public class LogininvalidoException extends Exception {
    public LogininvalidoException() {
        super("Login Inválido!");
    }

    public LogininvalidoException(String message) {
        super(message);
    }
}
