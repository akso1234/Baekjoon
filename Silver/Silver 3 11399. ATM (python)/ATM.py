imsi = 0
result = 0

N = int(input())



bank_array = list(map(int, input().split()))
bank_array.sort()

for i in range(len(bank_array)):
    imsi = imsi + bank_array[i]
    result = result + imsi

print(result)
