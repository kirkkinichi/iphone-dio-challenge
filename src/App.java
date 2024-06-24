public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        //Reprodutor Musical
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        //Navegador na Internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        //AparelhoTelefonico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
