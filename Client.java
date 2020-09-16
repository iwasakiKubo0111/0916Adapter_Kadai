
public class Client {

	public static void main(String[] args) {
		Dengen dengen;

		dengen=new AcAdapter();
		int denatsu=dengen.kyuuden();
		System.out.println(denatsu+"Vで給電されています");
	}

}

//--------------------------------------------

abstract class Dengen{//Targetに該当
	public abstract int kyuuden();
}

//---------------------------------------------

class AcAdapter extends Dengen {//Adapter

	private JapaneseConsent J=new JapaneseConsent();

	public int kyuuden() {
		return (int)(100*J.Japan_V_Magnification());
	}
}

//-----------------------------------------------
class JapaneseConsent  {//Adaptee
	public float Japan_V_Magnification() {
		return 0.16f;
	}
}
