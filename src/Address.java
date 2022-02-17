public class Address {
    private String streetNum;
    private String streetName;
    private String aptNum;
    private String city;
    private String state;
    private String zipCode;

    public Address(String sNum, String sName, String cit, String stat, String zip) {
    streetNum = sNum;
    streetName = sName;
    city = cit;
    state = stat;
    zipCode = zip;
    }
    }
    public Address(String sNum, String sName, String aNum, String cit, String stat, String zip) {
    streetNum = sNum;
    streetName = sName;
    aptNum = aNum;
    city = cit;
    state = stat;
    zipCode = zip;
    }
    public Address()
}
