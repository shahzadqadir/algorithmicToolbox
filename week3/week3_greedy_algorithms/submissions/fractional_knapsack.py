# Uses python3
import sys

def get_optimal_value(capacity, weights, values):
    value = 0.
    # write your code here 
    while capacity > 0 and len(weights) > 0:
        indx = max_value_index(values, weights)
        if capacity >= weights[indx]:
            value += values[indx]
            capacity -= weights[indx]
            values.remove(values[indx])
            weights.remove(weights[indx])
        else:
            value += round(capacity * (values[indx]/weights[indx]), 3)
            return value
    return value
        

def max_value_index(values, weights):
    max_value = 0.0
    max_indx = 0
    if len(weights) < 2:
        return max_indx
    for i in range(len(values)):
        if round(values[i]/weights[i], 3) > max_value:
            max_value = round(values[i]/weights[i], 4)
            max_indx = i
    return max_indx


if __name__ == "__main__":
    data = list(map(int, sys.stdin.read().split()))
    n, capacity = data[0:2]
    values = data[2:(2 * n + 2):2]
    weights = data[3:(2 * n + 2):2]
    opt_value = get_optimal_value(capacity, weights, values)
    print(opt_value)
