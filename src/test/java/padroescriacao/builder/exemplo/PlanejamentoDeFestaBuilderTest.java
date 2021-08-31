package padroescriacao.builder.exemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlanejamentoDeFestaBuilderTest {

    @Test
    void deveRetornarExcecaoParaPlanejamentoSemAniversariante() {
        try {
            PlanejamentoDeFestaBuilder planejamentoDeFestaBuilder = new PlanejamentoDeFestaBuilder();
            PlanejamentoDeFesta planejamentoDeFesta = planejamentoDeFestaBuilder
                    .setIdade(22)
                    .setSexo("Masculino")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do aniversariante inválido.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPlanejamentoSemIdade() {
        try {
            PlanejamentoDeFestaBuilder planejamentoDeFestaBuilder = new PlanejamentoDeFestaBuilder();
            PlanejamentoDeFesta planejamentoDeFesta = planejamentoDeFestaBuilder
                    .setAniversariante("Hiago")
                    .setSexo("Masculino")
                    .setSaborBolo("Chocolate")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Idade do aniversariante inválida.", e.getMessage());
        }
    }

    @Test
    void deveRetornarPlanejamentoValido() {
        PlanejamentoDeFestaBuilder planejamentoDeFestaBuilder = new PlanejamentoDeFestaBuilder();
        PlanejamentoDeFesta planejamentoDeFesta = planejamentoDeFestaBuilder
                .setAniversariante("Hiago")
                .setSexo("Masculino")
                .setSaborBolo("Chocolate")
                .setQtdSalgadinhos(200)
                .setQtdDocinhos(100)
                .setDesejaBaloes(false)
                .build();

        assertNotNull(planejamentoDeFesta);
    }
}
