package marcoscaretaker.domain;

public class NaveCientifica extends NaveEspacial {

    String projetoPesquisa;
    int porcentagemProjetoPesquisa = 100;
    private NivelAmeaca nivelAmeaca = NivelAmeaca.SEGURO;


    public NaveCientifica(String name, double integridadeCasco, TipoCombustivel combustivel) {
        super(name, integridadeCasco, combustivel);
    }

    public NaveCientifica(String name, double integridadeCasco, TipoCombustivel combustivel, String projetoPesquisa) {
        super(name, integridadeCasco, combustivel);
        this.projetoPesquisa = projetoPesquisa;
    }

    @Override
    public void executarMissao(NivelAmeaca nivelAmeaca) {
        switch (nivelAmeaca) {
            case PERIGO_IMINENTE:
                this.nivelAmeaca = nivelAmeaca;
                this.porcentagemProjetoPesquisa -= 5;
                break;
            case ATENCAO:
                this.nivelAmeaca = nivelAmeaca;
                this.porcentagemProjetoPesquisa -= 2;
                break;
            case SEGURO:
                this.nivelAmeaca = nivelAmeaca;
                break;
        }
    }

    @Override
    public void enviarRelatorio() {
        System.out.println("A nave " + this.getName());
        System.out.println("Com o combustível " + this.getCombustivel());
        if (this.isExplodiu()) {
            System.out.println("NÃO HÁ MAIS NADA A SER FEITO A NAVE " + this.getName() + " EXPLODIU... :(((");
            return;
        } else {
            System.out.println("Integridade do casco: {" + this.getIntegridadeCasco() + "} nave está com o projeto de pesquisa[" + this.projetoPesquisa + "] com sua potência em [" + this.porcentagemProjetoPesquisa + "%]");
            if (this.getIntegridadeCasco() <= 20 && this.getIntegridadeCasco() > 0) {
                System.out.println("##### NAVE ESPACIAL COM DANO SEVERO COM MENOS DE 20% DE SUA INTEGRIDADE TOTAL, PERIGO DE EXPLOSAO IMINENTE #####");
            } else if (this.getIntegridadeCasco() <= 0) {
                this.setExplodiu(true);
                System.out.println("NÃO HÁ MAIS NADA A SER FEITO A NAVE " + this.getName() + " EXPLODIU... :(((");
                return;
            }
        }
        System.out.println("ESTADO ATUAL QUE A NAVE SE ENCONTRA: ");
        switch (this.nivelAmeaca) {
            case PERIGO_IMINENTE:
                System.out.println("PERIGO IMINENTE!! -NAVE FAZENDO SUAS PESQUISA TENTANDO PROTEGER AO MÁXIMO DE SEUS DADOS E PROJETO - SOFREU DANO - PERDEU PARTE DE SUA POTÊNCIA DE PESQUISA");
                break;
            case ATENCAO:
                System.out.println("ATENÇÃO!! -NAVE FAZENDO SUAS PESQUISAS E SENDO VIGIADA - DIMINUIU POUCO DE SUA POTÊNCIA DE PESQUISA PARA NÃO SER DETECTADA");
                break;
            case SEGURO:
                System.out.println("SEGURO!! -NAVE OBTENDO ÓTIMOS RESULTADOS DE SUA PESQUISA");
                break;
        }

    }

    public String getProjetoPesquisa() {
        return projetoPesquisa;
    }

    public void setProjetoPesquisa(String projetoPesquisa) {
        this.projetoPesquisa = projetoPesquisa;
    }
}
