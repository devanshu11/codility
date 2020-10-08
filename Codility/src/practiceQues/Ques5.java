package practiceQues;

public class Ques5 {

	public static void main(String[] args) {
		Ques5 obj1 = new Ques5();
		String str = "plusplus";
		System.out.println(obj1.solution(str));

	}
	public String solution(String str) {
		String fin =str.toLowerCase();
		String[] st = fin.split("us");
		String flag="";
		for(String x: st) {
			if("pl".equals(x)) flag+="+";
			else flag+="-";
			}
	return flag;
	}

}
