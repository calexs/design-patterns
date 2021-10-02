package Bridge;

// Imagine um Joystick retrô parecido com o controle do Atari que pode
// ser usado no PC também.
public class JoystickAtari implements IJoystick {

    protected IDispositivo dispositivo;

    public JoystickAtari() {
    }

    public JoystickAtari(IDispositivo d) {
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
}
