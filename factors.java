// public class factors{
    
//     public static void main(String[] args){

//         int n = 8;
//         for(int i=1 ; i<=n ; i++){
//             if(n % i == 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


//----------------------------------------------


public class factors {
    
    public static void main(String[] args){
        
        int count = 0;
        int n = 6;
        for(int i=1 ; i<=n ; i++){
            if(n % i == 0){
                count++;
            }
            System.out.println(i);
        }
    }
}
