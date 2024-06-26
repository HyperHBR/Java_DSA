public class _01_Creation{

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
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;

        init(n);

        buildSegmentTree(arr,0,0,n-1);

        for(int i=0;i<segmentTree.length;i++){
            System.out.print(segmentTree[i] + " ");
        }
    }
}