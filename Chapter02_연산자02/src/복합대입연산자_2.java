/*
 * 비트 연산자
 * int a = 10;
 * a&=2 ==> a=a&2
 * a|=2 ==> a=10|2
 * a^=2 ==> a=10^2
 * 
 * ========================================
n = int(input())
m =list(map(int, input().split()))
cnt = 0
s = 0
for i in range(n):
    for j in range(2, m[i]+1):
        if m[i] % j == 0:
            cnt += 1
    if cnt == 1:
       s += 1
print(s)
           그 수를 나눠서 0이되는 수 
 *  *   if 약수가 1을 제외시키고 나밖에 없으면
 * 2, 자신+1
 */
public class 복합대입연산자_2 {
	public static void main(String[] args) {
		int a = 10;
		a &= 2;
		System.out.println(a);
		
		a=10;
		a|=2;
		System.out.println(a);
		
		a = 10;
		a ^= 2;
		System.out.println(a);

	}

}
