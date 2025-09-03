package br.com.mariojp.solid.lspaccounts;

public class SavingsAccount extends Account {
    
	@Override
    public void withdraw(double amount) {
    	throw new UnsupportedOperationException("Saldo não permitido em poupança");
    }
}
