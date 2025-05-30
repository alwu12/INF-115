#Dingxin Tao ID: 75864090

def sum_digits(n):
    s = 0
    sign = -1 if n < 0 else 1
    n = abs(n)
    s += sign * (n // (10 ** (len(str(n)) - 1)))
    n %= (10 ** (len(str(n)) - 1))
    while n > 0:
        s += n % 10
        n //= 10
    return s

def order_by_points(nums):
    if not nums:
        return []
    
    with_sums = []
    for i, num in enumerate(nums):
        with_sums.append((sum_digits(num), i, num))
    
    with_sums.sort()
    
    result = [num for _, _, num in with_sums]
    return result