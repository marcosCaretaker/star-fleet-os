package marcoscaretaker.domain;

public class SimuladorSetor {
    public void simularEvento(NaveEspacial[] frota, NivelAmeaca ameaca, double danoGeral) {
        System.out.println(" ");
        System.out.println("@@@@@ EVENTO ->" + ameaca + "<- INICIADO @@@@@");
        System.out.println(" ");
        for (NaveEspacial nave : frota) {
            if (!nave.isExplodiu()) {
                nave.enviarRelatorio();
            }
            System.out.println(" ");
            System.out.println("*****     *****     *****     *****     *****");
            System.out.println(" ");
            if (danoGeral > 0 && !nave.isExplodiu()) {
                nave.executarMissao(ameaca);
                nave.sofrerDano(danoGeral);
                System.out.println("**** RELATÓRIO APÓS EVENTO SER INICIADO ****");
                nave.enviarRelatorio();
                System.out.println(" ");
            } else if (nave.isExplodiu()) {
                System.out.println("--= EVENTO IMPOSSÍVEL DE SER CONCLUÍDO =--");
                System.out.println("A NAVE [" + nave.getName() + "] INFELIZMENTE FOI EXPLODIDA, PORÉM SEMPRE SERÁ LEMBRADA POR SUA PERSEVERANÇA!!!");
            }

        }
        System.out.println(" ");
        System.out.println("@@@@@ EVENTO <-" + ameaca + "->FINALIZADO @@@@@");
        System.out.println(" ");
    }
}
