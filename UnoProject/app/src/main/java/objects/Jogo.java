package objects;

import java.util.ArrayList;

import enums.Cores;
import enums.TipoCarta;

public class Jogo {

    final int QT_CARTAS_NORMAIS = 19;
    final int QT_CURINGAS_SIMPLES = 8;
    final int QT_CURINGAS_FODOES = 4;

    ArrayList<Carta> cartasMesa = new ArrayList<>();

    ArrayList<Carta> cartasComprar = new ArrayList<>();

    public Jogo(){
        int j = 0;
        for(int i = 0; i < QT_CARTAS_NORMAIS; i ++){
            int num = i > 9? j++ : i;
            Carta cartaAzul = new Carta(Cores.AZUL, TipoCarta.NORMAL, num);
            Carta cartaVermelha = new Carta(Cores.VERMELHO, TipoCarta.NORMAL, num);
            Carta cartaAmarela = new Carta(Cores.AMARELO, TipoCarta.NORMAL, num);
            Carta cartaVerde = new Carta(Cores.VERDE, TipoCarta.NORMAL, num);
            cartasComprar.add(cartaAzul);
            cartasComprar.add(cartaVermelha);
            cartasComprar.add(cartaAmarela);
            cartasComprar.add(cartaVerde);
        }
    }
}
