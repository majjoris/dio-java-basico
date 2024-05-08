public class Iphone implements Navegador_na_Internet,Aparelho_Telefonico,Repodutor_Musicial {

    String Cor;
    String Modelo;
    double Preco;

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Selecionando musica");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorrerioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Adiocionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando pagina");
    }

}
