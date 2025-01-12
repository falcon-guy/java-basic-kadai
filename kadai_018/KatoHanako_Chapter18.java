package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	   public static void main(String[] args) {
		   KatoHanako_Chapter18 KatoHanako = new KatoHanako_Chapter18();
		   KatoHanako.eachIntroduce();
		   }
	public void setGivenName(String givenName){
		System.out.println("名前は" + familyName + givenName);
	}
	
	void eachIntroduce() {
		System.out.println("住所は" + address +"です");
		System.out.println("趣味は読書です");
	}
}