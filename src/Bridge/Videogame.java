package Bridge;

public class Videogame implements IDispositivo {

    private boolean pause = false;
    private int municao = 30;
    private boolean direita = false;
    private boolean esquerda = false;

    // No xbox e no playstation você pode ver conquistas através de
    // um botão no joystick moderno.
    private boolean menuConquistas = false;

    @Override
    public boolean taPausado() {
        return pause;
    }

    @Override
    public void pausar() {
        if (taPausado() == false) {
            pause = true;
        } else {
            pause = false;
        }
    }

    @Override
    public int getMunicao() {
        return municao;
    }

    @Override
    public void setMunicao(int valor) {
        if (municao != 0) {
            municao = valor;
        }
    }

    @Override
    public void setMovendoDireita(boolean valor) {
        if (direita == false && valor == true) {
            esquerda = false;
            direita = valor;
        }
    }

    @Override
    public void setMovendoEsqueda(boolean valor) {

        if (esquerda == false && valor == true) {
            direita = false;
            esquerda = valor;
        }

    }

    @Override
    public boolean getMovendoDireita() {
        return direita;
    }

    @Override
    public boolean getMovendoEsquerda() {
        return esquerda;
    }

    public void verConquistas() {
        if (menuConquistas == false) {
            menuConquistas = true;
        } else {
            menuConquistas = false;
        }
    }
}
