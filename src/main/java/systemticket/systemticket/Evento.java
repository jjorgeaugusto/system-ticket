package systemticket.systemticket;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private String nome;
    private String data;
    private String localizacao;
    private int qtdTicketsTotal;
    private boolean status;

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

    public Evento(String nome, String data, String localizacao, int qtdTickets, boolean status) {
        this.nome = nome;
        this.data = data;
        this.localizacao = localizacao;
        this.qtdTicketsTotal = qtdTickets;
        this.status = status;



    }
}
