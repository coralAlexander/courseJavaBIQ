package exercise_celebration_from_Exam_q1;

public class Person {

	private String FirstName ;
	private String SecondName;
	
	public Person (String FirstName,String SecondName) {
		this.FirstName=FirstName;
		this.SecondName=SecondName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getSecondName() {
		return SecondName;
	}

	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", SecondName=" + SecondName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
		result = prime * result + ((SecondName == null) ? 0 : SecondName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (FirstName == null) {
			if (other.FirstName != null)
				return false;
		} else if (!FirstName.equals(other.FirstName))
			return false;
		if (SecondName == null) {
			if (other.SecondName != null)
				return false;
		} else if (!SecondName.equals(other.SecondName))
			return false;
		return true;
	}
	
	
}
