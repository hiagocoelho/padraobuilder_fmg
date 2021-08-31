package padroescriacao.builder.exemplo;

public class PlanejamentoDeFestaBuilder {

    private PlanejamentoDeFesta planejamentoDeFesta;

    public PlanejamentoDeFestaBuilder() {
        planejamentoDeFesta = new PlanejamentoDeFesta();
    }

    public PlanejamentoDeFesta build() {
        if (planejamentoDeFesta.getAniversariante().equals("")) {
            throw new IllegalArgumentException("Nome do aniversariante inválido.");
        }
        if (planejamentoDeFesta.getIdade() == 0) {
            throw new IllegalArgumentException("Idade do aniversariante inválida.");
        }
        return planejamentoDeFesta;
    }

    public PlanejamentoDeFestaBuilder setAniversariante(String aniversariante) {
        planejamentoDeFesta.setAniversariante(aniversariante);
        return this;
    }

    public PlanejamentoDeFestaBuilder setIdade(int idade) {
        planejamentoDeFesta.setIdade(idade);
        return this;
    }

    public PlanejamentoDeFestaBuilder setSexo(String sexo) {
        planejamentoDeFesta.setSexo(sexo);
        return this;
    }

    public PlanejamentoDeFestaBuilder setSaborBolo(String saborBolo) {
        planejamentoDeFesta.setSaborBolo(saborBolo);
        return this;
    }

    public PlanejamentoDeFestaBuilder setQtdSalgadinhos(int qtdSalgadinhos) {
        planejamentoDeFesta.setQtdSalgadinhos(qtdSalgadinhos);
        return this;
    }

    public PlanejamentoDeFestaBuilder setQtdDocinhos(int qtdDocinhos) {
        planejamentoDeFesta.setQtdDocinhos(qtdDocinhos);
        return this;
    }

    public PlanejamentoDeFestaBuilder setDesejaBaloes(boolean desejaBaloes) {
        planejamentoDeFesta.setDesejaBaloes(desejaBaloes);
        return this;
    }
}
