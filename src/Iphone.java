public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }
    @Override
    public void pausar(){
        System.out.println("Pausando musica");
    }
    @Override
    public void selecionarMusica(String musica){
        System.out.println("A musica -- " + musica + " -- foi selecionada");
    }

    @Override
    public void atender(){
        System.out.println("Atendendo ligacao");
    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correi de voz");
    }

    @Override
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando Aba");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }
    @Override
    public void exibirPagina(String url){
        System.out.println("Pagina : " + url);
    }
}
