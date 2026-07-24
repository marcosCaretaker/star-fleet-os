package marcoscaretaker.domain;

public class Main {
    static void main() {
        NaveDeBatalha estellar = new NaveDeBatalha("Killship Vol.1", 100, TipoCombustivel.ANTIMATERIA, 60);
        NaveCargueira sedex = new NaveCargueira("Vega Transport", 100, TipoCombustivel.PLASMA, 200, 60);
        NaveCientifica drStone = new NaveCientifica("Red Apple Explorer", 100, TipoCombustivel.FUSAO_NUCLEAR, "QUÍMICA DOS ALIENS");
        SimuladorSetor simulacao = new SimuladorSetor();
        NaveEspacial[] frota = {estellar, sedex, drStone};
        simulacao.simularEvento(frota, NivelAmeaca.SEGURO, 0);
        simulacao.simularEvento(frota, NivelAmeaca.ATENCAO, 10);
        simulacao.simularEvento(frota, NivelAmeaca.PERIGO_IMINENTE, 88);
        simulacao.simularEvento(frota, NivelAmeaca.PERIGO_IMINENTE, 33);
        simulacao.simularEvento(frota, NivelAmeaca.SEGURO, 10);

    }
}
