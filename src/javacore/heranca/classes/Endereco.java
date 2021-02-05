package javacore.heranca.classes;

public class Endereco {
    private String rua;
    private String bairro;

    public Endereco(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Endereco() {
    }

    public void imprime(){
        System.out.println("Rua: "+this.rua);
        Pessoa pessoa = new Pessoa("Pedro");

        System.out.println();
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
