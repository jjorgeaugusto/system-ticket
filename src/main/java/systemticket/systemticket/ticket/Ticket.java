package systemticket.systemticket.ticket;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
@Entity
@Table(name = "ticket")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class Ticket {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
//    @Column(name = "name")
//    private String nome;
    @Column(name = "id_categoria")
    private BigInteger id_categoria;
    @Column(name = "id_evento")
    private BigInteger id_evento;

    public Ticket(DadosCadastroTicket dados) {
        this.id_evento = dados.evento().getId();
        this.id_categoria = dados.categoria().getId();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
//                ", nome='" + nome + '\'' +
                ", categoria=" + id_categoria +
                ", evento=" + id_evento +
                '}';
    }
}
