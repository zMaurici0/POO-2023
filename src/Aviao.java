public class Aviao extends BaseVeiculos{
    public Aviao(int codigo, String codigoRenavam, String cidadeUF, String estadoUF, String nome, String modelo,
            String cor, String chassi, String placa, int anoModelo, int anoFabricacao, int eixos, double pesoLiquido,
            double pesoTotal, int assentos, int portas, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes) {
        super(codigo, codigoRenavam, cidadeUF, estadoUF, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, eixos,
                pesoLiquido, pesoTotal, assentos, portas, rodas, fabricante, potencia, tipoCombustivel, nomeProprietario,
                tipoVeiculo, qtdeMotores, qtdeOcupantes);
    
    }
    @Override
    public void Imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Codigo Renavam: " + this.codigoRenavam);
        System.out.println("CidadeUF: " + this.cidadeUF);
        System.out.println("EstadoUF" + this.estadoUF);
        System.out.println("Nome: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Chassi: " + this.chassi);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano do Modelo: " + this.anoModelo);
        System.out.println("Ano da Fabricação: " + this.anoFabricacao);
        System.out.println("Eixos: " + this.eixos);
        System.out.println("Peso Liquido: " + this.pesoLiquido);
        System.out.println("Peso Total" + this.pesoTotal);
        System.out.println("Assentos: " + this.assentos);
        System.out.println("Portas: " + this.portas);
        System.out.println("Rodas: " + this.rodas);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Potência: " + this.potencia);
        System.out.println("Tipo do Combustível: " + this.tipoCombustivel);
        System.out.println("Nome do Proprietário: " + this.nomeProprietario);
        System.out.println("Tipo do Veículo: " + this.tipoVeiculo);
        System.out.println("Quantidade de Motores: " + this.qtdeMotores);
        System.out.println("Quantidade de Ocupantes: " + this.qtdeOcupantes);

    }   
   
}
