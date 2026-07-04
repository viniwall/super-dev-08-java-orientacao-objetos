import javax.swing.JOptionPane;

public class CarroExecutor {
    public void executar() {
        Carro uno = new Carro();
        uno.motor = 3.5;
        uno.modelo = "Uno com escada";
        uno.cor = "Claro";
        uno.isEletrico = false;
        uno.marca = "Fiat";
        uno.aro = 14;

        uno.modelo = "Uno com escada Dupla";
        uno.motor = 7.0;
        uno.cor = "Relampago do Marquinhos";

        Carro carro1 = new Carro();
        carro1.modelo = JOptionPane.showInputDialog("Insira o modelo do carro");
        carro1.cor = JOptionPane.showInputDialog("Insira a cor do carro");
        carro1.isEletrico = Boolean.parseBoolean(JOptionPane.showInputDialog("Carro é elétrico? [true/false]"));
        carro1.motor = Double.parseDouble(JOptionPane.showInputDialog("Insira o potencia do motor"));
        carro1.marca = JOptionPane.showInputDialog("Insira a marca do carro");
        carro1.aro = Integer.parseInt(JOptionPane.showInputDialog("Insira o aro do carro"));

        JOptionPane.showMessageDialog(null, 
            "==Dados do Uno ==" + 
            "\nModelo: " + uno.modelo + 
            "\nPotência do motor: " + uno.motor + 
            "\nCor do carro: " + uno.cor + 
            "\nCarro é elétrico? " + uno.isEletrico + 
            "\nMarca do carro: " + uno.marca + 
            "\nAro: " + uno.aro + "\n\n" + 
        
            "==Dados do "+carro1.modelo+"==" +
            "\nModelo: " + carro1.modelo + 
            "\nPotência do motor: " + carro1.motor + 
            "\nCor do carro: " + carro1.cor + 
            "\nCarro é elétrico? " + carro1.isEletrico + 
            "\nMarca do carro: " + carro1.marca + 
            "\nAro: " + carro1.aro + "\n\n"
        );
    }
}