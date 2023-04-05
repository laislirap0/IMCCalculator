    public class Pessoa {
        
        // Creating atributtes
        public String nome;
        public int idade;
        public double altura;
        public double peso;
        public String sexo;

        // Constructor padrão
        Pessoa () {

        }

        // Criando funcionalidade
        
        Pessoa (String nome, int idade, double altura, double peso, String sexo) {
            this.nome = nome;
            this.idade = idade; 
            this.altura = altura;
            this.peso = peso;
            this.sexo = sexo;
        }

        public double calcIMC() {
            return  this.peso / (this.altura*this.altura);
        }

        public void imprimirIMC() {
            double resultado = this.calcIMC();

            System.out.println("Nome: " + this.nome);
            System.out.println("IMC: " + resultado);

            if (resultado < 18.5) {
                System.out.println("Abaixo do peso normal.");
            } else if (resultado < 25) {
                System.out.println("Peso normal.");
            } else if (resultado <= 30) {
                System.out.println("Acima do peso normal.");
            } else {
                System.out.println("Obeso.");
            }
        }


}
