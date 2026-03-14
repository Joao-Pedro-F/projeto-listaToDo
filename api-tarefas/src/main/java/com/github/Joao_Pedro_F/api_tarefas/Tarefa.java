package com.github.Joao_Pedro_F.api_tarefas;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Tarefa {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String titulo;
	private boolean concluida= false;
	
	
	public Long getId() {return id;}
	public void setId(Long id) {this.id=id;}
	
	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo=titulo;}

	public boolean isConcluida() {return concluida;}
	public void setConcluida(boolean concluida) {this.concluida=concluida;}
	
}
