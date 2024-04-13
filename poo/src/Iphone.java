public class Iphone implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico {
    public Iphone() {
        System.out.println("Iphone ligado!");
    }

    public void startPlayer() {
        System.out.println("Reprodutor Musical");
    }

    public void startPhone() {
        System.out.println("Aparelho Telefonico");
    }

    public void startBrowser() {
        System.out.println("Navegador na Internet");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioDeVoz'");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarNovaPagina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaPagina'");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }
}
