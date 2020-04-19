package futzinho;

import javax.swing.JOptionPane;

public class AuxilioJogo {

    public int ataque(Atacante ata, Goleiro gol, Atacante zag, int g) {
        double a;
        int go = 0;
        a = Math.round(1 + Math.random() * (20 - 1));
        if (a == 1) {//JOGADA HISTÓRICA
            a = Math.round(1 + Math.random() * (5 - 1));
            if (a == 1) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " dribla o time adversário inteiro");
            } else if (a == 2) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " dribla um");
                JOptionPane.showMessageDialog(null, ata.getNome() + " dribla dois");
                JOptionPane.showMessageDialog(null, ata.getNome() + " dribla três");
                JOptionPane.showMessageDialog(null, ata.getNome() + " dribla quatro");
            } else if (a == 3) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " mete um chutaço no ângulo lá da defesa");
            } else if (a == 4) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " desafia " + gol.getNome() + " com um chute de trivela a 130km por hora");
            } else {
                JOptionPane.showMessageDialog(null, ata.getNome() + " deixa " + zag.getNome() + " no chão junto com a defesa adversária");
            }
            while (go == 0) {
                a = Math.round(1 + Math.random() * (50 - 1));
                if (a > 10 && a <= (ata.getChute() + 50)) {//FAZ O GOL HISTÓRICO
                    a = Math.round(1 + Math.random() * (5 - 1));
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL, MEU DEUS DO CÉU QUE GOLAÇO");
                    } else if (a == 2) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLLAAAAAAAÇÇOOOOOOOOO, O GOL DA VIDA DELE");
                    } else if (a == 3) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL ");
                    } else if (a == 4) {
                        JOptionPane.showMessageDialog(null, "GOOOLLLLL, ELE BRINCOU COM O TIME ADVERSÁRIO");
                    } else {
                        JOptionPane.showMessageDialog(null, "OLHA O GOL, OLHA O GOL, OLHA O GOL, OLHA O GOL, NEM PELÉ FARIA");
                    }
                    JOptionPane.showMessageDialog(null, ata.getComemoracao());
                    go = 1;
                } else if (a < gol.getDefesaPerto()) {// GOLEIRO FAZ DEFESA HISTTÓRICA
                    JOptionPane.showMessageDialog(null, gol.getNome() + " INCRIVELMENTE DEFENDE, É A DEFESA DA SUA VIDA");
                    go = 2;
                }
            }
            if (go == 1) {
                g = 1;
            }
        } else if (a == 2 || a == 3 || a == 4) {//CHUTE DE LONGE
            a = Math.round(1 + Math.random() * (5 - 1));
            if (a == 1) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " arrisca do meio da quadra");
            } else if (a == 2) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " tenta surpreender " + gol.getNome() + " de longe");
            } else if (a == 3) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " mete uma sapatada de longe");
            } else if (a == 4) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " desafia " + gol.getNome() + " com um chute de longe");
            } else {
                JOptionPane.showMessageDialog(null, ata.getNome() + " não quer nem saber e chuta de longe no gol de " + gol.getNome());
            }
            while (go == 0) {
                a = Math.round(1 + Math.random() * (30 - 1));
                if (a <= ata.getChute()) {//FAZ O GOL DE LONGE
                    a = Math.round(1 + Math.random() * (5 - 1));
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL");
                    } else if (a == 2) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLLAAAAAAAÇÇOOOOOOOOO DO MEIO DA RUA");
                    } else if (a == 3) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL LINDO DE LONGE");
                    } else if (a == 4) {
                        JOptionPane.showMessageDialog(null, "GOOOLLLLL, SUPREENDENDO O GOLEIRO");
                    } else {
                        JOptionPane.showMessageDialog(null, "OLHA O GOL, OLHA O GOL, OLHA O GOL, OLHA O GOL");
                    }
                    JOptionPane.showMessageDialog(null, ata.getComemoracao());
                    go = 1;
                } else if (a > 10 && a <= (gol.getDefesa() + 20)) {//GOLEIRO DEFENDE DE LONGE
                    JOptionPane.showMessageDialog(null, gol.getDefLonge());
                    go = 2;
                }
            }
            if (go == 1) {
                g = 1;
            }
        } else if (a == 5 || a == 6 || a == 7) {//CHUTE MÉDIA DISTANCIA
            a = Math.round(1 + Math.random() * (5 - 1));
            if (a == 1) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " chuta de meia distância");
            } else if (a == 2) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " tenta o chute em " + gol.getNome() + " de longe");
            } else if (a == 3) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " mete uma sapatada");
            } else if (a == 4) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " desafia " + gol.getNome() + " com um chute");
            } else {
                JOptionPane.showMessageDialog(null, ata.getNome() + " não quer nem saber e chuta no meio de todo mundo no gol de " + gol.getNome());
            }
            while (go == 0) {
                a = Math.round(1 + Math.random() * (20 - 1));
                if (a <= ata.getChute()) {//FAZ O GOL DE MÉDIA DISTÂNCIA
                    a = Math.round(1 + Math.random() * (5 - 1));
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL");
                    } else if (a == 2) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLLAAAAAAAÇÇOOOOOOOOO");
                    } else if (a == 3) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL LINDO");
                    } else if (a == 4) {
                        JOptionPane.showMessageDialog(null, "GOOOLLLLL, UM FRANGO DO GOLEIRO");
                    } else {
                        JOptionPane.showMessageDialog(null, "OLHA O GOL, OLHA O GOL, OLHA O GOL, OLHA O GOL");
                    }
                    JOptionPane.showMessageDialog(null, ata.getComemoracao2());
                    go = 1;
                } else if (a > 10 && a <= (gol.getDefesa() + 10)) {//GOLEIRO DEFENDE DE MÉDIA DISTÂNCIA
                    JOptionPane.showMessageDialog(null, gol.getDefMedio());
                    go = 2;
                }
            }
            if (go == 1) {
                g = 1;
            }
        } else if (a == 8 || a == 9 || a == 10) {//CHUTE QUEIMA ROUPA
            a = Math.round(1 + Math.random() * (5 - 1));
            if (a == 1) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " chuta de perto");
            } else if (a == 2) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " tenta o chute em " + gol.getNome() + " de um angulo improvavel");
            } else if (a == 3) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " mete uma sapatada a queima roupa");
            } else if (a == 4) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " desafia " + gol.getNome() + " com um chute queima roupa");
            } else {
                JOptionPane.showMessageDialog(null, ata.getNome() + " não quer nem saber e tenta driblar " + gol.getNome());
            }
            while (go == 0) {
                a = Math.round(1 + Math.random() * (30 - 1));
                if (a > 10 && a <= (ata.getChute() + 20)) {//FAZ O GOL DE CURTA DISTÂNCIA
                    a = Math.round(1 + Math.random() * (5 - 1));
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL, SEM CHANCES PRO GOLEIRO");
                    } else if (a == 2) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLLAAAAAAAÇÇOOOOOOOOO, O GOLEIRO NEM VIU A BOLA");
                    } else if (a == 3) {
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL, BELO POSICIONAMENTO DE ATAQUE");
                    } else if (a == 4) {
                        JOptionPane.showMessageDialog(null, "GOOOLLLLL, UM FRANGO DO GOLEIRO, QUE SAI ERRADO");
                    } else {
                        JOptionPane.showMessageDialog(null, "OLHA O GOL, OLHA O GOL, OLHA O GOL, OLHA O GOL, SEM NENHUMA CHANCE PRO GOLEIRO");
                    }
                    JOptionPane.showMessageDialog(null, ata.getComemoracao2());
                    go = 1;
                } else if (a <= gol.getDefesaPerto()) {//GOLEIRO DEFENDE DE CURTA DISTÂNCIA
                    JOptionPane.showMessageDialog(null, gol.getDefPerto());
                    go = 2;
                }
            }
            if (go == 1) {
                g = 1;
            }
        } else if (a == 11 || a == 12) {//PENÂLTI
            a = Math.round(1 + Math.random() * (5 - 1));
            if (a == 1) {
                JOptionPane.showMessageDialog(null, "É PENAAAALTI");
                JOptionPane.showMessageDialog(null, zag.getNome() + " pega a bola com a mão dentro da area");
            } else if (a == 2) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " toma um carrinho criminoso de " + gol.getNome() + " e é penalti");
            } else if (a == 3) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " é derrubado por " + zag.getNome() + " dentro da aréa");
            } else if (a == 4) {
                JOptionPane.showMessageDialog(null, "PENALIDADE MÁXIMA MARCADA");
                JOptionPane.showMessageDialog(null, ata.getNome() + " é atropelado por " + zag.getNome() + " dentro da aréa");
            } else {
                JOptionPane.showMessageDialog(null, "PENAAAALTI");
                JOptionPane.showMessageDialog(null, ata.getNome() + " tenta o drible e é puxado por " + gol.getNome());
            }
            while (go == 0) {
                a = Math.round(1 + Math.random() * (30 - 1));
                if (a > 10 && a <= (ata.getPenalti() + 20)) {//FAZ O GOL DE PENALTI
                    a = Math.round(1 + Math.random() * (5 - 1));
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " faz menção que irá chutar na direita");
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL, SEM CHANCES PRO GOLEIRO");
                    } else if (a == 2) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " faz menção que irá chutar na esquerda");
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL, O GOLEIRO NEM VIU A BOLA");
                    } else if (a == 3) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " ri de " + gol.getNome() + " antes de chutar");
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL");
                    } else if (a == 4) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " parece nervoso antes de bater");
                        JOptionPane.showMessageDialog(null, "GOOOLLLLL, UM FRANGO DO GOLEIRO, A BOLA PASSA NO MEIO DAS MÃOS DELE");
                    } else {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " toma uma água antes de bater o penalti");
                        JOptionPane.showMessageDialog(null, "OLHA O GOL, OLHA O GOL, OLHA O GOL, OLHA O GOL, SEM NENHUMA CHANCE PRO GOLEIRO");
                    }
                    JOptionPane.showMessageDialog(null, ata.getComemoracao2());
                    go = 1;
                } else if (a <= gol.getDefesaPenalti()) {//GOLEIRO DEFENDE O PENALTI
                    a = Math.round(1 + Math.random() * (5 - 1));
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " faz menção que irá chutar na direita");
                        JOptionPane.showMessageDialog(null, gol.getDefPenal());
                    } else if (a == 2) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " faz menção que irá chutar na esquerda");
                        JOptionPane.showMessageDialog(null, gol.getDefPenal());
                    } else if (a == 3) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " ri de " + gol.getNome() + " antes de chutar");
                        JOptionPane.showMessageDialog(null, gol.getDefPenal());
                    } else if (a == 4) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " parece nervoso antes de bater");
                        JOptionPane.showMessageDialog(null, gol.getDefPenal());
                    } else {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " toma uma água antes de bater o penalti");
                        JOptionPane.showMessageDialog(null, gol.getDefPenal());
                    }
                    go = 2;
                }
            }
            if (go == 1) {
                g = 1;
            }
        } else if (a == 13 || a == 14) {//FALTA DE LONGE
            a = Math.round(1 + Math.random() * (5 - 1));
            if (a == 1) {
                JOptionPane.showMessageDialog(null, "é falta, mas parece bem longe");
                JOptionPane.showMessageDialog(null, zag.getNome() + " pega a bola com a mão sem querer");
            } else if (a == 2) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " toma um carrinho criminoso de " + zag.getNome() + " no meio da quadra e é falta");
            } else if (a == 3) {
                JOptionPane.showMessageDialog(null, ata.getNome() + " é derrubado por " + zag.getNome() + " e é falta, mas parece bem longe para chutar");
            } else if (a == 4) {
                JOptionPane.showMessageDialog(null, "Falta marcada no meioo da quadra");
                JOptionPane.showMessageDialog(null, ata.getNome() + " é atropelado por " + zag.getNome());
            } else {
                JOptionPane.showMessageDialog(null, "Falta marcada, mas parece longe para chutar");
                JOptionPane.showMessageDialog(null, ata.getNome() + " tenta o drible e é puxado por " + zag.getNome());
            }
            while (go == 0) {
                a = Math.round(1 + Math.random() * (30 - 1));
                if (a <= ata.getChute()) {//FAZ O GOL DE FALTA DE LONGE
                    a = Math.round(1 + Math.random() * (5 - 1));
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " faz menção que irá chutar no gol");
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL, SEM CHANCES PRO GOLEIRO, NO ÂNGULO");
                    } else if (a == 2) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " faz que irá apenas cruzar");
                        JOptionPane.showMessageDialog(null, ata.getNome() + " decide chutar de última hora");
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL, O GOLEIRO NEM VIU A BOLA DE TÃO RÁPIDA");
                    } else if (a == 3) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " ri de " + gol.getNome() + " antes de cobrar a falta");
                        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLLAAAAAAAAÇOOOO DO MEIO DA QUADRA");
                    } else if (a == 4) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " parece nervoso antes de bater, será que ele irá bater direto");
                        JOptionPane.showMessageDialog(null, ata.getNome() + " chuta no gol");
                        JOptionPane.showMessageDialog(null, "GOOOLLLLL, UM FRANGO DO GOLEIRO, A BOLA PASSA DIRETO PELAS MÃOS DELE");
                    } else {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " não quer saber e vai chutar do meio da quadra");
                        JOptionPane.showMessageDialog(null, "OLHA O GOL, OLHA O GOL, OLHA O GOL, OLHA O GOL, SEM NENHUMA CHANCE PRO GOLEIRO QUE FICA PARADO NO MEIO DO GOL");
                    }
                    JOptionPane.showMessageDialog(null, ata.getComemoracao());
                    go = 1;
                } else if (a > 10 && a <= (gol.getDefesa() + 20)) {//GOLEIRO DEFENDE A FALTA DE LONGE
                    a = Math.round(1 + Math.random() * (5 - 1));
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " faz menção que irá chutar no gol");
                        JOptionPane.showMessageDialog(null, gol.getDefLonge());
                    } else if (a == 2) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " faz que irá apenas cruzar");
                        JOptionPane.showMessageDialog(null, ata.getNome() + " decide chutar de última hora");
                        JOptionPane.showMessageDialog(null, gol.getDefLonge());
                    } else if (a == 3) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " ri de " + gol.getNome() + " antes de cobrar a falta");
                        JOptionPane.showMessageDialog(null, gol.getDefLonge());
                    } else if (a == 4) {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " parece nervoso antes de bater, será que ele irá bater direto");
                        JOptionPane.showMessageDialog(null, ata.getNome() + " chuta no gol");
                        JOptionPane.showMessageDialog(null, gol.getDefLonge());
                    } else {
                        JOptionPane.showMessageDialog(null, ata.getNome() + " não quer saber e vai chutar do meio da quadra");
                        JOptionPane.showMessageDialog(null, gol.getDefLonge());
                    }
                    go = 2;
                }
            }
            if (go == 1) {
                g = 1;

            } else if (a == 15 || a == 16) {//FALTA DE PERTO
                a = Math.round(1 + Math.random() * (5 - 1));
                if (a == 1) {
                    JOptionPane.showMessageDialog(null, "É FALTA, PERTO DA AREA");
                    JOptionPane.showMessageDialog(null, zag.getNome() + " pega a bola com a mão perto da area");
                } else if (a == 2) {
                    JOptionPane.showMessageDialog(null, ata.getNome() + " toma um carrinho criminoso de " + gol.getNome() + " e é falta, quase penalti");
                } else if (a == 3) {
                    JOptionPane.showMessageDialog(null, ata.getNome() + " é derrubado por " + zag.getNome() + " perto da aréa");
                } else if (a == 4) {
                    JOptionPane.showMessageDialog(null, "FALTA, DO LADO ESQUERDO DA AREA");
                    JOptionPane.showMessageDialog(null, ata.getNome() + " é atropelado por " + zag.getNome() + " perto da aréa");
                } else {
                    JOptionPane.showMessageDialog(null, "FALTA MARCADA");
                    JOptionPane.showMessageDialog(null, ata.getNome() + " tenta o drible e é puxado por " + gol.getNome());
                }
                while (go == 0) {
                    a = Math.round(1 + Math.random() * (25 - 1));
                    if (a > 10 && a <= (ata.getPenalti() + 15)) {//FAZ O GOL DE FALTA
                        a = Math.round(1 + Math.random() * (5 - 1));
                        if (a == 1) {
                            JOptionPane.showMessageDialog(null, ata.getNome() + " faz menção que irá chutar na direita");
                            JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL, SEM CHANCES PRO GOLEIRO");
                        } else if (a == 2) {
                            JOptionPane.showMessageDialog(null, ata.getNome() + " faz menção que irá chutar na esquerda");
                            JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL, O GOLEIRO NEM VIU A BOLA");
                        } else if (a == 3) {
                            JOptionPane.showMessageDialog(null, ata.getNome() + " ri de " + gol.getNome() + " antes de chutar");
                            JOptionPane.showMessageDialog(null, "GOOOOOOOOOOLLLLLLLLLL");
                        } else if (a == 4) {
                            JOptionPane.showMessageDialog(null, ata.getNome() + " parece nervoso antes de bater");
                            JOptionPane.showMessageDialog(null, "GOOOLLLLL, UM FRANGO DO GOLEIRO, A BOLA PASSA NO MEIO DAS MÃOS DELE");
                        } else {
                            JOptionPane.showMessageDialog(null, ata.getNome() + " toma uma água antes de bater o penalti");
                            JOptionPane.showMessageDialog(null, "OLHA O GOL, OLHA O GOL, OLHA O GOL, OLHA O GOL, SEM NENHUMA CHANCE PRO GOLEIRO");
                        }
                        JOptionPane.showMessageDialog(null, ata.getComemoracao());
                        go = 1;
                    } else if (a <= gol.getDefesaPenalti()) {//GOLEIRO DEFENDE A FALTA DE PERTO
                        a = Math.round(1 + Math.random() * (5 - 1));
                        if (a == 1) {
                            JOptionPane.showMessageDialog(null, ata.getNome() + " faz menção que irá chutar na direita");
                            JOptionPane.showMessageDialog(null, gol.getDefPerto());
                        } else if (a == 2) {
                            JOptionPane.showMessageDialog(null, ata.getNome() + " faz menção que irá chutar na esquerda");
                            JOptionPane.showMessageDialog(null, gol.getDefPerto());
                        } else if (a == 3) {
                            JOptionPane.showMessageDialog(null, ata.getNome() + " ri de " + gol.getNome() + " antes de chutar");
                            JOptionPane.showMessageDialog(null, gol.getDefPerto());
                        } else if (a == 4) {
                            JOptionPane.showMessageDialog(null, ata.getNome() + " parece nervoso antes de bater");
                            JOptionPane.showMessageDialog(null, gol.getDefPerto());
                        } else {
                            JOptionPane.showMessageDialog(null, ata.getNome() + " toma uma água antes de bater o penalti");
                            JOptionPane.showMessageDialog(null, gol.getDefPerto());
                        }
                        go = 2;
                    }
                }
                if (go == 1) {
                    g = 1;
                }
            } else if (a == 17 || a == 18 || a == 19 || a == 20) {//ERRO DE PASSE
                if (a == 17 || a == 18) {
                    JOptionPane.showMessageDialog(null, ata.getErroP());
                } else {
                    JOptionPane.showMessageDialog(null, ata.getErroP2());
                }
            }
        }
        return g;
    }
}
