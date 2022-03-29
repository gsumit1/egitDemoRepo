package eGitDemo.Test;

public class Sum {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		Employee e=new Employee();
		Class s=e.getClass();
		System.out.println(s.getName());
		Field[] F=s.getDeclaredFields();
		for (Field f:F){
			System.out.println(f.getName());
			System.out.println(f.get(s));
		}
		Method[] allMethods = s.getDeclaredMethods();
		for(Method m: allMethods){
			System.out.println(m.invoke((Object)e,null));
		}
		int c=30;
		int sum = a + b+c;
		System.out.println(sum);
	}
}
