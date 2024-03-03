package project;

public class bill {
    private String meternum;
    private String name;
    private String email;
    private String address;
    private String phonenumber;
    public bill( String meternum,String name,String email,String phonenumber,String Address){
        this.meternum=meternum;
        this.name=name;
        this.email=email;
        this.phonenumber=phonenumber;
        this.address=Address;
        System.out.println(meternum);
        System.out.println(name);
        System.out.println(email);
        System.out.println(phonenumber);
        System.out.println(Address);


    }

    public String getMeternum() {
        return meternum;
    }
    public void setMeternum(String meternum) {
        this.meternum = meternum;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }




    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        address = address;
    }


}
