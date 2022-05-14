N = input()

if '0' in N:
    number_array = list(N)
    number_array.sort(reverse= True)
    result = "".join(number_array)
    if int(result) % 30 == 0:
        print(result)
    else:
        print("-1")
else:
    print("-1")
