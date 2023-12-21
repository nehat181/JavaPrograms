package leetCode.strings.easy;

public class FindWordsThatCanBeFormedByCharacters {

	public int countCharacters(String[] words, String chars) {
		int count=0;
		
		int [] arr=new int[26];
		for(int i=0;i<chars.length();i++){ //n
			int index=chars.charAt(i)-'a';
			arr[index]=arr[index]+1;
		}
		
		for(int i=0;i<words.length;i++) {//m
			int [] out=new int[26];
			for(int j=0;j<words[i].length();j++) {//k
				out[words[i].charAt(j)-'a']=out[words[i].charAt(j)-'a']+1;
			}
			boolean f=true;
			for(int k=0;k<26;k++) {
				if(arr[k]<out[k]) {
					f=false;
					break;
				}
			}
			if(f) {
				count+=words[i].length();
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"cat","bt","hat","tree"};
		String chars = "atach";
		System.out.println(new FindWordsThatCanBeFormedByCharacters().countCharacters(words, chars));
		System.out.println('A'-0);
	}

}
