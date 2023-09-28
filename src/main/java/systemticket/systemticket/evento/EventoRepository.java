package systemticket.systemticket.evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface EventoRepository extends JpaRepository<Evento, BigInteger> {

    boolean existsByNome(String nome);

}
