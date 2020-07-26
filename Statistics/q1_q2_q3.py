def median(num):
    n=len(num)
    if n%2==0:
        return (num[n//2]+num[n//2-1])//2
    else:
        return num[n//2]


n=int(input())
numbers=[int(x) for x in input().split()]
numbers=sorted(numbers)


#for Q1 and Q2 we divide list in 2 parts
l=u=numbers
h=n//2
if n%2==0:
    l=numbers[:h]
    u=numbers[h:]
else:
    l=numbers[:h]
    u=numbers[h+1:]
print(median(l))
print(median(numbers))
print(median(u))
