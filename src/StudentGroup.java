import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		
		if(students==null)
		{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		if(index <0 || index>=students.length)
		{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(index <0 || index>=students.length)
		{
			throw new IllegalArgumentException();
		}
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		students[index]=student;
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		int j;
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==null)
			{
				j=i;
				break;
			}
		}
		while(j>=0 && j<students.length)
		{
			students[j+1]=students[j];
			j--;
		}
		students[0]=student;
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		int j;
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==null)
			{
				j=i;
				break;
			}
		}
		if(j<students.length)
		students[j]=student;
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		if(index <0 || index>=students.length)
		{
			throw new IllegalArgumentException();
		}
		int j;
		for(int i=students.length-1;i>index;i--)
		{
			students[i+1]=students[i];
		}
		students[index]=student;
		
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		//if(student==null)
		//{
		//	throw new IllegalArgumentException();
		//}
		if(index <0 || index>=students.length)
		{
			throw new IllegalArgumentException();
		}
		for(int i=0;i<students.length;i++)
		{
			if(i==index && students[i]!=null)
			{
				students[i]=students[i+1];
			}
			if(students[i]==null)
				break;
		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		for(int i=0;i<students.length;i++)
		{
			if(student[i]==student && students[i]!=null)
			{
				students[i]=students[i+1];
			}
			else if(student[i]!=student && student[i]==null)
				throw new IllegalArgumentException("Student not exist");
			if(students[i]==null)
				break;
		}
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		if(index <0 || index>=students.length)
		{
			throw new IllegalArgumentException();
		}
		for(int i=index+1;i<students.length;i++)
		{
			students[i]=null;
		}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		for(int i=0;i<students.length-1;i++)
		{
			if(students[i]==null)
				break;
			else
			{
				if(students[i]==student)
					students[i+1]=null;
			}
		}
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		int i=0;
		for(i=0;i<students.length;i++)
		{
			if(student[i]==student)
				break;
		}
		// Add your implementation here
		return students[i];
	}
}
