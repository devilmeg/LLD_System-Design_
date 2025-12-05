// interface Logistics{
//     void send();
// }

// class Road implements Logistics{
//     @Override
//     public void send(){
//         System.out.println("Sending byy road logic");
//     }
// }

// class Air implements Logistics{
//     @Override
//     public void send(){
//         System.out.println("Sending by air  logic");
//     }

// }
// class Train implements Logistics{
//     @Override
//     public void send(){
//         System.out.println("Sending by Train  logic");
//     }

// }

// class LogisticsFactory{
//     public static Logistics getLogistics(String mode){
//         if(mode=="road"){
//             return new Road();
//         }
//        else if(mode=="Air"){
//         return new Air();
//        }else{
//         return new Train();
//        }
//     }
// }


// class LogisticService{
//     public void send(String mode){
//      Logistics logistics=LogisticsFactory.getLogistics(mode);
//      logistics.send();
// }
// }
// public class Factory {
//     public static void main(String[] args) {
        
//     }
// }

interface Logistics {
    void send();
}

class Road implements Logistics {
    @Override
    public void send() {
        System.out.println("Sending by road logic");
    }
}

class Air implements Logistics {
    @Override
    public void send() {
        System.out.println("Sending by air logic");
    }
}

class Train implements Logistics {
    @Override
    public void send() {
        System.out.println("Sending by train logic");
    }
}

class LogisticsFactory {
    public static Logistics getLogistics(String mode) {

        if (mode.equalsIgnoreCase("road")) {
            return new Road();

        } else if (mode.equalsIgnoreCase("air")) {
            return new Air();

        } else if (mode.equalsIgnoreCase("train")) {
            return new Train();
        }

        throw new IllegalArgumentException("Invalid logistics mode: " + mode);
    }
}

class LogisticService {
    public void send(String mode) {
        Logistics logistics = LogisticsFactory.getLogistics(mode);
        logistics.send();
    }
}

public class Factory {
    public static void main(String[] args) {

        LogisticService service = new LogisticService();

        service.send("road");
        service.send("air");
        service.send("train");
    }
}
