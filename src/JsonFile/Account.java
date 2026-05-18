package JsonFile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Account {


    private Long id;
    private String name;
    private String referenceNumber = UUID.randomUUID().toString();
    private BigDecimal amount;
    private LocalDate date;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", amount=" + amount +
                ", date=" + date +"\n" +
        '}';
    }
}


