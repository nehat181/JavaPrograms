package random;

public class ExtractNumberFromAlphaNumeric {
	
	
	public static void extract(String str) {
		String regex = "[^\\d]+";
int sum=0;
        String[] str1 = str.split(regex);
        String required = "";
        for(String st: str1){
            sum+=Integer.parseInt(st);
        }
        System.out.println(sum);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="12ABC20CBW";
		
		extract(str);

	}

}
