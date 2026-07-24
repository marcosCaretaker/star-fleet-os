package marcoscaretaker.domain;

public class SimuladorSetor {
    public void simularEvento(NaveEspacial[] frota,NivelAmeaca ameaca,double danoGeral){
        for (NaveEspacial nave:frota){
            System.out.println("**** RELATÓRIO ANTES DE SIMULAR O EVENTO ****");
            nave.enviarRelatorio();
            System.out.println(" --- --- --- --- ---");
            if(danoGeral > 0 && !nave.isExplodiu()){
                nave.executarMissao(ameaca);
                nave.sofrerDano(danoGeral);
                System.out.println("**** RELATÓRIO DEPOIS DE SIMULAR O EVENTO ****");
                nave.enviarRelatorio();
                System.out.println(" ");
            }else if(nave.isExplodiu()) {
                System.out.println("NAVE NÃO EXISTE MAIS,"+nave.getName()+" VAI SER SEMPRE LEMBRADA, POR SUA PERSEVERANÇA, MAS INFELIZMENTE FOI EXPLODIDA!!!");
            }
            System.out.println("@@@@@ RELATÓRIO FINALIZADO @@@@@");
            System.out.println(" ");
        }
    }
}
