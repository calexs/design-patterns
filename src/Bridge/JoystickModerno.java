package Bridge;

public class JoystickModerno implements IJoystick {
    protected IDispositivo dispositivo;

    public JoystickModerno() {
    }

    public JoystickModerno(IDispositivo d) {
        this.dispositivo = d;
    }

    public void moveDireita() {
        if (dispositivo.getMovendoDireita() == false) {
            dispositivo.setMovendoDireita(true);
        }
    }

    public void moveEsquerda() {
        if (dispositivo.getMovendoEsquerda() == false) {
            dispositivo.setMovendoEsqueda(true);
        }
    }

    public void pausa() {
        if (dispositivo.taPausado() == false) {
            dispositivo.pausar();
        }
    }

    public void verConquistas() {
        Videogame videogame = null;
        if ((dispositivo instanceof Videogame) == true) {
            videogame = new Videogame();
            videogame.verConquistas();
        }
    }

    public void atirar() {
        dispositivo.setMunicao(dispositivo.getMunicao() - 1);
    }

    public void recarregar() {
        if (dispositivo.getMunicao() <= 29) {
            dispositivo.setMunicao(30);
        }
    }
}