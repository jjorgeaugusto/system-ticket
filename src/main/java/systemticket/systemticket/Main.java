package systemticket.systemticket;


import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Categoria categoriaVIP = new Categoria("VIP",new BigInteger("2"),new BigDecimal(150.00));

        Evento eventoShow = new Evento("Henrique e Juliano","28/04/2024" ,"Porto Alegre",2,true);

        Ticket ticket1 = new Ticket(categoriaVIP,eventoShow);
        System.out.println(ticket1.toString());

        Ticket ticket2 = new Ticket(categoriaVIP,eventoShow);
        System.out.println(ticket2.toString());

        Ticket ticket3 = new Ticket(categoriaVIP,eventoShow);
        System.out.println(ticket3.toString());
    }
}
