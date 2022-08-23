# python3
import sys


def compute_min_refills(distance, tank, stops):
    # write your code here
    no_of_refills = 0
    fuel_capacity = tank

    for i in range(0, len(stops)-1):
        if i > 0:
            fuel_left -= (stops[i] - stops[i-1])
        else:
            fuel_left = tank - stops[i]

        if i < len(stops):
            distance_to_next_stop = stops[i+1] - stops[i]
        else:
            distance_to_next_stop = distance - stops[i]

        if distance_to_next_stop > fuel_capacity:
            return -1

        if distance_to_next_stop > fuel_left:
            no_of_refills += 1
            tank += fuel_capacity

    return no_of_refills
    return -1

if __name__ == '__main__':
    d, m, _, *stops = map(int, sys.stdin.read().split())
    print(compute_min_refills(d, m, stops))
