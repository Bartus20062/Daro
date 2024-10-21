public class ListaLiczbCalkowitych {

    private WezelListyLiczbCalkowitch head;
    public void addFront(int dana){
        WezelListyLiczbCalkowitch nowy=new WezelListyLiczbCalkowitch(dana, head);
        head=nowy;
    }
    public void addEnd(int dana){
        WezelListyLiczbCalkowitch nowy=new WezelListyLiczbCalkowitch(dana, null);
        if(head==null){
            addFront(dana);
            return;
        }
        WezelListyLiczbCalkowitch temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(nowy);
    }
    public void print(){
        WezelListyLiczbCalkowitch temp=head;
        while(temp!=null){
            System.out.print(temp.getDana()+"->");
            temp=temp.getNext();
        }
        System.out.println();
    }
}
