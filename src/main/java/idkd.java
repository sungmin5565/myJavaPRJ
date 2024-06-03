import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class idkd {

    public static void main(String[] args) {
      // Arraylist 구현 방식으로 메모리 올리기
        List<String> list = new ArrayList<>();

        // list 객체에 데이터 추가
        list.add("협건");
        list.add("길동");

        // list 저장된 데이터 수
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");

        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 :" + list.get(i));
        }

        //개선된 for 반복문 --2세대
        //장점 : 1세대 반복문의 단점인 반드시반복의 횟수를 알고 있어야 하는 반복문의문제점을 개선함
        System.out.println("2세대 반복문");

        for (String name : list) {
            System.out.println("이름 :" + name);
        }

        //개선된 for 반복문 --3세대
        //장점 : 2세대 보다 코딩해야 하는 줄(라인)이 감소함, 람다식 적용, 자바1.8 사용 가능
        System.out.println("3세대 반복문");

        list.forEach(name -> System.out.println("name : " + name));
    }
}
