public class Enfermeiro extends Pessoa{

    String horarioDeTrabalho;
    String setor;
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
    public void setHorarioDeTrabalho(String horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getCartaoDeCadastro() {
        return cartaoDeCadastro;
    }
    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }
    public String getSetor() {
        return setor;
    }

    public void imprimirInfo(){
        System.out.println("Função: " + funcao);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Documento: " + documento);
        System.out.println("Catão de cadastro: " + cartaoDeCadastro);
        System.out.println("Setor de trabalho: " + setor);
        System.out.println("Horario de trabalho: " + horarioDeTrabalho);
    }
}
