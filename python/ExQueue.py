import queue

Ex_queue = queue.Queue()

print('Queue에 값을 저장')
for i in range(0, 10):
    Ex_queue.put(i)
    pass
print('Queue의 크기 : ', Ex_queue.qsize())

print('Queue에서 값을 꺼내면서 값을 지움')
for i in range(0, 10):
    if Ex_queue.qsize() == 10:
        print('[', end=' ')
    print(Ex_queue.get(), end=', ')
    if Ex_queue.qsize() == 0:
        print(']')
    pass
print('Queue의 크기 : ', Ex_queue.qsize())
print(Ex_queue.qsize())
