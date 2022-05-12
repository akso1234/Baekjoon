RESULT_ARRAY = []

while(True):
    SMALL_PARENTHESIS_NUMBER= 0
    MIDDLE_PARENTHESIS_NUMBER = 0

    DETERMINATION_ARRAY = []

    temporary_sentence = input()
    if temporary_sentence == ".":
        break
    else:
        for i in range(len(temporary_sentence)):
            if temporary_sentence[i] == "[":
                MIDDLE_PARENTHESIS_NUMBER += 1
                DETERMINATION_ARRAY.append(1)

            elif temporary_sentence[i] == "(":
                SMALL_PARENTHESIS_NUMBER += 1
                DETERMINATION_ARRAY.append(0)

            elif temporary_sentence[i] == "]":
                if MIDDLE_PARENTHESIS_NUMBER <= 0:
                    MIDDLE_PARENTHESIS_NUMBER = -1
                    break

                else:
                    if DETERMINATION_ARRAY[len(DETERMINATION_ARRAY) - 1] == 1:
                        MIDDLE_PARENTHESIS_NUMBER -= 1
                        del DETERMINATION_ARRAY[len(DETERMINATION_ARRAY) - 1]
                    else:
                        break
            
            elif temporary_sentence[i] == ")":
                if SMALL_PARENTHESIS_NUMBER <= 0:
                    SMALL_PARENTHESIS_NUMBER = -1
                    break

                else:
                    if DETERMINATION_ARRAY[len(DETERMINATION_ARRAY) - 1] == 0:
                        SMALL_PARENTHESIS_NUMBER -= 1
                        del DETERMINATION_ARRAY[len(DETERMINATION_ARRAY) - 1]
                    else:
                        break


            else:
                pass
        
        if SMALL_PARENTHESIS_NUMBER != 0 or MIDDLE_PARENTHESIS_NUMBER != 0:
            RESULT_ARRAY.append("no")
        else:  
            RESULT_ARRAY.append("yes")

for i in range(len(RESULT_ARRAY)):
    print(RESULT_ARRAY[i])
