package leetCode.strings.easy;

import java.util.Stack;

public class BackspaceStringCompare {

	public static boolean backspaceCompareOptimized(String s, String t) {
		int p1=s.length()-1;
		int p2=t.length()-1;
		int skip1=0;
		int skip2=0;
		while(p1>=0||p2>=0){
			while(p1>=0){
				if(!Character.isLetterOrDigit(s.charAt(p1))){
					skip1++;
					p1--;
				}
				else if(skip1>0){
					skip1--;
					p1--;
				}
				else {
					break;
				}
			}
			while(p2>=0){
				if(!Character.isLetterOrDigit(t.charAt(p2))){
					skip2++;
					p2--;
				}
				else if(skip2>0){
					skip2--;
					p2--;
				}
				else {
					break;
				}

			}
			if(p1<0&&p2<0) return true;
			if(p1<0||p2<0) return false;
			if(s.charAt(p1)!=t.charAt(p2)){
				return false;
			}
			p1--;
			p2--;
		}
		return true;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

//				String s = "a##c";
//					String t = "#a#c";
		//		String s = "oi###mupo##rszty#s#xu###bxx##dqc#gdjz";
		//		String t = "oi###mu#ueo##pk#o##rsztu#y#s#xu###bxx##dqc#gz#djz";
		//		String s = "bxj##tw";
		//		String t = "bxj###tw";
//		String s = "ab#c";
//		String t = "ad#c";
		String s = "bbbe";
		String t = "bbb#e";
		System.out.println(backspaceCompareOptimized(s, t));

	}
}
