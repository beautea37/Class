package ioEx;

import java.io.File;
import java.io.IOException;

public class FileExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);

		File f = new File("C:" + File.separator + "temp");
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());

		// Press란 폴더를 생성해보자구!
		String fName = "press";
		File file = new File("myFile.txt");
		// 생성자 파라미터 1개짜리를 이용, File객체 생성..
		File folder = new File(fName);
		if (!folder.exists()) {
			System.out.println(folder.mkdir());
		} else {
			// 만약 존재한다면 경로는 어떻게 되니?
			String path = folder.getAbsolutePath();
			System.out.println(path);

			// 파라미터 2개 생성자를 이용해 지정된 부모 폴더 하위에 빈파일 생성
			File newFile = new File(folder, file.getName());
			System.out.println(newFile.createNewFile() == true ? " 파일이 생성됨" : "뭔가 오류가 있슴");

			// 생성된 파일의 일반적 정보를 알아봅니다.
			System.out.println("이름 : " + newFile.getName());
			System.out.println("크기(size) : " + newFile.length() + "bytes");
			System.out.println("절대경로 : " + newFile.getAbsolutePath());
			System.out.println("파일 or 폴더 : " + newFile.isFile());
			System.out.println("부모 폴더 이름 :  : " + newFile.getParent());
			System.out.println("숨김(hidden) 여부 : " + newFile.isHidden());
			System.out.println("읽기 전용으로(ReadOnly로 수정 : " + newFile.setReadOnly());

			// 부모폴더를 file 객체로 리턴받는다.
			File parent = newFile.getParentFile();
			File[] files = parent.listFiles();
			if (files.length != 0) {
				for (File fi : files) {
					System.out.println(fi.getName());
					System.out.println(fi.isDirectory() == true ? "폴더" : "파일");
					System.out.println(fi.delete());
				}
			}
		}
		delAll(folder.getAbsolutePath());
	}

	// 재귀호출을 이용한 파일이 있는 폴더 삭제하기 <<<<<<<<<이거 왜함? 프로그래밍상 폴더를 지우면 파일이 남아있게되고 그럼 말도 안되기
	// 때문에 재귀재귀로 파일 모두 삭제시킨 후 폴더 지워야 한다.
	static void delAll(String path) {
		// 폴더 내의 모든 파일 정보를 얻어낸다.
		File[] files = new File(path).listFiles();

		for (File f : files) {
			// 폴더정보 얻기
			if (f.isFile()) {
				f.delete();
				System.out.println("파일을 삭제함");
			} else {
				delAll(f.getAbsolutePath());
				f.delete();
				System.out.println("폴더 삭제함");
			}
		}
	}
}
