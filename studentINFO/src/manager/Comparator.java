package manager;

import model.Student;
import java.util.ArrayList;
import java.util.Collections;
import model.Validate;

public class Comparator {
    Validate validate = new Validate();
    
    public void addStudent(ArrayList<Student> lt) {
        
        System.out.println("====== Collection Sort Program ======");
        System.out.println("Please input student information ");
        System.out.print("Name: ");
        String name = validate.checkInputString();
        System.out.print("Classes: ");
        String classes = validate.checkInputString();
        System.out.print("Mark: ");
        float mark = validate.checkInputFloat();
        lt.add(new Student(name, mark, classes));
    }

    public void print(ArrayList<Student> lt) {
        if (lt.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(lt);
        for (int i = 0; i < lt.size(); i++) {
            System.out.println("--------Student " + (i + 1) + "--------");
            System.out.println("Name: " + lt.get(i).getName());
            System.out.println("Classes: " + lt.get(i).getClasses());
            System.out.println("Mark: " + lt.get(i).getMark());
        }
    }

    public void display() {
        ArrayList<Student> lt = new ArrayList<>();
        addStudent(lt);
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N): ");
            if (validate.checkInputYN()) {
                addStudent(lt);
            } else {
                break;
            }
        }
        print(lt);
    }

}