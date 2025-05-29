package model;
public class Restaurante {
    private int idRestaurante;
    private String nome;
    private String descricao;
    private String tipoCozinha;
    private float precoMedio;
    private String horarioFuncionamento;
    private String localizacao;

    public Restaurante() {
    }

    public Restaurante(int idRestaurante, String nome, String descricao, String tipoCozinha, float precoMedio,
            String horarioFuncionamento, String localizacao) {
        this.idRestaurante = idRestaurante;
        this.nome = nome;
        this.descricao = descricao;
        this.tipoCozinha = tipoCozinha;
        this.precoMedio = precoMedio;
        this.horarioFuncionamento = horarioFuncionamento;
        this.localizacao = localizacao;
    }

    public int getId() {
        return idRestaurante;
    }

    public void setId(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoCozinha() {
        return tipoCozinha;
    }

    public void setTipoCozinha(String tipoCozinha) {
        this.tipoCozinha = tipoCozinha;
    }

    public float getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(float precoMedio) {
        this.precoMedio = precoMedio;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
