package ws;

public class Compte {
    private int code;
    private double solde;

    // Constructors
    public Compte() {}

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    // Getters and setters
    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }
    public double getSolde() { return solde; }
    public void setSolde(double solde) { this.solde = solde; }
}