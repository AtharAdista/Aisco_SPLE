package aisco.product.marimenyumbang;

import aisco.program.ProgramFactory;
import aisco.program.core.Program;
import aisco.financialreport.FinancialReportFactory;
import aisco.financialreport.core.FinancialReport;
import aisco.donation.DonationFactory;
import aisco.donation.core.Donation;

import java.util.ArrayList;
import java.util.List;

public class MariMenyumbang {
	private static final int INDEX_LIBRARY = 0;
	private static final int INDEX_BOOK = 1;

	private static FinancialReport income1;
	
	 public static List<Program> addProgram() {    	
	        // TODO: Create necessary feature objects for the program
	        // TODO: Implement the main logic of the program
	        // TODO: Handle input and output if needed
	        // TODO: Add exception handling if necessary
	        System.out.println("\n Programs: ");
	        List<Program> programs = new ArrayList<>();
	        Program libraryconstruction = ProgramFactory.createProgram(
	        		"aisco.program.activity.ProgramImpl",
	        		1,
	        		"Library Construction",
	        		"Construct the building of library",
	        		"Fix building",
	        		"Government",
	        		"https://www.myschool.splelive.id/logo"	

	        );
	        Program freebook = ProgramFactory.createProgram(
	        		"aisco.program.activity.ProgramImpl",
	        		2,
	        		"Free book",
	        		"Free for library",
	        		"100 books",
	        		"MariBerbagi Community",
	        		"https://www.myschool.splelive.id/liblogo"

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
	    			"QRIS"
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
	    			"QRIS"
	    	));
	    	
	    	
	    	return incomes;
	     }

     public static void addDonation() {
    	 Donation donate = DonationFactory.createDonation("aisco.donation.paymentqr.DonationImpl");
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
   	 
   	 addDonation();
   	 System.out.println("income: " + totalincome);

        
    }
}
