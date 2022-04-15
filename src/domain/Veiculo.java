package domain;

public class Veiculo implements Comparable<Veiculo>{

    private String marca;
    private String modeloVeiculo;
    private String cor;
    private String placa;
    private int valorDaDiaria;
    private boolean alugado;

    public Veiculo(String marca, String modeloVeiculo, String cor, String placa,
                   int valorDaDiaria, boolean alugado) {
        this.marca = marca;
        this.modeloVeiculo = modeloVeiculo;
        this.cor = cor;
        this.placa = placa;
        this.valorDaDiaria = valorDaDiaria;
        this.alugado = alugado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getValorDaDiaria() {
        return valorDaDiaria;
    }

    public void setValorDaDiaria(int valorDaDiaria) {
        this.valorDaDiaria = valorDaDiaria;
    }

    public boolean isDisponivel() {
        return alugado;
    }

    public void setDisponivel(boolean disponivel) {
        this.alugado = disponivel;
    }

    @Override
    public String toString() {
        return  "Marca: " + marca +" | "+
                "Modelo: " + modeloVeiculo + " | "+
                "Cor: " + cor + " | " +
                "Placa: " + placa + " | " +
                "Valor da Diária R$: " + valorDaDiaria ;
    }

    @Override
    public int compareTo(Veiculo o) {

        if(this.valorDaDiaria < o.valorDaDiaria){
            return -1;
        }
        if(this.valorDaDiaria > o.valorDaDiaria){
            return 1;
        }
        return 0;
    }
}