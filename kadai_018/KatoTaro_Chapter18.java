package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{

	   public static void main(String[] args) {
		   KatoTaro_Chapter18 KatoTaro = new KatoTaro_Chapter18();
		   KatoTaro.eachIntroduce();
		   }
	public void setGivenName(String name){
		givenName = name;
	}
	
	public KatoTaro_Chapter18() {
		super();
	}
	
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
}
