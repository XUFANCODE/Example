
public class Interface3 {

	public static void main(String[] args){
		
		Interface2 in2 = new Interface2();
		
		
		in2.doLogin(new Interface1(){

			@Override
			public void didsuccse(int n) {
				// TODO Auto-generated method stub
				System.out.println(n);
			}
			
		});
		
		
	}
	
	
}
