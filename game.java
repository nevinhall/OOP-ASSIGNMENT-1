package lottogame;

import java.util.ArrayList;

public class game {
	private int  numLottoNumbersAllowed = 5;
	private  ArrayList<Integer> lottoNumbers = new ArrayList<>();
	private  ArrayList<Integer> playerNumbers = new ArrayList<>();


	public game() {





	}

	public void  generateLottoNumbers() {

		for(int i = 0; i < numLottoNumbersAllowed; i++ ) {
			int res = (int)(Math.random() * 50 + 1);
			lottoNumbers.add(res);
//			System.out.println("Lotto Number " + i +  " is" + lottoNumbers.get(i));

		}
	}


	
	public void playerNumbers( ArrayList<Integer> playerNumbers) {
		int MinToWin = 0;
		if(playerNumbers.equals(lottoNumbers)) {
			MinToWin = 5;
			System.out.println("Congratulations you have won the lotto");
		}else
			for(int i = 0; i < lottoNumbers.size(); i++) {
//				System.out.println( playerNumbers.get(i));			
				if( lottoNumbers.get(i) == playerNumbers.get(i)) {
//					System.out.println("player numbers:"+ playerNumbers.get(i));
					MinToWin ++;
				}			
			}
		if( MinToWin == 4){
			System.out.println("you've gotten four lotto numbers correct");
		}else if(MinToWin > 4) {
		}
		else
			System.out.println("you havent won sorry ");
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

	public ArrayList<Integer> getPlayerNumbers() {
		return playerNumbers;
	}

	public void setPlayerNumbers(ArrayList<Integer> playerNumbers) {
		this.playerNumbers = playerNumbers;
	}



}





