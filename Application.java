import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

	List<Student> students = new ArrayList<>();	
		
	students.add( new Student("Ivan Sergeev", "IT", 6.8));
	students.add( new Student("Miroslav Carpenco", "Cook", 9.6));
	students.add( new Student("Katerina Voitenko", "Lawyer", 7.4));
	students.add( new Student("Eugen Curcinin", "Photographer", 8.2));
	students.add( new Student("Anna Lavotcaia", "Journalist", 9.1));
	
	int indexOfTheBest = 0;
	for (int i = 0; i < students.size(); i++) {
		if( students.get(i).getGrade() > students.get(indexOfTheBest).getGrade() ) {
			indexOfTheBest = i;
		}
	}
	
	students.get(indexOfTheBest).setGrade(students.get(indexOfTheBest).getGrade()+0.1);
	
	System.out.println("########StudentsList############\n");
	
	for (Student s : students) {
		System.out.println( s );
	}
	
	List<Student> bestStudents = new ArrayList<>();
	
	for (int i = 0; i < students.size(); i++) {
		if( students.get(i).getGrade() > 8.0f) {
			bestStudents.add(students.get(i));
		}
	}
	
	System.out.println("\n\n##########Our best students!##########\n");
	
	for (Student s : bestStudents) {
		System.out.println( s );
	}
		
	}
}
