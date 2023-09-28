package systemticket.systemticket.ticket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, BigInteger> {

}