package forTeam;

public class PeopleSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			People people1 = new People("사람1", 5, 3, 2);
			People people2 = new People("사람2", 8, 7, 3);
			People people3 = new People("사람3", 3, 7, 15);
			People people4 = new People("사람4", 5, 3, 6);
			People people5 = new People("사람5", 2, 1, 0);
			People people6 = new People("사람6", 3, 0, 0);
			People people7 = new People("사람7", 1, 0, 5);
			People people8 = new People("사람8", 23, 3, 7);
			
			
			System.out.println(people1.name + " : " + people1.getWin() + "승 " + people1.getDraw() + "무 " + people1.getLose() + "패 >> 승률 :    " + (long)people1.getWin()/(people1.getWin()+people1.getDraw()+people1.getLose())*100 + "%") ;
			System.out.println(people2.name + " : " + people2.getWin() + "승 " + people2.getDraw() + "무 " + people2.getLose() + "패 >> 승률 :    " + (long)people2.getWin()/(people2.getWin()+people2.getDraw()+people2.getLose())*100 + "%") ;
			System.out.println(people3.name + " : " + people3.getWin() + "승 " + people3.getDraw() + "무 " + people3.getLose() + "패 >> 승률 :    " + (long)people3.getWin()/(people3.getWin()+people3.getDraw()+people3.getLose())*100 + "%") ;
			System.out.println(people4.name + " : " + people4.getWin() + "승 " + people4.getDraw() + "무 " + people4.getLose() + "패 >> 승률 :    " + (long)people4.getWin()/(people4.getWin()+people4.getDraw()+people4.getLose())*100 + "%") ;
			System.out.println(people5.name + " : " + people5.getWin() + "승 " + people5.getDraw() + "무 " + people5.getLose() + "패 >> 승률 :    " + (long)people5.getWin()/(people5.getWin()+people5.getDraw()+people5.getLose())*100 + "%") ;
			System.out.println(people6.name + " : " + people6.getWin() + "승 " + people6.getDraw() + "무 " + people6.getLose() + "패 >> 승률 :    " + (long)people6.getWin()/(people6.getWin()+people6.getDraw()+people6.getLose())*100 + "%") ;
			System.out.println(people7.name + " : " + people7.getWin() + "승 " + people7.getDraw() + "무 " + people7.getLose() + "패 >> 승률 :    " + (long)people7.getWin()/(people7.getWin()+people7.getDraw()+people7.getLose())*100 + "%") ;
			System.out.println(people8.name + " : " + people8.getWin() + "승 " + people8.getDraw() + "무 " + people8.getLose() + "패 >> 승률 :    " + (long)people8.getWin()/(people8.getWin()+people8.getDraw()+people8.getLose())*100 + "%") ;
		
			}
}
