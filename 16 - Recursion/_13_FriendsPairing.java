public class _13_FriendsPairing {
    public static int FriendsPairing(int Num){
        if(Num==1 || Num==2){
            return Num;
        }
        return FriendsPairing(Num-1) + FriendsPairing(Num-2) * (Num-1);
    }
    public static void main(String[] args) {
        int Num = 3;
        System.out.println(FriendsPairing(Num));
    }
}
