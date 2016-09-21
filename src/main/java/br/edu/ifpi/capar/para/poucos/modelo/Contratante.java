package br.edu.ifpi.capar.para.poucos.modelo;

/**Classe que faz especificação de Contratante
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 */

public class Contratante {
    private int id;
    private int cpf;
    private String nome;
    private String endereco;
/**
 * 
 * @return retorna o cpf da pessoa
 */
    public int getCpf() {
        return cpf;
    }
/**
 * 
 * @param cpf Insere o cpf 
 */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
/**
 * 
 * @return retorna o nome da pessoa 
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome Insere o nome da pessoa 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return retorna o endereço da pessoa
 */
    public String getEndereco() {
        return endereco;
    }
/**
 * 
 * @param endereco insere o endereço da pessoa
 */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
  /**
  * 
  * @return retorna Id da pessoa
  */   
    public int getId() {
        return id;
    }
 /**
 * 
 * @param id inseri o id da pessoa
 */   
    public void setId(int id) {
        this.id = id;
    }
}
