package 한승록2A;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 5-1. 변수 선언
		// String name = Member 클래스에 전달할 이름 
	    // String userId = Member 클래스에 전달할 아이디
	    // String userPw = Member 클래스에 전달할 패스워드 
	    // String search = selectOne메서드에 전달할 아이디 
	    // String deleteId = delete메서드에 전달할 아이디
	    // String storeName, address = 각각 Seller와 Customer에 전달할 변수
	    // String use = 아이디 일치여부 확인후 해당 아이디 사용할것인지 확인하는 변수
	    // int menu = 프로그램 실행 번호
	    // int type = 구매자와 판매자 구분 번호
	    // int check = 0 = 아이디 일치여부 확인
	    // int row = 각 메뉴별 메서드 사용 시 정수 return값을 저장할 변수
		String name, userId, userPw;
		String search, deleteId;
		String storeName, address;
		int menu, type, check = 0, row;
		String use;
		
		Scanner sc = new Scanner(System.in);	// 5-2. 값을 입력받기위해 Scanner 클래스 생성
		
		// 5-3. 객체 및 리스트 생성
		Member mb = null;					// 값을 저장할 Member객체 생성
		ArrayList<Member> list = null;		// 저장된 list 값을 저장해줄 리스트 생성
		Handler handler = new Handler();	// 메서드 사용 위한 handler 객체 생성
		
		System.out.println("\t쇼핑몰 회원가입 프로그램 (응시자 : 한승록)\t\n");
		System.out.println();
		
		// 5-4.  do while 구문 작성(프로그램 실행)
		do {									// 강제로 최초 1회 실행을 위한 do(무한 반복을 돌리기 위한 작업)
			System.out.println("1. 회원가입");
			System.out.println("2. 회원목록");
			System.out.println("3. 회원검색");
			System.out.println("4. 회원탈퇴");
			System.out.println("0. 종료");
			System.out.print("프로그램 실행번호 입력 : ");
			menu = Integer.parseInt(sc.nextLine());		// 위의 프로그램 실행 번호로 보내기 위한 menu (번호)입력
			
			switch(menu) {								// switch를 위에서 입력받은 menu로 통제
			
			case 1:	// 회원가입
				System.out.print("회원아이디 중복 확인 : ");	
				userId = (sc.nextLine());				// 가입 전 회원아이디 중복 확인
				check = handler.duplicateCheck(userId);	// 중복되었다면 handler.duplicationCheck(userId)메서드가 1을 반환하고 check에 저장
				
					if (check == 1) {		// check가 1이라면 사용불가능 에러 메시지 출력
						System.err.println("사용 불가능한 아이디 입니다");	
						System.out.println("다시 입력 부탁드립니다.");	
						System.out.println();
						continue;
					}
					else if (check == 0) {	// check가 0이라면 사용가능 아이디 출력과 동시에 계속 사용여부 확인
						System.out.print("사용가능한 아이디입니다 사용 하시겠습니까?(Y/N) ");
						use = sc.nextLine();	// use에 사용자가 "Y"를 누른다면 계속 진행 
						System.out.println();
						
						if (use.equals("Y")) {
							System.out.println("이어서 입력해주세요");
							
							// 회원가입이 계속 진행될 경우 공통 속성을 (패스워드와 이름)입력 받음
							System.out.print("비밀번호 입력 : ");
							userPw = sc.nextLine();
							
							System.out.print("회원이름 입력 : ");
							name = sc.nextLine();
							
							// 판매자인지 구매자인지 구분하는 type입력 요청
							System.out.print("회원유형 입력(1. 판매자 | 2. 구매자) : ");
							type = Integer.parseInt(sc.nextLine());
							if (type == 1) {						// type이 1(판매자)라면 storeName을 입력받음 
								System.out.print("가게이름 입력 : ");
								storeName = sc.nextLine();
								
								// mb = new Seller(입력받은 변수)를 통해 판매자 객체 생성
								mb = new Seller(name, userId, userPw, storeName);
								row = handler.insert(mb);
								list = handler.selectAll();	// list에 handler에서 반환된 list값을 저장
								
								System.out.println(row == 1 ? "가입 성공!" : "가입 실패");
								System.out.println();
								
							}
							else if (type == 2) {					// type이 2(구매자)라면 address를 입력받음 
								System.out.print("기본 배송 주소 입력 : ");
								address = sc.nextLine();
								
								// mb = new Customer(입력받은 변수)를 통해 구매자 객체 생성
								mb = new Customer(name, userId, userPw, address);
								row = handler.insert(mb);
								list = handler.selectAll();	// list에 handler에서 반환된 list값을 저장
								
								// row에 handler.insert(mb)를 통해 정수를 받고 1이면 가입성공을 2이면 가입실패를 출력
								System.out.println(row == 1 ? "가입 성공!" : "가입 실패");
								System.out.println();
							}
						}
						if (use.equals("N")) {		// 아이디 사용 여부에서 "N"을 누른다면 다시 처음부터 시작
							System.out.println("처음으로 돌아갑니다");
							System.out.println();
							continue;
						}
					}
				
				break;
				
			case 2:	// 전체목록
				if (list.size() != 0) {			// list의 크기가 0이 아니라면 향상된 for문을 통해 toString()을 사용하기 위해
					for(Member m : list) {		// Member클래스 m객체에 리스트 값을 저장하고 출력
						System.out.println(m);
					}
				}
				else {							//  크기가 0이라면 회원이 없다는 에러메시지 출력
					System.err.println("회원이 없습니다.");
					System.out.println();
				}
				System.out.println();
				break;
				
			case 3:	// 단일 검색
				if (list.size() != 0) {			// 크기가 0이 아니라면 검색할 ID를 search로 입력받음
					System.out.print("검색하실 회원님의 ID를 입력하세요 : ");
					search = sc.nextLine();
					mb = handler.selectOne(search);	// handler.selectOne(search)의 반환값이 Member 변수 객체이므로 
													// 새로운 Member객체 생성 후 저장 후 출력
					if (mb != null) {
						System.out.println(mb);
					}
					// 값이 null이라면 회원이 없다는 에러메시지 출력
					else System.err.println("찾으시는 회원이 없습니다. 회원 ID 확인부탁드립니다");	
					System.out.println();
				}
				else {	// 크기가 0이라면 회원이 없다는 에러메시지 출력
					System.err.println("회원이 없습니다.");
					System.out.println();
				}
				break;
				
			case 4:	// 회원탈퇴
				if (list.size() != 0) {		// list의 크기가 0이 아니라면 
					System.out.print("탈퇴하실 회원 Id입력 : ");
					deleteId = sc.nextLine();	// 탈퇴 회원 ID를 deleteID에 입력받은 뒤 
					
					row = handler.delete(deleteId);	// row에 handler.delete(deletId)의 값을 저장
					System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");	// 1을 반환하면 삭제 성공을 아니라면 삭제 실패를 출력
					System.out.println();
				}
				else {	// 크기가 0이라면 회원이 없다는 에러메시지 출력
					System.err.println("회원이 없습니다.");
					System.out.println();
				}
				break;
			}
		} while(menu != 0);	// menu에 0을 입력하면 프로그램 모두 종료
		sc.close();
	}
}
