package br.edu.ifpi.capar.para.poucos.modelo;

/**Classe que faz especificação de Inscricao
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 */
public class Inscricao {
    private int numero;
    private int codParticipante;
/**
 * 
 * @return retorna o numaro da inscrição 
 */
    public int getNumero() {
        return numero;
    }
/**
 * 
 * @param numero insere o numero da inscrição 
 */
    public void setNumero(int numero) {
        this.numero = numero;
    }
/**
 * 
 * @return retorna o codigo do participante
 */
    public int getCodParticipante() {
        return codParticipante;
    }
/**
 * 
 * @param codParticipante insere o codigo do participante 
 */
    public void setCodParticipante(int codParticipante) {
        this.codParticipante = codParticipante;
    }
}
