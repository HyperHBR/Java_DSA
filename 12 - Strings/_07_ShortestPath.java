public class _07_ShortestPath {
    public static float getShortestPath(String Path){
        int X = 0,Y = 0;

        for(int i=0;i<Path.length();i++)
        {
            if(Path.charAt(i)=='N'){
                X++;
            }
            else if(Path.charAt(i)=='S'){
                X--;
            }
            else if(Path.charAt(i)=='E'){
                Y++;
            }
            else{
                Y--;
            }
        }
        int X2 = X*X;
        int Y2 = Y*Y;

        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String Path = "NENENEE";
        System.out.println(getShortestPath(Path));
    }    
}
