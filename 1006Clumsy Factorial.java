/*The problem is to make us familiar with the operation of stack
stack is a kind of data structure which is in Java package

*/
class Solution {
    public int clumsy(int N) {
      Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(N);// insert the data into the stack
        if(N==1){return 1;}
          for(int n=N-1;n>0;n--){ 
              int temp=0;
             if((N-n-1)%4==0){temp=stack.pop()*n;stack.push(temp);}//pop() make the data out of the stack
             if((N-n-1)%4==1){temp=stack.pop()/n;stack.push(temp);}
             if((N-n-1)%4==2){stack.push(n);}
             if((N-n-1)%4==3){stack.push(-n);}
          }
          int sum=0;
          while(!stack.isEmpty()){//to test whether the data is empty
              sum+=stack.pop();
          }
          return sum;
    }
}
