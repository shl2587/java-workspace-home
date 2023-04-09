package quiz2;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		// userid와 userpw에 문자열을 입력받아서
		// 1) 아이디 불일치
		// 2) 아이디는 일치하지만, 패스워드 불일치
		// 3) 아이디와 패스워드 모두 일치하여 로그인 성공
				
		// 3개의 결과를 화면에 출력할 수 있는 코드를 작성하세요
		
		// 회원가입된 계정 정보
		String id = "itbank";
		String pw = "it";
		
		
		Scanner sc = new Scanner(System.in);
		String userid, userpw;	// 계정 로그인을 위한 userid와 userpw변수 선언
		
		System.out.print("아이디 입력 : ");
		userid = sc.nextLine();	// userid 입력받고 저장
		
		if (!id.equals(userid)) {	// String 내장 메서드인 equals를 활용하여 id 일치여부 확인
			System.err.println("아이디가 일치하지 않습니다.");	// 일치하지 않으면 해당 출력문 출력 후 실행 종료
		}
		else {	// 아이디가 일치한다면
			System.out.print("비밀번호 입력 : ");
			userpw = sc.nextLine();	// userpw 입력받고 저장
			
			if (!pw.equals(userpw)) {	// String 내장 메서드인 equals를 활용하여 pw 일치여부 확인
				System.err.println("비밀번호가 일치하지 않습니다.");	// 일치하지 않는다면 해당 출력문 출력 후 실행 종료 
			}
			else {	// pw까지 일치한다면
				System.out.printf("%s님 로그인 되었습니다.\n", userid);	// 로그인 성공을 알리는 메시지 출력
			}
		}

		
		System.out.println();
		
		sc.close();
	}
}
