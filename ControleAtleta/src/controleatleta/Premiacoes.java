package controleatleta;

public class Premiacoes {

    private String premiacoes;
    private int ano;

    public Premiacoes(String premiacoes, int ano) {
        this.premiacoes = premiacoes;
        this.ano = ano;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes) {
        this.premiacoes = premiacoes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return this.ano + " - " + this.premiacoes;
    }
}
