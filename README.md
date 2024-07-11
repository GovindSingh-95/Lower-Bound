# Lower-Bound
<h2>Problem Statement</h2>
<p>
  <br>To find the index "idx" in the Sorted Array arr of length n ,such that arr[index]>=target.<br>Where target is user input number.<br>
</p>
<h2>Bases Cases</h2>
<p>
  <br>Consider a Sorted Array [10,20,20,30,40,50,60,70]<br>
  <br>with n=8<br>
  <br>If Target is present in more than one index in the Array then the lowerbound of target in this case is the 
      minimum of the indices.Consider target as 20 , here we have 2 indices whose value is 20, and among them the minimum is 1,thus lower 
      bound is 1.<br>
  <br>If the target is not present in the Array but satisfies the condition of "arr[0]<target" and "arr[n-1]>target" then the lower bound 
      is that nearest number in the Array which is less than target.Consider Target=45,as 45 is not present in the array,but is greater 
      than arr[0] and less than arr[7] and here the closest number present in the array , smaller than 45 is 40,thus lower bound of 45 is 
      4.<br>
   <br>If the target is less than arr[0],then simply lower bound is taken to be 0.<br>
   <br>If the target is more than arr[n-1],then lower bound is taken to be n.<br>
</p>
<h2>Algorithm</h2>
<p>
  <br>Here, as we bascially need to search a particular element.So, we are gonna use Binary Search.<br>
  <br>So,we declare our Binary Search variables of int low=0 and int high=n-1.But,we also need to store the index for lower bound<br>
</p>
