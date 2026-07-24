package marcoscaretaker.domain;

public class NaveCargueira extends NaveEspacial {
    private NivelAmeaca nivelAmeaca = NivelAmeaca.SEGURO;
    double capacidadeDeCarga;
    double cargaAtual;

    public NaveCargueira(String name, double integridadeCasco, TipoCombustivel combustivel) {
        super(name, integridadeCasco, combustivel);
    }

    public NaveCargueira(String name, double integridadeCasco, TipoCombustivel combustivel, double capacidadeDeCarga, double cargaAtual) {
        super(name, integridadeCasco, combustivel);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.cargaAtual = cargaAtual;
    }

    @Override
    public void executarMissao(NivelAmeaca nivelAmeaca) {
        switch (nivelAmeaca) {
            case PERIGO_IMINENTE:
                this.nivelAmeaca = nivelAmeaca;
                this.cargaAtual -= 2;
                break;
            case ATENCAO, SEGURO:
                this.nivelAmeaca = nivelAmeaca;
                break;
        }
    }

    @Override
    public void enviarRelatorio() {
        System.out.println("A nave "+this.getName());
        System.out.println("Com o combustível "+this.getCombustivel());



        if(this.isExplodiu()){
            System.out.println("NÃO HÁ MAIS NADA A SER FEITO A NAVE "+this.getName()+" EXPLODIU... :(((");
            return;
        }else{
            System.out.println("Integridade do casco: {"+this.getIntegridadeCasco()+"} com a capacidade de carga["+this.capacidadeDeCarga+"] e carga atual de ["+this.cargaAtual+"]");
            if(this.getIntegridadeCasco() <= 20 && this.getIntegridadeCasco() > 0){
                System.out.println("##### NAVE ESPACIAL COM DANO SEVERO COM MENOS DE 20% DE SUA INTEGRIDADE TOTAL, PERIGO DE EXPLOSAO IMINENTE #####");
            }else if(this.getIntegridadeCasco() <= 0){
                this.setExplodiu(true);
                System.out.println("NÃO HÁ MAIS NADA A SER FEITO A NAVE "+this.getName()+" EXPLODIU... :(((");
                return;
            }
        }
        System.out.println("ESTADO ATUAL QUE A NAVE SE ENCONTRA: ");
        switch (this.nivelAmeaca) {
            case PERIGO_IMINENTE:
                System.out.println("PERIGO IMINENTE!! -NAVE FAZENDO UMA FORTE MANOBRA EVASIVA - SOFREU DANO - PERDEU PARTE DE SUA CARGA ATUAL");
                break;
            case ATENCAO:
                System.out.println("ATENÇÃO!! -NAVE PREPARA SEUS JATOS PARA QUALQUER MANOBRA EVASIVA QUE POSSA SURGIR");
                break;
            case SEGURO:
                System.out.println("SEGURO!! -NAVE TRAFEGANDO PARA SUAS ENTREGAS... TUDO CALMO POR AQUI...");
                break;
        }

    }

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }
}
