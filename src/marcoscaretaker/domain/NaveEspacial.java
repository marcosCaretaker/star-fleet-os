package marcoscaretaker.domain;

public abstract class NaveEspacial implements Atacavel,Comunicavel {
    private String name;
    private double integridadeCasco = 100;
    private TipoCombustivel combustivel;

    public NaveEspacial(String name, double integridadeCasco, TipoCombustivel combustivel) {
        this.name = name;
        this.integridadeCasco = integridadeCasco;
        this.combustivel = combustivel;
    }

    public abstract void executarMissao(NivelAmeaca nivelAmeaca);

    @Override
    public void sofrerDano(double quantidade) {
        this.integridadeCasco = this.integridadeCasco - quantidade;
        if(this.integridadeCasco <= 0){
            this.integridadeCasco = 0.0F;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIntegridadeCasco() {
        return integridadeCasco;
    }

    public void setIntegridadeCasco(double integridadeCasco) {
        this.integridadeCasco = integridadeCasco;
    }

    public TipoCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(TipoCombustivel combustivel) {
        this.combustivel = combustivel;
    }
}
