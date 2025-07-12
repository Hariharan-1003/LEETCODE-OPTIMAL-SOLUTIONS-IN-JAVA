class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int size = temperatures.length;
        int[] arr = new int[size];
        for(int i =size-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()) arr[i] = stack.peek()-i; 
            stack.push(i);
        }
        return arr;
    }
}