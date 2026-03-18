package KIT.std;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
	private final List<Student>students=new ArrayList<>();
	
	public void addStudent(Student student)
	{
		  for(Student s : students)
    {
        if(s.getId() == student.getId())
        {
            System.out.println("Student with this ID already exists.");
            return;
        }
    }

    students.add(student);
    System.out.println("Student added successfully.");
	}
	
	public void viewStudents()
	{
		if(students.isEmpty())
		{
			System.out.println("No student to display.");
		}
		else
		{
			students.forEach(System.out::println);
		}
	}
	
	public void updateStudent(int id,String newName,String newCourse)
	{
		for(Student student:students)
		{
			if(student.getId()==id)
			{
				student.setName(newName);
				student.setCourse(newCourse);
				System.out.println("Student updated.");
				return;
			}
		}
		System.out.println("Student not found");
	}

	public void deleteStudent(int id)
	{
		students.removeIf(s -> s.getId()==id);
		System.out.println("Student deleted (if existed).");
	}
}
