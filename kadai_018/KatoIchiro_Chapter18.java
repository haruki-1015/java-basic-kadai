package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
   
	public  KatoIchiro_Chapter18() {
        familyName = "加藤";
        address = "東京都中野区〇×";
        setGivenName();
    }

    public void setGivenName() {
        this.givenName = "一郎";
    }

    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}
