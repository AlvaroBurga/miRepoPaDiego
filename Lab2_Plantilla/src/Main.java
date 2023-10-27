import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Bienvenido a Zombiweb, donde la mayor pesadilla esta por llegar");
        System.out.print("En la primera etapa vas a configurar tu partida y en la segunda los zombies van a ir a por ti buahaha");
        boolean finInicio = false;
        boolean finjuego = false;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Objeto> objetos = new ArrayList<>();
        ArrayList<Ente> entes = new ArrayList<>();
        AppController controller = new AppController();



        while (!finInicio) {
            System.out.println("Elige la opcion que desees: ");
            System.out.println("1. Añadir objetos a la lista");
            System.out.println("2. Añadir un superviviente");
            System.out.println("3. Añadir un zombie");
            System.out.println("5. Empezar el juego");

            String opcion = scanner.nextLine();

            switch (opcion){
                case "1" -> controller.agregarObjeto(objetos);
                case "2" -> controller.agregarSuperviviente(entes,objetos);
                case "3" -> controller.agregarZombie(entes);
                case "5" -> {
                    int res = controller.verificarListaPura(entes);
                    switch (res){

                        //Completar

                    }

                }
            }
        }

        while (!finjuego)
        {
            System.out.println("Juego iniciado");
            Superviviente supervivienteActivo = controller.obtenerSupervivienteMasValiente(entes);
            Zombie zombieActivo = controller.obtenerZombieMasDebil(entes);
            boolean terminoBatalla = false;
            //Completar el juego
            
        }
    }

}