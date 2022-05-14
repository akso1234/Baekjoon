A, B = map(int, input().split())

check_number = 0
result_number = 0

while(check_number == 0):
    if A > int(B):
        check_number = 1
        result_number = -1
        break

    elif A == int(B):
        check_number = 1
        break

    else:
        B = str(B)
        if int(B) % 2 == 0:
            B = int(int(B) / 2)
            result_number += 1

        elif int(B[len(B) - 1]) == 1:
            B = int(B[:-1])
            result_number += 1

        elif int(B[len(B) - 1]) >= 3:
            check_number = 1
            result_number = -1
            break

if result_number == -1:
    print(result_number)
else:
    print(result_number + 1)
