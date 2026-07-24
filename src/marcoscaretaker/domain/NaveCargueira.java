package marcoscaretaker.domain;

public class NaveCargueira extends NaveEspacial{

    double capacidadeDeCarga;
    double cargaAtual;
    public NaveCargueira(String name, double integridadeCasco, TipoCombustivel combustivel) {
        super(name, integridadeCasco, combustivel);
    }

    @Override
    public void executarMissao(NivelAmeaca nivelAmeaca) {

    }

    @Override
    public void enviarRelatorio() {

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
