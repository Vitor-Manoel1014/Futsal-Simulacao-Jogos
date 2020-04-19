package futzinho;

public class Time {

    private String ano;
    private int vitorias;
    private int geral;
    private int gol;
    private Goleiro goleiro;
    private Atacante zagueiro;
    private Atacante zagueiro2;
    private Atacante atacante;
    private Atacante atacante2;

    public Time(String ano, int geral, Goleiro goleiro, Atacante zagueiro, Atacante zagueiro2, Atacante atacante, Atacante atacante2) {
        this.ano = ano;
        this.vitorias = 0;
        this.geral = geral;
        this.gol = 0;
        this.goleiro = goleiro;
        this.zagueiro = zagueiro;
        this.zagueiro2 = zagueiro2;
        this.atacante = atacante;
        this.atacante2 = atacante2;
    }

    public Goleiro getGoleiro() {
        return goleiro;
    }

    public void setGoleiro(Goleiro goleiro) {
        this.goleiro = goleiro;
    }

    public Atacante getZagueiro() {
        return zagueiro;
    }

    public void setZagueiro(Atacante zagueiro) {
        this.zagueiro = zagueiro;
    }

    public Atacante getZagueiro2() {
        return zagueiro2;
    }

    public void setZagueiro2(Atacante zagueiro2) {
        this.zagueiro2 = zagueiro2;
    }

    public Atacante getAtacante() {
        return atacante;
    }

    public void setAtacante(Atacante atacante) {
        this.atacante = atacante;
    }

    public Atacante getAtacante2() {
        return atacante2;
    }

    public void setAtacante2(Atacante atacante2) {
        this.atacante2 = atacante2;
    }

    public final void ganhou() {
        setVitorias(getVitorias() + 1);
    }

    public final void perdeu() {
        setVitorias(getVitorias() - 1);
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getGeral() {
        return geral;
    }

    public void setGeral(int geral) {
        this.geral = geral;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

}
