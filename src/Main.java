
public class Main {
    public static void main(String[] args) {

        Heroi heroi1 = new Heroi("Merlin", 30, "mago");
        Heroi heroi2 = new Heroi("Arthur", 40, "guerreiro");
        Heroi heroi3 = new Heroi("Lao", 25, "monge");
        Heroi heroi4 = new Heroi("Hattori", 20, "ninja");

        heroi1.atacar();  // Exibe: O mago atacou usando magia
        heroi2.atacar();  // Exibe: O guerreiro atacou usando espada
        heroi3.atacar();  // Exibe: O monge atacou usando artes marciais
        heroi4.atacar();  // Exibe: O ninja atacou usando shuriken
    }
}
