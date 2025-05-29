package model;
public class Prato {
    private int idPrato;
    private String nomePrato;
    private String descricao;
    private float preco;

    public Prato() {
    }

    public Prato(int idPrato, String nomePrato, String descricao, float preco) {
        this.idPrato = idPrato;
        this.nomePrato = nomePrato;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return idPrato;
    }

    public void setId(int idPrato) {
        this.idPrato = idPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
