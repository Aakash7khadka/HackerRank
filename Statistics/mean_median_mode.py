
n=int(input())
numbers=[int(x) for x in input().split()]
numbers=sorted(numbers)#required for the median
mean=sum(numbers)/n
print(mean)

if n%2==1:
    median=numbers[n//2]
else:

    median=(numbers[n//2]+numbers[(n//2)-1])/2
print(median)

mode={}
unique=list(set(numbers))
for key in unique:
    count=0
    for n in numbers:
        if n==key:
            count+=1
    mode[key]=count

#Since our dictionary key are not sorted so,reversing by the counts
sorted_items=sorted(mode.items(),key=lambda x:x[0])
freq=0
mod=0
for key,value in sorted_items:
    if value>freq:
        mod=key
        freq=value
print(mod)

    
