def order_by_points(nums):
    if not nums:
        return []

    def sum_digits(n):
        s = 0
        n = abs(n)
        while n:
            s += n % 10
            n //= 10
        return s

    with_indices = list(enumerate(nums))
    with_indices.sort(key=lambda x: (sum_digits(x[1]), x[0]))
    return [x[1] for x in with_indices]

