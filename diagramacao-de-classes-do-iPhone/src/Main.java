public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

        System.out.println("********************");
        aparelhoTelefonico.selecionarMusica("Nx Zero");
        aparelhoTelefonico.tocar();
        aparelhoTelefonico.pausar();

        System.out.println("********************");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.ligar(38831705);

        System.out.println("********************");
        aparelhoTelefonico.exibirPagina();
        aparelhoTelefonico.atualizarPagina();
        aparelhoTelefonico.adicionarNovaAba();

        System.out.println("********************");
    }
}