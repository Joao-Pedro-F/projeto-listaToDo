package com.github.Joao_Pedro_F.api_tarefas;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
	private final TarefaRepository repository;
	
	
	public TarefaController(TarefaRepository repository) {
		this.repository=repository;
	}
	
	@GetMapping 
	public List<Tarefa> listar(){
		return repository.findAll();
		
	}
	@PostMapping 
	public Tarefa criar(@RequestBody Tarefa tarefa) {
		return repository.save(tarefa);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		repository.deleteById(id);
	}
	@PatchMapping("/{id}/concluir")
	public Tarefa concluir(@PathVariable Long id) {
		Tarefa tarefa= repository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada."));
		tarefa.setConcluida(!tarefa.isConcluida());
		return repository.save(tarefa);
		
	}
	

}
