package datecalformat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {

	public static void main(String[] args) {
//		new PatternMatcherDemo().searchDigit(); 
//		new PatternMatcherDemo().searchRange();
		new PatternMatcherDemo().searchHexa();
	}

	
	// + => 1 - N 
	void searchRange() {
		
		// "a" 
		// "aba" 
		// "[ahgj]"
		//  "[a-f]" 
		//  "[a-fA-F]"
		
		Pattern p = Pattern.compile("[a-z]+");// \d 
		Matcher m = p.matcher("3p4rtgh76yt7483iasuhvyh");
		while (m.find()) {
			System.out.println(m.start()+" => "+m.group());
		}
	}
	
	// + => 1 - N 
	void searchDigit() {
		Pattern p = Pattern.compile("\\d+");// \d 
		Matcher m = p.matcher("3p4rtgh76yt7483iuhvyh");

//		System.out.println(m.find()+" => "+m.start()+" => "+m.group());
//		System.out.println(m.find()+" => "+m.start()+" => "+m.group());
//		System.out.println(m.find()+" => "+m.start()+" => "+m.group());
//		System.out.println(m.find()+" => ");

		while (m.find()) {
			System.out.println(m.start()+" => "+m.group());
		}
	}

	void searchHexa() {
		Pattern p = Pattern.compile("0[xX][a-fA-F0-9]+");// \d 
		Matcher m = p.matcher("cfdrgh0xy787uhgfde450x234ZC12368ikj0xABC1Zhgf");

//		System.out.println(m.find()+" => "+m.start()+" => "+m.group());
//		System.out.println(m.find()+" => "+m.start()+" => "+m.group());
//		System.out.println(m.find()+" => "+m.start()+" => "+m.group());
//		System.out.println(m.find()+" => ");

		while (m.find()) {
			System.out.println(m.start()+" => "+m.group());
		}
	}

	
	void basic() {
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abasabfdabfdf");

//		System.out.println(m.find()+" => "+m.start()+" => "+m.group());
//		System.out.println(m.find()+" => "+m.start()+" => "+m.group());
//		System.out.println(m.find()+" => "+m.start()+" => "+m.group());
//		System.out.println(m.find()+" => ");

		while (m.find()) {
			System.out.println(m.start());
		}
	}
}
