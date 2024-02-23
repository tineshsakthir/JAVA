arr = [105,117,80,72,93,106,92,84,81,77,97,89,100,109,114,71,102,111,119,90,82,104,107,115,83,101,95,75,118,123,125,108,121,91,96,66,103,78,65,74,69,112,120,99,85,116,68,76,70,110]
print(len(arr))
a = arr.sort()
print(arr)
not_given = []

for i in range(67,127):
  if i not in arr : 
    not_given.append(i)
  else : 
    continue
print(not_given)