package java_AllBasicPrograms;

public class InterchangeWords_using_splitFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="God loves Me";
		
		//storing the single sentence into a String array
		
		//split(something mentioned within " " will be removed and returns the remaining")
		
		String[] temp=given.split(" ");
		
		String reversed = " ";
		
		System.out.println(temp.length);
		
		for(int i=temp.length-1;i>=0;i--){
			
			reversed=reversed+temp[i]+" ";
			
		}
		System.out.println(reversed);
	}

}
