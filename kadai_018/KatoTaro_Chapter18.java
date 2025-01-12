package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{

	   public static void main(String[] args) {
		   KatoTaro_Chapter18 KatoTaro = new KatoTaro_Chapter18();
		   KatoTaro.eachIntroduce();
		   }
	public void setGivenName(String givenName){
		System.out.println("名前は" + familyName + givenName);
	}
	
	void eachIntroduce() {
		System.out.println("住所は" + address +"です");
		System.out.println("Javaが得意です");
	}
}
