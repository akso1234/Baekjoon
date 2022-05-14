N, K= map(int, input().split())
cnt = 0
money_array = []

for i in range(N):
    money = int(input())
    if money > K:
        pass
    else:
        money_array.append(money)

money_array.sort(reverse=True)

for coin in money_array:
    cnt += K // coin
    K %= coin

print(cnt)
