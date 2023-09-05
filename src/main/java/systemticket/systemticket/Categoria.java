package systemticket.systemticket;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Categoria {

    private String nome;
    private BigInteger quantidade;
    private BigDecimal valor;


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
