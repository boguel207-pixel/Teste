public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.combustivel);
        System.out.println(carro.cor);
        carro.ligarMotor();
        carro.desligarMotor();

        System.out.println("");

        Moto moto = new Moto();

        System.out.println(moto.marca);
        System.out.println(moto.modelo);
        System.out.println(moto.combustivel);
        System.out.println(moto.cor);
        carro.ligarMotor();
        carro.desligarMotor();
    }
}
