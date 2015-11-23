class A1 {
    public void f(){
    	System.out.println("英文字母大写:");
    	for(char d='A';d<='Z';d++){
    		System.out.print(d);
    	}
    	System.out.println();
    	System.out.println("英文字母小写:");
    	for(char d='a';d<='z';d++){
    		System.out.print(d);
    	}
    }
}

class B1 extends A1{
	public void g(){//不许重写
		System.out.println("希腊字母大写:");
		for (char i = 'α'-32; i <= 'ω'-32; i++){//'Α''Ω'
			System.out.print(i);
		}
		System.out.println();
		System.out.println("希腊字母小写:");
		for(char i='α';i<='ω';i++){
			System.out.print(i);
		}
	}
}

public class Example8 {
	public static void main(String[] args){
		B1 b = new B1();
		System.out.print("打印英文字母大写和小写:");
		b.f();
		System.out.println();
		System.out.println("打印希腊字母大写和小写:");
		b.g();
	}
}
