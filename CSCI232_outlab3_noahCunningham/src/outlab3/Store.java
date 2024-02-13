package outlab3;

public class Store {
	// create varaibles need
	String[] data;
	String courseID;
	String[] getID;
	String teacher;
	
	//split up data
		public Store(String line) {
			data = line.split(",");
		}

	// get class ID and not using the section number
	public String getClassID(){
		courseID = data[1];
		getID = courseID.split("-");
		return getID[0];
	}
	// get teacher
	public String getTeacher(){
		teacher = data[7];
		StringBuilder sb = new StringBuilder(teacher);
		// delete the quotes before profs name
		sb.deleteCharAt(0);
		teacher = sb.toString();
		return teacher;
	}
	
	
}
