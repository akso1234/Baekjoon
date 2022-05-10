result = 0

number = int(input())

word = input().split()

cluster = int(input())

for i in range(number):
    if int(word[i]) != 0:
        if int(word[i]) > cluster:
            if int(word[i]) % cluster == 0:
                result = result + int(int(word[i]) / cluster)
            else:
                result = result + int(int(word[i]) / cluster) + 1
        else:
            result = result + 1

print(cluster * result)
