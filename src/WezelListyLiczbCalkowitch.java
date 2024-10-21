public class WezelListyLiczbCalkowitch {
    private int dana;

    private WezelListyLiczbCalkowitch next;


    public WezelListyLiczbCalkowitch(int dana, WezelListyLiczbCalkowitch next){
        this.dana= dana;
        this.next=next;
    }
    public int getDana(){
        return dana;
    }

    public WezelListyLiczbCalkowitch getNext() {
        return next;
    }

    public void setNext(WezelListyLiczbCalkowitch next) {
        this.next = next;
    }
}
