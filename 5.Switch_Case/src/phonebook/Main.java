package phonebook;

import java.util.Scanner;


// Quiz(phonebook) - funtion, switch ~ case 활용
// 추가할 기능 >>>
// 1) 전화번호 추가
// 2) 전화번호 목록
// 3) 전화번회 수정
// 4) 전화번호 삭제
// 5) 프로그램 종료
// 


public class Main {
			
	// 데이터를 저장할 배열은 어느 함수에서나 접근할 수 있도록 static으로 
	static Contact[] conArr = new Contact[10];
	
	// 전화번호 추가에 사용할 add함수 작성
	static int add(Contact ct) {	// static main에서 사용 되어야 하므로
									// - int 자료형을 반환하는 static add 함수 작성
		int row = 0;								// 정수를 반환할 row를 0으로 초기화 하여 선언
		for (int i = 0; i < conArr.length; i++) {	// 배열에 값을 넣기 위해 통제할 for반복문 제어문 작성
			if (conArr[i] == null) {				// 해당 인덱스의 배열 값이 null이면
				conArr[i] = ct;						// 매개변수로 전달받은 Contact 객체를 저장
				row = 1;							// row에 1을 저장하여 저장 성공을 확인
				break;								// 반복문 종료
			}
		}
		
		return row;									// 결과값 반환
	}
	
	// 전화번호 수정에 사용할 update함수 작성
	static int update(int compareIdx, Contact ct) {		// static main에서 사용 되어야 하므로
														// 	- int 자료형을 반환하는 static update 함수 작성
		int row = 0;									// 정수를 반환할 row를 0으로 초기화 하여 선언
		for(int i = 0; i < conArr.length; i++) {		// 배열에 값을 수정하기 위해 통제할 for반복문 제어문 작성
			if (compareIdx == conArr[i].getIdx()) {		// 매개변수로 전달받은 고유번호와 저장된 Contact 객체의 고유번호가 같으면
				conArr[i] = ct;							// 새롭게 전달받은 객체를 새롭게 저장
				row = 1;								// row에 1을 저장하여 저장 성공을 확인
				break;									// 반복문 종료
			}
		}
		return row;										// 결과값 반환
	}
	
	// 전화번호 수정에 사용할 delete함수 작성
	static int delete(int compareIdx) {					// static main에서 사용 되어야 하므로
														// 	- int 자료형을 반환하는 static delete 함수 작성
		int row = 0;									// 정수를 반환할 row를 0으로 초기화 하여 선언
		for(int i = 0; i < conArr.length; i++) {		// 저장된 값을 삭제하기 위해 배열 범위를 통제할 for반복문 제어문 작성
			if (compareIdx == conArr[i].getIdx()) {		// 매개변수로 전달받은 고유번호와 저장된 Contact 객체의 고유번호가 같으면
				conArr[i] = null;						// 해당 배열을 null로 값을 변경
				row = 1;								// row에 1을 저장하여 저장 성공을 확인
				break;									// 반복문 종료
			}
		}
		return row;										// 결과값 반환
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Contact ct = null;	// Contact 인스턴스 생성을 위한 변수 선언

		// 전화번호부에 선언 된 변수를 불러오기 위한 변수 선언
		int idx = 1;	
		String name, pnum;
		int compareIdx;		// 수정,삭제를 위해 고유번호와 비교할 정수 변수 compareIdx 선언 
		int menu;	// switch 문을 제어하기 위한 정수 변수 menu 선언
		int row;	// static 함수의 반환값을 저장하기 위한 정수 변수 row 선언
		
		
		
		// 기능을 제어할 switch ~ case 작성
		do {
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 목록");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 전화번호 삭제");
			System.out.println("0. 전화번호 종료");
			System.out.print("실행할 프로그램 번호 선택 >> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			
			case 1:
				// 객체 생성
				ct = new Contact();
				
				// 이름과 전화번호 입력 받음
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.print("전화번호 입력 : ");
				pnum = sc.nextLine();
				
				// Contact 클래스 변수가 private 처리 되어 있으므로 setter로 데이터 저장
				ct.setIdx(idx);	// 고유 번호는 입력받지 않고 삽입 
				ct.setName(name);
				ct.setPnum(pnum);
				
				row = add(ct);	// add 함수에 객체 형태로 매개변수 전달
								// - 성공하면 1을 반환 실패하면 0을 반환
				idx++;			// 고유번호를 자동 증가시켜 제어
				
				// 정수 row에 1이 반환되었으면 "추가성공"을 0이 반환되면 "추가실패"를 출력
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				System.out.println();
				break;
				
			case 2:
				for(int i = 0; i < conArr.length; i++) {
					if (conArr[i] != null) {
						// Contact클래스에서 오버로딩한 toString 함수로 출력
						System.out.println(conArr[i].toString());	
					}
					// 데이터가 없으면 경고문 출력
					else System.err.println("전화번호부가 비어있습니다.");
				}
				break;
				
			case 3:
				
				// 목록 번호를 확인하기 위해 안내차 목록 출력
				for(int i = 0; i < conArr.length; i++) {
					if (conArr[i] != null) {
						System.out.println(conArr[i].toString());
					}
					else break;
				}
				
				// 수정할 데이터 고유번호를 입력받고
				System.out.print("수정할 전화번호부 순번 입력 : ");
				compareIdx = Integer.parseInt(sc.nextLine());
				// 새로운 이름과 전화번호 입력
				System.out.print("수정할 이름 입력 : ");
				name = sc.nextLine();
				System.out.print("수정할 전화번호 입력 : ");
				pnum = sc.nextLine();
				
				// 입력받은 데이터로 수정 실시
				ct.setName(name);
				ct.setPnum(pnum);
				
				// update 함수에 매개변수로 고유번호와 객체 정보 전달
				// - 성공하면 1을 반환하므로 row에 1이 저장되고 실패하면 0이 저장
				row = update(compareIdx, ct);
				
				// 정수 row에 1이 반환되었으면 "수정성공"을 0이 반환되면 "수정실패"를 출력
				System.out.println(row == 1 ? "수정 성공" : "수정 실패");
				System.out.println();
				break;
				
			case 4:
				// 목록 번호를 확인하기 위해 안내차 목록 출력
				for(int i = 0; i < conArr.length; i++) {
					if (conArr[i] != null) {
						System.out.println(conArr[i].toString());
					}
					else break;
				}
				
				System.out.print("삭제할 전화번호부 목록 번호 입력 : ");
				compareIdx = Integer.parseInt(sc.nextLine());
				
				// 입력 받은 고유번호를 delete함수에 매개변수로 전달
				// - 성공하면 1을 반환하므로 row에 1이 저장되고 실패하면 0이 저장
				row = delete(compareIdx);
				
				// 정수 row에 1이 반환되었으면 "삭제성공"을 0이 반환되면 "삭제실패"를 출력
				System.out.println(row == 1 ? "삭제성공" : "삭제실패");
				System.out.println();
				break;
			}
			
		
		} while(menu != 0);	// menu가 0이 입력되면 반복문이 종료됨
		sc.close();
	}
}
