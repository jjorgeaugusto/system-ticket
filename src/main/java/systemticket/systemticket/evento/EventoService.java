package systemticket.systemticket.evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class EventoService {

    @Autowired
    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }
    public List<Evento> listarTodosEventos(){
        return eventoRepository.findAll();
    }
    public List<Evento> listaEventosDisponiveis() {
        return listarTodosEventos().stream().filter(l -> l.isStatus())
                .collect(Collectors.toList());
    }

    public void criarNovoEvento(DadosCadastroEvento dados) {
        eventoRepository.save(new Evento(dados));
    }

    public List<Evento> pesquisarEventosPorNome(String nome) {
        return listarTodosEventos().stream()
                .filter(evento -> evento.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void atualizar(DadosAtualizacaoEvento dados) {
        Evento evento = eventoRepository.getReferenceById(BigInteger.valueOf(dados.id()));
        evento.atualizarInformacoes(dados);
    }
    public boolean verificaNomeEvento(DadosCadastroEvento dados) {
        return eventoRepository.existsByNome(dados.nome());
    }
    public void novoEventoVerificado(DadosCadastroEvento dados) throws EventoJaExisteException {
        if (!verificaNomeEvento(dados)) {
            criarNovoEvento(dados);
        } else {
            throw new EventoJaExisteException("Evento com nome " + dados.nome() + " já existe.");
        }
    }
}
