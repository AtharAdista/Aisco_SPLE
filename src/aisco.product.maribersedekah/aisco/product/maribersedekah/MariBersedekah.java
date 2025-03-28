package aisco.product.maribersedekah;

import aisco.program.ProgramFactory;
import aisco.program.core.Program;
import aisco.financialreport.FinancialReportFactory;
import aisco.financialreport.core.FinancialReport;
import aisco.donation.DonationFactory;
import aisco.donation.core.Donation;

import java.util.ArrayList;
import java.util.List;

public class MariBersedekah {
	private static final int INDEX_LIBRARY = 0;
	private static final int INDEX_BOOK = 1;

	private static FinancialReport income1;
	private static FinancialReport expense1;
	
	 public static List<Program> addProgram() {    	
	        // TODO: Create necessary feature objects for the program
	        // TODO: Implement the main logic of the program
	        // TODO: Handle input and output if needed
	        // TODO: Add exception handling if necessary
	        System.out.println("\n Programs: ");
	        List<Program> programs = new ArrayList<>();
	        Program libraryconstruction = ProgramFactory.createProgram(
	        		"aisco.program.operational.ProgramImpl",
	        		1,
	        		"Library Construction",
	        		"Fix library counstruction",
	        		"Public"

	        );
	        Program freebook = ProgramFactory.createProgram(
	        		"aisco.program.operational.ProgramImpl",
	        		2,
	        		"Free book",
	        		"Giving 100 books for free",
	        		"Book lovers"

	        );
	    
	        programs.add(INDEX_LIBRARY, libraryconstruction);
	        programs.add(INDEX_BOOK, freebook);
	        return programs;
	    }
	 
	 public static List<FinancialReport> addIncome(List<Program> programs){
	    	List<FinancialReport> incomes = new ArrayList<>();
	    	income1 = FinancialReportFactory.createFinancialReport(
	    			"aisco.financialreport.income.FinancialReportImpl",
	    			FinancialReportFactory.createFinancialReport(
	    					"aisco.financialreport.core.FinancialReportImpl",
	    					"1",
	    					"23-10-2019",
	    					100000,
	    					"Donation Ana",
	    					programs.get(INDEX_LIBRARY),
	    					"11000"	
	    			),
	    			"Transfer"
	    	);
	    	incomes.add(income1);
	    	incomes.add(FinancialReportFactory.createFinancialReport(
	    			"aisco.financialreport.income.FinancialReportImpl",
	    			FinancialReportFactory.createFinancialReport(
	    					"aisco.financialreport.core.FinancialReportImpl",
	    					"2",
	    					"24-10-2019",
	    					3000000,
	    					"Donation Joni",
	    					programs.get(INDEX_BOOK),
	    					"11000"
	    			),
	    			"Cash"
	    	));
	    	
	    	
	    	return incomes;
	     }
	 public static List<FinancialReport> addExpense(List<Program> programs){
	    	List<FinancialReport> expenses = new ArrayList<>();
	    	expense1 = FinancialReportFactory.createFinancialReport(
	    			"aisco.financialreport.expense.FinancialReportImpl",
	    			FinancialReportFactory.createFinancialReport(
	    			"aisco.financialreport.core.FinancialReportImpl",
	    			"10",
	    			"23-10-2019",
	    			1000000,
	    			"Buy Cement",
	    			programs.get(INDEX_LIBRARY),
	    			"41000"
	    			)
	    	);
	    	expenses.add(expense1);
	    	expenses.add(FinancialReportFactory.createFinancialReport(
	    			"aisco.financialreport.expense.FinancialReportImpl",
	    			FinancialReportFactory.createFinancialReport(
	    					"aisco.financialreport.core.FinancialReportImpl",
	    					"20",
	    					"24-10-2019",
	    					1500000,
	    					"Buy Bookcase",
	    					programs.get(INDEX_BOOK),
	    					"410"
	    			)
	    	));
	    	
	    	return expenses;
	     }
	
     public static void addDonation() {
    	 Donation donate = DonationFactory.createDonation("aisco.donation.credit.DonationImpl");
    	 donate.addDonation();
    	 donate.getDonation();
     }



    public static void main(String[] args) {    	
        // TODO: Create necessary feature objects for the program
        // TODO: Implement the main logic of the program
        // TODO: Handle input and output if needed
        // TODO: Add exception handling if necessary
     System.out.println("Product variasi 1");
   	 List<Program> programs = addProgram();
   	 System.out.println(programs);
   	 
   	 List<FinancialReport>incomes = addIncome(programs);
   	 income1.printHeader();
   	 System.out.println(incomes);
   	 int totalincome = ((aisco.financialreport.income.FinancialReportImpl)income1).total(incomes);
   	 
   	 List<FinancialReport> expenses = addExpense(programs);
   	 expense1.printHeader();
   	 System.out.println(expenses);
   	 int totalexpense = ((aisco.financialreport.expense.FinancialReportImpl)expense1).total(expenses);
   	 
   	 addDonation();
   	 int balance = totalincome-totalexpense;
   	 System.out.println("Balance: " + balance);

        
    }
}

