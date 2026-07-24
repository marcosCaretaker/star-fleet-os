package marcoscaretaker.domain;

public class SimuladorSetor {
    public void simularEvento(NaveEspacial[] frota,NivelAmeaca ameaca,double danoGeral){
        for (NaveEspacial nave:frota){
            nave.executarMissao(ameaca);
            if(danoGeral > 0){
                nave.sofrerDano(danoGeral);
            }
            nave.enviarRelatorio();
            System.out.println(" --- --- --- --- ---");
        }
    }
}
