package systemticket.systemticket;

import systemticket.systemticket.ticket.Ticket;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
public class Carrinho {
    private List<Ticket> itensCarrinho;

    public Carrinho(){
        itensCarrinho = new ArrayList<>();
    }

    public void adicionarItem(Ticket ticket){
        itensCarrinho.add(ticket);
    }

    public void removerItem(Ticket ticket){
        itensCarrinho.remove(ticket);
    }

    public List<Ticket> getItensCarrinho() {
        return itensCarrinho;
    }

//    public BigDecimal calcularTotal() {
//        BigDecimal total = null;
//        for (Ticket ticket : itensCarrinho) {
//            total.add(ticket.getCategoria().getValor());
//        }
//        return total;
//    }
}
