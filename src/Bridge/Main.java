package Bridge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao;
        boolean a = false;

        do {
            try {
                System.out.println("Digite um dispositivo:\n1-> PC\n2-> Videogame\n");
                opcao = Integer.parseInt(s.nextLine());

                if (opcao == 1) {
                    System.out.println("Digite um joystick:\n3->atari\n4->moderno\n");
                    int opcao2 = Integer.parseInt(s.nextLine());
                    a = false;

                    switch (opcao2) {
                        case 3:
                            Computador pc = new Computador();
                            JoystickAtari atari = new JoystickAtari(pc);
                            System.out.println("5-> mover direita\n6-> mover esquerda\n7->pausar\n");
                            int opcao3 = Integer.parseInt(s.nextLine());

                            if (opcao3 == 5) {
                                atari.moveDireita();
                            }

                            else if (opcao3 == 6) {
                                atari.moveEsquerda();
                            }

                            else if (opcao3 == 7) {
                                atari.pausa();
                            }

                            System.out.println("esquerda: " + atari.dispositivo.getMovendoEsquerda() + " direita: "
                                    + atari.dispositivo.getMovendoDireita() + " pause: "
                                    + atari.dispositivo.taPausado());
                            break;

                        case 4:
                            Computador pc2 = new Computador();
                            JoystickModerno moderno = new JoystickModerno(pc2);
                            System.out.println(
                                    "5-> mover direita\n6-> mover esquerda\n7->pausar\n8-> atirar\n9->conquistas");
                            int opcao33 = Integer.parseInt(s.nextLine());

                            if (opcao33 == 5) {
                                moderno.moveDireita();
                            }

                            else if (opcao33 == 6) {
                                moderno.moveEsquerda();
                            }

                            else if (opcao33 == 7) {
                                moderno.pausa();
                            }

                            else if (opcao33 == 8) {
                                moderno.atirar();
                            }

                            System.out.println("esquerda: " + moderno.dispositivo.getMovendoEsquerda() + " direita: "
                                    + moderno.dispositivo.getMovendoDireita() + " pause: "
                                    + moderno.dispositivo.taPausado() + " municao: " + moderno.dispositivo.getMunicao()
                                    + " menu de conquistas: ");

                            break;
                    }
                }

                else if (opcao == 2) {
                    System.out.println("Digite um joystick:\n3->atari\n4->moderno\n");
                    int opcao2 = Integer.parseInt(s.nextLine());
                    a = false;

                    switch (opcao2) {
                        case 3:
                            Videogame v = new Videogame();
                            JoystickAtari atari = new JoystickAtari(v);
                            System.out.println("5-> mover direita\n6-> mover esquerda\n7->pausar\n");
                            int opcao3 = Integer.parseInt(s.nextLine());

                            if (opcao3 == 5) {
                                atari.moveDireita();
                            }

                            else if (opcao3 == 6) {
                                atari.moveEsquerda();
                            }

                            else if (opcao3 == 7) {
                                atari.pausa();
                            }

                            System.out.println("esquerda: " + atari.dispositivo.getMovendoEsquerda() + " direita: "
                                    + atari.dispositivo.getMovendoDireita() + " pause: "
                                    + atari.dispositivo.taPausado());

                            break;

                        case 4:
                            Computador v2 = new Computador();
                            JoystickModerno moderno = new JoystickModerno(v2);
                            System.out.println(
                                    "5-> mover direita\n6-> mover esquerda\n7->pausar\n8-> atirar\n9->conquistas");
                            int opcao33 = Integer.parseInt(s.nextLine());

                            if (opcao33 == 5) {
                                moderno.moveDireita();
                            }

                            else if (opcao33 == 6) {
                                moderno.moveEsquerda();
                            }

                            else if (opcao33 == 7) {
                                moderno.pausa();
                            }

                            else if (opcao33 == 8) {
                                moderno.atirar();
                            }

                            System.out.println("esquerda: " + moderno.dispositivo.getMovendoEsquerda() + " direita: "
                                    + moderno.dispositivo.getMovendoDireita() + " pause: "
                                    + moderno.dispositivo.taPausado() + " municao: " + moderno.dispositivo.getMunicao()
                                    + " menu de conquistas: ");

                            break;
                    }
                }

            }

            catch (NumberFormatException ex) {
                a = true;
                System.out.println("invalido");
            }
        } while (a == true);

        s.close();
    }
}
