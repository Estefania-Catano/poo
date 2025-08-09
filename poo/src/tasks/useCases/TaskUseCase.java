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

        Task task = new Task(name, description, false);
        this.tasks.add(task);
        return "Tarea Creada: " + task.getName() + " Descripcion: " + task.getDescription() + " " + task.getStatus();
    }
}

// Uptade

public String update(Task task;String name; String description;boolean satus){

task.setName(name);
task.setDescription(description);
task.setStatus(status);
        return "Tarea Actualizada: " + task.getName() + " Descripcion: " + task.getDescription() + " Estado: " + task.getStatus();
    }


// Delete
public String delete(Task task) {
    task = null;
    return "Tarea Eliminada";
}


// Get
public String get() {
    return "Tarea: " + task.getName() + " Descripcion: " + task.getDescription() + " Estado: " + task.getStatus();
}