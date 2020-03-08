import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fhgj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("12345adfggh445667!@899");
		
		while(m.find())
		{
		if(m.group().length()==3|| m.group().length()==4)	
		{
			System.out.println(m.group());
		}
		
		}
	}

}
