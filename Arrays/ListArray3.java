package Arrays;

import java.util.ArrayList;

public class ListArray3 {


	public static void main(String[] args) {
		
		ArrayList grades = new ArrayList();
		grades.add(3.2);
		grades.add("bob");
		
		Object myGrade = grades;
		System.out.println(myGrade);
		for(Object OBG : grades){
	//		System.out.println(OBG);
		}
}
}
