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

    public void setStreetNumb() {
        stnum = rInt("What is the Street #?");
    }

    public void setStreet() {
        stname = rStr("What is the street name?");
    }

    public void setAppNum() {
        boolean haveAppartment = false;
        haveAppartment = rBoole("Do you have an appartment?");

        if (haveAppartment) {
            appNum = rInt("Input appartment # here:");
        }
    }

    public void setState() {
        stname = rStr("What is the State?");
    }

    public void setZip() {
        zip = rInt("What is the zipcode?");
    }

    public Integer getStreetNumb() {
        return appNum;
    }

    public Integer getAppNum() {
        return appNum;
    }

    public String getStreet() {
        return stname;
    }

    public String getState() {
        return stname;
    }

    public Integer getZip() {
        return zip;
    }

    /*
     * returns the earlier of the two zips..
     */
    public void comesBefore(int alpha, int beta) {
        if (alpha <= beta) {
            pTextln("The first zip code is:\t" + alpha + "\nFollowed by\t" + beta);

        } else {
            pTextln("The first zip code is:\t" + beta + "\nfollowed by\t" + alpha);
        }
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

    /*
     * Initalise each object
     */
    public void drivercode() {
        setStreetNumb();
        setStreet();
        setAppNum();
        setState();
        setZip();
    }
}