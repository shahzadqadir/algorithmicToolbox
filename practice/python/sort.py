#!/usr/bin/python

def find_min(input_list, start_indx):
    index = start_indx
    for i in range(start_indx+1, len(input_list)):
        if input_list[i] < input_list[index]:
            index = i
    return index


def selection_sort(input_list):
    temp = 0
    for i in range(len(input_list)):
        min_index = find_min(input_list, i)
        if input_list[i] > input_list[min_index]:
            temp = input_list[i]
            input_list[i] = input_list[min_index]
            input_list[min_index] = temp            
    return input_list


ls1 = [3, 10, 2, 4, 1, 50, 66]
ls2 = selection_sort(ls1)
print(ls2)