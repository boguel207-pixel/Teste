public class Main {
    public static void main(String[] args) {
       //CARRO
        Carro carrinho = new Carro();
        carrinho.marca = "FIAT";
        carrinho.modelo = "UNO";
        carrinho.combustivel = "Diesel";
        carrinho.cor = "Rosa";

        System.out.println(carrinho.marca);
        System.out.println(carrinho.modelo);
        System.out.println(carrinho.combustivel);
        System.out.println(carrinho.cor);
        carrinho.ligarMotor();
        carrinho.desligarMotor();

        //MOTO
        Moto motinha = new Moto();
        motinha.marca = "YAMAHA";
        motinha.modelo = "R15";
        motinha.combustivel = "Agua";
        motinha.cilindradas = 1500;
        
        System.out.println(motinha.marca);
        System.out.println(motinha.modelo);
        System.out.println(motinha.combustivel);
        System.out.println(motinha.cilindradas);
        motinha.ligarMotor();
        motinha.desligarMotor();

        //HELICOPTERO
        Helicoptero helicopterozinho = new Helicoptero();
        helicopterozinho.marca = "Sallo Jeans";
        helicopterozinho.modelo = "H160";
        helicopterozinho.ano = 2067;

        System.out.println(helicopterozinho.marca);
        System.out.println(helicopterozinho.modelo);
        System.out.println(helicopterozinho.ano);
        helicopterozinho.girarHelice();
        helicopterozinho.desligarHelice();

        //BALÃO
        Balao balaozinho = new Balao();
        balaozinho.limite_pessoas = 15;

        System.out.println(balaozinho.limite_pessoas);
        balaozinho.acenderBalao();
        balaozinho.subirBalao();
        balaozinho.descerBalao();
    }
}