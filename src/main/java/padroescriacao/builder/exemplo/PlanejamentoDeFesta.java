package padroescriacao.builder.exemplo;

public class PlanejamentoDeFesta {

    private String aniversariante;
    private int idade;
    private String sexo;
    private String saborBolo;
    private int qtdSalgadinhos;
    private int qtdDocinhos;
    private boolean desejaBaloes;

    public PlanejamentoDeFesta() {
        this.aniversariante = "";
        this.idade = 0;
    }

    public String getAniversariante() {
        return aniversariante;
    }

    public void setAniversariante(String aniversariante) {
        this.aniversariante = aniversariante;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSaborBolo() {
        return saborBolo;
    }

    public void setSaborBolo(String saborBolo) {
        this.saborBolo = saborBolo;
    }

    public int getQtdSalgadinhos() {
        return qtdSalgadinhos;
    }

    public void setQtdSalgadinhos(int qtdSalgadinhos) {
        this.qtdSalgadinhos = qtdSalgadinhos;
    }

    public int getQtdDocinhos() {
        return qtdDocinhos;
    }

    public void setQtdDocinhos(int qtdDocinhos) {
        this.qtdDocinhos = qtdDocinhos;
    }

    public boolean isDesejaBaloes() {
        return desejaBaloes;
    }

    public void setDesejaBaloes(boolean desejaBaloes) {
        this.desejaBaloes = desejaBaloes;
    }
}
