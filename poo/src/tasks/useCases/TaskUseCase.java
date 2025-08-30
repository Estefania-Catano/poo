package tasks.useCases;

import java.util.ArrayList;
import java.util.List;

import tasks.models.Task;

// Inconsistencias en un hilo

// Estado de un hilo

// Contenerdor de metodos y atributos de la tarea
public class TaskUseCase {
    // propiedades
    private final List<Task> tasks; // lista vacía de tareas

    // Constructor
    public TaskUseCase() {
        this.tasks = new ArrayList<>();
    }

    // Lista de tareas y queremos agregar una tarea a la lista de tareas
    public String create(String name, String description) {
        try {
            Task task = new Task(name, description, false);
            this.tasks.add(task);
            return "Tarea Creada: " + task.getName() + " Descripcion: " + task.getDescription();
        } catch (Exception e) {
            return "Ha ocurrido un error, por favor intente de nuevo";
        }
    }

    // Uptade

public String update(int index;String name; String description;){
try{
    Task taskFound = new  Task();
for (int i=0; i< task.size();i++){
    if(index == i){
        Task task = tasks.get(index);
        task.setName(name);
        task.setDescription(description);
        taskFound = task;
    }
    }
    return "Tarea actualizada: " + taskFound.getName() + " Descripcion: " + taskFound.getDescription();
}
catch(Exception e){
    return "Ha ocurrido un error, por favor intente de nuevo";
}

 }
}