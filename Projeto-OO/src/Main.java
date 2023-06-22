public class Main {
    public static void main(String[] args) {
        int i;
        Scanner ler = new Scanner(System.in);
        Estacionamento e1 = new Estacionamento();

        System.out.println("Digite a quantidade máxima do estacionamento: ");
        int valorCapacidade = ler.nextInt();
        i = e1.validarInt(valorCapacidade);
        e1.setCapacidade(valorCapacidade, i);

        System.out.println("Digite o valor do acesso fração do estacionamento: ");
        float valorFracao = ler.nextFloat();
        i = e1.validarFloat(valorFracao);
        e1.setValorFracao(valorFracao, i);

        System.out.println("Digite o valor da porcentagem da hora cheia do estacionamento: ");
        int valorHoraCheia= ler.nextInt();
        i = e1.validarInt(valorHoraCheia);
        e1.setPocentagemHoraCheia(valorHoraCheia, i);

        System.out.println("Digite o valor da porcentagem da diária noturna do estacionamento: ");
        int valorNoturno= ler.nextInt();
        i = e1.validarInt(valorNoturno);
        e1.setPorcentagemNoturno(valorNoturno, i);

        System.out.println("Digite o valor da diária diurna do estacionamento: ");
        float valorDiaria = ler.nextFloat();
        i = e1.validarFloat(valorDiaria);
        e1.setValorDiaria(valorDiaria, i);

        System.out.println("Digite o valor da acesso evento do estacionamento: ");
        float valorEvento = ler.nextFloat();
        i = e1.validarFloat(valorEvento);
        e1.setValorEvento(valorEvento, i);

        System.out.println("Digite o valor da acesso mensalista do estacionamento: ");
        float valorMensalista= ler.nextFloat();
        i = e1.validarFloat(valorMensalista);
        e1.setValorEvento(valorMensalista, i);

        e1.status();
        ler.close();

}