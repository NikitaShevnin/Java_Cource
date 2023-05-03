package SeminarOOP5_MVC.dz.service;

import SeminarOOP5_MVC.dz.model.User;
import SeminarOOP5_MVC.dz.view.BankView;

public class RebalacingService {
    public static void rebalancing(User user, int amount){
        user.rebalancing(amount);
        BankView.transactionView(amount);
    }
}
