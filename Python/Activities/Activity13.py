def calculate_sum(numbers):
    sum = 0
    for number in numbers:
        sum +=number
    return sum
numList =[10,10,10,10]
result = calculate_sum(numList)
print("the sum of all the elements is:" + str(result))

