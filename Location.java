
/**
 * Ini adalah kelas Location. Kelas ini digunakan untuk mendata
 * lokasi yang ada supplier dan hal-hal yang bersangkutan
 * dengannya.
 * @author (Muhammad Haqy Aunoora)
 * @version (28 Februari 2019)
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Konstruktor untuk objek dari kelas Supplier
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city = city;
        this.province = province;
        this.description = description;
    }

    /**
     * Method getter untuk mengambil data
     *
     * @return    province
     */
    public String getProvince()
    {
        // put your code here
        return province;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    city
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param province
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param city 
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param description 
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * Method printData untuk memunculkan data
     */
    public void printData()
    {
        System.out.println("=========LOCATION=========");
        System.out.println("Province: "+province);
        System.out.println("City: "+city);
        System.out.println("Description: "+description);
    }
}
