package futzinho;

public class Goleiro extends Jogador {

    private int defesa;
    private int defesaPerto;
    private int defesaPenalti;
    private int lancamento;
    private int penalti;
    private String defLonge;
    private String defMedio;
    private String defPerto;
    private String defPenal;

    public Goleiro(String nome, int defesa, int defesaPerto, int defesaPenalti, int lancamento, int penalti, String defLonge, String defMedio, String defPerto, String defPenal) {
        this.nome = nome;
        this.defesa = defesa;
        this.defesaPerto = defesaPerto;
        this.defesaPenalti = defesaPenalti;
        this.lancamento = lancamento;
        this.penalti = penalti;
        this.defLonge = defLonge;
        this.defMedio = defMedio;
        this.defPerto = defPerto;
        this.defPenal = defPenal;
    }

    public String getDefPenal() {
        return defPenal;
    }

    public void setDefPenal(String defPenal) {
        this.defPenal = defPenal;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDefesaPerto() {
        return defesaPerto;
    }

    public void setDefesaPerto(int defesaPerto) {
        this.defesaPerto = defesaPerto;
    }

    public int getDefesaPenalti() {
        return defesaPenalti;
    }

    public void setDefesaPenalti(int defesaPenalti) {
        this.defesaPenalti = defesaPenalti;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public String getDefLonge() {
        return defLonge;
    }

    public void setDefLonge(String defLonge) {
        this.defLonge = defLonge;
    }

    public String getDefMedio() {
        return defMedio;
    }

    public void setDefMedio(String defMedio) {
        this.defMedio = defMedio;
    }

    public String getDefPerto() {
        return defPerto;
    }

    public void setDefPerto(String defPerto) {
        this.defPerto = defPerto;
    }

}
