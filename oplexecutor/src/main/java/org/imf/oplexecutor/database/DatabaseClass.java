package org.imf.oplexecutor.database;

import java.util.HashMap;
import java.util.Map;

import org.imf.oplexecutor.model.Opl;
import org.imf.oplexecutor.model.Task;

public class DatabaseClass {

	private static Map<Long, Task> tasks = new HashMap<>();
	private static Map<Long, Opl> opls = new HashMap<>();
	
	public static Map<Long, Task> getTasks() {
		return tasks;
	}
	
	public static Map<Long, Opl> getOpls() {
		return opls;
	}
	
}
