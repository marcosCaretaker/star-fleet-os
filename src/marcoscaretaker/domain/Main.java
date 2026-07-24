package marcoscaretaker.domain;

public class Main {
    static void main() {
        NaveDeBatalha estellar = new NaveDeBatalha("ESTELLAR",100,TipoCombustivel.ANTIMATERIA,60);

        NaveCargueira sedex = new NaveCargueira("SEDEX HOLLY",100,TipoCombustivel.PLASMA,200,60);

        NaveCientifica drStone = new NaveCientifica("DR.STONE",100,TipoCombustivel.FUSAO_NUCLEAR,"QUÍMICA DOS ALIENS");

        SimuladorSetor simulacao = new SimuladorSetor();

        NaveEspacial[] frota = {estellar,sedex,drStone};

        System.out.println("$$$$ SIMULAÇÃO COM NÍVEL DE AMEAÇA [ SEGURO ]");
        System.out.println(" ");
        simulacao.simularEvento(frota,NivelAmeaca.SEGURO,0);
        System.out.println("$$$$ SIMULAÇÃO COM NÍVEL DE AMEAÇA [ ATENÇÃO ]");
        System.out.println(" ");
        simulacao.simularEvento(frota,NivelAmeaca.ATENCAO,10);
        System.out.println("$$$$ SIMULAÇÃO COM NÍVEL DE AMEAÇA [ PERIGO IMINENTE ]");
        System.out.println(" ");
        simulacao.simularEvento(frota,NivelAmeaca.PERIGO_IMINENTE,150);
        System.out.println("$$$$ SIMULAÇÃO COM NÍVEL DE AMEAÇA [ SEGURO ] [ APÓS TODAS AS NAVES ESTAREM DESTRUÍDAS]");
        System.out.println(" ");
        simulacao.simularEvento(frota,NivelAmeaca.SEGURO,10);

    }
}
