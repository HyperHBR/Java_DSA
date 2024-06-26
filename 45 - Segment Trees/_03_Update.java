public class _03_Update{

    static int segmentTree[];

    public static void init(int n){
        segmentTree = new int[n*4];
    }

    public static void buildSegmentTree(int arr[],int stidx,int start,int end){
        if(start==end){
            segmentTree[stidx] = arr[start];
            return;
        }

        int mid = (start+end)/2;
        buildSegmentTree(arr, stidx*2+1, start, mid); //Left ST
        buildSegmentTree(arr, stidx*2+2, mid+1, end); //Right ST

        segmentTree[stidx] = segmentTree[2*stidx+1] + segmentTree[2*stidx+2];
    }

    public static int getSumUtil(int stidx,int si,int sj,int qi,int qj){
        if(qj<si || qi>sj){
            return 0;
        }
        if(si >= qi && sj <= qj){
            return segmentTree[stidx];
        } 
        
        int mid = (si + sj) / 2;
        int left = getSumUtil(stidx*2 + 1, si, mid, qi, qj);
        int right = getSumUtil(stidx*2 + 2, mid + 1, sj, qi, qj);
        return left + right;
    }

    public static int getSum(int arr[],int qi,int qj){
        return getSumUtil(0,0,arr.length-1, qi, qj);
    }

    public static void update(int arr[],int idx,int newValue){
        int diff = newValue - arr[idx];
        arr[idx] = newValue;
        updateUtil(0,0,arr.length-1,idx,diff);
    }

    public static void updateUtil(int stidx,int si,int sj,int idx,int diff){
        if(si>idx || sj<idx){
            return;
        }

        segmentTree[stidx] += diff;

        if(si!=sj){//Not Leaf
            int mid = (si+sj)/2;
            updateUtil(stidx*2+1, si, mid, idx, diff);//Left
            updateUtil(stidx*2+2, mid+1, sj, idx, diff);//Right
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;

        init(n);

        buildSegmentTree(arr,0,0,n-1);

        for(int i=0;i<segmentTree.length;i++){
            System.out.print(segmentTree[i] + " ");
        }
        System.out.println();
        System.out.println(getSum(arr, 2, 6));
        
        update(arr,2,2);

        for(int i=0;i<segmentTree.length;i++){
            System.out.print(segmentTree[i] + " ");
        }
        System.out.println();
        System.out.println(getSum(arr, 2, 6));
    }
}