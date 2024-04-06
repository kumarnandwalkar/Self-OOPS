import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Task {
    private String name;
    private String description;
    private boolean completed;
    private int priority;

    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getPriority() {
        return priority;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "[" + (completed ? "X" : " ") + "] " + name + " (Priority: " + priority + ")";
    }
}

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void editTask(int index, Task task) {
        tasks.set(index, task);
    }

    public void deleteTask(int index) {
        tasks.remove(index);
    }
}

class TaskManagerGUI {
    private JFrame frame;
    private DefaultListModel<Task> taskListModel;
    private JList<Task> taskList;
    private JTextField nameField;
    private JTextField descriptionField;
    private JCheckBox completedCheckbox;
    private JSpinner prioritySpinner;
    private TaskManager taskManager;

    public TaskManagerGUI() {
        taskManager = new TaskManager();

        frame = new JFrame("Task Manager");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);

        JPanel inputPanel = new JPanel(new GridLayout(0, 2, 10, 5));
        mainPanel.add(inputPanel, BorderLayout.NORTH);

        inputPanel.add(new JLabel("Task Name:"));
        nameField = new JTextField(20);
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Description:"));
        descriptionField = new JTextField(20);
        inputPanel.add(descriptionField);

        completedCheckbox = new JCheckBox("Completed");
        inputPanel.add(completedCheckbox);

        inputPanel.add(new JLabel("Priority:"));
        prioritySpinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        inputPanel.add(prioritySpinner);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        JButton addButton = new JButton("Add Task");
        addButton.setPreferredSize(new Dimension(120, 30));
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });
        buttonPanel.add(addButton);

        JButton editButton = new JButton("Edit Task");
        editButton.setPreferredSize(new Dimension(120, 30));
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editTask();
            }
        });
        buttonPanel.add(editButton);

        JButton deleteButton = new JButton("Delete Task");
        deleteButton.setPreferredSize(new Dimension(120, 30));
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTask();
            }
        });
        buttonPanel.add(deleteButton);

        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(taskList);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void addTask() {
        String name = nameField.getText();
        String description = descriptionField.getText();
        int priority = (int) prioritySpinner.getValue();

        if (!name.isEmpty()) {
            Task task = new Task(name, description, priority);
            taskManager.addTask(task);
            taskListModel.addElement(task);

            clearInputFields();
        } else {
            JOptionPane.showMessageDialog(frame, "Task name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editTask() {
        int selectedIndex = taskList.getSelectedIndex();

        if (selectedIndex != -1) {
            Task selectedTask = taskList.getSelectedValue();
            String name = nameField.getText();
            String description = descriptionField.getText();
            boolean completed = completedCheckbox.isSelected();
            int priority = (int) prioritySpinner.getValue();

            Task editedTask = new Task(name, description, priority);
            editedTask.setCompleted(completed);

            taskManager.editTask(selectedIndex, editedTask);
            taskListModel.setElementAt(editedTask, selectedIndex);

            clearInputFields();
        } else {
            JOptionPane.showMessageDialog(frame, "Please select a task to edit.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteTask() {
        int selectedIndex = taskList.getSelectedIndex();

        if (selectedIndex != -1) {
            taskManager.deleteTask(selectedIndex);
            taskListModel.removeElementAt(selectedIndex);

            clearInputFields();
        } else {
            JOptionPane.showMessageDialog(frame, "Please select a task to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearInputFields() {
        nameField.setText("");
        descriptionField.setText("");
        completedCheckbox.setSelected(false);
        prioritySpinner.setValue(1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TaskManagerGUI();
            }
        });
    }
}