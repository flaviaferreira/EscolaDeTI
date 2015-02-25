package applicattion.dao;

public class Animal {
	private long id;
	private String nome;
	
	public Animal(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Animal() {
		
	}

	@Override
	public String toString() {
		return "Animais [id=" + id + ", nome=" + nome + "]";
	}

	public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
