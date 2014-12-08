package br.com.maxx.bean;

/**
 *
 * @author Joel Rodrigues
 */
public class Pessoa {

    private String cidade;
    private Long id;
    private String nome;
    private Integer idade;
    private String cpfdd;

    public Pessoa() {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpfdd;
    }

    public void setCpf(String cpf) {
        this.cpfdd = cpf;
    }

}
