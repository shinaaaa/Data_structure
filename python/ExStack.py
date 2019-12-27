data_stack = list()

for i in range(0, 10):
    data_stack.append(i)
    pass

print('스택의 크기 : ', len(data_stack))

for i in range(0, 10):
    print(data_stack.pop())
    print(data_stack)
pass
