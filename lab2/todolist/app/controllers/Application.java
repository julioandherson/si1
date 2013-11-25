package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import play.mvc.*;
import models.*;
import play.data.*;

/**
 * 
 * @author
 *
 */
public class Application extends Controller {
	static Form<Task> taskForm = Form.form(Task.class);
	static String FEITO = "Feito";
	
	/**
	 * redireciona direto para tarefas
	 * @return
	 */
    public static Result index() {
        return redirect(routes.Application.tasks());
    }
    
    /**
     * 
     * @return lista de tarefas feitas, nao feitas e o formulario de tarefa
     */
    public static Result tasks() {
    	List<Task> listaTarefaFeita = new ArrayList<Task>();
    	List<Task> listaTarefaNaoFeita = new ArrayList<Task>();
    	List<Task> todasTarefas = ordenaPorPrioridade(Task.all());
    	for(Task task : todasTarefas){
    		if(task.getSituation().equals(FEITO)){
    			listaTarefaFeita.add(task);
    		}else{
    			listaTarefaNaoFeita.add(task);
    		}
    	}
    	return ok(views.html.index.render(listaTarefaFeita, listaTarefaNaoFeita, taskForm));    	
    }
    
    /**
     * 
     * @return
     */
    public static Result newTask() {
    	Form<Task> filledForm = taskForm.bindFromRequest();
        if (filledForm.hasErrors()) {
        	List<Task> listaTarefaFeita = new ArrayList<Task>();
            List<Task> listaTarefaNaoFeita = new ArrayList<Task>();
            List<Task> todasTarefas = ordenaPorPrioridade(Task.all());
            for (Task task: todasTarefas){
            	if (task.getSituation().equals(FEITO)){
            		listaTarefaFeita.add(task);
            	} else {
            		listaTarefaNaoFeita.add(task);
            	}
            }
            return ok(views.html.index.render(listaTarefaFeita, listaTarefaNaoFeita, taskForm));
        } else {
        	Task.create(filledForm.get());
            return redirect(routes.Application.tasks());
        }
    }
    
    /**
     * ordena as tarefas em ordem crescente de prioridade 
     * @param listaTarefas
     * @return lista de tarefas ordenadas
     */
    public static List<Task> ordenaPorPrioridade(List<Task> listaTarefas){
    	List<Task> lista = listaTarefas;
    	Collections.sort(lista);
    	Collections.reverse(lista);
    	return lista;
    }
    
    /**
     * 
     * @param id
     * @return
     */
    public static Result updateTask(Long id){
    	Task.updateSituation(id);
    	return redirect(routes.Application.tasks());
    }
    
    /**
     * deleta a tarefa
     * @param id
     * @return
     */
    public static Result deleteTask(Long id){
    	Task.delete(id);
    	return redirect(routes.Application.tasks());
    }
}