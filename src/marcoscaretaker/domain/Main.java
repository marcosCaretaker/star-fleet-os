package marcoscaretaker.domain;

public class Main {
    static void main() {
        NaveDeBatalha estellar = new NaveDeBatalha("ESTELLAR",100,TipoCombustivel.ANTIMATERIA,60);

        NaveCargueira sedex_holly = new NaveCargueira("SEDEX HOLLY",100,TipoCombustivel.PLASMA,200,60);

        SimuladorSetor simulacao = new SimuladorSetor();
        NaveEspacial[] frota = {estellar,sedex_holly};
        simulacao.simularEvento(frota,NivelAmeaca.PERIGO_IMINENTE,60);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        simulacao.simularEvento(frota,NivelAmeaca.PERIGO_IMINENTE,42);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        simulacao.simularEvento(frota,NivelAmeaca.PERIGO_IMINENTE,10);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        simulacao.simularEvento(frota,NivelAmeaca.PERIGO_IMINENTE,10);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        simulacao.simularEvento(frota,NivelAmeaca.PERIGO_IMINENTE,10);
    }
}
