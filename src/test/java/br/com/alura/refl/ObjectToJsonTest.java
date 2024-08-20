package br.com.alura.refl;

import br.com.alura.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObjectToJsonTest {

    Pessoa pessoa = new Pessoa(32, "João", "12312312312");

    @Test
    public void shouldTransform() {
        ObjectToJson objectToJson = new ObjectToJson();
        String actual = objectToJson.transform(pessoa);

        System.out.println(actual);

        Assertions.assertInstanceOf(String.class, actual);
    }
}
