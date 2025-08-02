data = [1, 2, 3]

def process(data):
    for i in range(len(data)):
        data = data[i] * 2  
    return data

print(process(data))
