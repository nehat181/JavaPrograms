package leetCode;

public class RemoveColoredPiecesifBothNeighborsAreTheSameColor {

	public static boolean winnerOfGame(String colors) {
    	int aScore=0;
		int bScore=0;
		for(int i=1;i<colors.length()-1;i++) {
		 char curr=colors.charAt(i);
		 char prev= colors.charAt(i-1);
		 char next=colors.charAt(i+1);
		 
		 if(curr=='A'&&prev=='A'&&next=='A') {
			 aScore++;
		 }
		 if(curr=='B'&&prev=='B'&& next=='B') {
			 bScore++;
		 }
		 
		}
		
		return aScore>bScore;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colors="ABBBBBBBAAA";
		System.out.println(winnerOfGame(colors));
	}

}
