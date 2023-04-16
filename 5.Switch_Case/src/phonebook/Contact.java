package phonebook;

public class Contact {
	
	// 원본 값의 변경을 허용하지 않기 위한 private 처리
	private int idx;		// 고유 식별 번호
	private String name;	// 이름
	private String pnum;	// 전화번호
	
	
	@Override
	public String toString() {
		return String.format("%d.\n [이름] : %s\n [전화번호] : %s\n",
				idx, name, pnum);
	}
	
	
	// private 처리된 변수를 사용하기 위한 getter/setter 생성
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	
	
	
	
	
}
