package encapulation;

public class Driver {
public static void main (String[] args)
{
	Sub sb = new Sub();
}
public static int get(int i){
	System.out.print(""+ i);
	return i;
	}
}
class Super{
	int valueStatic = Driver.get(1);
	static int x;
	int valueIstance = Driver.get(x);
}
class Sub extends Super{}
