package JsonFile;

import files.writer.FileDataWriter;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private static List<Account> transactions = new ArrayList<>();
    private static long id = 1;

    public static void creatATransaction(Account account) {
        StringBuilder stringBuilder = new StringBuilder();

        account.setName(account.getName());
        account.setAmount(account.getAmount());
        account.setDate(LocalDate.now());
        account.setId(id);
        account.setReferenceNumber(account.getReferenceNumber());

        transactions.add(account);

        for(Account accounts : transactions){
            stringBuilder.append(accounts.toString());
        }

        String text = String.valueOf(stringBuilder);


        Path path = Path.of("/home/odili/Desktop/transactions.json");
        FileDataWriter.writeDataToFile(text, path);

        id ++;

    }


    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setName("John Doe");
        account1.setAmount(BigDecimal.valueOf(20_000));

        creatATransaction(account1);

        Account account2 = new Account();
        account2.setName("Jane Dan");
        account2.setAmount(BigDecimal.valueOf(30_000));
        creatATransaction(account2);

        Account account3 = new Account();
        account3.setName("Jane Ian");
        account3.setAmount(BigDecimal.valueOf(40_000));
        creatATransaction(account3);




    }
}
