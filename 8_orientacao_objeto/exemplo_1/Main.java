public class Main {
    public static void main(String[] args) {
        Personagem persona = new Personagem();
        persona.nome = "Donald";
        persona.idade = 12;
        persona.poder = 8001;

        System.out.println(persona.nome);
        System.out.println(persona.idade);
        System.out.println(persona.poder);
        persona.pular();
        persona.correr();
    }
}
