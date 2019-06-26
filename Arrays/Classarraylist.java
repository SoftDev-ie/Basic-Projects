package Arrays;
import java.util.ArrayList;

public class Classarraylist {

public static void main(String[] args)
		{
		ArrayList<String> list = new ArrayList();
		list.add("2");
		list.add("3");
		list.add("4");
		for(String s: list)
			{
			if(s.equals("3")){
				list.remove(s);
				System.out.println(s+" Removed");
				}
			}
		}
}
