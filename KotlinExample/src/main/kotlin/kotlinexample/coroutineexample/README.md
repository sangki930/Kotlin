launch(), async() 빌더의 경우 (일시 중단 함수 내부에서) 스레드 호출을 block시키진 않지만 <br>
백그라운드 스레드를 공유하는 pool을 통해 작업을 실행한다.<br>

runBlocking()은 블러킹 호출과 넌블러킹 호출에 고안된 빌더이므로, 테스트나 메인함수에서 최상위 빌더로 사용하는 등의 경우에만 쓴다.

coroutineScope() 호출로 코드 블럭을 감싸면 커스텀 영역을 도입할 수 있다. 이것은 람다의 결과를 반환하, 자식들이 완료되기 전까지 실행이 완료되지 않는다.<br>

- 잡(Job) : 동시성 작업의 생명 주기를 표현하는 객체
<br>
- 잡 프로퍼티로부터 잡 현재 상태 결정하기
<br>
<br>

| **잡 상태** | **isActive** | **isCompeted** | **isCancelled** |
|----------|--------------|----------------|-----------------|
| 신규       | false        | false          | false           |
| 활성화      | true         | false          | false           |
| 완료 중     | true         | false          | false           |
| 취소 중     | false        | false          | true            |
| 취소됨      | false        | true           | true            |
| 완료됨      | false        | true           | false           |