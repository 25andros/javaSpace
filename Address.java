/*
    P7 problem #1
//*/

public class Address extends andria {

    private Integer stnum;
    private String stname;
    private Integer appNum;
    private String city;
    private String state;
    private Integer zip;

    public Address() {
        stnum = 834;
        stname = "Cascade Dr";
        appNum = null;
        city = "Newport News";
        state = "VA";
        zip = 23608;

    }

    public void setAppNum() {
        boolean haveAppartment = false;
        haveAppartment = rBoole("Do you have an appartment?");

        if (haveAppartment) {
            appNum = rInt("Input appartment # here:");
        }
    }

    public Integer getAppNum() {
        return appNum;

    }

    public void setStreet() {
        stname = rStr("What is the street address?");
    }

    public String getStreet() {
        return stname;
    }

    public void printVariables() {
        pTextln("");
        pTextln("Street Number:\t" + stnum);
        pTextln("Street Name:\t" + stname);
        if (appNum != null) {
            pTextln("Appartment #:\t" + appNum);
        }
        pTextln("City:\t" + city);
        pTextln("State:\t" + state);
        pTextln("Zip:\t" + zip);

    }

    public void drivercode() {
        setAppNum();
        printVariables();
    }
}