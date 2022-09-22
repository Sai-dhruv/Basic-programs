package stack;

public class Stack {
	
	public static  final int MAX = 2;
	
	int top ;
	
	int a[] = new int[MAX];

		boolean isEmpty() {
			return (0<top);
		}
        Stack() {
        	top = -1;
		}
		boolean push(int x) {
			if(top<MAX-1) {
				a[++top] = x;
				System.out.println("Element Pushed "+x);
				return true;
			}else {
				System.out.println("Stack overflow");
				return false;
			}
		}
		
		int pop() {
			
			if(top == -1) {
				System.out.println("Stack underflow");
				return 0;
			}else {
				int x = a[top--];
				return x;
			}
		}
		
		void print() {
			
			for(int i=0; i<=top; i++) {
				System.out.println(a[i]);
			}
		}
		
		public static void main(String[] args) {
			
			Stack s = new Stack();
			s.push(10);
			s.push(20);
			
		   int k = s.pop();
		   System.out.println("kkk===>"+k); 
		   s.print();
			
		}
		
	

}
