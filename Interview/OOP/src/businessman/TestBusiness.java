package businessman;

public class TestBusiness {
	public static void main(String[] args) {

		BusinessMan b = new BusinessMan();
		Richman r = new BusinessMan();

		r.earnMoney();
		r.donation();
		r.party();

		SocialWorker s = new BusinessMan();

		s.helpToOthers();
	}
}
