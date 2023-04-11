package projeto.java.gof.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;


@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;

	public Cliente() {
	}

	public Cliente(Long id, String nome, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Cliente)) return false;
		Cliente cliente = (Cliente) o;
		return Objects.equals(getId(), cliente.getId()) && Objects.equals(getNome(), cliente.getNome()) && Objects.equals(getEndereco(), cliente.getEndereco());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getNome(), getEndereco());
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", endereco=" + endereco +
				'}';
	}
}
