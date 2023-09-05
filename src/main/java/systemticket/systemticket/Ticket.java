package systemticket.systemticket;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private String nome;
    @Embedded
    private Categoria categoria;
    @ManyToOne
    private Evento evento;

    public Ticket(Categoria categoria, Evento evento) {
        if (verificaQtdTicket(categoria) == true) {
            this.categoria = categoria;
            this.nome = categoria.getNome();
            this.evento = evento;
            System.out.println("Ingresso gerado com sucesso!");
            categoria.diminuiQuatidade();
        }
        else {
            System.out.println("Não há ingressos disponiveis");
        }
    }

    public boolean verificaQtdTicket(Categoria categoria){
        if (!categoria.getQuantidade().equals(BigInteger.ZERO)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria=" + categoria +
                ", evento=" + evento +
                '}';
    }
}
