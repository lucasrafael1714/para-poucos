package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 */
public class Tema {
    private int id;
    private String nome;
    private String descricao;
/**
 * 
 * @return retorna o id 
 */
    public int getId() {
        return id;
    }
/**
 * 
 * @param id insere o Id do tema
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * 
 * @return o nome do tema 
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome insere o nome do tema 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return retorna a descrição do tema
 */
    public String getDescricao() {
        return descricao;
    }
/**
 * 
 * @param descricao Insere a descrição do tema
 */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
