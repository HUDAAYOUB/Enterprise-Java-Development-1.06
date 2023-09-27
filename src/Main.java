import com.lab2.Employee;
import com.lab2.Intern;

import java.io.FileWriter;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Employee emp1 = new Employee("Huda Ayoub","Hud@htm.com", 25, 20010);
        Employee emp2 = new Employee("Rawan Ayoub","rwn@htm.com", 30, 20200);
        Intern in1 = new Intern("Sahar Ahmad" , "shrg@gml.com", 23, 23000);
        Employee emp3 = new Employee("Elian White","shr@htm.com", 27, 20600);
        Employee emp4 = new Employee("Ruba Abdullah","ruba@htm.com", 29, 20050);
        Employee emp5 = new Employee("Reema Yousef","reema@htm.com", 26, 20030);
        Intern in2 = new Intern("Raghad Khalid" , "rghd@gml.com", 33, 20000);


     String filePath = "src/com/lab2/Employees.txt";
        File file = new File(filePath);
        file.createNewFile();
        if (file.createNewFile()) System.out.println("File has been Created");
        else System.out.println("File already has been created");


        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write( " " + emp1.toString()+ "\n");
        fileWriter.write(" " + emp2.toString()+ "\n");
        fileWriter.write(" " + in1.toString()+ "\n");
        fileWriter.write(" " + emp3.toString()+ "\n");
        fileWriter.write(" " + emp4.toString()+ "\n");
        fileWriter.write(" " + emp5.toString()+ "\n");
        fileWriter.write(" " + in2.toString()+ "\n");


        fileWriter.close();


    }
}