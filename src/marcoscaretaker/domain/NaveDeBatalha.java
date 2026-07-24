package marcoscaretaker.domain;

public class NaveDeBatalha extends NaveEspacial{

    int poderDeFogo = 52;
    String estadoAtual = "Seguro";

    public NaveDeBatalha(String name, double integridadeCasco, TipoCombustivel combustivel) {
        super(name, integridadeCasco, combustivel);
    }

    @Override
    public void executarMissao(NivelAmeaca nivelAmeaca) {
        switch (nivelAmeaca){
            case PERIGO_IMINENTE:
                estadoAtual = "Perigo iminente.";
                poderDeFogo -= 4;
            case ATENCAO:
                estadoAtual = "Atenção";
            case SEGURO:
                estadoAtual = "Seguro";
        }
    }

    @Override
    public void enviarRelatorio() {
        System.out.println("A nave "+this.getName());
        System.out.println("Com o combustível "+this.getCombustivel());
        System.out.println("Integridade do casco: "+this.getIntegridadeCasco()+" com o poder de fogo de "+this.poderDeFogo+"un.");
        switch (estadoAtual){
            case "Perigo iminente":
                System.out.println("PERIGO IMINENTE!! ATACANDO COM FORÇA DE 4un");
            case "Atenção":
                System.out.println("ATENÇÃO!! ARMAS PREPARADAS PARA QUALQUER AMEAÇA");
            case "Seguro":
                System.out.println("PATRULHANDO... TUDO CALMO POR AQUI...");
        }
    }

    public int getPoderDeFogo() {
        return poderDeFogo;
    }

    public void setPoderDeFogo(int poderDeFogo) {
        this.poderDeFogo = poderDeFogo;
    }
}
