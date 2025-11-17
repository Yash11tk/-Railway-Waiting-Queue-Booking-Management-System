import java.util.concurrent.atomic.AtomicInteger; 
public class Passenger { 
private static final AtomicInteger ticketCounter = new AtomicInteger(1000); 
private final int ticketNumber; 
private String name; 
private int age; 
private String gender; 
private String contact; 
private String status; 
public Passenger(String var1, int var2, String var3, String var4, String var5) { 
this.ticketNumber = ticketCounter.getAndIncrement(); 
this.name = var1; 
this.age = var2; 
this.gender = var3; 
this.contact = var4; 
this.status = var5; 
} 
public int getTicketNumber() { 
return this.ticketNumber; 
} 
public String getName() { 
return this.name; 
} 
public int getAge() { 
return this.age; 
} 
public String getGender() { 
return this.gender; 
} 
public String getContact() { 
return this.contact; 
} 
public String getStatus() { 
return this.status; 
} 
public void setStatus(String var1) { 
this.status = var1; 
} 
public void setName(String var1) { 
this.name = var1; 
} 
public void setAge(int var1) { 
this.age = var1; 
} 
public void setGender(String var1) { 
this.gender = var1; 
} 
public void setContact(String var1) { 
this.contact = var1; 
} 
public String toCSV() { 
return this.ticketNumber + "," + this.name + "," + this.age + "," + this.gender + "," + this.contact + "," + this.status; 
} 
public String toString() { 
return String.format("%-8d %-15s %-5d %-8s %-15s %-10s", this.ticketNumber, this.name, this.age, this.gender, this.contact, this.status); 
} 
}