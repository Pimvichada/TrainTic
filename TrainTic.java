import java.util.Scanner;
public class RedLineTrainCal {

    static String stt[] = {"Taling Chan","Bang Bamru","Bang Son","Bang Sue","Chatuchak","Wat Samian Nari","Bang Khen","Thung Song Hong","Laksi","Kan Kheha","Donmueang","Lakhok","Rangsit"};
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
    
    static int checkValid (String a) {
    	int check = 0;
    	for(int i=0; i<stt.length; i++){
            if(!(a.equals(stt[i]))){
            	check = -1;
            }
            if(a.equals(stt[i])) {
            	check = 0;
            	return check;
            }
        }
		return check;
    }
    
    static void buy(){
        Scanner sc = new Scanner(System.in);
        String from;
        String to;
        int ch = 0;
        while(true){
        	System.out.println("START FROM : ");
            from = sc.nextLine();
                
            while(checkValid(from) == -1) {
            	System.out.println("\t!!INVALID!!");
                System.out.println("\tPLEAST TRY AGAIN");
            	System.out.println("START FROM : ");
                from = sc.nextLine();
                checkValid(from);
            }
            System.out.println("TO : ");
            to = sc.nextLine();
            while(checkValid(to) == -1) {
            	System.out.println("\t!!INVALID!!");
                System.out.println("\tPLEAST TRY AGAIN");
            	System.out.println("TO : ");
                to = sc.nextLine();
                checkValid(to);
            }            
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
            }
        }
    }//end buy 

    static void allstation(){
        System.out.println("||Taling Chan||\t||Bang Bamru||\t||Bang Son||\t||Bang Sue||\n||Chatuchak||\t||Wat Samian Nari||\t||Bang Khen||\t||Thung Song Hong||\n||Laksi||\t||Kan Kheha||\t||Donmueang||\t||Lakhok||\t||Rangsit||");
	}
    static void calc(String from , String to){
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
            if (stt[0].equals(from)&&stt[1].equals(to) || stt[1].equals(from)&&stt[0].equals(to) || stt[2].equals(from)&&stt[3].equals(to) || stt[3].equals(from)&&stt[2].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("18 Bath");
                System.out.println("================================================");
            }
            else if (stt[1].equals(from)&&stt[2].equals(to) || stt[2].equals(from)&&stt[1].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("23 Bath");
                System.out.println("================================================");
            }
            else if (stt[3].equals(from)&&stt[4].equals(to) || stt[4].equals(from)&&stt[3].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("16 Bath");
                System.out.println("================================================");
                }
            else if (stt[4].equals(from)&&stt[5].equals(to) || stt[5].equals(from)&&stt[4].equals(to) ||stt[8].equals(from)&&stt[9].equals(to) || stt[9].equals(from)&&stt[8].equals(to) || stt[9].equals(from)&&stt[10].equals(to) || stt[10].equals(from)&&stt[9].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("15 Bath");
                System.out.println("================================================");
                }
            else if (stt[6].equals(from)&&stt[5].equals(to) || stt[5].equals(from)&&stt[6].equals(to) || stt[6].equals(from)&&stt[7].equals(to) || stt[7].equals(from)&&stt[6].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("14 Bath");
                System.out.println("================================================");
                }
            else if (stt[7].equals(from)&&stt[8].equals(to) || stt[8].equals(from)&&stt[7].equals(to) || stt[11].equals(from)&&stt[12].equals(to) || stt[12].equals(from)&&stt[11].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("17 Bath");
                System.out.println("================================================");
                }
            else if (stt[10].equals(from)&&stt[11].equals(to) || stt[11].equals(from)&&stt[10].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("21 Bath");
                System.out.println("================================================");
                }
        if(total == 2){
            if (stt[0].equals(from)&&stt[2].equals(to) || stt[2].equals(from)&&stt[0].equals(to) || stt[1].equals(from)&&stt[3].equals(to) || stt[3].equals(from)&&stt[1].equals(to))
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("29 Bath");
                System.out.println("================================================");
                }
            else if (stt[2].equals(from)&&stt[4].equals(to) || stt[4].equals(from)&&stt[2].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("22 Bath");
                System.out.println("================================================");
                }
            else if (stt[3].equals(from)&&stt[5].equals(to) || stt[5].equals(from)&&stt[3].equals(to)||stt[6].equals(from)&&stt[8].equals(to) || stt[8].equals(from)&&stt[6].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("19 Bath");
                System.out.println("================================================");
                }
            else if (stt[4].equals(from)&&stt[6].equals(to) || stt[6].equals(from)&&stt[4].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("17 Bath");
                System.out.println("================================================");
                }
            else if (stt[5].equals(from)&&stt[7].equals(to) || stt[7].equals(from)&&stt[5].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("16 Bath");
                System.out.println("================================================");
                }
            else if (stt[7].equals(from)&&stt[9].equals(to) || stt[9].equals(from)&&stt[7].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("20 Bath");
                System.out.println("================================================");
                }
            else if (stt[8].equals(from)&&stt[10].equals(to) || stt[10].equals(from)&&stt[8].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("18 Bath");
                System.out.println("================================================");
                }
            else if (stt[9].equals(from)&&stt[11].equals(to) || stt[11].equals(from)&&stt[9].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("24 Bath");
                System.out.println("================================================");
                }
            else if (stt[10].equals(from)&&stt[12].equals(to) || stt[12].equals(from)&&stt[10].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("26 Bath");
                System.out.println("================================================");
                }
        }
        if(total == 3){
            if (stt[0].equals(from)&&stt[3].equals(to) || stt[3].equals(from)&&stt[0].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("35 Bath");
                System.out.println("================================================");
                }
            else if (stt[1].equals(from)&&stt[4].equals(to) || stt[4].equals(from)&&stt[1].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("32 Bath");
                System.out.println("================================================");
                }
            else if (stt[2].equals(from)&&stt[5].equals(to) || stt[5].equals(from)&&stt[2].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("25 Bath");
                System.out.println("================================================");
                }
            else if (stt[3].equals(from)&&stt[6].equals(to) || stt[6].equals(from)&&stt[3].equals(to)||stt[5].equals(from)&&stt[8].equals(to) || stt[8].equals(from)&&stt[5].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("20 Bath");
                System.out.println("================================================");
                }
            else if (stt[4].equals(from)&&stt[7].equals(to) || stt[7].equals(from)&&stt[4].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("19 Bath");
                System.out.println("================================================");
                }
            else if (stt[6].equals(from)&&stt[9].equals(to) || stt[9].equals(from)&&stt[6].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("22 Bath");
                System.out.println("================================================");
                }
            else if (stt[7].equals(from)&&stt[10].equals(to) || stt[10].equals(from)&&stt[7].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("23 Bath");
                System.out.println("================================================");
                }
            else if (stt[8].equals(from)&&stt[11].equals(to) || stt[11].equals(from)&&stt[8].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("27 Bath");
                System.out.println("================================================");
                }
            else if (stt[9].equals(from)&&stt[12].equals(to) || stt[12].equals(from)&&stt[9].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("29 Bath");
                System.out.println("================================================");
                }
        }
        if(total == 4){
            if (stt[0].equals(from)&&stt[4].equals(to) || stt[4].equals(from)&&stt[0].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("38 Bath");
                System.out.println("================================================");
                }
            else if (stt[1].equals(from)&&stt[5].equals(to) || stt[5].equals(from)&&stt[1].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("35 Bath");
                System.out.println("================================================");
                }
            else if (stt[2].equals(from)&&stt[6].equals(to) || stt[6].equals(from)&&stt[2].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("26 Bath");
                System.out.println("================================================");
                }
            else if (stt[3].equals(from)&&stt[7].equals(to) || stt[7].equals(from)&&stt[3].equals(to)||stt[4].equals(from)&&stt[8].equals(to) || stt[8].equals(from)&&stt[4].equals(to)||stt[5].equals(from)&&stt[9].equals(to) || stt[9].equals(from)&&stt[5].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("23 Bath");
                System.out.println("================================================");
                }
            else if (stt[6].equals(from)&&stt[10].equals(to) || stt[10].equals(from)&&stt[6].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("25 Bath");
                System.out.println("================================================");
                }
            else if (stt[7].equals(from)&&stt[11].equals(to) || stt[11].equals(from)&&stt[7].equals(to)||stt[8].equals(from)&&stt[12].equals(to) || stt[12].equals(from)&&stt[8].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("32 Bath");
                System.out.println("================================================");
                }
        }
        if(total == 5){
            if (stt[0].equals(from)&&stt[5].equals(to) || stt[5].equals(from)&&stt[0].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("41 Bath");
                System.out.println("================================================");
                }
            else if (stt[1].equals(from)&&stt[6].equals(to) || stt[6].equals(from)&&stt[1].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("37 Bath");
                System.out.println("================================================");
                }
            else if (stt[2].equals(from)&&stt[7].equals(to) || stt[7].equals(from)&&stt[2].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("29 Bath");
                System.out.println("================================================");
                }
            else if (stt[3].equals(from)&&stt[8].equals(to) || stt[8].equals(from)&&stt[3].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("27 Bath");
                System.out.println("================================================");
                }
            else if (stt[4].equals(from)&&stt[9].equals(to) || stt[9].equals(from)&&stt[4].equals(to)||stt[5].equals(from)&&stt[10].equals(to) || stt[10].equals(from)&&stt[5].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("26 Bath");
                System.out.println("================================================");
                }
            else if (stt[6].equals(from)&&stt[11].equals(to) || stt[11].equals(from)&&stt[6].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("34 Bath");
                System.out.println("================================================");
                }
            else if (stt[7].equals(from)&&stt[12].equals(to) || stt[12].equals(from)&&stt[7].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("36 Bath");
                System.out.println("================================================");
                }
        }
        if(total == 6 ){
            if (stt[0].equals(from)&&stt[6].equals(to) || stt[6].equals(from)&&stt[0].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("42 Bath");
                System.out.println("================================================");
                }
            else if (stt[1].equals(from)&&stt[7].equals(to) || stt[7].equals(from)&&stt[1].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("39 Bath");
                System.out.println("================================================");
                }
            else if (stt[2].equals(from)&&stt[8].equals(to) || stt[8].equals(from)&&stt[2].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("33 Bath");
                System.out.println("================================================");
                }
            else if (stt[3].equals(from)&&stt[9].equals(to) || stt[9].equals(from)&&stt[3].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("30 Bath");
                System.out.println("================================================");
                }
            else if (stt[4].equals(from)&&stt[10].equals(to) || stt[10].equals(from)&&stt[4].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("29 Bath");
                System.out.println("================================================");
                }
            else if (stt[5].equals(from)&&stt[11].equals(to) || stt[11].equals(from)&&stt[5].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("35 Bath");
                System.out.println("================================================");
                }
            else if (stt[6].equals(from)&&stt[12].equals(to) || stt[12].equals(from)&&stt[6].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("38 Bath");
                System.out.println("================================================");
                }
        }
        if(total == 7 ){
            if (stt[0].equals(from)&&stt[7].equals(to) || stt[7].equals(from)&&stt[0].equals(to)||stt[1].equals(from)&&stt[8].equals(to) || stt[8].equals(from)&&stt[1].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("42 Bath");
                System.out.println("================================================");
                }
            else if (stt[2].equals(from)&&stt[9].equals(to) || stt[9].equals(from)&&stt[2].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("36 Bath");
                System.out.println("================================================");
                }
            else if (stt[3].equals(from)&&stt[10].equals(to) || stt[10].equals(from)&&stt[3].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("33 Bath");
                System.out.println("================================================");
                }
            else if (stt[4].equals(from)&&stt[11].equals(to) || stt[11].equals(from)&&stt[4].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("38 Bath");
                System.out.println("================================================");
                }
            else if (stt[5].equals(from)&&stt[12].equals(to) || stt[12].equals(from)&&stt[5].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("40 Bath");
                System.out.println("================================================");
                }
        }
        if(total == 8 ){
            if (stt[0].equals(from)&&stt[8].equals(to) || stt[8].equals(from)&&stt[0].equals(to)||stt[3].equals(from)&&stt[11].equals(to) || stt[11].equals(from)&&stt[3].equals(to)||stt[4].equals(from)&&stt[12].equals(to) || stt[12].equals(from)&&stt[4].equals(to)||stt[1].equals(from)&&stt[9].equals(to) || stt[9].equals(from)&&stt[1].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("42 Bath");
                System.out.println("================================================");
                }
            else if (stt[2].equals(from)&&stt[10].equals(to) || stt[10].equals(from)&&stt[2].equals(to)){
                System.out.println("================================================");
                System.out.println("Start From :"+from);
                System.out.println("To :"+to);
                System.out.println("39 Bath");
                System.out.println("================================================");
                }
        }
        if(total >= 9 && total < 13){
        System.out.println("================================================");
        System.out.println("Start From :"+from);
        System.out.println("To :"+to);
        System.out.println("42 Bath");
        System.out.println("================================================");
        }
    }
}
