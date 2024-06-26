public class _03_Disjoint_Set_DS{

    public static int N = 7;
    public static int parent[] = new int[N]; //Leaders
    public static int rank[] = new int[N]; //Already Initialized To 0

    public static void init(){
        for(int i=0;i<N;i++){
            parent[i] = i;
        }
    }

    public static int find(int x){
        if(parent[x] == x){
            return x;
        }

        //Optimization Mate
        return parent[x] = find(parent[x]);
    }

    public static void union(int u,int v){
        //Finding Leaders 
        int x = find(u);
        int y = find(v);

        if(rank[x] == rank[y]){
            parent[y] = x;
            rank[x]++;
        }
        else if(rank[x]<rank[y]){
            parent[x] = y;
        }
        else{
            parent[y] = x;
        }
    }

    public static void main(String[] args) {
        init();

        union(1,3);
        System.out.println(find(3));
        union(2,4);
        System.out.println(find(4));
        union(3,6);
        union(1,4);
        System.out.println(find(4));
        
    }
}