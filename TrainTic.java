import java.util.Scanner;
public class TrainTic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = " ";
        while(true){
            menu();
            choice = sc.next();
            if(choice.equals("1")){
                buy();
                break;
            }else if(choice.equals("2")){
                allstation();
            }else if(choice.equalsIgnoreCase("Y")){
                System.out.println("GOOD BYE");
                break;
        }
    }
}
    static void menu(){
        System.out.println("\t\t MAIN MENU");
        System.out.println("....................................................");
        System.out.println("1.BUY TICKET");
        System.out.println("2.ALL STATION");
        System.out.println("\t\t EXIT(Y/N)"); 
        System.out.println("....................................................");
    }//end menu

    static void buy(){
        Scanner sc = new Scanner(System.in);
        String from;
        String to;
        int ch = 0;
        

        while(true){

            System.out.println("START FROM : ");
            from = sc.nextLine();
            System.out.println("TO : ");
            to = sc.nextLine();
            
    
            System.out.println("START FROM : "+ from +" TO : "+ to);
    
            System.out.println("CONFIRM?");
            System.out.println("1.YES");
            System.out.println("2.NO");
            ch = sc.nextInt();
            sc.nextLine();
            
            if(ch == 1){
            calc(from, to);
            break;
            }
            else if(ch == 2){
                allstation();
            }
        }
    }//end buy 

    static void allstation(){
        System.out.println("||1||\t||Bang Bamru||\t||Bang Son||\t||Bang Sue||");
        System.out.println("||Chatuchak||\t||Wat Samian Nari||\t||Bang khen||\t||Thung Song Hong||");
        System.out.println("||Laksi||\t||Kan Kheha||\t||Donmueang||\t||Lakhok||\t||Rangsit||");
    }
    static void calc(String from , String to){
        
        String stt[] = {"Taling Chan","Bang Bamru","Bang Son","Bang Sue","Chatuchak","Wat Samian Nari","Bang Khen","Thung Song Hong","Laksi","Kan Kheha","Donmueang","Lakhok","Rangsit"};
        
        int pos = 0;
        int tn = 0;
        //check position of station 
        for(int i=0; i<stt.length; i++){
            if(stt[i].equals(from)){
                pos = i;
                break;
            }
        }
        for(int i=0; i<stt.length; i++){
            if(stt[i].equals(to)){
                tn = i;
                break;
            }
        }
        int total = Math.abs(pos-tn);
        //use if else to check distance
        if(total == 1){
            System.out.println("================================================");
            System.out.println("Start From :"+from);
            System.out.println("To :"+to);
            System.out.println("18 Bath");
            
            
        }
        else if(total == 2){
            System.out.println("================================================");
            System.out.println("Start From :"+from);
            System.out.println("To :"+to);
            System.out.println("29 Bath");
            System.out.println("================================================");
        }
        else if(total == 3){
            System.out.println("================================================");
            System.out.println("Start From :"+from);
            System.out.println("To :"+to);
            System.out.println("35 Bath");
            System.out.println("================================================");
        }
        else if(total == 4){
            System.out.println("================================================");
            System.out.println("Start From :"+from);
            System.out.println("To :"+to);
            System.out.println("38 Bath");
            System.out.println("================================================");
        }
        else if(total == 5){
            System.out.println("================================================");
            System.out.println("Start From :"+from);
            System.out.println("To :"+to);
            System.out.println("41 Bath");
            System.out.println("================================================");
        }
        else if(total >= 6 && total < 13){
            System.out.println("================================================");
            System.out.println("Start From :"+from);
            System.out.println("To :"+to);
            System.out.println("42 Bath");
            System.out.println("================================================");
        }
    }
}
