package systemticket.systemticket.evento;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.transaction.Transactional;


import java.util.List;

@RestController
@RequestMapping(path = "/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping
        @Transactional
        public void cadastrar(@RequestBody DadosCadastroEvento dados) throws EventoJaExisteException{
            eventoService.novoEventoVerificado(dados);
        }
        @GetMapping
        public List<Evento> buscar() {
            return eventoService.listarTodosEventos().stream().toList();
        }
        @GetMapping("/disponivel")
        public List<Evento> listaEventosDisponiveis() {
            return eventoService.listaEventosDisponiveis();
        }
        @GetMapping("/search")
        public List<Evento> pesquisarEventosPorTitulo(@RequestParam("nome") String termoPesquisa) {
            return eventoService.pesquisarEventosPorNome(termoPesquisa);
        }
        @PutMapping
        @Transactional
        public void atualizar(@RequestBody @Valid DadosAtualizacaoEvento dados) {
            eventoService.atualizar(dados);
        }
}