package practiceQues;

public class Ques4 {
	
	public static void main(String[] args) {
		Ques4 obj1 = new Ques4();
		String str = "Petter Parker,Dow Jones,leo,Alew Shre Packard";
		System.out.println(obj1.solution(str));
		
	}
	
	public String solution(String str) {
		String[] asdf = str.split(",");
		String fina="";
		for(String x :asdf) {
			String[] spli = x.split(" ");
				String init="";
					for(String b:spli) {
						init += b.toLowerCase();
					}
			fina+=x+"<"+init+"@company.com>,";
		}

		return fina;
		
	}

}
