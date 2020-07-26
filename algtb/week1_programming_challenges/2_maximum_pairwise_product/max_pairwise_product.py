# python3
def quick_sort(array):
  if len(array) <= 1:
    return array

  pivot = array[len(array)//2]
  left = [x for x in array if x < pivot]
  middle = [x for x in array if x == pivot]
  right = [x for x in array if x > pivot]

  return quick_sort(left) + middle + quick_sort(right)

def max_pairwise_product(numbers):
    n = len(numbers)
    numbers = quick_sort(numbers)
    return numbers[n-1]*numbers[n-2]

if __name__ == '__main__':
    input_n = int(input())
    input_numbers = [int(x) for x in input().split()]
    print(max_pairwise_product(input_numbers))
