public class SistemaBancario {
    double saldo;

    public SistemaBancario(double saldo){
        this.saldo = saldo;
    }


    public double deposito(double deposito) {
        saldo += deposito;
        return deposito;
    }

        public String saque(double saque){
            if (saque>saldo){
               return "Impossivel sacar , saque maior que saldo";
            }
            else{
                saldo-=saque;
                return "Saque realizado com sucesso R$ "+ saque ;
            }
        }
        public double versaldo(){
            return saldo;
        }



}