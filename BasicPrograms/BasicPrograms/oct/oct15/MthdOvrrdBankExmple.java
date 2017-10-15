package oct15;

class Bnk{
	int interest(){
		return 0;
	}
}

class SBH extends Bnk{
	
	int interest(){
		return 6;
	}
}

class HDFC extends Bnk{
	
	int interest(){
		return 7;
	}
}

class YES extends Bnk{
	int interest(){
		return 8;
	}
}

public class MthdOvrrdBankExmple extends Bnk{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBH sb = new SBH();
		HDFC hd = new HDFC();
		YES ys = new YES();
		
		System.out.println("SBH Interest rate: "+sb.interest());
		System.out.println("HDFC Interest rate:"+hd.interest());
		System.out.println("YES Interest rate:"+ys.interest());
		
	}

}
