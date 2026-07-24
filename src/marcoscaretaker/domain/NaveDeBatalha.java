package marcoscaretaker.domain;

public class NaveDeBatalha extends NaveEspacial{
    private NivelAmeaca nivelAmeaca = NivelAmeaca.SEGURO;
    int poderDeFogo;


    public NaveDeBatalha(String name, double integridadeCasco, TipoCombustivel combustivel) {
        super(name, integridadeCasco, combustivel);
    }

    public NaveDeBatalha(String name, double integridadeCasco, TipoCombustivel combustivel, int poderDeFogo) {
        super(name, integridadeCasco, combustivel);
        this.poderDeFogo = poderDeFogo;
    }

    @Override
    public void executarMissao(NivelAmeaca nivelAmeaca) {
        switch (nivelAmeaca){
            case PERIGO_IMINENTE:
                this.nivelAmeaca = nivelAmeaca;
                poderDeFogo -= 5;
                break;
            case ATENCAO,SEGURO:
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
            System.out.println("Integridade do casco: {"+this.getIntegridadeCasco()+"} com o poder de fogo de ["+this.poderDeFogo+"un]");
            if(this.getIntegridadeCasco() <= 20 && this.getIntegridadeCasco() > 0){
                System.out.println("NAVE ESPACIAL COM DANO SEVERO COM MENOS DE 20% DE SUA INTEGRIDADE TOTAL, PERIGO DE EXPLOSAO IMINENTE");
            }else if(this.getIntegridadeCasco() <= 0){
                this.setExplodiu(true);
                System.out.println("NÃO HÁ MAIS NADA A SER FEITO A NAVE "+this.getName()+" EXPLODIU... :(((");
                return;
            }
        }
        System.out.println("ESTADO ATUAL QUE A NAVE SE ENCONTRA: ");
        switch (this.nivelAmeaca){
            case PERIGO_IMINENTE:
                System.out.println("PERIGO IMINENTE!! -NAVE ATACANDO COM PODER DE FOGO DE 5un - SOFREU FORTE DANO");
                break;
            case ATENCAO:
                System.out.println("ATENÇÃO!! -NAVE PREPARA AS ARMAS PARA QUALQUER AMEAÇA QUE POSSA SURGIR");
                break;
            case SEGURO:
                System.out.println("SEGURO!! -NAVE PATRULHANDO... TUDO CALMO POR AQUI...");
                break;
        }
    }


    public int getPoderDeFogo() {
        return poderDeFogo;
    }

    public void setPoderDeFogo(int poderDeFogo) {
        this.poderDeFogo = poderDeFogo;
    }
}
