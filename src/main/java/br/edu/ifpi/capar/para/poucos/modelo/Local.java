package br.edu.ifpi.capar.para.poucos.modelo;

/**Classe que faz especificação de Local
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 */


public class Local {
    private int id;
    private String nome;
    private int capacidade;
    private String cidade;
    private String estado;
    private String rua;
    private int numero;
/**
 * 
 * @return retorna o id do local
 */
    public int getId() {
        return id;
    }
/**
 * 
 * @param id Insere o Id do local 
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * 
 * @return retorna o nome 
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome Insere o nome 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return retona a capacidade do local
 */
    public int getCapacidade() {
        return capacidade;
    }
/**
 * 
 * @param capacidade insere a capacidade
 */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
/**
 * 
 * @return retorna a cidade do local 
 */
    public String getCidade() {
        return cidade;
    }
/**
 * 
 * @param cidade Insere a cidade do local
 */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
/**
 * 
 * @return retorna o Estado 
 */
    public String getEstado() {
        return estado;
    }
/**
 * 
 * @param estado Insere o estado 
 */
    public void setEstado(String estado) {
        this.estado = estado;
    }
/**
 * 
 * @return retorna a rua do local
 */
    public String getRua() {
        return rua;
    }
/**
 * 
 * @param rua insere a rua do local 
 */
    public void setRua(String rua) {
        this.rua = rua;
    }
/**
 * 
 * @return retorna o numero 
 */
    public int getNumero() {
        return numero;
    }
/**
 * 
 * @param numero Insere o numero
 */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
