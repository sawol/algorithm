# algorithm
알고리즘 문제 풀이

문제풀이 언어 : Python3.7

2020-09-13 programmers 시작!
2020-09-14 baekjoon 시작!


효율적으로 코딩하는 방법
<details>
    <summary>무한루프를 생성한다면 'while True:'가 아닌 'while 1:'를 사용</summary>

True = 1, False = 0

</details>

<details>
    <summary>두개의 리스트에서 다른 원소만 출력하고 싶을 때</summary>

반복문으로 원소를 비교하는 코드가 아닌 'collections.Counter(list1) - collections.Counter(list2)' 를 사용

</details>

<details>
    <summary>eval,exec 는 되도록 사용을 하지말자!</summary>

사용자의 입력값을 통해 취약점이 생길 수 있기때문이다.
무엇보다 eval, exec를 대채할 수 있는 더 좋은 방법이 대부분 존재한다.
참고-<https://qastack.kr/programming/1832940/why-is-using-eval-a-bad-practice>

</details>

<details>
    <summary>파이썬 연산자 우선순위</summary>

<https://dojang.io/mod/page/view.php?id=2461>

</details>
