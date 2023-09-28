package systemticket.systemticket.evento;

public record DadosCadastroEvento(String nome,String data, String localizacao, int qtdTicketsTotal, boolean status) {

    public DadosCadastroEvento(String nome, String data, String localizacao, int qtdTicketsTotal, boolean status) {
        this.nome = nome;
        this.data = data;
        this.localizacao = localizacao;
        this.qtdTicketsTotal = qtdTicketsTotal;
        this.status = status;
    }
}
