package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	   public static void main(String[] args) {
		   KatoIchiro_Chapter18 KatoIchiro = new KatoIchiro_Chapter18();
		   KatoIchiro.eachIntroduce();
		   }
	public void setGivenName(String givenName){
		System.out.println("名前は" + familyName + givenName);
	}
	
	void eachIntroduce() {
		System.out.println("住所は" + address +"です");
		System.out.println("好きな食べ物はリンゴです");
	}
}