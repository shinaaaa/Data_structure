<img src='https://user-images.githubusercontent.com/37543606/71501602-c1db0b80-28ae-11ea-8731-4531f1bdb737.jpg' >

* 출처 : https://image.shutterstock.com/image-vector/stack-books-isolated-icon-260nw-1263605575.jpg

#### 스택(Stack)

- 데이터를 일시적으로 저장하기 위해 사용되는 자료구조
- 데이터의 입력과 출력 순서는 후입선출(LIFO : Last In Firts Out)

- 시연해보며 이해보기 : https://visualgo.net/en/list

#### 푸시(Push)

- 데이터를 넣는 작업

#### 팝(Pop)

- 데이터를 꺼내는 작업

#### 꼭대기 (Top)

- 푸시와 팝을 하는 쪽

#### 바닥(Bottom)

- 스택의 가장 아래부분

##### Java

```java
import java.util.*;

public class ExStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();

    /* Stack에 값을 저장 */
    System.out.println("Stack에 값을 저장");
    for (int i = 0; i < 10; i++) {
      stack.push(i);
    }

    /* Stack의 크기 확인 */
    System.out.println("Stack의 크기 : " + stack.size());

    /* Stack의 맨위에 값을 꺼냄 꺼낸 값은 지워지지않음 */
    System.out.println("Stack의 값을 꺼냄 : " + stack.peek());

    /* Stack에서 값을 꺼내면서 값을 지움 */
    System.out.println("Stack에서 값을 꺼내면서 값을 지움");
    for (int i = 0; i < 10; i++) {
      if (stack.size() == 10) {
        System.out.print("[ ");
      }
      System.out.print(stack.pop() + ", ");
      if (stack.size() == 0) {
        System.out.println("] ");
      }
    }

    /* Stack의 크기 확인 */
    System.out.println("Stack의 크기 : " + stack.size());
  }
}
```



##### Python

```python
data_stack = list()

for i in range(0, 10):
    data_stack.append(i)
    pass

print('스택의 크기 : ', len(data_stack))

for i in range(0, 10):
    print(data_stack.pop())
    print(data_stack)
pass
```

