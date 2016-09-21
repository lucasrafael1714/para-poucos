package br.edu.ifpi.capar.para.poucos.modelo;

/**Classe que faz especificação de Organizador
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 */
public class Organizador {
    private int id;
    private int cpf;
    private int contato;
    private String nome;
    private String agencia;
    private String email;
/**
 * 
 * @return retorna o cpf 
 */
    public int getCpf() {
        return cpf;
    }
/**
 * 
 * @param cpf insere o cpf do organizador
 */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
/**
 * 
 * @return retorna o contato 
 */
    public int getContato() {
        return contato;
    }
/**
 * 
 * @param contato insere o contato do organizador 
 */
    public void setContato(int contato) {
        this.contato = contato;
    }
/**
 * 
 * @return retorna nome 
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome insere o nome 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return retorna a agencia do organizador
 */
    public String getAgencia() {
        return agencia;
    }
/**
 * 
 * @param agencia insere a agencia do organizador 
 */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
/**
 * 
 * @return retorna o email 
 */
    public String getEmail() {
        return email;
    }
/**
 * 
 * @param email insere o email do organizador 
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * 
 * @return retorna o id
 */
    public int getId() {
        return id;
    }
/**
 * 
 * @param id insere o id do organizador 
 */
    public void setId(int id) {
        this.id = id;
    }
}
