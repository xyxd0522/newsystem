package util;

public class ArrayUtil {
	public static Object[] multArray(Object[] a, Object[] b) {
		if (a == null) {
			a = new Object[0];
		}
		if (b == null) {
			b = new Object[0];
		}
		Object[] objs = new Object[a.length + b.length];
		int i = 0;
		while (i < a.length) {
			objs[i] = a[i++];
		}
		while (i < b.length + a.length) {
			objs[i] = b[i++ - a.length];
		}
		display(objs);
		return objs;
	}
	
	public static void display(Object[] objs) {
		if (objs == null) {
			objs = new Object[0];
		}
		for (Object o : objs) {
			System.out.println(o);
		}
	}
}
