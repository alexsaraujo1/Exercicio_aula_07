public class App {
    public static void main(String[] args) throws Exception {
        pessoaFisica= new pessoaFisica("Alex", "Araujo", "M", 39f, "01477953540", "solteiro", "44082050")


        System.out.println(pessoaFisica.description());

    }
}


class pessoaFisica {
    
    private String nome;
    private String ultimoNome;
    private String genero;
    private int idade;
    private String cpf;
    private String estadoCivil;
    private String cep;
}
    public pessoaFisica(String nome, String ultimoNome, String genero, int idade, String cpf, String estadoCivil,
            String cep) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.genero = genero;
        this.idade = idade;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.cep = cep;
    }


    public String getNome() {
        return nome;
    }
    public String getUltimoNome() {
        return ultimoNome;
    }
    public String getGenero() {
        return genero;
    }
    public int getIdade() {
        return idade;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public String getCep() {
        return cep;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    

    
public void description(){
System.out.println(
"Meu nome é"+ this.nome +
", Meu ultimo nome é " + this.ultimoNome +
"sou do sexo" + this.genero +
"tenho" + this.idade +
"meu cpf" + this.cpf +
"meu estado civil" + this.estadoCivil+
"moro na rua com cep " + this.cep);


}