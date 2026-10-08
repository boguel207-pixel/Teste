// Classe em PascalCase
public class Aluno {

	// Atributo da classe snake_case
  String nome;
  
	// Método construtor
  public Aluno(String nome) {
    this.nome = nome; // this.nome refere-se ao nome da classe
  }
  
  // Método set em camelCase
  public void setNome(String nome){
	  this.nome = nome;
  }
  
	// Método get em camelCase
  public String getNome(){
	  return this.nome; // recuperando o valor da propriedade interna
  }

	// Método principal da classe
  public static void main(String[] args) {
		// Criando instância
    Aluno estudante = new Aluno("Diogo"); // estudante é um objeto
    
    // Trocando o nome com setter
    estudante.setNome("Joãozinho");
    
    // Exibindo os valores com getter
    System.out.println("Nome do Aluno: " + estudante.getNome());
    
    // Instâncias
	  Curso curso_1 = new Curso("GTI");
    Curso curso_2 = new Curso("ADM");
		// Arrays de cursos
    Curso[] cursos = { curso_1, curso_2 };
    // Exibindo cada curso
    for(Curso curso: cursos){
	    System.out.println("Curso: " + curso.getNome());
    }
  }
  
}

// Classe externa
public class Curso {
	String nome;
	
	public Curso (String nome) {
		this.nome = nome;
	}
	
	public setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
}