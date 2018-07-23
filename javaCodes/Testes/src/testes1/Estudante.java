package testes1;

public class Estudante {

    private String nome;
    private String email;
    private int RA;

    public Estudante(String nome, String email, int RA) {
        this.nome = nome;
        this.email = email;
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    @Override
    public String toString() {
        return "Estudante: " + "nome=" + nome + ", email=" + email + ", RA=" + RA + '\n';
    }
    
    

}
