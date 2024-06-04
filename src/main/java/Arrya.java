import java.util.*;

public class Arrya {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;
        for (int i =0; i <3; i++) {

            System.out.println("이름 : ");
            String name = Scanner.next();

            System.out.println("이메일 : ");
            String email = Scanner.next();

            System.out.println("부서 : ");
            String dept = Scanner.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            list.add(map);
        }
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        list.forEach(rMap -> {    //3세대
            // 장점 ㅣ 2세대 보다 코딩해야 하는 줄 (라인)이 감소, 람다식 적용 , 자바 1.8 사용
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });

        list.parallelStream().forEach(rMap -> {  //4세대
            // 개선된 for 반복문 장점 : 3세대에 비동기식 처리 방법 적용
            //단점 : 처리완료가 누가 먼저 될지 알 수가 없음, 따라서 모든 경우에 다 쓸수 없
            //parallelStream = 병렬 처리 스트림
            System.out.println("name : " + rMap.get("name")); // 이름 가져오기
            System.out.println("email : " + rMap.get("email")); // 이메일 가져오기
            System.out.println("dept : " + rMap.get("dept"));  //부서 가져오기
        });
    }
}
