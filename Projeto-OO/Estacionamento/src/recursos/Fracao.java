package recursos;

public class Fracao extends Acesso {

    public void calcularFracao() {
      this.valorAcesso = Estacionamento.getValorFracao()*getMinutosTotaisEstacionamento();
}
}
