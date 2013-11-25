package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import play.mvc.*;
import models.*;
import play.data.*;

public class Application extends Controller {
	static Form<Task> taskForm = Form.form(Task.class);
	static String FEITO = "Feito";
	
    public static Result index() {
        return redirect(routes.Application.tasks());
    }
    
    public static Result tasks() {
    	List<Task> done = new ArrayList<Task>();
    	List<Task> notDone = new ArrayList<Task>();
    	List<Task> all = ordenaPorPrioridade(Task.all());
    	for(Task task : all){
    		if(task.situation.equals(FEITO)){
    			done.add(task);
    		}else{
    			notDone.add(task);
    		}
    	}
    	return ok(views.html.index.render(done, notDone, taskForm));    	
    }
    
    public static Result newTask() {
    	Form<Task> filledForm = taskForm.bindFromRequest();
        if (filledForm.hasErrors()) {
        	List<Task> done = new ArrayList<Task>();
            List<Task> notDone = new ArrayList<Task>();
            List<Task> all = ordenaPorPrioridade(Task.all());
            for (Task task: all){
            	if (task.situation.equals(FEITO)){
            		done.add(task);
            	} else {
            		notDone.add(task);
            	}
            }
            return ok(views.html.index.render(done, notDone, taskForm));
        } else {
        	Task.create(filledForm.get());
            return redirect(routes.Application.tasks());
        }
    }
    
    public static List<Task> ordenaPorPrioridade(List<Task> listaTarefas){
    	List<Task> lista = listaTarefas;
    	Collections.sort(lista);
    	Collections.reverse(lista);
    	return lista;
    }
    
    public static Result deleteTask(Long id){
    	Task.delete(id);
    	return redirect(routes.Application.tasks());
    }
}