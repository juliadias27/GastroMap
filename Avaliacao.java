package model;
public class Avaliacao {
    private int idAvaliacao;
    private float nota;
    private String comentario;
    private String dataAvaliacao;

    public Avaliacao() {
    }
    public Avaliacao(int idAvaliacao, float nota, String comentario, String dataAvaliacao) {
        this.idAvaliacao = idAvaliacao;
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
    }
    public int getIdAvaliacao() {
        return idAvaliacao;
    }
    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getDataAvaliacao() {
        return dataAvaliacao;
    }
    public void setDataAvaliacao(String dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
}
