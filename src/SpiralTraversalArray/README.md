
## Iterative solution for sprial presentation of given 2D array

#### Algorithm
   We handle the problem as follows: suppose M and N are number of the rows and columns of array.
   Besides that, we want to traverse in clock-wise, so we have to define the path based on that so the spriral makes.
   Starting from the first element of the array, during the traversing, we keep a record of visiting the new element.
   And if we recognize that we are going further from the boundaries of the array or reaching an element, which has seen
   before, we have to change the direction and going on the new direction based on clock-wise manner. So the next position
   always is an element which is in the boundaries of the array and also not visited so far, otherwise, 
   we do a clockwise turn and the next position is the one after that.
   
### Implementation
        src/SpiralTraversalArray/SpiralTraversalArrayIterativeSolution.java


### Complexity Analysis

    I. Auxillary Space: we store new elemnts in 2 arrays named visited and answer, so it is of O(M*N),
        where M and N are the number of rows and columns of the array respectively.
    II. Time Complexity: we add all of the elements of the input into the answer, and loop throght them,
        so the time complexity is of O(N), where N is the number of all elements in the array.



## Recursive solution for sprial presentation of given 2D array

#### Algorithm

### Implementation
        src/SpiralTraversalArray/SpiralTraversalArrayRecursiveSolution.java

### Complexity Analysis

    I. Auxillary Space: since no extra space is required, so it is of O(1),
    II. Time Complexity: we traverse all of the elements of the input, and loop throght them,
        so the time complexity is of O(M*N), where M and N are the number of rows and columns
        of the array respectively
