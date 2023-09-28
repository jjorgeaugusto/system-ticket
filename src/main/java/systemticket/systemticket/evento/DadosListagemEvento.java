package systemticket.systemticket.evento;

import java.math.BigInteger;

public record DadosListagemEvento(BigInteger id, String autor, String data, String localizacao, int qtdTickets, boolean status) {
    public void DadosListagemEvento(String nome){
    }


}
