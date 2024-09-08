extends Node

var sort: Array = ["2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"]

func check_straight(array):
	var numbers = []
	for i in array:
		numbers.append(i.erase(1,2))
	var numbers_str = str(numbers)
	var sort_str = str(sort)
	if numbers_str in sort_str:
		return true
	else:
		return false