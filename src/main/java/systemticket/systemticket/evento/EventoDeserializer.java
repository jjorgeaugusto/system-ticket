package systemticket.systemticket.evento;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.math.BigInteger;

public class EventoDeserializer extends JsonDeserializer<Evento> {
    @Override
    public Evento deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        BigInteger idEvento = BigInteger.valueOf(jsonParser.readValueAs(Long.class));
        return new Evento(idEvento);
    }

}
