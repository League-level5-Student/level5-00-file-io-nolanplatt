package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	
	
	JFrame frame;
	JPanel panel;
	
	JButton addTask;
	JButton viewTasks;
	JButton removeTask;
	JButton saveList;
	JButton loadList;
	
	
	public static void main(String[] args) {
		ToDoList tdl = new ToDoList();
	}
	
	ToDoList() {
		
		//Parents
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		//Child/Buttons
		JButton addTask = new JButton();
		JButton viewTasks = new JButton();
		JButton removeTask = new JButton();
		JButton saveList = new JButton();
		JButton loadList = new JButton();
		
		frame.add(panel);
		panel.add(addTask);
		panel.add(viewTasks);
		panel.add(removeTask);
		panel.add(saveList);
		panel.add(loadList);
		frame.setVisible(true);
		frame.pack();
		
		addTask.setText("Add Task");
		viewTasks.setText("View Tasks");
		removeTask.setText("Remove Task");
		saveList.setText("Save List");
		loadList.setText("Load List");
		
		addTask.addActionListener(this);
		viewTasks.addActionListener(this);
		removeTask.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);
		
	}
	
	 @Override
	    public void actionPerformed(ActionEvent e) {
		    JButton src = (JButton)e.getSource();
		    
		    if(src == addTask) {
		    	System.out.println("add task");
		    }
         
         
		}
	    
	
	
	
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
}
