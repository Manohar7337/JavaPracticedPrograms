class Textbook {
	private int pageNo;// this is my important data
	// to access my private data only public getter and
	// setter methds should be used
//setter 
	public void setPageNo(int pageNo) {
		
		if (pageNo >= 0) {//if page no is less than 0 its useless(condition is optional)
			this.pageNo = pageNo;
		}
		else {
			System.out.println("invalid page no");
		}
	}
	//getter
	public int getPageNo() {
		return pageNo;
	}

}

public class TextbookApp {

	public static void main(String[] args) {
		Textbook tb=new Textbook();
		tb.setPageNo(20);
		System.out.println(tb.getPageNo());
	}

}
