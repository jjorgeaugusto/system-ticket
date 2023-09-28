package systemticket.systemticket.ticket;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
    public void criaNovoTicket(DadosCadastroTicket dados) {
        ticketRepository.save(new Ticket(dados));
    }
    public List<Ticket> listaTodosTickets(){
        return ticketRepository.findAll();
    }

}
