package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import play.*;
import play.mvc.*;
import models.*;
import play.data.*;
import views.html.*;

public class Application extends Controller {
	static Form<Task> taskForm = Form.form(Task.class);
	

	
	
    public static Result index() {
        return redirect(routes.Application.tasks());
    }
    
    public static Result tasks() {
    	List<Task> allTasks = Task.all();
    	List<Task> done = new ArrayList<Task>();
    	List<Task> notDone = new ArrayList<Task>();
    	
    	for(Task task : Task.all()){
    		//ADICIONA TASKS COM TAG FEITO
    		if(task.situation.equals("Feito")){
    			done.add(task);
    		//ADICIONA TASKS COM TAG NÃO FEITO
    		}else{
    			notDone.add(task);
    		}
    	}
    	
    	return ok(views.html.index.render(done, notDone, taskForm));
    	
    	  //return ok(views.html.index.render(Task.all(), taskForm));
    }
    
    public static Result newTask() {
        Form<Task> filledForm = taskForm.bindFromRequest();
        if (filledForm.hasErrors()) {
                List<Task> all = Task.all();
                //Collections.sort(all);
                Collections.reverse(all);
                List<Task> done = new ArrayList<Task>();
                List<Task> notDone = new ArrayList<Task>();
                
                for (Task t: Task.all()){
                	if (t.situation.equals("Feito")){
                		done.add(t);
                	} else {
                		notDone.add(t);
                	}
                }
                return ok(views.html.index.render(done, notDone, taskForm));
        } else {
                Task.create(filledForm.get());
                return redirect(routes.Application.tasks());
        }
}
    
    public static Result deleteTask(Long id){
    	Task.delete(id);
    	return redirect(routes.Application.tasks());
    }
}
