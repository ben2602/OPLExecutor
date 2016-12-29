package org.imf.oplexecutor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.imf.oplexecutor.database.DatabaseClass;
import org.imf.oplexecutor.model.Task;

public class TaskService {

	private Map<Long, Task> tasks = DatabaseClass.getTasks();
	
	public TaskService() {
		//tasks.put(1L, value)
		//tasks.put(1L, new Task(1, "/home/user/opl.xml"));
	}
	
	public List<Task> getAllTasks() {
		return new ArrayList<Task>(tasks.values());
	}
	
	public Task addTask(Task task) {
		task.setTaskId(tasks.size() + 1);
		tasks.put(task.getTaskId(), task);
		return task;
	}

}
