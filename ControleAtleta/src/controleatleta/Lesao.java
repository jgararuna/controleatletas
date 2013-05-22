package controleatleta;

public class Lesao {

    private String lesao;
    private int ano;

    public Lesao(String lesao, int ano) {
        this.lesao = lesao;
        this.ano = ano;
    }

    public String getLesao() {
        return lesao;
    }

    public void setLesao(String lesao) {
        this.lesao = lesao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return this.ano + " - " + this.lesao;
    }
}
