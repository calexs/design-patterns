package Factory;

/**
 * @author calexs
 * @version 1.0
 */
public class CreateFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "16 GB", "2 GB", "3.2 GHz");
        Computer server = ComputerFactory.getComputer("server", "32 GB", "10 TB", "3.9 GHz");
        System.out.println("PC Config:" + pc);
        System.out.println("Server Config:" + server);
    }

}