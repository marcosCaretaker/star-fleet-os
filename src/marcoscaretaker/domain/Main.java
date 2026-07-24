package marcoscaretaker.domain;

public class Main {
    static void main() {
        NaveEspacial estellar = new NaveDeBatalha("ESTELLAR",100,TipoCombustivel.ANTIMATERIA);
        estellar.enviarRelatorio();
    }
}
