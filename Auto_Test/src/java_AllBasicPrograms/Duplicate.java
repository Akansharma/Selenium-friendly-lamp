package java_AllBasicPrograms;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Automation";
		str= str.toLowerCase();
		//Using split () to split the string
		String[] letter = str.split(" ");
		for(int i=0;i<letter.length;i++)
		{
			int count =1;
			for(int j=i+1; j<letter.length;j++){
				
				if(letter[i].equals(letter[j])){
					count = count+1;
					letter[j]="0";
				
			}
			}
			
			if(count>1 && letter[i] !="0")
				System.out.println(letter[i]);
		}
	}
}
		
		

	


