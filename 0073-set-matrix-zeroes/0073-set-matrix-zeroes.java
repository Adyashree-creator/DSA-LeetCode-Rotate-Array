class Solution {
    public void setZeroes(int[][] arr) {
        int m= arr.length; int n= arr[0].length;
        int [][]copy= new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                copy[i][j]= arr[i][j];
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(copy[i][j]==0){
                    for(int k=0;k<m;k++){
                        arr[k][j]=0;
                    }
                    for(int l=0;l<n;l++){
                        arr[i][l]=0;
                    }

                }
            }
        }
        
        
    }
}