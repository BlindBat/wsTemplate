package kz.alfabank.statement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuan on 25.06.2017.
 * Класс-контроллер, обеспечивающий перехват и обработку запросов к сервису выписки
 */
@RestController
public class TransactionsController {

    @RequestMapping("/transactions")
    public List<Transaction> transactions(@RequestParam String iban) {
        List<Transaction> transactionsList = new ArrayList<>();
        transactionsList.add(new Transaction());
        transactionsList.add(new Transaction());
        return transactionsList;
    }
}
