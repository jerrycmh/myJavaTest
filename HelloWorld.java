public class HelloWorld {
	public static void main(String args[]){
		mutiArg();
		mutiArg(3,4,5,1);
		mutiArg(2,7);
	}

	private static int addition(int x, int y){
		x=x+y;
		return x;
	}

	public static void testX(){
		int x=4;
		int y=2;
		System.out.println(x+" "+y);
		x=addition(x,y);
		System.out.println(x+" "+y);
	}

	public static void printTree(){
		for(int i=0;i<5;i++){
			for(int k=0;k<(5-i);k++){
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void testArray(){
		int myArray[] = {1,3,5};
		fun(myArray);
		for(int i=0;i<myArray.length;i++){
			System.out.println(myArray[i]);
		}
	}

	private static void fun(int temp[]){
		temp[0]=120;
	}

	public static void mutiArg(int... arg){
		for(int x : arg){
			System.out.print(x);
		}
		System.out.println();
	}
}