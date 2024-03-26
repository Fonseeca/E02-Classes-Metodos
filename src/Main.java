public class Main {
    public static void main(String[]args){
        Conta conta1 = new Conta();
        Conta2 conta2 = new Conta2();

        conta1.dono = "Jubileu";
        conta1.numero = 1;
        conta1.saldo = 1000;
        conta1.agencia = "333-33";
        conta1.imprimir();

        conta2.dono.Nome = "Júlia";
        conta2.dono.CPF = "999.999.999 - 99";
        conta2.dono.Endereco = "Ibiritexas";
        conta2.dono.Idade =  16;
        conta2.dono.Sexo = "fem";
        conta2.numero = 1234;
        conta2.saldo = 3000;
        conta2.agencia = "222-22";

        conta2.imprimir();
    }
}
