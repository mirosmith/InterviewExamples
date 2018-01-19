package resource;

public class InitializationStatic {
    
    private int number;
    private String name;
    protected String address;  
    boolean pravda;
    
    {
	number = 100;
	name = "Elisabeth";
	address = "5th Avenue";
	pravda = true;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
    
    @Override
    public String toString() {
	return "ParentClass [number=" + number + ", name=" + name + ", address=" + address + ", pravda=" + pravda + "]";
    }    

}
