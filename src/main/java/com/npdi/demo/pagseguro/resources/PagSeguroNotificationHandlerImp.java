package com.npdi.demo.pagseguro.resources;

import br.com.uol.pagseguro.api.application.authorization.search.AuthorizationDetail;
import br.com.uol.pagseguro.api.notification.PagSeguroNotificationHandler;
import br.com.uol.pagseguro.api.preapproval.search.PreApprovalDetail;
import br.com.uol.pagseguro.api.transaction.search.TransactionDetail;

/**
 *
 * @author DD
 */
public class PagSeguroNotificationHandlerImp implements PagSeguroNotificationHandler {

    @Override
    public void handleTransactionNotification(TransactionDetail td) {
        System.out.println(td);
    }

    @Override
    public void handleAuthorizationNotification(AuthorizationDetail ad) {
        System.out.println(ad);
    }

    @Override
    public void handlePreApprovalNotification(PreApprovalDetail pad) {
        System.out.println(pad);
    }

}