package com.todo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.todo.Entity.Tasks;
import com.todo.Entity.Users;
import com.todo.Service.TaskService;
import com.todo.Service.UserService;

@Controller
public class MainController {

	@Autowired
	UserService userService;

	@Autowired
	TaskService taskService;

	@GetMapping("/userPage")
	public String getUserPage(Model model)
	{
		System.out.println("List of all tasks");

		List<Tasks> tasks = taskService.getTasksList();

		model.addAttribute("tasks" , tasks);

		return "userPage";
	}

	@GetMapping("/loginPage")
	public String getLoginPage(Model model)
	{
		System.out.println("Login Page");

		Users user1 = new Users();
		model.addAttribute("Users" , user1);
		return "loginPage";
	}

	@PostMapping("/saveLoginPage")
	public String saveLoginPage(@ModelAttribute("Users") Users users)
	{
		System.out.println("Login Page saving and checking");

		List<Users> existingUsersList = userService.getUsersList();

		for (Users user1 : existingUsersList)
		{

			if(user1.getUserName().equalsIgnoreCase(users.getUserName()))
			{
				/*
				 * if(users.getIsAdmin() && user1.getIsAdmin()) { return "redirect:/adminPage";
				 * } else { return "redirect:/userPage"; }
				 */
				return "redirect:/adminPage";
			}
			
		}
		return "redirect:/registrationPage" ;
	}
	
	@GetMapping("/registrationPage")
	public String getRegistrationPage(Model model)
	{
		System.out.println("Registration page");

		Users user1 = new Users();
		model.addAttribute("Users" , user1);
		return "registrationPage";
	}
	
	@PostMapping("/saveRegistrationForm")
	public String saveRegistrationForm(@ModelAttribute("Users") Users users)
	{
		System.out.println("Registration page saving ");

		 userService.addUser(users);

		
		return "redirect:/loginPage" ;
	}
	
	@GetMapping("/adminPage")
	public String getAdminPage(Model model)
	{
		System.out.println("Here in Admin Page");

		List<Tasks> tasks = taskService.getTasksList();

		model.addAttribute("tasks" , tasks);

		return "adminPage";
	}
	
	@GetMapping("/addTasksToList")
	public String addTasksToList(Model model)
	{
		System.out.println("Here in Add tasks Page");

		Tasks tasks = new Tasks();
		

		model.addAttribute("tasks" , tasks);

		return "addTasksPage";
	}
	@PostMapping("/saveTasks")
	public String saveTasks(@ModelAttribute("tasks")Tasks tasks)
	{
		System.out.println("tasks saving and checking");

		taskService.addTask(tasks);
		return "redirect:/adminPage" ;
	}
	@GetMapping("/updateTasksFromList")
	public String updateTasksFromList(@ModelAttribute("taskId")int id , Model model)
	{
		
		Tasks tasks = taskService.getTasksList(id);
		
		System.out.println("tasks list aftet get in update method is "+tasks);
		model.addAttribute("tasks" , tasks);

		return "addTasksPage";
	}
	
	@GetMapping("/deleteTasksFromList")
	public String deleteTasksFromList(@ModelAttribute("taskId")int id)
	{
		
		taskService.deleteTask(id);
		return "redirect:/adminPage";
		
	}
	
}
