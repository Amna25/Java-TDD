public class Printer {

    private int numberOfSheets;
    public Printer(int numberOfSheets){
        this.numberOfSheets = numberOfSheets;
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

}
