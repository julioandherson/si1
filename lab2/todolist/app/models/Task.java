package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

/**
 * Classe que cria tarefas
 * atributos: id, project, description, priority, situation, FEITO
 * @author
 *
 */
@Entity
public class Task extends Model implements Comparable<Task>{
		
	@Id
    private Long id;
    
    @Required
    private String project;
    
    @Required
    private String description;
    
    @Required
    private int priority;
    
    @Required
    private String situation = "Não feito";
    
    @Required
    static String FEITO = "Feito";
    
    public static Finder<Long,Task> find = new Finder(Long.class, Task.class);
    
    /**
     * 
     * @return lista de todas as tarefas criadas
     */
    public static List<Task> all() {
    	return find.all();
    }

    /**
     * salva uma tarefa
     * @param task
     */
    public static void create(Task task) {
    	task.save();
    }

    /**
     * delelta uma tarefa que teve sua id passada por parametro
     * @param id
     */
    public static void delete(Long id) {
    	find.ref(id).delete();
    }
    
    /**
     * 
     * @return id da tarefa
     */
    public Long getId(){
    	return this.id;
    }
    
    /**
     * altera a id da tarefa
     * @param id
     */
    public void setId(Long id){
    	this.id = id;
    }
    
    /**
     * 
     * @return project da tarefa
     */
    public String getProject(){
    	return this.project;
    }
    
    /**
     * altera o project da tarefa
     * @param project
     */
    public void setProject(String project){
    	this.project = project;
    }
    
    /**
     * 
     * @return description da tarefa
     */
    public String getDescription(){
    	return this.description;
    }
    
    /**
     * altera descricao da tarefa
     * @param description
     */
    public void setDescription(String description){
    	this.description = description;
    }
    
    /**
     * 
     * @return priority da tarefa
     */
    public int getPriority(){
    	return this.priority;
    }
    
    /**
     * altera prioridade da tarefa
     * @param priority
     */
    public void setPriority(int priority){
    	this.priority = priority;
    }
    
    /**
     * 
     * @return situation da tarefa
     */
    public String getSituation(){
    	return this.situation;
    }
    
    /**
     * altera a situacao da tarefa
     * @param situation
     */
    public void setSituation(String situation){
    	this.situation = situation;
    }

    /**
     * atualiza a situacao de nao feita para feita
     * @param id da tarefa a ser atualizada
     */
    public static void updateSituation(Long id){
    	Task taskAux = new Task();
    	Task task = find.ref(id);
    	
    	//MUDA PARA FEITO E REPASSA DADOS DA ANTIGA TASK
    	taskAux.setSituation(FEITO);
    	taskAux.setId(task.getId());
    	taskAux.setProject(task.getProject());
    	taskAux.setDescription(task.getDescription());
    	taskAux.setPriority(task.getPriority());
    	
    	task.delete();
    	taskAux.save();
    }
    
    /**
     * compara a prioridade de duas tarefas
     */
	@Override
	public int compareTo(Task tarefa) {
		int result = tarefa.getPriority() - this.getPriority();
		return result;
	}
}