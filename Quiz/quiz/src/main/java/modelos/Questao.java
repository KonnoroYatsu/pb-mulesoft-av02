package modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questoes")
public class Questao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pergunta;
	private boolean verdadeira;
	private boolean ativa;
	
	public Questao() {}
	
	public String getPergunta() {
		return this.pergunta;
	}
	public boolean isVerdadeira() {
		return this.verdadeira;
	}
	public boolean isAtiva() {
		return this.ativa;
	}
}
