#coding=utf8
def twoSums(nums,target):
	dict={}	
	for i in range(len(nums)):
		for j in range(i+1,len(nums)):
			if (target-nums[i]==nums[j]):
				return [i,j]
	return [-1,-1]				
if __name__ =='__main__' :
	nums=[3,2,4]
	result=twoSums(nums,6)
	for ele in result:
		print ele
