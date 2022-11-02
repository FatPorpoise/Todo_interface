package com.example.interfejs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

public class TaskStorage {
    private List<Task> taskList;
    private TaskStorage(){
        taskList = new ArrayList<Task>();
        for(int i = 1; i<=150; i++){
            Task task = new Task();
            task.setName("Zadanie nr "+i);
            task.setDone(i%3 == 0);
            taskList.add(task);
        }
    }
    private static TaskStorage taskStorage = new TaskStorage();;
    public static TaskStorage getInstance(){
        return taskStorage;
    }
    public List<Task> getTasks(){
        return taskList;
    }
    public Task getTask(UUID taskId){
        ListIterator<Task> iterator = taskList.listIterator();
        while(iterator.hasNext()){
            Task task = iterator.next();
            if(taskId.compareTo(task.getId())==0){
                return task;
            }
        }
        return null;
    }
}

