# 입출력과 사칙연산

## 2557. Hello World!

- psvm: public static void main(String[] args) {}
- sout: System.out.println();

> ***참고*** <br>
> 자바에서는 패키지 이름과 클래스 이름이 숫자로 시작할 수 없음. 

## 1000. A+B
- scanner: Scanner sc = new Scanner(System.in);
- nextInt(): int a = sc.nextInt();
- nextLine(): String str = sc.nextLine();
- parseInt(): int num = Integer.parseInt(str);
- close(): sc.close();

## 1008. A/B
- double: 실수형 자료형
- casting: (double) a / b;
- 오차 범위: 10^-9 이면 -> 대체로 소수점 9번째 자리까지 출력
  - float: 대체로 6~7자리까지 정확성 보장 
  - double: 대체로 15~16자리까지 정확성 보장
  - 따라서 정확한 실수 계산이 필요한 경우 double 사용 권장
- printf: System.out.printf("%.9f\n", result);
  - %.9f: 소수점 9자리까지 출력

#### [자바 자료형]
|분류|	타입|	크기|	기본값| 	범위                                              | 범위(10진수)       | 범위(2진수)                    |
|---|---|---|---|--------------------------------------------------|----------------|-------------------------------------|
|정수형|	byte|	1byte|	0| 	-128 ~ 127                                      | -10^2 ~ 10^2   | -2^7 ~ 2^7-1                        |
|정수형|	short|	2byte|	0| 	-32768 ~ 32767                                  | -10^5 ~ 10^5   | -2^15 ~ 2^15-1                      |
|정수형|	int|	4byte|	0| 	-2147483648 ~ 2147483647                        | -10^10 ~ 10^10 | -2^31 ~ 2^31-1                      |
|정수형|	long|	8byte|	0L| 	- 9223372036854775808 ~ 9223372036854775807     | -10^19 ~ 10^19 | -2^63 ~ 2^63-1                      |
|문자형|	char|	2byte|	‘\u0000’| 	0 ~ 65535 (\u0000 ~ \uffff)                     | 0 ~ 65,535     | 0 ~ 2^16-1                          |
|실수형|	float|	4byte|	0.0f| 	single-precision 32-bit IEEE 754 floating point | -              | 약 1.4E-45 ~ 3.4028235E38            |
|실수형|	double|	8byte|	0.0d| 	double-precision 64-bit IEEE 754 floating point | -              | 약 4.9E-324 ~ 1.7976931348623157E308 |
|논리형|	boolean|	1byte|	false| 	true, false                                     | -              | N/A             |
* 1byte = 8bit

#### [참조 자료형]
- 데이터가 저장된 메모리 주소를 참조하는 자료형

| 참조 자료형     | 	설명              |
|------------|------------------|
| String     | 	문자열을 저장하는 데 사용되는 클래스. |
| ArrayList  | 	동적 배열을 나타내는 클래스. |
| HashMap    | 	키-값 쌍을 저장하는 데 사용되는 클래스. |
| HashSet    | 	고유한 요소를 저장하는 데 사용되는 클래스. |
| LinkedList | 	연결 리스트를 나타내는 클래스. |
| Queue      | 	큐를 나타내는 인터페이스.  |
|  Stack     | 	스택을 나타내는 클래스.   |

#### [래퍼 클래스(Wrapper Class)]
- 기본 자료형을 객체로 다루기 위한 클래스
- 기본 자료형을 클래스로 감싸 객체로 변환

|분류| 기본자료형 타입(Primitive Type) | 래퍼 클래스(Wrapper Class) |
|---|--------------------------|--------------------------|
|진위형|    boolean|	Boolean|
|문자형|    char   |	Character|
|정수형|    byte   |	Byte|
|정수형|    short  |	Short|
|정수형|    int    |	Integer|
|정수형|    long   |	Long|
|실수형|    float  |	Float|
|실수형|    double |	Double|

#### [박싱(Boxing)과 언박싱(Unboxing)]
- 기본 자료형과 래퍼 클래스 간에 데이터를 변환하는 과정
- JDK 1.5부터는 자바 컴파일러가 자동으로 처리하는 **오토 박싱/언박싱**을 지원함

| 구분 | 설명 | 예시 코드 |
|---|---|---|
| 박싱 (Boxing) | 기본 자료형의 값을 래퍼 클래스의 객체로 변환하는 것 | `int` → `Integer` |
| 언박싱 (Unboxing) | 래퍼 클래스 객체에서 기본 자료형의 값을 꺼내는 것 | `Integer` → `int` |

