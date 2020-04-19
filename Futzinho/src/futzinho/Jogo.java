package futzinho;

import javax.swing.JOptionPane;

public class Jogo {

    private String estadio;

    public Jogo(String estadio) {
        this.estadio = estadio;
    }

    public void jogo(Time time, Time time2) {
        JOptionPane.showMessageDialog(null, "O jogo entre " + time.getAno() + " e " + time2.getAno() + " começou");
        JOptionPane.showMessageDialog(null, "E o juíz apita o jogo na " + this.getEstadio());
        AuxilioJogo aux = new AuxilioJogo();
        int tempo = 0;
        int t = 0;
        int gol = 0;
        double a;
        while (t == 1 || tempo <= 30) {
            JOptionPane.showMessageDialog(null, tempo + " minutos de jogo\n\n" + time.getAno() + " " + time.getGol() + " X " + time2.getGol() + " " + time2.getAno());
            a = Math.random() * 20;
            if (a <= time.getGeral()) {//JOGADA TIME1
                a = Math.round(1 + Math.random() * (6 - 1));
                if (a == 5 || a == 3) {//ATAQUE ATACANTE 1
                    time.setGol(time.getGol() + aux.ataque(time.getAtacante(), time2.getGoleiro(), time2.getZagueiro(), gol));
                    gol = 0;
                } else if (a == 6 || a == 4) {//ATAQUE ATACANTE 2
                    time.setGol(time.getGol() + aux.ataque(time.getAtacante2(), time2.getGoleiro(), time2.getZagueiro2(), gol));
                    gol = 0;
                } else if (a == 1) {//ATAQUE ZAGUEIRO 1
                    time.setGol(time.getGol() + aux.ataque(time.getZagueiro(), time2.getGoleiro(), time2.getZagueiro(), gol));
                    gol = 0;
                } else if (a == 2) {//ATAQUE ZAGUEIRO 2
                    time.setGol(time.getGol() + aux.ataque(time.getZagueiro2(), time2.getGoleiro(), time2.getZagueiro2(), gol));
                    gol = 0;
                }
            } else if (a > 10 && a <= (time2.getGeral() + 10)) {//JOGADA TIME2
                a = Math.round(1 + Math.random() * (6 - 1));
                if (a == 5 || a == 3) {//ATAQUE ATACANTE 1
                    time2.setGol(time2.getGol() + aux.ataque(time2.getAtacante(), time.getGoleiro(), time.getZagueiro(), gol));
                    gol = 0;
                } else if (a == 6 || a == 4) {//ATAQUE ATACANTE 2
                    time2.setGol(time2.getGol() + aux.ataque(time2.getAtacante2(), time.getGoleiro(), time.getZagueiro2(), gol));
                    gol = 0;
                } else if (a == 1) {//ATAQUE ZAGUEIRO 1
                    time2.setGol(time2.getGol() + aux.ataque(time2.getZagueiro(), time.getGoleiro(), time.getZagueiro(), gol));
                    gol = 0;
                } else if (a == 2) {//ATAQUE ZAGUEIRO 2
                    time2.setGol(time2.getGol() + aux.ataque(time2.getZagueiro2(), time.getGoleiro(), time.getZagueiro2(), gol));
                    gol = 0;
                }
            }
            tempo += 3;
        }
        JOptionPane.showMessageDialog(null, "FINAL DE PARTIDA");
        JOptionPane.showMessageDialog(null, time.getAno() + " " + time.getGol() + " X " + time2.getGol() + " " + time2.getAno());
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

}
