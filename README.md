# Programmers_64061
## 프로그래머스 - 크레인 인형뽑기 게임 (https://programmers.co.kr/learn/courses/30/lessons/64061#)
인형뽑기에서 뽑은 인형들을 바구니에 담았을 때, 마지막 담았던 인형이 방금 집어 넣은 인형과 같을 경우 터지게 되며,
터진 인형의 개수를 return하는 아주 간단한 문제. LIFO 자료구조, Stack을 이용하면 쉽게 풀 수 있다..
라고 생가하고 Submit 했지만, 몇몇 상황에 대한 예외처리가 필요했다.

구현 순서는 아래와 같다 : 
1. 크레인을 내릴 위치가 담긴 moves 배열의 값을 Column값으로, 가장 위에 위치한 인형 확인
2. 인형이 위치했던 자리의 배열값 0으로 수정 & 아래 조건 확인
  - Stack이 empty일 경우 무조건 Push > Empty 상태에서 Peek() 시 발생하는 EmptyStackException에 대한 예외처리
  - Stack의 맨 마지막 값과 방금 꺼낸 인형이 같을 경우
      > Return 값 2씩 증가
      > 인형을 터뜨린 뒤에 연속되는 인형들에 대한 처리를 위해 While문에 위치해야 함  
  - 위 2개 조건 외에는 그냥 Stack에 인형 push
