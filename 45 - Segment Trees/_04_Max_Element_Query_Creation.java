public class _04_Max_Element_Query_Creation {
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
    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);

        buildSegmentTree(0,arr,0,n-1);

        for(int i=0;i<segmentTree.length;i++){
            System.out.print(segmentTree[i] + " ");
        }
    }
}
