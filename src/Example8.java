class A1 {
    public void f(){
    	System.out.println("Ӣ����ĸ��д:");
    	for(char d='A';d<='Z';d++){
    		System.out.print(d);
    	}
    	System.out.println();
    	System.out.println("Ӣ����ĸСд:");
    	for(char d='a';d<='z';d++){
    		System.out.print(d);
    	}
    }
}

class B1 extends A1{
	public void g(){//������д
		System.out.println("ϣ����ĸ��д:");
		for (char i = '��'-32; i <= '��'-32; i++){//'��''��'
			System.out.print(i);
		}
		System.out.println();
		System.out.println("ϣ����ĸСд:");
		for(char i='��';i<='��';i++){
			System.out.print(i);
		}
	}
}

public class Example8 {
	public static void main(String[] args){
		B1 b = new B1();
		System.out.print("��ӡӢ����ĸ��д��Сд:");
		b.f();
		System.out.println();
		System.out.println("��ӡϣ����ĸ��д��Сд:");
		b.g();
	}
}
