package systemticket.systemticket.ticket;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.math.BigInteger;
@Entity
@Table(name = "categoria")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@EqualsAndHashCode(of = "id")
@JsonDeserialize(using = CategoriaDeserializer.class)
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "quantidade")
    private BigInteger quantidade;
    @Column(name = "valor")
    private BigDecimal valor;

    public Categoria(DadosCadastroCategoria dados) {
        this.nome = dados.nome();
        this.quantidade = dados.quantidade();
        this.valor = dados.valor();
    }

    public Categoria(BigInteger idCategoria) {
        this.id = idCategoria;
    }

    public void diminuiQuatidade(){
        this.quantidade = quantidade.subtract(BigInteger.valueOf(1));
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
