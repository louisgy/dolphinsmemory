package advice;

public class StudentNotFoundException extends RuntimeException {
	public StudentNotFoundException(int id) {
		super("Could not find student " + id);
	}

}
