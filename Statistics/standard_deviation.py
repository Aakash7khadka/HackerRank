
n=int(input())
numbers=[int(x) for x in input().split()]
mean=sum(numbers)/n


sum_of_sq_diff=sum([(x-mean)**2 for x in numbers])
std=(sum_of_sq_diff/n)**(1/2)
print(round(std,1))
