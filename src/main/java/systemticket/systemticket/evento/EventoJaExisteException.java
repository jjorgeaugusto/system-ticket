package systemticket.systemticket.evento;

public class EventoJaExisteException extends Exception {
    public EventoJaExisteException(String mensagem){
        super(mensagem);
    }
}
