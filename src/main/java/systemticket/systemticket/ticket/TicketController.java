package systemticket.systemticket.ticket;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import systemticket.systemticket.evento.DadosCadastroEvento;
import systemticket.systemticket.evento.Evento;
import systemticket.systemticket.evento.EventoJaExisteException;
import systemticket.systemticket.evento.EventoService;

import java.util.List;

@RestController
@RequestMapping(path = "/eventos")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping(path = "/ticket")
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroTicket dados) {
        ticketService.criaNovoTicket(dados);
    }
    @GetMapping(path = "/ticket")
    public List<Ticket> buscarTicket() {
        return ticketService.listaTodosTickets().stream().toList();
    }


    @PostMapping(path = "/categoria")
    @Transactional
    public void cadastrarCategorioa(@RequestBody DadosCadastroCategoria dados){
        categoriaService.criarNovaCategoria(dados);
    }
    @GetMapping(path = "/categoria")
    public List<Categoria> buscarCategoria() {
        return categoriaService.listaTodasCategorias().stream().toList();
    }
}
