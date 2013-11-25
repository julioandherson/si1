package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model implements Comparable<Task>{
		
	@Id
    public Long id;
    
    @Required
    public String project;
    
    @Required
    public String description;
    
    @Required
    public int priority;
    
    @Required
    public String situation = "Não feito";
    
    static String FEITO = "Feito";
    
    public static Finder<Long,Task> find = new Finder(Long.class, Task.class);
    
    public static List<Task> all() {
    	return find.all();
    }

    public static void create(Task task) {
    	task.save();
    }

    public static void delete(Long id) {
    	find.ref(id).delete();
    }
    
    public Long getId(){
    	return this.id;
    }
    
    public void setId(Long id){
    	this.id = id;
    }
    
    public String getProject(){
    	return this.project;
    }
    
    public void setProject(String project){
    	this.project = project;
    }
    
    public String getDescription(){
    	return this.description;
    }
    
    public void setDescription(String description){
    	this.description = description;
    }
    
    public int getPriority(){
    	return this.priority;
    }
    
    public void setPriority(int priority){
    	this.priority = priority;
    }
    
    public String getSituation(){
    	return this.situation;
    }
    
    public void setSituation(String situation){
    	this.situation = situation;
    }

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
    
	@Override
	public int compareTo(Task tarefa) {
		int result = tarefa.getPriority() - this.getPriority();
		return result;
	}
}