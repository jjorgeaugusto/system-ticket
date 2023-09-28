package systemticket.systemticket.evento;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigInteger;


@Entity
@Table(name = "evento")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "data")
    private String data;
    @Column(name = "localizacao")
    private String localizacao;
    @Column(name = "qtdticketstotal")
    private int qtdTicketsTotal;
    @Column(name = "status")
    private boolean status;

    public Evento(BigInteger idEvento) {
        this.id = idEvento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", qtdTicketsTotal=" + qtdTicketsTotal +
                ", status=" + status +
                '}';
    }

    public Evento(DadosCadastroEvento dados) {
        this.nome = dados.nome();
        this.data = dados.data();
        this.localizacao = dados.localizacao();
        this.qtdTicketsTotal = dados.qtdTicketsTotal();
        this.status = dados.status();
    }
    public void atualizarInformacoes(DadosAtualizacaoEvento dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.data() != null) {
            this.data = dados.data();
        }
        if (dados.localizacao() != null){
            this.localizacao = dados.localizacao();
        }
        if (dados.qtdTicketsTotal() >= 0){
            this.qtdTicketsTotal = dados.qtdTicketsTotal();
        }
            this.status = dados.status();
    }
}
