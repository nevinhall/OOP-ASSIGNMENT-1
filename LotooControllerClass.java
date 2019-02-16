package lottogame;
import java.util.ArrayList;

public class LotooControllerClass {
	private int  numLottoNumbersAllowed = 5;
	private  ArrayList<Integer> lottoNumbers = new ArrayList<>();
	
	public LotooControllerClass() {
		
		  LotooControllerClass game1 = new  LotooControllerClass();
	        game1.generateLottoNumbers();
	    
		
	}
	
	public void  generateLottoNumbers() {
		
		for(int i = 0; i < numLottoNumbersAllowed; i++ ) {
			int res = (int)(Math.random() * 50 + 1);
			lottoNumbers.add(res);
			System.out.println("Lotto Number " + i +  " is" + lottoNumbers.get(i));
		
			
			
		}
		
		
		
		
	}

	public int getNumLottoNumbersAllowed() {
		return numLottoNumbersAllowed;
	}

	public void setNumLottoNumbersAllowed(int numLottoNumbersAllowed) {
		this.numLottoNumbersAllowed = numLottoNumbersAllowed;
	}

	public ArrayList<Integer> getLottoNumbers() {
		return lottoNumbers;
	}

	public void setLottoNumbers(ArrayList<Integer> lottoNumbers) {
		this.lottoNumbers = lottoNumbers;
	}


	
	}


