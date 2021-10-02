package Bridge;

// Imagine que um jogo de tiro está rodando num dispositivo (videogame ou PC):
public interface IDispositivo {
    boolean taPausado();

    void pausar();

    int getMunicao();

    void setMunicao(int valor);

    void setMovendoDireita(boolean valor);

    void setMovendoEsqueda(boolean valor);

    boolean getMovendoDireita();

    boolean getMovendoEsquerda();
}
