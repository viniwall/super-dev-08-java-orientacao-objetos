import javax.swing.JOptionPane;
public class FabricanteExecutor {
    public void executar() {
        Fabricante renaux = new Fabricante();
        renaux.razaoSocial = "renaux Linhas e Fios";
        renaux.CNPJ = "000.000/0000.-00";
        renaux.faturamento = 3_000_000.00;
        renaux.percentualLucro = 25;
        renaux.lucroFinal = calcularLucroFinal(renaux);
        Fabricante havan = new Fabricante();
        havan.razaoSocial = "Havan";
        havan.CNPJ = "123.456/7891-112";
        havan.faturamento = 289_000_000;
        havan.percentualLucro = 35;
        havan.lucroFinal = calcularLucroFinal(havan);
        JOptionPane.showMessageDialog(null, 
            "==Empresa 1==" +
            "\nRazão Social: " + renaux.razaoSocial + 
            "\nCNPJ: " + renaux.CNPJ + 
            "\nFaturamento: " + renaux.faturamento + 
            "\nPercentual de Lucro: " + renaux.percentualLucro + 
            "\nLucro Final: " + renaux.lucroFinal + "\n\n" + 
            "==Empresa 2==" +
            "\nRazão Social: " + havan.razaoSocial + 
            "\nCNPJ: " + havan.CNPJ + 
            "\nFaturamento: " + havan.faturamento + 
            "\nPercentual de Lucro: " + havan.percentualLucro + 
            "\nLucro Final: " + havan.lucroFinal
        );
    }
    private double calcularLucroFinal(Fabricante fabricante) {
        double lucroFinal =  (fabricante.percentualLucro/100)* fabricante.faturamento;
        return lucroFinal;
    }
}