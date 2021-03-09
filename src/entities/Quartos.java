package entities;
public class Quartos {
    private String nomeDoEstudante;
    private String emailDoEstudante;

    public Quartos(String nomeDoEstudante, String emailDoEstudante) {
        this.nomeDoEstudante = nomeDoEstudante;
        this.emailDoEstudante = emailDoEstudante;
    }

    public String getNomeDoEstudante() {
        return nomeDoEstudante;
    }

    public void setNomeDoEstudante(String nomeDoEstudante) {
        this.nomeDoEstudante = nomeDoEstudante;
    }

    public String getEmailDoEstudante() {
        return emailDoEstudante;
    }

    public void setEmailDoEstudante(String emailDoEstudante) {
        this.emailDoEstudante = emailDoEstudante;
    }
    
    public String toString(){
        return nomeDoEstudante + ", " + emailDoEstudante;
    }
    
}
