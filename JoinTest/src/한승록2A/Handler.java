package 한승록2A;

import java.util.ArrayList;

public class Handler {
	
	// 4-1. 값을 저장할 ArrayList<Member> 선언
	// - ArrayList(변수명 list)에 초기값을 null로 생성하면 NullPointException이 발생할 수 있기 때문에 사이즈로 내부 값 제어예정
	ArrayList<Member> list = new ArrayList<Member>();	 
	
	
	// 4-2 회원가입
	// 1)  duplicationCheck 메서드
	public int duplicateCheck(String userId) {	// - 자료형이 int인 이유는 Main 에서 출력을 하고 해당 클래스에서는 출력문을 사용하지 않을 것이기 때문
		int row = 0;											// int row = 0;으로 지역변수 선언 및 초기화(반환 값에 사용)
		if (list.size() != 0) {									// list.size()의 값이 0이 아니면 해당 list크기 만큼 반복을 진행
			for (int i = 0; i < list.size(); i++) {				// list.get(인덱스).getUserId().equals(userId)로 입력한 ID와 기존 아이디의 중복을 검사
				// - list.get(인덱스) : 해당 인덱스의 list 요소를 불러옴
				// - getUserId() : 해당 list요소의 아이디를 불러옴
		        // - equals(userId) : 매개변수로 받은 userId와 같은지 비교
				if ((list.get(i).getUserId().equals(userId))) {
					row = 1;									// 만약 같은 아이디가 있다면 row에 '1'을 저장하고 반환
					break;
				}
			}
		}
		else if (list.size() == 0) {							// list.size()의 값이 0이면 회원가입한 사람이 없으므로 지역 변수 row의 초기값을 그대로 반환
			return row;
		}
		return row;
	}
	
	
	// 2) insert 메서드
	public int insert(Member mb) {			// Main 클래스에서 Member 객체로 입력을 받을 예정이기 때문에 Member 클래스 객체를 매개변수로 받음
		int row = 0;						// insert 메서드 내부에 지역 변수 int row를 선언하고 0으로 초기화
	
		return row += list.add(mb) ? 1 : 0;	// 삼항연산자로 this.list에 값을 저장하는 동시에 성공 여부에 따라 row에 1 또는 0을 저장
											// - 성공하면 1을 실패하면 0을 반환
	}
	
	// 3) selectAll(전체 목록) 메서드
	public ArrayList<Member> selectAll() {		// ArrayList로 자료형을 정한 이유는 this.list를 반환하기 위함
		ArrayList<Member> list = this.list;		// 새로 생성한 ArrayList<Member> list에 this.list를 저장하여 반환
												// - 향후 조건의 변화로 인해 저장된 값을 훼손하는 일을 방지하기 위해 클론 생성
		return list;
	}
	
	
	// 4) selectOne(회원 검색) 메서드
	public Member selectOne(String search) {	// Member를 자료형으로 선택한 이유는 오바리이딩한 toString()을 사용하기 위함
		Member mb = null;										// 변수 Member mb = null을 선언 및 초기화함
																// - 조건이 만족하지 못할때 null을 반환하기 위함
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getUserId().equals(search))) {		// list.get(인덱스).getUserId().equals(search)로 입력한 ID와 기존 아이디의 중복을 검사
				mb = list.get(i);								// - 동일한 회원이 있다면 mb에 this.list.get(i)를 저장하여 반환
				break;
			}
		}
		return mb;
	}
	
	// 5) delete(회원 삭제)
	public int delete(String deleteId) {	// int로 자료형을 정한 이유는 회원 삭제 진행 후 성공 여부를 1 또는 0으로 반환하기 위함
		
		// boolean flag에 removeIf를 사용하여 람다식 활용
		boolean flag = list.removeIf(m -> m.getUserId().equals(deleteId));	
		// - (m -> m.getUserId)로 m의 클래스를 Member클래스로 인식
        // - m.getUserId().equals(deleteId)로 동일한 ID의 list요소 삭제

		return flag ? 1 : 0;	        // flag의 값이 true(삭제성공)면 1을 반환 false(삭제 실패)면 0을 반환
	}
	
	
	
}
