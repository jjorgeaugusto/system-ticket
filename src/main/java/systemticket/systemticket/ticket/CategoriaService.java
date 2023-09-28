package systemticket.systemticket.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public void criarNovaCategoria(DadosCadastroCategoria dados) {
        categoriaRepository.save(new Categoria(dados));
    }

    public List<Categoria> listaTodasCategorias() {
        return categoriaRepository.findAll();
    }
}
