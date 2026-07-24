package marcoscaretaker.domain;

public class NaveCientifica extends NaveEspacial{

    String projetoPesquisa;
    private NivelAmeaca nivelAmeaca = NivelAmeaca.SEGURO;
    public NaveCientifica(String name, double integridadeCasco, TipoCombustivel combustivel) {
        super(name, integridadeCasco, combustivel);
    }

    @Override
    public void executarMissao(NivelAmeaca nivelAmeaca) {
        switch (nivelAmeaca){
            case PERIGO_IMINENTE:

            case ATENCAO:

            case SEGURO:
        }
    }

    @Override
    public void enviarRelatorio() {
        System.out.println("A nave "+this.getName());
        System.out.println("Com o combustível "+this.getCombustivel());

        System.out.println("ESTADO ATUAL QUE A NAVE SE ENCONTRA: ");
        switch (this.nivelAmeaca){
            case PERIGO_IMINENTE:
                System.out.println("PERIGO IMINENTE!! -NAVE FAZENDO UMA FORTE MANOBRA EVASIVA - SOFREU DANO - PERDEU PARTE DE SUA CARGA ATUAL");
                break;
            case ATENCAO:
                System.out.println("ATENÇÃO!! -NAVE PREPARA AS ARMAS PARA QUALQUER AMEAÇA QUE POSSA SURGIR");
                break;
            case SEGURO:
                System.out.println("SEGURO!! -NAVE PATRULHANDO... TUDO CALMO POR AQUI...");
                break;
        }
        System.out.println("Integridade do casco: {"+this.getIntegridadeCasco()+"}");
    }

    public String getProjetoPesquisa() {
        return projetoPesquisa;
    }

    public void setProjetoPesquisa(String projetoPesquisa) {
        this.projetoPesquisa = projetoPesquisa;
    }
}
