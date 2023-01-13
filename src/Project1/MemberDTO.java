package Project1;

//0111 1819


public class MemberDTO{
	   
	   private String ID;
	   private String PW;
	   private int Date;
	   MemberDAO memDAO;

	   

	   public MemberDTO(MemberDAO memDAO) {
	      this.memDAO = memDAO;
	      
	   }
	   
	   


	   public String getPW() {
	      return PW;
	   }

	   public void setPW(String pW) {
	      PW = pW;
	   }

	   public String getID() {
	      return ID;
	   }

	   public void setID(String iD) {
	      ID = iD;
	   }
	   public int getDate() {
	      return Date;
	   }
	   public void setDate(int date) {
	      Date = date;
	   }
	}
