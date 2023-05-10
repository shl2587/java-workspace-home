package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.MemberDTO;
import repository.MemberDAO;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String userid, userpw, nickname;
		String logout;
		int menu, row;
		MemberDTO dto = null;
		MemberDAO dao = null;
		ArrayList<MemberDTO> list = null;
		
		
		do {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인 / 로그아웃");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 회원 탈퇴");
			System.out.println("0. 프로그램 종료");
			System.out.print("프로그램 실행 번호 입력 : ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
				
			case 1:
				
				dao = new MemberDAO();
				
				if (dto == null) {
					dto = new MemberDTO();
					System.out.print("아이디 입력 : ");
					userid = sc.nextLine();
					
					System.out.print("비밀번호 입력 : ");
					userpw = sc.nextLine();
					
					System.out.print("닉네임 입력 : ");
					nickname = sc.nextLine();
					
					dto.setUserid(userid);
					dto.setUserpw(userpw);
					dto.setNickname(nickname);
					
					row = dao.insert(dto);
					if (row == 1) {
						System.out.println("회원가입 성공! 로그인 하세요");
					}
					else {
						System.out.println("회원가입 실패!");
					}
					System.out.println();
				}
				else {
					System.out.println("로그인 중입니다. 로그아웃 후 진행부탁드립니다");
					System.out.println();
				}
				break;
				
			case 2:
				if (dto == null) {
					System.out.print("아이디 입력 : ");
					userid = sc.nextLine();
					
					System.out.print("비밀번호 입력 : ");
					userpw = sc.nextLine();
					
					dao = new MemberDAO();
					dto = new MemberDTO();
					
					dto = dao.login(userid, userpw);
					
					System.out.println((dto != null) ? "로그인 성공" : "로그인 실패");
					System.out.println();
					break;
				}
				else {
					System.out.print("로그아웃 하시겠습니까?(Y/N) : ");
					logout = sc.nextLine();
					if (logout.equals("Y")) {
						dto = null;
						System.out.println();
						break;
					}
					if (logout.equals("N")){
						System.out.println();
						break;
					}
				}
				System.out.println();
				
			case 3:
				list = new ArrayList<>();
				if (dto != null) {
					System.out.println("1. 비밀번호 변경");
					System.out.println("2. 닉네임 변경");
					System.out.print("수정할 회원 정보 선택 : ");
					int check;
					check = Integer.parseInt(sc.nextLine());
					dto = new MemberDTO();
					if (check == 1) {
						System.out.print("현재 비밀번호 입력 : ");
						userpw = sc.nextLine();
						
						list = dao.coincide(userpw);
						boolean flag = (list.isEmpty());
						
						if (flag == false) {
							System.out.print("새 비밀번호 입력 : ");
							userpw = sc.nextLine();
							row = dao.change(userpw, list.get(0).getUserid(), check);
							
							System.out.println(row != 0 ? "비밀번호 변경완료!" : "비밀번호 변경실패!");
							System.out.println();
						}
						else {
							System.out.println("비밀번호가 일치하지 않습니다. 확인후 다시 시도해주세요");
							System.out.println();
						}
					}
					if (check == 2) {
						System.out.print("새 닉네임 입력 : ");
						nickname = sc.nextLine();
						
						row = dao.change(nickname, dto.getUserid(), check);
						System.out.println(row != 0 ? "닉네임 변경완료!" : "닉네임 변경실패!");
						System.out.println();
					}
					break;
				}
				else {
					System.out.println("로그인 되어있지 않습니다. 로그인 후 이용바랍니다.");
					System.out.println();
				}
			
			case 4:
				if (dto != null) {
					System.out.print("현재 비밀번호 입력 : ");
					userpw = sc.nextLine();
					
					list = dao.coincide(userpw);
					boolean flag = (list.isEmpty());
					
					if (flag == false) {
						String choice;
						System.out.print("회원 탈퇴를 진행하시겠습니까?(Y/N)");
						choice = sc.nextLine();
						if (choice.equals("Y")) {
							dto = new MemberDTO();
							row = dao.delete(dto);
							System.out.println(row != 0 ? "회원탈퇴 되었습니다. 이용해주셔서 감사합니다." 
															: "탈퇴가 정상적으로 진행되지 않았습니다.");
						}
					}
				}
				else {
					System.out.println("로그인 되어있지 않습니다. 로그인 후 이용바랍니다.");
					System.out.println();
				}
				
				break;
			}
		} while (menu != 0);
		
		
		sc.close();
		
	}
}
