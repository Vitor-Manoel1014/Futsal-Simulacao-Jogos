package futzinho;

public class Futzinho {

    public static void main(String[] args) {

        //CRIAÇÃO SEGUNDO ANO
        Goleiro VitorManoel = new Goleiro("Vitor Manoel", 9, 7, 9, 10, 8, "Mas Vitor faz sua defesa tranquila", "Vitor defende de boa", "DEFESA MONUMENTAL DE VITOR", "MEUS AMIGOS, QUE DEFESA MILAGROSA DE VITOR, ELE VAI BUSCAR A BOLA NO CANTO");
        Atacante GabrielVitor = new Atacante("Gabriel", 7, 7, 7, 5, "Gabriel nem liga para seu próprio gol", "Gabriel ri do goleiro adversário", "Gabriel faz merda e erra o passe", "Gabriel toma na jabiraca e erra o passe");
        Atacante Luizin = new Atacante("Luizin", 4, 6, 7, 10, "Luizin chora de alegria após seu gol", "Luizin seu time por ajuda-lo a fazer o gol", "Luizin dá uma de Ruinzin e  erra o passe", "Luizin tropeça na bola e cai");
        Atacante Willian = new Atacante("Willian", 9, 10, 9, 8, "E Willian cala a boca da torcida adversária", "Willian grita e pula de alegria", "Willian ferra a jogada e perda a bola", "Willian tenta o drible e perde a bola");
        Atacante Zeca = new Atacante("Zeca", 10, 10, 10, 8, "Kaua da um mortal após o gol", "Kaua grita perto de sua torcida", "Zeca faz merda e perde a jogada", "Zeca tenta o passe para Willian mas joga a bola pra lateral");
        Time S = new Time("2°ano", 10, VitorManoel, GabrielVitor, Luizin, Willian, Zeca);

        //CRIAÇÃO PRIMEIRO ANO
        Goleiro Matheus = new Goleiro("Matheus", 3, 4, 5, 6, 4, "Mas Matheus defende a bola com tranquilidade", "Matheus defende a bola", "DEFESAÇA DE MATHEUS, NEM ELE ACREDITA", "E O PENALTI É MAL COBRADO, MATHEUS DEFENDE A BOLA SEM GRANDES DIFICULDADES");
        Atacante Arthur = new Atacante("Arthur", 6, 6, 9, 4, "Arthur comemora o gol junto a seus amigos", "Arthur chora de emoção", "Arthur passa errado para o Fino", "Arhur toca errado no ataque");
        Atacante Joao = new Atacante("João", 9, 10, 9, 9, "Jão mostra o como os Jões são lendas", "Jão comemora com o outro Jão", "Jão dá uma de Jão e perde a bola", "Jão toca a bola para o adversário");
        Atacante Fino = new Atacante("Emanoel Kant", 8, 9, 8, 9, "Fino cala a boca de todos na arena", "Fino comemora igual Gabigol", "Emanoel fomeia e perde a bola", "Emanoel parte pra jogada individual e perde a bola");
        Atacante Vitor = new Atacante("Vitor", 9, 10, 9, 7, "Vitor da um mortal triplo carpado após o gol", "Vitor representa o poder de seu nome", "Vitor não representa seu nome e perde a bola", "Vitor toca errado para Emanoel");
        Time P = new Time("1°ano", 8, Matheus, Arthur, Joao, Fino, Vitor);
        
        //CRIAÇÃO TERCEIRO ANO
        Goleiro Bahia = new Goleiro("Bahia", 3, 4, 5, 6, 4, "Mas Bahia defende a bola com tranquilidade", "Matheus defende a bola", "DEFESAÇA DE BAHIA, NEM ELE ACREDITA", "E O PENALTI É MAL COBRADO, BAHIA DEFENDE A BOLA SEM GRANDES DIFICULDADES");
        Atacante LuizG = new Atacante("Luiz Gustavo", 6, 6, 9, 4, "Luiz comemora o gol junto a seus amigos", "Luiz chora de emoção", "Luiz passa errado para o Fino", "Luiz toca errado no ataque");
        Atacante VitorD = new Atacante("Vitor Dorta", 9, 10, 9, 9, "Dorta mostra o como os Jões são lendas", "Dorta comemora com Jão", "Dorta dá uma de Jão e perde a bola", "Dorta toca a bola para o adversário");
        Atacante Alexandre = new Atacante("Alexandre", 8, 9, 8, 9, "Alexandre cala a boca de todos na arena", "Alexandre comemora igual Gabigol", "Alexandre fomeia e perde a bola", "Alexandre parte pra jogada individual e perde a bola");
        Atacante Japa = new Atacante("Japa", 9, 10, 9, 7, "Japa da um mortal triplo carpado após o gol", "Japa representa o poder de seu chute", "Japa perde a bola", "Japa toca errado para Alexandre");
        Time T = new Time("3°ano", 8, Bahia, LuizG, VitorD, Alexandre, Japa);
        
        //CRIAÇÃO OS BRABOS
        Goleiro Danilo = new Goleiro("Danilo", 3, 4, 5, 6, 4, "Mas Danilo defende a bola com tranquilidade", "Danilo defende a bola", "DEFESAÇA DE DANILO, NEM ELE ACREDITA", "E O PENALTI É MAL COBRADO, DANILO DEFENDE A BOLA SEM GRANDES DIFICULDADES");
        Atacante Quem = new Atacante("Quem", 6, 6, 9, 4, "Quem comemora o gol junto a seus amigos", "Quem chora de emoção", "Quem passa errado para o Fino", "Quem toca errado no ataque");
        Atacante Rostang = new Atacante("Rostang", 9, 10, 9, 9, "Rostang mostra o como os Jões são lendas", "Rostang comemora com Jão", "Rostang dá uma de Jão e perde a bola", "Rostang toca a bola para o adversário");
        Atacante Thiago = new Atacante("Thiago ", 8, 9, 8, 9, "Thiago cala a boca de todos na arena", "Thiago comemora igual Gabigol", "Thiago fomeia e perde a bola", "Thiago parte pra jogada individual e perde a bola");
        Atacante Jao = new Atacante("Jão", 9, 10, 9, 7, "Jão faz um gol nivel Jão", "Jão representa o poder do verdedeiro Jão", "Jão perde a bola, obviamente ele quis perder pois o Jão nunca perderia uma bola", "Jão toca errado para ele mesmo");
        Time B = new Time("Os Brabos", 8, Danilo, Quem, Rostang, Thiago, Jao);
        
        //CRIAÇÃO TIME FEMININO
        Goleiro Yasmin = new Goleiro("Yasmin", 3, 4, 5, 6, 4, "Mas Yasmin defende a bola com tranquilidade", "Yasmin defende a bola", "DEFESAÇA DE YASMIN, NEM ELE ACREDITA", "E O PENALTI É MAL COBRADO, YASMIN DEFENDE A BOLA SEM GRANDES DIFICULDADES");
        Atacante Karine = new Atacante("Karine", 6, 6, 9, 4, "Karine comemora o gol junto a seus amigos", "Arthur chora de emoção", "Karine passa errado para o Gislayne", "Karine toca errado no ataque");
        Atacante Gislayne = new Atacante("Gislayne", 9, 10, 9, 9, "Gislayne como são as lendas", "Gislayne comemora com Jão", "Gislayne dá uma de Gislayne e perde a bola", "Gislayne toca a bola para o adversário");
        Atacante Vitoria = new Atacante("Vitoria", 8, 9, 8, 9, "Vitoria cala a boca de todos na arena", "Vitoria comemora igual Gabigol", "Vitoria fomeia e perde a bola", "Vitoria parte pra jogada individual e perde a bola");
        Atacante Sofia = new Atacante("Sofia", 9, 10, 9, 7, "Sofia da um mortal triplo carpado após o gol", "Sofia mostre o poder de seu chute", "Sofia perde a bola de forma ridicuka", "Sofia toca errado para Vitoria");
        Time F = new Time("Time Feminino", 8, Yasmin, Karine, Gislayne, Vitoria, Sofia);
        
        Jogo J = new Jogo("quadra do IF");
        J.jogo(T, S);
    }

}
