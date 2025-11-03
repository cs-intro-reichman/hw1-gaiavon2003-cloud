// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int x = (int)(Math.random()*num);
		int y = (int)(Math.random()*num);
		int z = (int)(Math.random()*num);
		int mim = Math.min(x,Math.min(y,z));
		int max = Math.max(x,Math.max(y,z));
		int middle = (x+y+z)-max-mim;
		System.out.println(mim +" "+ middle+ " "+ max);
	}
}
