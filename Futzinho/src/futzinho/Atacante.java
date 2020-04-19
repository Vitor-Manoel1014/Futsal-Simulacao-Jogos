package futzinho;

public class Atacante extends Jogador {

    protected int chute;
    protected int chutePerto;
    protected int penalti;
    protected int velocidade;
    protected String comemoracao;
    protected String comemoracao2;
    protected String erroP;
    protected String erroP2;

    public Atacante(String nome, int chute, int chutePerto, int penalti, int velocidade, String comemoracao, String comemoracao2, String erroP, String erroP2) {
        this.nome = nome;
        this.chute = chute;
        this.chutePerto = chutePerto;
        this.penalti = penalti;
        this.velocidade = velocidade;
        this.comemoracao = comemoracao;
        this.comemoracao2 = comemoracao2;
        this.erroP = erroP;
        this.erroP2 = erroP2;
    }

    public String getComemoracao2() {
        return comemoracao2;
    }

    public void setComemoracao2(String comemoracao2) {
        this.comemoracao2 = comemoracao2;
    }

    public String getErroP() {
        return erroP;
    }

    public void setErroP(String erroP) {
        this.erroP = erroP;
    }

    public String getErroP2() {
        return erroP2;
    }

    public void setErroP2(String erroP2) {
        this.erroP2 = erroP2;
    }

    public int getChute() {
        return chute;
    }

    public void setChute(int chute) {
        this.chute = chute;
    }

    public int getChutePerto() {
        return chutePerto;
    }

    public void setChutePerto(int chutePerto) {
        this.chutePerto = chutePerto;
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getComemoracao() {
        return comemoracao;
    }

    public void setComemoracao(String comemoracao) {
        this.comemoracao = comemoracao;
    }

}
