package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model {
		
	@Id
    public Long id;
    
    @Required
    public String project;
    
    @Required
    public String description;
    
    @Required
    public int priority;
    
    @Required
    public String situation;
    
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
    
    public String getProject(){
    	return this.project;
    }
    
    public void setProject(String project){
    	this.project = project;
    }
    
    public String getDescription(){
    	return this.description;
    }
    
    public int getPriority(){
    	return this.priority;
    }
    
    public String getSituation(){
    	return this.situation;
    }
}