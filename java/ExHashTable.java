import java.util.*;

public class ExHashTable {
  public static void main(String[] args) {

    /* HashMap 선언 */
    HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

    /* HashMap에 값 저장 */
    hashmap.put("피카츄", 10);
    hashmap.put("파이리", 13);
    hashmap.put("꼬부기", 11);
    hashmap.put("이상해씨", 9);

    /* HashMap의 키 값 확인 */
    System.out.println(hashmap.keySet());

    /* HashMap의 키 값과 데이터 확인 */
    for (String key : hashmap.keySet()) {
      System.out.println(key + "의 레벨 : " + hashmap.get(key));
    }

    /* HashMap 키 "꼬부기" 삭제 */
    hashmap.remove("꼬부기");

    /* HashMap 키 "피카츄"의 값 31로 변경 */
    hashmap.replace("피카츄", 31);

    System.out.println("---------------------------");

    /* HashMap의 키 값과 데이터 확인 */
    for (String key : hashmap.keySet()) {
      System.out.println(key + "의 레벨 : " + hashmap.get(key));
    }
  }
}