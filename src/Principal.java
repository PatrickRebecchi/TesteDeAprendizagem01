public class Principal {
    public static void main(String[] args) {
        Paciente paciente01 = new Paciente();
        System.out.println("*".repeat(30));
        System.out.println("Informações sobre atendimento");
        System.out.println("*".repeat(30));
        System.out.println("Paciente");
        System.out.println(" ");
        paciente01.nome = "Patrick";
        paciente01.idade = 25;
        paciente01.documento = "111.111.111-11";
        paciente01.matricula = "105";
        paciente01.planoDeSaude = "Bradesco";
        paciente01.imprimirInfo();

        System.out.println("*".repeat(30));
        System.out.println("Primeiro atendimento: ");

        Enfermeiro enfermeiro01 = new Enfermeiro();
        System.out.println(" ");
        enfermeiro01.funcao = "Enfermeiro(a)";
        enfermeiro01.nome = "Lucio";
        enfermeiro01.idade = 34;
        enfermeiro01.documento = "175.14l.125-00";
        enfermeiro01.cartaoDeCadastro = "Elucio25";
        enfermeiro01.horarioDeTrabalho = "07:00 as 19:00";
        enfermeiro01.setor = "Emergencia";
        enfermeiro01.imprimirInfo();

        System.out.println("*".repeat(30));
        System.out.println("Segunda atendimento: ");

        Medico medico01 = new Medico();
        System.out.println(" ");
        medico01.funcao = "Médico";
        medico01.nome = "Ronaldo";
        medico01.idade = 48;
        medico01.documento = "585.085.268-87";
        medico01.cartaoDeCadastro = "Mluiz28";
        medico01.horarioDeTrabalho = "08:00 as 15:00";
        medico01.especialidade = "Ortopedia";
        medico01.imprimirInfo();

    }
}