package strings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;



public class StringPermutation {

	static String perm="";
	static String org="abc";
	
	/*Print all the permutations of a string without repetition using Collections in Java*/
	
	static void permutation(String perm, String word){
		if (word.isEmpty()) { System.err.println(perm + word); } 
		
		else {
			for (int i = 0; i<word.length(); i++) { 
				String sub1=word.substring(0, i);
				String sub2=word.substring(i + 1, word.length());
				String arg=perm + word.charAt(i) ;
				permutation(arg,sub1 + sub2); } } 
		}

	static void write() throws IOException{
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
/*		//System.out.println(org.substring(1));
		//permutation("",org);
		
		String excelFilePath = "C:/Users/Provar Neha Tiwari/Provar/Training/ProvarTraining/templates/DataMapping_TS_Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
 
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet("Target");
        //sheet.getRow(7).getCell(1).setCellFormula("=Sum(A4:A5)");
        
        Row row=sheet.getRow(2);
        Cell cell=row.createCell(10);
       // System.out.println(row.getCell(1));
        String strFormula= "SUM(I1:I2)";
        //cell.setCellType(CellType.FORMULA);
        System.out.println("done");
       // cell.setCellType(XSSFCell.CELL_TYPE_FORMULA);
        cell.setCellFormula(strFormula);
        //row.getCell(10).setCellFormula("=Sum(A4:A5)");
        
       // sheet.getRow(7).getCell(1).setCellFormula("=Sum(A4:A5)");
         
        inputStream.close();
         
        FileOutputStream outputStream = new FileOutputStream(excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();*/
		
		
		permutation("", "abc");
		
		
	}

}
//abc,aca,