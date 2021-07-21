public class Person {
    private String name;
    private String address;
    private int ppsNo=1000;

    public Person() {
    }

    public Person(String name,String address,int ppsNo){
        this.name = name;
        this.address = address;
        this.ppsNo += ppsNo;
    }


    public void showPerson(){
        System.out.printf(" *****PERSONAL DETAILS*****\n");
        System.out.println("Name:"+name);
        System.out.println("ADDRESS:"+address);
        System.out.println("PPS NUMBER:"+ppsNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPPSNo() {
        return ppsNo;
    }

    public void setPPSNo(int ppsNo) {
        this.ppsNo = ppsNo;
    }
    
    @Override
    public String toString() {
        String detail="NAME: "+getName();
        detail+="\nADDRESS: "+getAddress();
        detail+="\nPPS NUMBER: "+getPPSNo();
        return detail;
    }
}
