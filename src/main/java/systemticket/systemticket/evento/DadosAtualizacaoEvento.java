package systemticket.systemticket.evento;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoEvento(@NotNull Long id, @NotNull String nome, @NotNull String data, String localizacao,@NotNull int qtdTicketsTotal, boolean status) {
}
