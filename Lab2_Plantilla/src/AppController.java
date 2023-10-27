import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class AppController {
    //Objeto objeto = new Objeto();
    Ente ente = new Ente();
    //Arma arma = new Arma();
    //ObjetoCurativo objetoCurativo = new ObjetoCurativo();
    Zombie zombie = new Zombie();

    public void agregarObjeto(ArrayList<Objeto> objetos) {
        //Completar
        Scanner sc = new Scanner(System.in);
        Objeto objeto = new Objeto();
        p1:
        while (true) {
            System.out.println("ingrese el nombre del objeto: ");
            String nombre_ob = sc.nextLine();
            objeto.setNombre(nombre_ob);
            System.out.println("ingrese el uso del objeto: ");
            String uso_ob = sc.nextLine();
            objeto.setDescripcion(uso_ob);
            System.out.println("elija el tipo de objeto: ");
            System.out.println(("1. arma "));
            System.out.println("2. objeto curativo ");
            System.out.println("3. otro ");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1": {
                    while (true) {
                        Arma arma = new Arma();
                        System.out.println("indique el poder del arma: ");
                        String poderstr = sc.nextLine();
                        Double poderdb = Double.parseDouble(poderstr);
                        if (poderdb < 0 || poderdb > 1000) {
                            System.out.println("no valido");
                        } else {
                            Arma.setPoder(poderdb);
                            //objeto.getLista.add(arma);
                            break;
                        }
                    }
                }
                case "2": {

                    while (true) {
                        ObjetoCurativo oc = new ObjetoCurativo();
                        System.out.println("Indique la vida que restaura el objeto: ");
                        String curacion = sc.nextLine();
                        if (curacion.isEmpty()) {
                            System.out.println("Indique la vida que restaura el objeto");
                        } else {
                            ObjetoCurativo.setVidaRestaurada(int.parseInt(curacion));
                            //Objeto.getLista.add(oc);
                            break ;
                        }
                    }
                }
                case "3": {
                    break p1;
                }
            }
        }
    }

    public void agregarZombie(ArrayList<Ente> entes)
    {
        //Completar
        Scanner sc = new Scanner(System.in);
        System.out.println("indique nombre del zombie: ");
        String nombre = sc.nextLine();
        ente.setNombre(nombre);
        System.out.println("Indique la fuerza del zombie: ");
        String fuerza = sc.nextLine();
        System.out.println("Indique la defensa del zombie: ");
        String defensa = sc.nextLine();
        System.out.println("indique la de velocidad del zombie: ");
        String velocidad = sc.nextLine();
        System.out.println("indique la vida del zombie: ");
        String vida = sc.nextLine();
        System.out.println("indique una frase de victoria que diria: ");
        String frase = sc.nextLine();
        System.out.println("zombie añadido con nombre: "+ente.getNombre());
        //System.out.println("elige la opcion que desees: ");
        //String opcion = sc.nextLine();

    }

    public void agregarSuperviviente(ArrayList<Ente> lista,ArrayList<Objeto> objetos)
    {
        //Completar
        Scanner sc = new Scanner(System.in);
        System.out.println("indique nombre del superviviente: ");
        String nombre = sc.nextLine();
        ente.setNombre(nombre);
        System.out.println("Indique la fuerza del superviviente: ");
        String fuerza = sc.nextLine();
        System.out.println("Indique la defensa del superviviente: ");
        String defensa = sc.nextLine();
        System.out.println("indique la de velocidad del superviviente: ");
        String velocidad = sc.nextLine();
        System.out.println("indique la vida del superviviente: ");
        String vida = sc.nextLine();
        System.out.println("indique una frase de victoria que diria: ");
        String frase = sc.nextLine();
        System.out.println("Ingrese la cantidad de objetos que tendra: ");
        String cant = sc.nextLine();

    }

    public int verificarListaPura(ArrayList<Ente> lista){
        //Tu mismo eres

        return  0;
    }

    public Superviviente obtenerSupervivienteMasValiente(ArrayList<Ente> lista){
        //Tu vas por el 20
        return null;
    }

    public Zombie obtenerZombieMasDebil(ArrayList<Ente> lista){
        //Sigue asi tu puedes!!
        Zombie zombie = new Zombie();

        return null;
    }

    public void atacarZombie(double poder, Zombie zombie)
    {
        //Ya falta poco
    }

    public void defenderseDeZombie(double poder, Superviviente superviviente)
    {
        //Veo un futuro 20
    }

}
