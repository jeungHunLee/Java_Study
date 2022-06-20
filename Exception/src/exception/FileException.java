package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) {
        FileInputStream file = null;

        try {
            file = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {     //파일이 존재 하지 않을때 예외 처리
            System.out.println(e);
            return;
        } finally {     //위의 return과 상관없이 try문 실행시 finally문은 항상 실행
            if(file != null) {
                try {
                    file.close();
                } catch(IOException e) {    //파일을 닫을때 발생하는 예외 처리
                    e.printStackTrace();    //에러 위치와 이유를 전체적인 단계로 출력
                }
            }
            System.out.println("finally문은 try문 실행시 항상 실행");
        }
        System.out.println("종료");
    }
}
