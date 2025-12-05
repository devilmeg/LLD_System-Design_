

// class JudgeAnalytics {
//     private static final JudgeAnalytics INSTANCE = new JudgeAnalytics();

//     private JudgeAnalytics() {
//     }

//     public static JudgeAnalytics getInstance() {
//         return INSTANCE;
//     }
// }//EAGER LOADING


// //LAZY lOADING
// class JudgeAnalytics{
//     private static JudgeAnalytics Instance;
//     private JudgeAnalytics(){

//     };
//    public static JudgeAnalytics getInstance() {
//       {
//         if(Instance == null){
//              Instance=new JudgeAnalytics();
//         }
//         return Instance;
//     }
// }
// }
//LAZY lOADING
// class JudgeAnalytics{
//     private static JudgeAnalytics Instance;
//     private JudgeAnalytics(){

//     };
//    public static synchronized JudgeAnalytics getInstance() {
//       {
//         if(Instance == null){
//              Instance=new JudgeAnalytics();
//         }
//         return Instance;
//     }
// }
// }


// class JudgeAnalytics{//Doubled check logging
//     private static volatile JudgeAnalytics Instance;
//     private JudgeAnalytics(){}

    

//    public JudgeAnalytics getInstance(){
//     if(Instance==null){
//         synchronized (JudgeAnalytics.class){
//             if(Instance==null){
//                 Instance=new JudgeAnalytics();
//             }
//         }
//     }
//     return Instance;
//    }
// }


    //Bill pugh singleton
    class JudgeAnalytics{
    private JudgeAnalytics(){}
    private static class Holder{
        private static final JudgeAnalytics instance= new JudgeAnalytics();
    }
    public static JudgeAnalytics getInstance(){
        return Holder.instance;
    }
    }
public class Singleton {
    public static void main(String[] args) {
        JudgeAnalytics obj1 = JudgeAnalytics.getInstance();
        JudgeAnalytics obj2 = JudgeAnalytics.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
