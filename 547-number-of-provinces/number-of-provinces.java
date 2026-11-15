class Solution {
    public int findCircleNum(int[][] isConnected) {
     int v=isConnected[0].length;
     ArrayList<ArrayList<Integer>> adjls=new ArrayList<ArrayList<Integer>>();
     for(int i = 0; i < v; i++)
{
    adjls.add(new ArrayList<>());
}
     for(int i=0;i<v;i++)
     {
        for(int j=0;j<v;j++)
        {
            if(isConnected[i][j]==1 &&i!=j){
            adjls.get(i).add(j);
            adjls.get(j).add(i);
            }

        }
     } 
     int vis[]=new int[v+1];
     int count=0;
     for(int i=0;i<v;i++)
     {
        if(vis[i]==0)
        {
            count++;
            dfs(i,adjls,vis);
        }
     }  
     return count;
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>> adjls,int vis[])
    {
        vis[node]=1;
        for(int it:adjls.get(node))
        {
            if(vis[it]==0)
            {
                dfs(it,adjls,vis);
            }
        }
    }
}