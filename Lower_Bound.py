n=int(input("Enter Size of List: "))
lst=[]
print("Enter Elements in the list: ")
for i in range(n):
    lst.append(int(input()))
lst.sort()
target=int(input("Enter a target Element: "))
low=0
high=n-1
idx=n
while low<=high:
    mid=(high-low+low+low)//2
    if lst[mid]>=target:
        idx=mid
        high=mid-1
    else:
        low=mid+1
print("Entered List is:")
print(lst)
print("The lower bound of",target,"is",idx)