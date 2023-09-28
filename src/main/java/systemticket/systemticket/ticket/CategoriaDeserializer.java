package systemticket.systemticket.ticket;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.math.BigInteger;

public class CategoriaDeserializer extends JsonDeserializer<Categoria> {

    @Override
    public Categoria deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        BigInteger idCategoria = BigInteger.valueOf(jsonParser.readValueAs(Long.class));
        return new Categoria(idCategoria);
    }
}
