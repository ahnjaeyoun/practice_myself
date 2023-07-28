package kh.practice.practice2;


public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price ) {
		
				return "저장 완료되었습니다."
						+ "\n저장한 정보를 확인하시겠습니까?(y/n) : ";
						
						
	}

	public String confirmData() {
		return s.information();
	}
	
	
}
