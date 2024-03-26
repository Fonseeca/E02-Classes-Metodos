public class Conta {
    String dono;
    double saldo;
    int numero;
    String agencia;

    void imprimir(){
        System.out.println("Dono da conta: " + this.dono);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo da conta: " + this.saldo);
        System.out.println("Agência da conta: " + this.agencia); //como assim limite?
    }
}
