number  = int(input())

file = []

for i in range(number):
    file.append(input())

imsi = file[0]
result = ""
check_number = 0

if len(file) == 1:
    result = imsi

else:
    for i in range(len(imsi)):
        for j in range(len(file)):
            if imsi[i] == file[j][i]:
                check_number = check_number + 1

        if check_number == int(len(file)):
            check_number = 0
            result = result + str(imsi[i])
        
        else:
            check_number = 0
            result = result + "?"

print(result)
