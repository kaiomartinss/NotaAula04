public class Funcionario {
    protected double salario;
    protected String nome;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularBonus() {
        return 0.1 * salario;
    }
    public double calcularSalario() {
        return salario + calcularBonus();
    }
}
