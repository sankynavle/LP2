#include<iostream>
using namespace std;
int isVisited(int arr[],int visited,int j)
{

for(int i = 0;i <= visited;i++)
	{
		if(arr[i] == j)
		{
			return 0;
		}
	}
	return 1;

}

int main()
{
    int vertex=5;
    int graph[][5] = {
		{0,0,0,3,0},
		{0,0,10,4,0},
		{0,10,0,2,6},
		{3,4,2,0,1},
		{0,0,6,1,0}
				
	};


for(int i=0;i<5;i++)
{
     for(int j=0;j<5;j++)
        {

             cout<<graph[i][j]<<" ";
        }
           cout<<endl;
}

        int arr[vertex];
	int visited = 0, cost = 0;
	arr[0] = visited;
	
	while(visited < vertex)
	{
		int min = 500;
		int minIndex = 0;
		for(int i = 0;i <= visited;i++)
		{
			for(int j = 0;j < vertex;j++)
			{	
				if(min > graph[arr[i]][j] && graph[arr[i]][j] != 0 && isVisited(arr, visited, j))
				{
					min = graph[arr[i]][j];
					minIndex = j;
				}
			}
		}
		
		visited++;
                
		arr[visited] = minIndex;
		cost = cost + min;
                cout<<cost;
	}	
	
	cout<<"Minimal Cost is "<<cost -500;

for(int j=0;j<5;j++)
        {

             cout<<arr[1];
        }

}


