import static java.lang.System.out; 
import java.util.*;
class Graph
{

public LinkedList<Integer>[] adj;
int ver;
int edge;


Graph(int v,int e)
{
  ver=v;
  edge=e;
  adj=new LinkedList[v];

   for(int i=0;i<ver;i++)
    adj[i]=new LinkedList();

}

public String toString()
{
   StringBuilder sb=new StringBuilder();

   for(int i=0;i<ver;i++)
     {
         sb.append(i+"  -> ");
         for(int w:adj[i])
         sb.append(w+" -> ");

         sb.append("\n");

     }


return sb.toString();
}



public void dfs()
{
   boolean visited[]=new boolean[ver];

   for(int i=0;i<ver;i++)
{
     if(!visited[i])
{

   dfs(i,visited);   

}



}


}

public void dfs(int w, boolean visited[])
{

   visited[w]=true;
   out.print(w+" ->");

   for(int i:adj[w])
     { if(!visited[i])
        {

           dfs(i,visited);   

         }
       
}

}

public void addEdge(int u,int v)
{
 adj[u].add(v);
 adj[v].add(u);


}

public void bfs(int w)
{
  boolean visited[]=new boolean[ver];

  Queue<Integer> q=new LinkedList<Integer>();

  visited[w]=true;
  q.add(w);
 BFSUtil(q,visited);




}

void BFSUtil(Queue<Integer> q, boolean visited[])
{
     if(q.isEmpty())
      return;

    int vertex=q.poll();
     System.out.print(vertex+" -> ");

for(int w: adj[vertex])
		{
			if(!visited[w])
			{
				visited[w]=true;
				q.add(w);
			}
		}
    	BFSUtil(q,visited);


}

public static void main(String args[])
{
   java.util.Scanner sc=new java.util.Scanner(System.in);
   out.println("Enter no of verrtices");
   int v=sc.nextInt();
   
   out.println("Enter no of edges ");
   int e=sc.nextInt();

   Graph g=new Graph(v,e);

    for(int i=0;i<e;i++)
          {

                  for(int j=i+1;j<v;j++)
                     {
                       System.out.println("Is there Is realation of "+i+" With "+j+" If Yes Enter 1 otherwiase 0");
    			int ans=sc.nextInt();
    			if(ans==1)
    				g.addEdge(i,j);

                     }


          }

   out.println("Graph In adjacancy List format"+g);
  g.bfs(0); 


}
}