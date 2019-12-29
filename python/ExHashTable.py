""" HashTable 생성 """
HashTable = list([0 for i in range(10)])


def getKey(data):
    return hash(data)


def hashFunction(key):
    return key % 10


def saveData(data, value):
    hashAddress = hashFunction(getKey(data))
    HashTable[hashAddress] = value


def readData(data):
    hashAddress = hashFunction(getKey(data))
    return HashTable[hashAddress]


saveData('파이리', 10)
saveData('피카츄', 13)

print(readData('파이리'))

print(HashTable)
