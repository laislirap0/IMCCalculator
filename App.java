public class App {
    public static void main(String[] args) throws Exception {
        
        // Criando objetos e instanciando
        Pessoa paciente;
        paciente = new Pessoa();

        // Fazendo a abstração do objeto (Pessoa)
        paciente.nome = "Laís";
        paciente.idade = 18;
        paciente.altura = 1.74;
        paciente.peso = 59.0;
        paciente.sexo = "Feminino";
        
        // Trazendo a classe imprimirIMC
        paciente.imprimirIMC();

    }
}
