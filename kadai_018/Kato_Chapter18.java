package kadai_018;

public abstract class Kato_Chapter18 {

	public String familyName;
	public String givenName;
	public String address; 
	
	public Kato_Chapter18() {
		this.familyName = "加藤";
		this.address= "東京都中野区〇×";
		this.givenName = "";
	}
	
	public void commonIntroduce(){
		System.out.println("名前は" + familyName + givenName);
		System.out.println("住所は" + address +"です");	
	}
	abstract public void eachIntroduce();
	
	public void execIntroduce(){
		commonIntroduce();
		eachIntroduce();
	}
}