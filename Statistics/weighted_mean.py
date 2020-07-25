
n=int(input())
x=[int(i) for i in input().split()]
w=[int(i) for i in input().split()]
weighted_sum=sum([a*b for a,b in zip(x,w)])
ans=weighted_sum/sum(w)
print(round(ans,1))
