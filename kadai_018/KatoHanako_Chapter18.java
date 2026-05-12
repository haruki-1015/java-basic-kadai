package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
   
	public  KatoHanako_Chapter18() {
        familyName = "加藤";
        address = "東京都中野区〇×";
        setGivenName();
    }

    public void setGivenName() {
        this.givenName = "花子";
    }

    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}
