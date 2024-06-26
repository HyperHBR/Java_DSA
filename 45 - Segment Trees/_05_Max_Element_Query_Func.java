public class _05_Max_Element_Query_Func {
    static int segmentTree[];

    public static void init(int n){
        segmentTree = new int[n*4];
    }

    public static void buildSegmentTree(int stdix,int arr[],int si,int sj){
        if(si==sj){
            segmentTree[stdix] = arr[si];
            return;
        }

        int mid = (si+sj)/2;
        buildSegmentTree(stdix*2+1, arr, si, mid);
        buildSegmentTree(stdix*2+2, arr, mid+1, sj);

        segmentTree[stdix] = Math.max(segmentTree[stdix*2+1],segmentTree[stdix*2+2]);
    }

    public static int getMax(int arr[],int qi,int qj){
        int n = arr.length;
        return getMaxUtil(0, 0, n-1,qi, qj);
    }

    public static int getMaxUtil(int stidx,int si,int sj,int qi,int qj){
        if(qi>sj || qj<si){
            return Integer.MIN_VALUE;
        }
        else if(si>=qi && sj<=qj){
            return segmentTree[stidx];
        }
        else{
            int mid = (si+sj)/2;
            int left = getMaxUtil(stidx*2+1, si, mid, qi, qj);
            int right = getMaxUtil(stidx*2+2, mid+1, sj, qi, qj);
            return Math.max(left, right);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);

        buildSegmentTree(0,arr,0,n-1);

        for(int i=0;i<segmentTree.length;i++){
            System.out.print(segmentTree[i] + " ");
        }
        System.out.println();

        int max = getMax(arr,2,5);
        System.out.println(max);
    }
}
