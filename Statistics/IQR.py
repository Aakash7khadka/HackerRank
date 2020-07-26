def median(num):
    n=len(num)
    if n%2==0:
        return (num[n//2]+num[n//2-1])/2
    else:
        return num[n//2]


n=int(input())
first=[int(x) for x in input().split()]
second=[int(x) for x in input().split()]

lst=[]
for x,y in zip(first,second):
    for i in range(y):
        lst.append(x)
#Before calculating median we sort the list
lst=sorted(lst)

#Dividing the list in 2 parts
mid=len(lst)//2
l=u=lst
if n%2==0:
    l=lst[:mid]
    u=lst[mid:]
else:
    l=lst[:mid]
    u=lst[mid+1:]


q1=float(median(l))
q3=float(median(u))
print(round(q3-q1,1))
