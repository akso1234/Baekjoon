N = int(input())

vote_array = []
result = 0

for i in range(N):
    vote_array.append(int(input()))


while(max(vote_array) != vote_array[0]):
    i = vote_array.index(max(vote_array))
    if vote_array[0] <= vote_array[i]:
        vote_array[0] += 1
        vote_array[i] -= 1
        result += 1

number =list(filter(lambda e:vote_array[e] == max(vote_array), range(len(vote_array))))

if len(number) >= 2:
    for i in range(1, len(number)):
        vote_array[0] += 1
        vote_array[number[i]] -= 1
        result += 1
        if max(vote_array) == vote_array[0]:
            break



print(result)
