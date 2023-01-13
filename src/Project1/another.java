package Project1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/* 회원가입 시 설정된 암호 맞는지 검사
 * 
 * 로그인시 [' '님 환영합니다] 출력
 * 로그인 오류 : 오류알림 , 3회 재입력 기회 , [ 관리자 연락바람 ] 메세지 출력 후 게임 종료
 */

public class another implements ActionListener {

   JFrame frame = new JFrame();
   JButton loginBtn = new JButton("Sign in");
   JButton reBtn = new JButton("Reset");
   JTextField userID = new JTextField();
   JPasswordField userPW = new JPasswordField(20);
   JLabel userIDlabel = new JLabel("Email : ");
   JLabel userPWlabel = new JLabel("Password : ");
   JLabel msglabel = new JLabel("");
   HashMap<String, String> logininfo = new HashMap<String, String>();

   another(HashMap<String, String> loginInfoOriginal) {

      logininfo = loginInfoOriginal;

      userIDlabel.setBounds(50, 100, 75, 25);
      userPWlabel.setBounds(50, 150, 75, 25);

      msglabel.setBounds(125, 250, 250, 35);
      msglabel.setFont(new Font(null, Font.ITALIC, 25));

      userID.setBounds(125, 100, 200, 25);
      userPW.setBounds(125, 150, 200, 25);

      loginBtn.setBounds(125, 200, 100, 25);
      loginBtn.setFocusable(false);
      loginBtn.addActionListener(this);

      reBtn.setBounds(225, 200, 100, 25);
      reBtn.setFocusable(false);
      reBtn.addActionListener(this);

      frame.add(userIDlabel);
      frame.add(userPWlabel);
      frame.add(msglabel);
      frame.add(userID);
      frame.add(userPW);
      frame.add(loginBtn);
      frame.add(reBtn);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(420, 420);
      frame.setLayout(null);
      frame.setVisible(true);
   }

   @Override
   
   public void actionPerformed(ActionEvent e) {

      
         //리셋버튼눌렀을때 다 지워짐
      if (e.getSource() == reBtn) {
         userID.setText("");
         userPW.setText("");
      }
      //로그인 버튼눌렀을때
      loginBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            String id = userID.getText().trim();
            String pw = userPW.getText().trim();
            String login = "";
            
            if(id.length()==0 || pw.length()==0) {
               JOptionPane.showMessageDialog
               (null, "아이디 또는 비밀번호를 입력 하셔야 됩니다.", 
                     "아이디나 비번을 입력!", JOptionPane.DEFAULT_OPTION);
               return;
            }
      //텍스트 파일에 저장된 모든 글자를 가져온다 | 구분자로 아이디와 비번이 맞는게 있다면 로그인 시켜주면 된다.
            try{
            BufferedReader reader = new BufferedReader(new FileReader
                  ("C:\\Users\\Manic-063\\Desktop\\member.txt"));
            
            String str;
            ArrayList<String> txtmember = new ArrayList<>();
            while ((str = reader.readLine()) != null) {
               txtmember.add(str);
            }   
            
            reader.close();
            
            //memberlist에 아이디와 비밀번호 저장하기
            HashMap<String,String> memberlist = new HashMap<>();
            
            for(int i=0; i<txtmember.size(); i++) {
               // | 구분자 기준으로 잘라낸 텍스트를 memberlist에 넣어주기.
               
               String[] tempresult = txtmember.get(i).toString().split("\\|");
               memberlist.put(tempresult[0],tempresult[1]);
            }
            
            //txt 파일에서 가져온 아이디 비번과 입력한 아이디 비번이 맞는지 확인
            for ( String key : memberlist.keySet() ) {
               if(id.equals(key.trim()) && pw.equals(memberlist.get(key))) {
            
            login = "성공";
            }
        }                    
   
      }catch(Exception errmsg){
         errmsg.printStackTrace();
      }

if (logininfo.get(id).equals(pw)) {
      JOptionPane.showMessageDialog(null, "로그인 성공", "로그인 확인!", 
            JOptionPane.DEFAULT_OPTION);
      
   }else{
      JOptionPane.showMessageDialog(null, "로그인 실패", "계정 정보를 확인해 주세요.", 
            JOptionPane.DEFAULT_OPTION);
   }

   }});
   
      }
      }
      
   