1. 오토 박싱 (Auto Boxing)
- 명시적으로 객체를 생성하지 않아도, 기본값을 대입하면 자동으로 객체로 변환됨
```java
// [기존 방식] 생성자 사용 (권장하지 않음)
Integer numObj = new Integer(10);

// [오토 박싱] 기본타입 int 10이 자동으로 Integer 객체로 변환되어 할당
Integer numObj = 10; 

// [컬렉션 활용] 리스트는 객체만 담을 수 있지만, int를 넣어도 자동 박싱됨
List<Integer> list = new ArrayList<>();
list.add(10);
```
2. 오토 언박싱 (Auto Unboxing)
- 래퍼 객체를 기본 자료형 변수에 대입하거나 연산할 때 자동으로 값만 추출됨

```Java
Integer numObj = 10;

// [오토 언박싱] 객체인 numObj가 자동으로 int 값 10으로 변환되어 계산됨
int sum = numObj + 20;

// [주의] 래퍼 객체가 null일 경우 언박싱 시 NullPointerException 발생함
Integer nullObj = null;
int fail = nullObj; // (X) 런타임 에러 발생
```

#### [기본 자료형과 참조 자료형의 차이점]
|구분|기본 자료형 (Primitive Type)|참조 자료형 (Reference Type)|
|---|--------------------------|--------------------------|
|저장 내용|실제 데이터 값(Value) 자체를 저장|데이터가 위치한 메모리 주소(Reference) 저장|
|메모리 영역|스택(Stack) 영역에 값 저장|힙(Heap) 영역에 실제 객체 저장(스택에는 그 주소값만 저장)|
|Null 허용|불가능(반드시 값이 할당되어야 함)|가능(가리키는 객체가 없음을 의미)|
|기본값|0, 0.0, false 등(자료형에 따라 다름)|null|
|제네릭 사용|불가능(List<int> ❌ → Wrapper Class 필요)|가능(List<Integer> ⭕)|
|산술 연산|가능 (사칙연산 등)|불가능(단, 언박싱(Unboxing) 후 가능)|
|메모리 크기|자료형별로 고정됨 (예: int는 4byte)|객체의 속성 및 크기에 따라 가변적|
|접근 속도|빠름 (메모리 직접 접근)|상대적으로 느림 (주소를 타고 접근)|
|종류(예시|boolean, char, byte, shortint, long, float, double (총 8개)|String, Array([]), ClassInterface, Enum, Wrapper Class 등|

#### [심화: 기본형 vs 참조형 vs 래퍼 클래스 비교]
- 래퍼 클래스는 참조 자료형의 일종이지만, 기본 자료형을 객체화한다는 특수성이 있어 별도 비교가 필요함

|구분|기본 자료형 (Primitive)|참조 자료형 (Reference)|래퍼 클래스 (Wrapper)|
|---|--------------------------|--------------------------|--------------------------|
|대표 예시|int, double, boolean|String, Array, UserClass|Integer, Double, Boolean|
|저장 내용|실제 데이터 값|데이터가 있는 메모리 주소|실제 값을 감싼 객체의 주소|
|메모리 위치|Stack(스택)|Heap (힙)|Heap (힙)|
|Null| 허용|불가능|가능|가능|
|제네릭 사용|불가능 (List<int> ❌)|가능 (List<String> ⭕)|가능 (List<Integer> ⭕)|
|용도|일반적인 수치 계산, 성능 최적화|복잡한 데이터 관리, 객체 지향 구현|기본형을 객체로 다뤄야 할 때 (DB Null 처리, 컬렉션 사용 등)|

## 10869. 사칙연산
- 사칙연산: +, -, *, /, %
- 정수 나누기: 몫만 출력
- 나머지 연산자: %
- 예: 7 % 3 = 1, -7 % 3 = -1, 7 % -3 = 1, -7 % -3 = -1
- 자료형은 int 사용 -> double 사용 시 나눗셈을 했을 때 소수점까지 정밀하게 계산함.
  - 예: 7 / 3 = 2 (int), 7 / 3 = 2.3333333... (double)
  - 문제의 의도와는 다르므로 정수형(int) 사용.

## 10926. ??!
- sc.nextLine(): 한 줄 전체 입력 받기
- sc.next(): 공백 전까지 입력 받기
- 문자열 연결 연산자: +
  - 예: "Hello, " + "World!" = "Hello, World!"
  - 문자열과 다른 자료형 연결 시 자동으로 문자열로 변환됨
    - 예: "Number: " + 10 = "Number: 10"