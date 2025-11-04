package Assignments;

public class ArrayConcept {

	public static void main(String[] args) {
		//1. Print Semester 2 Subject 4 and Subject 5 names.
		
		//3D dimensional
		// String [][][] studentData = new String [semester] [subject][marks/subject name]
		
		//a. Semester 2 Subject 4
		
				String [][][] studentData = new String [5][6][2];
				
				studentData [1][3][0]= "Computer Programming";
				System.out.println ("Semester 2 Subject 4 :" + studentData [1][3][0]);
				
		//b. Semester 2 Subject 5	
				
				
				
				studentData [1][4][0]= "Engineering Physics";
				System.out.println ("Semester 2 Subject 5 :" + studentData [1][4][0]);
				
				
				
		//2. Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
				
				studentData [3][2][1] = "Fail (19)";
				studentData [3][5][1] = "Pass";
				
				System.out.println ("Status/Marks of Semester 4 Subject 3: " + studentData [3][2][1]);
				System.out.println ("Status/Marks of Semester 4 Subject 6: " + studentData [3][5][1]);
				
				
				
		
	
				
				
				
			

	}

}
