public class Conta2{
    Cliente dono = new Cliente();
    double saldo;
    int numero;
    String agencia;

    void imprimir(){
        System.out.println("Dono da conta: " + this.dono.Nome);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo da conta: " + this.saldo);
        System.out.println("Agência da conta: " + this.agencia); //como assim limite?
    }
}