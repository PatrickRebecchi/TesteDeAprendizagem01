public class Medico extends Pessoa {

    String horarioDeTrabalho;
    String especialidade;
    String cartaoDeCadastro;
    String funcao;

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setCartaoDeCadastro(String cartaoDeCadastro) {
        this.cartaoDeCadastro = cartaoDeCadastro;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setHorarioDeTrabalho(String horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }
    public String getCartaoDeCadastro() {
        return cartaoDeCadastro;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }
    public void imprimirInfo(){
        System.out.println("Função: " + funcao);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Documento: " + documento);
        System.out.println("Catão de cadastro: " + cartaoDeCadastro);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Horario de trabalho: " + horarioDeTrabalho);
    }
}