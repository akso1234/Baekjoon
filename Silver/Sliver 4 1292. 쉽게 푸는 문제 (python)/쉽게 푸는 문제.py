a, b =input().split()

number = [0 for i in range(int(b))]
e = 0
result = 0
add = 1

for i in range(int(b)):
    e = e + 1
    number[i] = add
    
    if add == e:
        add = add + 1
        e = 0

for i in range(int(a) -1 ,int(b)):
    
    result = result + number[i]

print(result)
