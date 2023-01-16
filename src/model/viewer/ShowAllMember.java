package model.viewer;

import java.util.ArrayList;

import model1.daos.ModelDAO;
import model1.model.MemberDTO;

/*
 * 모든 회원의 정보를 열람하는 클래스입니다.
 * DAO 의 getALLMember() 를 호출하여 ArrayList 를 얻고
 * 루프를 통해 모든 정보를 출력해 봅니다.
 */
public class ShowAllMember {
   public static void main(String[] args) {
      ModelDAO dao = ModelDAO.getInstance();
      
      ArrayList<MemberDTO> members = (ArrayList<MemberDTO>)dao.getAllMember();
      
      //데이터가 없어도 EmptyList 를 리턴하도록 했기때문에, NullPointer 예외 걱정없이
      //size() 호출 할 수 있습니다.
      if(members.size() != 0) {
      for(int i = 0; i<members.size(); i++) {
         MemberDTO member = members.get(i);
         //여기서부터 출력 시작..
         System.out.println("--------------------------------------");
         System.out.println(i +" 이름 : " + member.getUserName());
         System.out.println("ID : " +  member.getUserid());
         System.out.println("Password : " + member.getUserPassword());
         System.out.println("Email : " + member.getUserEmail());
         System.out.println("Age : " + member.getUserAge());
         System.out.println("가입일 : " + member.getReg_Date());
         System.out.println("--------------------------------------");
      }
   }else {
      System.out.println("가입된 회원이 없습니다.");
      }
   }
}