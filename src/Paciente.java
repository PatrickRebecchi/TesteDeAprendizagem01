public class Paciente extends Pessoa{

    String matricula;
    String planoDeSaude;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPlanoDeSuade() {
        return planoDeSaude;
    }

    public void setPlanoDeSuade(String planoDeSuade) {
        this.planoDeSaude = planoDeSuade;
    }
    public void imprimirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Documento: " + documento);
        System.out.println("Matricula do paciente: " + matricula);
        System.out.println("Plano de saúde: " + planoDeSaude);
    }
}
