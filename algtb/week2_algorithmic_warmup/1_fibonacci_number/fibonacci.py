# Uses python3
def calc_fib(n):
    if (n <= 1):
        return n
    
    prev = 0
    current = 1
    
    for _ in range(n-1):
      prev, current = current, prev + current

    return current

n = int(input())
print(calc_fib(n))
