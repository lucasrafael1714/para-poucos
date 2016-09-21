package br.edu.ifpi.capar.para.poucos.modelo;

/**Classe que faz especificação de evento
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 */
public class Evento {
    private int idEvento;
    private String nomeEvento;
    private String dataEvento;
    private int horario;
    private int idadeMinima;
    private int tipo;

    /**
     * @return retorna o id do evento
     */
    public int getIdEvento() {
        return idEvento;
    }

    /**
     * @param idEvento insere o id do evento
     */
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * @return retorna o nome do evento
     */
    public String getNomeEvento() {
        return nomeEvento;
    }

    /**
     * @param nomeEvento insere o nome do evento
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    /**
     * @return retorna a data do evento
     */
    public String getDataEvento() {
        return dataEvento;
    }

    /**
     * @param dataEvento insere a data do evento
     */
    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    /**
     * @return retorna o horario que vai ocorrer o evento
     */
    public int getHorario() {
        return horario;
    }

    /**
     * @param horario insere o horario do evento
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * @return retorna a idade minima para entrar no evento
     */
    public int getIdadeMinima() {
        return idadeMinima;
    }

    /**
     * @param idadeMinima insere a idade minima
     */
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    /**
     * @return retorna o tipo do evento
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo insere o tipo do evento
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
