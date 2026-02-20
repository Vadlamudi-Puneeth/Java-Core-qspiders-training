package payrollmanagement;

import java.util.*;
import java.util.stream.*;

public class BankService {

    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account a){
        accounts.add(a);
    }

	public double totalBankBalance(){
        // TODO: stream sum
        return accounts.stream().
        		mapToDouble(
        				e ->{ 
        				try {        					
        					return e.calculateBalance();
        				}catch(InvalidBalanceException e1) {
        					e1.getMessage();
        				}return 0;})
        		.sum();
        		
    }

    public List<Account> top3Richest(){
        // TODO: sort + limit
        
    	return	accounts.stream().sorted(Account::compareTo).limit(3).collect(Collectors.toList());
    }

    public Map<String,Double> averageByBranch(){
        // TODO groupingBy branch
    	Map<String, Double> map = accounts.stream()
    								.collect(Collectors.groupingBy(
    												e -> e.getBranch(),
    												Collectors.averagingDouble(e -> {try {
    													
    																		return e.calculateBalance();
    																		}catch(InvalidBalanceException i) {
    																			i.getMessage();
    																		}
    														return 0;}
    															
    														)
    											));
        return map;
    }

    public void report(){
        // TODO:
        // print totals
    	System.out.println(totalBankBalance());
        // print averages
    	Map<String,Double>map =  averageByBranch();
    	for(Map.Entry<String, Double>m: map.entrySet()) {
    		System.out.println(m.getKey() + " " + m.getValue());
    	}
        // print top 3
    	
    	for(Account a: top3Richest()) {
    		System.out.println(a.holder);
    	}
    }
}

