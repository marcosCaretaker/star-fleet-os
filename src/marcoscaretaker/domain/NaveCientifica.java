package marcoscaretaker.domain;

public class NaveCientifica extends NaveEspacial{

    String projetoPesquisa;

    public NaveCientifica(String name, double integridadeCasco, TipoCombustivel combustivel) {
        super(name, integridadeCasco, combustivel);
    }

    @Override
    public void executarMissao(NivelAmeaca nivelAmeaca) {

    }

    @Override
    public void enviarRelatorio() {

    }

    public String getProjetoPesquisa() {
        return projetoPesquisa;
    }

    public void setProjetoPesquisa(String projetoPesquisa) {
        this.projetoPesquisa = projetoPesquisa;
    }
}
