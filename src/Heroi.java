class Heroi {

    String nome;
    int idade;
    String tipo;


    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }


    public void atacar() {
        String ataque;


        switch (tipo.toLowerCase()) {
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
            case "monge":
                ataque = "usou artes marciais";
                break;
            case "ninja":
                ataque = "usou shuriken";
                break;
            default:
                ataque = "não tem um ataque válido";
                break;
        }


        System.out.println("O " + tipo + " atacou usando " + ataque);
    }
}