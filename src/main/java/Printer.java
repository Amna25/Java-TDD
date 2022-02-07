public class Printer {

    private int numberOfSheets;
    private int tonerVolume;

    public Printer(int numberOfSheets, int tonerVolume){
        this.numberOfSheets = numberOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int printSheets( int numOfPages,int numberOfCopies ){
        return this.numberOfSheets - numOfPages * numberOfCopies;
    }

    public boolean enoughPaper(){
        if(this.numberOfSheets >= 10){
            return true;
        }
            return false;
    }

    public int reduceTonerVolume(int pagePrinted){
        return this.tonerVolume - pagePrinted;
    }
//NOT sure which on eis right 
    public int reduceToner(){
        for(int i=10; i>0; i--){
        }
       return this.tonerVolume ;
    }

}
