import queue

N = int(input())

queue = []
result_array = []

for i in range(N):
    command_name = input()
    if "push" in command_name:
        queue.append(int(command_name[5:]))
    
    elif "pop" in command_name:
        if len(queue) == 0:
            result_array.append(-1)
        else:
            result_array.append(queue.pop(0))  

    elif "size" in command_name:
        result_array.append(len(queue))
    
    elif "empty" in command_name:
        if len(queue) == 0:
            result_array.append(1)
        else:
            result_array.append(0)

    elif "front" in command_name:
        if len(queue) == 0:
            result_array.append(-1)
        else:
            result_array.append(queue[0])

    elif "back" in command_name:
        if len(queue) == 0:
            result_array.append(-1)
        else:
            result_array.append(queue[len(queue) - 1])

for i in range(len(result_array)):
    print(result_array[i])
